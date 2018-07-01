package com.internousdev.regalo.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.regalo.dao.PasswordResetCompleteDAO;
import com.internousdev.regalo.dto.LoginDTO;
import com.internousdev.regalo.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class PasswordResetConfirmAction extends ActionSupport implements SessionAware{

	private String userId = "";      //ユーザーID
	private String password = "";    //現在のパスワード
	private String password1;        //新しいパスワード
	private String password2;        //確認パスワード
	private String hidePassword;     //新しいパスワードを*で暗号化

	private Map<String,Object> session;

	private String errorId = "";              //IDエラー
	private String errorPassword = "";        //現在のパスワードエラー
	private String errorPass = "";            //新しいパスワードエラー
	private String errorRePass = "";          //確認用パスワードエラー
	private String errorMessagePassword = ""; //新しいパスワードと確認パスワードが一致しなかったときのエラー
	private String errorMessageId = "";       //ID パスワードエラー


	private static final String ERRORPAGE = "errorPage";

	private LoginDTO loginDTO = new LoginDTO();
	private PasswordResetCompleteDAO passwordResetDAO = new PasswordResetCompleteDAO();

	int i;

	public List<String> ErrorUserIdList = new ArrayList<String>();
	public List<String> ErrorPasswordList = new ArrayList<String>();
	public List<String> ErrorPasswordList1 = new ArrayList<String>();
	public List<String> ErrorReconfirmPassList = new ArrayList<String>();
	public List<String> ErrorPasswordList2 = new ArrayList<String>();


	public String execute() {

		System.out.println("userId"+userId);

		String result = ERROR;

		if(!(session.containsKey("loginFlg"))) {
			return ERRORPAGE;
		}

		InputChecker inputChecker = new InputChecker();

		//フォームの入力内容をInputCheckerを使用しチェックする
		/* halfAlphabet：半角英字
		 * kanji：漢字
		 * hiragana：ひらがな
		 * katakana：カタカナ
		 * halfNumber：半角数字
		 * halfSymbol：半角記号
		 * fullSymbol：全角記号
		 */

		ErrorUserIdList = inputChecker.check("ユーザーID",userId,1,8,true,false,false,false,true,false,false);
		ErrorPasswordList = inputChecker.check("現在のパスワード",password,1,16,true,false,false,false,true,false,false);
		ErrorPasswordList1 = inputChecker.check("新しいパスワード",password1,1,16,true,false,false,false,true,false,false);
		ErrorReconfirmPassList = inputChecker.check("確認パスワード",password2,1,16,true,false,false,false,true,false,false);

		//ユーザーIDと新しいパスワードが同じだったらDBの現在のパスワードと同じになってしまうのでエラー文を出す
		String isNewPasswordTrue = passwordResetDAO.isNewPasswordTrue(userId, password1);
		if(isNewPasswordTrue != null){
			ErrorPasswordList2.add(isNewPasswordTrue);
		}

		//半角、全角スペースが入っていたらエラー文を出す
		if (userId.contains(" ") || userId.contains("　")){
			ErrorUserIdList.add("ユーザーIDは半角英数字で入力してください。");
		}

		if (password.contains(" ") || password.contains("　")){
			ErrorPasswordList.add("現在のパスワードは半角英数字で入力してください。");
		}

		if (password1.contains(" ") || password1.contains("　")){
			ErrorPasswordList1.add("新しいパスワードは半角英数字で入力してください。");
		}

		if (password2.contains(" ") || password2.contains("　")){
			ErrorReconfirmPassList.add("確認パスワードは半角英数字で入力してください。");
		}


		if(
				ErrorUserIdList.size() == 0 &&
				ErrorPasswordList.size() == 0 &&
				ErrorPasswordList1.size() == 0 &&
				ErrorPasswordList2.size() == 0 &&
				ErrorReconfirmPassList.size() ==0

				){

			result = SUCCESS;

		} else {

			for(i=0; i < ErrorUserIdList.size(); i++) {
				errorId = errorId + ErrorUserIdList.get(i);
			}

			for(i=0; i < ErrorPasswordList.size(); i++) {
				errorPassword = errorPassword + ErrorPasswordList.get(i);
			}

			for(i=0; i < ErrorPasswordList1.size(); i++) {
				errorPass = errorPass + ErrorPasswordList1.get(i);
			}

			for(i=0; i < ErrorReconfirmPassList.size(); i++) {
				errorRePass = errorRePass + ErrorReconfirmPassList.get(i);
			}


		}

		//入力情報をLoginDTOに格納する
		loginDTO.setUserId(userId);
		loginDTO.setPassword(password1);

		//パスワードの一部を隠す
		/*セキュリティのため字数に関わらず16字分出力させる
		  はじめの1文字＋15文字分のアスタリスクを表示する*/
		hidePassword = "";
		if(password1.length() > 0) {
			StringBuffer sb = new StringBuffer(password1.substring(0,1));

			sb.append("***************");

			hidePassword = sb.toString();
		}
		session.put("hidePassword",hidePassword);


		//新しいパスワードと確認パスワードが一致しなかったらエラーメッセージを出す

		if(!(password1.equals(password2))) {
			errorMessagePassword += "入力されたパスワードが異なります。";
			result = ERROR;
		}


		if((userId != "") && (password1 != "")){

			PasswordResetCompleteDAO dao = new PasswordResetCompleteDAO();
			boolean check = dao.passwordConfirm(userId,password);


			//ユーザーIDと現在のパスワードが正しくなかったらエラーメッセージを出す
			if(!check) {
				errorMessageId += "ユーザーIDまたはパスワードが異なります。";
				result = ERROR;
			}


		}

		return result;

	}

	//getter,setter
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword1() {
		return password1;
	}

	public void setPassword1(String password1) {
		this.password1 = password1;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public String getErrorPassword() {
		return errorPassword;
	}

	public void setErrorPassword(String errorPassword) {
		this.errorPassword = errorPassword;
	}

	public List<String> getErrorPasswordList() {
		return ErrorPasswordList;
	}

	public void setErrorPasswordList(List<String> errorPasswordList) {
		ErrorPasswordList = errorPasswordList;
	}

	public String getErrorId() {
		return errorId;
	}

	public void setErrorId(String errorId) {
		this.errorId = errorId;
	}

	public String getErrorPass() {
		return errorPass;
	}

	public void setErrorPass(String errorPass) {
		this.errorPass = errorPass;
	}

	public String getErrorRePass() {
		return errorRePass;
	}

	public void setErrorRePass(String errorRePass) {
		this.errorRePass = errorRePass;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public List<String> getErrorUserIdList() {
		return ErrorUserIdList;
	}

	public void setErrorUserIdList(List<String> errorUserIdList) {
		ErrorUserIdList = errorUserIdList;
	}

	public List<String> getErrorPasswordList1() {
		return ErrorPasswordList1;
	}

	public void setErrorPasswordList1(List<String> errorPasswordList1) {
		ErrorPasswordList1 = errorPasswordList1;
	}

	public List<String> getErrorReconfirmPassList() {
		return ErrorReconfirmPassList;
	}

	public void setErrorReconfirmPassList(List<String> errorReconfirmPassList) {
		ErrorReconfirmPassList = errorReconfirmPassList;
	}

	public String getErrorMessagePassword() {
		return errorMessagePassword;
	}

	public void setErrorMessagePassword(String errorMessagePassword) {
		this.errorMessagePassword = errorMessagePassword;
	}

	public String getErrorMessageId() {
		return errorMessageId;
	}

	public void setErrorMessageId(String errorMessageId) {
		this.errorMessageId = errorMessageId;
	}

	public LoginDTO getLoginDTO() {
		return loginDTO;
	}

	public void setLoginDTO(LoginDTO loginDTO) {
		this.loginDTO = loginDTO;
	}

	public PasswordResetCompleteDAO getPasswordResetDAO() {
		return passwordResetDAO;
	}

	public void setPasswordResetDAO(PasswordResetCompleteDAO passwordResetDAO) {
		this.passwordResetDAO = passwordResetDAO;
	}

	public List<String> getErrorPasswordList2() {
		return ErrorPasswordList2;
	}

	public static String getErrorpage() {
		return ERRORPAGE;
	}

	public void setErrorPasswordList2(List<String> errorPasswordList2) {
		ErrorPasswordList2 = errorPasswordList2;
	}

	public String getHidePassword() {
		return hidePassword;
	}

	public void setHidePassword(String hidePassword) {
		this.hidePassword = hidePassword;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
