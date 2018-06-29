package com.internousdev.regalo.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.regalo.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class AddressCreateConfirmAction extends ActionSupport implements SessionAware {

	private String familyName;      //姓
	private String firstName;       //名
	private String familyNameKana;  //姓仮名
	private String firstNameKana;   //名仮名
	private List<String> sexList = new ArrayList<String>();
	private String sex;             //性別


	private static final String MALE = "男性";
	private static final String FEMALE ="女性";
	private String defaultSexValue = MALE;
	private String email;          //メールアドレス
	private String telNumber;      //電話番号
	private String userAddress;    //住所


	private List<String> familyNameErrorMessageList = new ArrayList<String>();
	private List<String> firstNameErrorMessageList = new ArrayList<String>();
	private List<String> familyNameKanaErrorMessageList = new ArrayList<String>();
	private List<String> firstNameKanaErrorMessageList = new ArrayList<String>();
	private List<String> emailErrorMessageList = new ArrayList<String>();
	private List<String> telNumberErrorMessageList = new ArrayList<String>();
	private List<String> userAddressErrorMessageList = new ArrayList<String>();

	//前の動作で選んだカテゴリー情報を保持しておくため。
	private String categoryId;   //カテゴリーID

	private Map<String,Object> session;

	private static final String ERRORPAGE = "errorPage";

	public String execute() {

		String result = ERROR;

		if(!(session.containsKey("loginFlg"))) {
			return ERRORPAGE;
		}


		session.remove("familyNameErrorMessageList");
		session.remove("firstNameErrorMessageList");
		session.remove("familyNameKanaErrorMessageList");
		session.remove("firstNameKanaErrorMessageList");
		session.remove("emailErrorMessageList");
		session.remove("telNumberErrorMessageList");
		session.remove("userAddressErrorMessageList");

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

		familyNameErrorMessageList = inputChecker.check("姓",familyName,1,16,true,true,true,false,false,false,false);
		firstNameErrorMessageList = inputChecker.check("名",firstName,1,16,true,true,true,false,false,false,false);
		familyNameKanaErrorMessageList = inputChecker.check("姓仮名",familyNameKana,1,16,false,false,true,false,false,false,false);
		firstNameKanaErrorMessageList = inputChecker.check("名仮名",firstNameKana,1,16,false,false,true,false,false,false,false);
		userAddressErrorMessageList = inputChecker.check("住所",userAddress,15,50,true,true,false,true,true,true,false);
		telNumberErrorMessageList = inputChecker.check("電話番号",telNumber,10,13,false,false,false,false,true,false,false);
		emailErrorMessageList = inputChecker.check("メールアドレス",email,18,32,true,false,false,false,true,true,false);

		//姓、名に半角、全角スペースが入っていたらエラー文を出す
		if (familyName.contains(" ") || familyName.contains("　")){
			familyNameErrorMessageList.add("姓は半角英語、漢字、ひらがなで入力してください。");
		}

		if (firstName.contains(" ") || firstName.contains("　")){
			firstNameErrorMessageList.add("名は半角英語、漢字、ひらがなで入力してください。");
		}

		if(familyNameErrorMessageList.size()==0
		&& firstNameErrorMessageList.size()==0
		&& familyNameKanaErrorMessageList.size()==0
		&& firstNameKanaErrorMessageList.size()==0
		&& emailErrorMessageList.size()==0
		&& telNumberErrorMessageList.size()==0
		&& userAddressErrorMessageList.size()==0){

		result = SUCCESS;

		} else {
			session.put("familyNameErrorMessageList",familyNameErrorMessageList);
			session.put("firstNameErrorMessageList",firstNameErrorMessageList);
			session.put("familyNameKanaErrorMessageList",familyNameKanaErrorMessageList);
			session.put("firstNameKanaErrorMessageList",firstNameKanaErrorMessageList);
			session.put("emailErrorMessageList",emailErrorMessageList);
			session.put("telNumberErrorMessageList",telNumberErrorMessageList);
			session.put("userAddressErrorMessageList",userAddressErrorMessageList);

			result = ERROR;
		}

		sexList.add(MALE);
		sexList.add(FEMALE);

		return result;

	}

	//getter,setter
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getDefaultSexValue() {
		return defaultSexValue;
	}

	public void setDefaultSexValue(String defaultSexValue) {
		this.defaultSexValue = defaultSexValue;
	}

	public List<String> getSexList() {
		return sexList;
	}

	public void setSexList(List<String> sexList) {
		this.sexList = sexList;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void getTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setAddr11(String userAddress) {
		this.userAddress = userAddress;
	}

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

	public List<String> getEmailErrorMessageList() {
		return emailErrorMessageList;
	}

	public void setEmailErrorMessageList(List<String> emailErrorMessageList) {
		this.emailErrorMessageList = emailErrorMessageList;
	}

	public List<String> getTelNumberErrorMessageList() {
		return telNumberErrorMessageList;
	}

	public void setTelNumberErrorMessageList(List<String> telNumberErrorMessageList) {
		this.telNumberErrorMessageList = telNumberErrorMessageList;
	}

	public List<String> getUserAddressErrorMessageList() {
		return userAddressErrorMessageList;
	}

	public void setUserAddressErrorMessageList(List<String> userAddressErrorMessageList) {
		this.userAddressErrorMessageList = userAddressErrorMessageList;
	}

	public Map<String,Object> getSession() {
		return session;
	}

	public void setSession(Map<String,Object> session) {
		this.session = session;
	}

	public static String getMale() {
		return MALE;
	}

	public static String getFemale() {
		return FEMALE;
	}

	public static String getErrorpage() {
		return ERRORPAGE;
	}


}

