package com.internousdev.regalo.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.regalo.dao.UserCreateConfirmDAO;
import com.internousdev.regalo.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;
public class UserCreateConfirmAction extends ActionSupport implements SessionAware {

	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private String userId;
	private String password;
// 0:男性、1:女性

	private String sex;
	private String email;
	private static final String ERRORPAGE = "errorPage";
	private List<String> familyNameErrorMessageList = new ArrayList<>();
	private List<String> firstNameErrorMessageList = new ArrayList<>();
	private List<String> familyNameKanaErrorMessageList = new ArrayList<>();
	private List<String> firstNameKanaErrorMessageList = new ArrayList<>();
	private List<String> userIdErrorMessageList = new ArrayList<>();
	private String existUserIdErrorMessage;
	private List<String> passwordErrorMessageList = new ArrayList<>();
	private List<String> emailErrorMessageList = new ArrayList<>();

	public List<String> getFamilyNameErrorMessageList() {
		return familyNameErrorMessageList;
	}





	public void setFamilyNameErrorMessageList(List<String> familyNameErrorMessageList) {
		this.familyNameErrorMessageList = familyNameErrorMessageList;
	}





	public List<String> getFirstNameErrorMessageList() {
		return firstNameErrorMessageList;
	}





	public void setFirstNameErrorMessageList(List<String> firstNameErrorMessageList) {
		this.firstNameErrorMessageList = firstNameErrorMessageList;
	}





	public List<String> getFamilyNameKanaErrorMessageList() {
		return familyNameKanaErrorMessageList;
	}





	public void setFamilyNameKanaErrorMessageList(List<String> familyNameKanaErrorMessageList) {
		this.familyNameKanaErrorMessageList = familyNameKanaErrorMessageList;
	}





	public List<String> getFirstNameKanaErrorMessageList() {
		return firstNameKanaErrorMessageList;
	}





	public void setFirstNameKanaErrorMessageList(List<String> firstNameKanaErrorMessageList) {
		this.firstNameKanaErrorMessageList = firstNameKanaErrorMessageList;
	}





	public List<String> getUserIdErrorMessageList() {
		return userIdErrorMessageList;
	}





	public void setUserIdErrorMessageList(List<String> userIdErrorMessageList) {
		this.userIdErrorMessageList = userIdErrorMessageList;
	}





	public String getExistUserIdErrorMessage() {
		return existUserIdErrorMessage;
	}





	public void setExistUserIdErrorMessage(String existUserIdErrorMessage) {
		this.existUserIdErrorMessage = existUserIdErrorMessage;
	}





	public List<String> getPasswordErrorMessageList() {
		return passwordErrorMessageList;
	}





	public void setPasswordErrorMessageList(List<String> passwordErrorMessageList) {
		this.passwordErrorMessageList = passwordErrorMessageList;
	}





	public List<String> getEmailErrorMessageList() {
		return emailErrorMessageList;
	}





	public void setEmailErrorMessageList(List<String> emailErrorMessageList) {
		this.emailErrorMessageList = emailErrorMessageList;
	}


	private Map<String, Object> session;


//	メソッド
	public String execute() throws SQLException {
		String result = ERROR;
		if(!(session.containsKey("loginFlg"))) {
			return ERRORPAGE;
		}
		UserCreateConfirmDAO DAO = new UserCreateConfirmDAO();
		InputChecker i = new InputChecker();

		/* 以下booleanは使いたい文字型をtrueにする
		 * halfAlphabet：半角英字
		 * kanji：漢字
		 * hiragana：ひらがな
		 * katakana：カタカナ
		 * halfNumber：半角数字
		 * halfSymbol：半角記号
		 * fullSymbol：全角記号
		*errorList（任意のList） = check(ユーザーID, userId, 1, 8, true, false, false, false, true, false, false);
		*/

		System.out.println(familyName);

		session.put("familyName", familyName);
		session.put("firstName", firstName);
		session.put("familyNameKana", familyNameKana);
		session.put("firstNameKana", firstNameKana);
		session.put("sex", sex);
		session.put("email", email);
		session.put("userId", userId);
		session.put("password", password);

System.out.println("aaaa"+session.get("familyName"));

		familyNameErrorMessageList = i.check("姓",familyName,1,16,true,true,true,false,false,false,false);
		firstNameErrorMessageList = i.check("名", firstName, 1, 16, true, true, true, false, false, false, false);
		familyNameKanaErrorMessageList= i.check("姓ふりがな", familyNameKana, 1, 16, false, false, true, false, false, false, false);
		firstNameKanaErrorMessageList= i.check("名ふりがな", firstNameKana, 1, 16, false, false, true, false, false, false, false);
		userIdErrorMessageList= i.check("ログインID", userId, 1, 8, true, false, false, false, true, false, false);
		passwordErrorMessageList= i.check("パスワード", password, 1, 16, true, false, false, false, true, false, false);
		emailErrorMessageList= i.check("メールアドレス", email, 14, 32, true, false, false, false, true, true, false);

		if (DAO.existUserId(userId)) {
			existUserIdErrorMessage = "そのIDは既に使われています";
		}

		//姓、名に半角、全角スペースが入っていたらエラー文を出す
				if (familyName.contains(" ") || familyName.contains("　")){
					familyNameErrorMessageList.add("姓は半角英語、漢字、ひらがなで入力してください。");
				}
				if (firstName.contains(" ") || firstName.contains("　")){
					firstNameErrorMessageList.add("名は半角英語、漢字、ひらがなで入力してください。");
				}
				if (userId.contains(" ") || firstName.contains("　")){
					userIdErrorMessageList.add("ユーザーIDは半角英数字で入力してください。");
				}
				if (password.contains(" ") || firstName.contains("　")){
					passwordErrorMessageList.add("パスワードは半角英数字で入力してください。");
				}
//		エラー確認
		System.out.println(familyNameErrorMessageList.size());
//        System.out.println(String.valueOf(familyNameErorMessageList.get(0)));

        System.out.println(firstNameErrorMessageList.size());
//        System.out.println(String.valueOf(firstNameErorMessageList.get(0)));

        System.out.println(familyNameKanaErrorMessageList.size());
//        System.out.println(String.valueOf(familyNameKanaErorMessageList.get(0)));

        System.out.println(firstNameKanaErrorMessageList.size());
//        System.out.println(String.valueOf(firstNameKanaErorMessageList.get(0)));

        System.out.println(userIdErrorMessageList.size());
//        System.out.println(String.valueOf(userIdErorMessageList.get(0)));

        System.out.println(passwordErrorMessageList.size());
//        System.out.println(String.valueOf(passwordErorMessageList.get(0)));

        System.out.println(emailErrorMessageList.size());
//        System.out.println(String.valueOf(emailErorMessageList.get(0)));
System.out.println(existUserIdErrorMessage);

		if(familyNameErrorMessageList.size()==0
		&& firstNameErrorMessageList.size()==0
		&& familyNameKanaErrorMessageList.size()==0
		&& firstNameKanaErrorMessageList.size()==0
		&& userIdErrorMessageList.size()==0
		&& passwordErrorMessageList.size()==0
		&& emailErrorMessageList.size()==0
		&& existUserIdErrorMessage==null){
			result = SUCCESS;
			return result;
		}
		return result;
	}





	public static String getErrorpage() {
		return ERRORPAGE;
	}





	public String getFamilyName() {
		return familyName;
	}





	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}





	public String getFirstName() {
		return firstName;
	}





	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}





	public String getFamilyNameKana() {
		return familyNameKana;
	}





	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}





	public String getFirstNameKana() {
		return firstNameKana;
	}





	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}





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





	public String getSex() {
		return sex;
	}





	public void setSex(String sex) {
		this.sex = sex;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public Map<String, Object> getSession() {
		return session;
	}





	public void setSession(Map<String, Object> session) {
		this.session = session;
	}





	}