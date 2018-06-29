package com.internousdev.regalo.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class GoAddressCreateAction extends ActionSupport implements SessionAware{

	private String loginUserId;     //ユーザーID
	private String loginPassword;   //パスワード
	private String familyName;      //姓
	private String firstName;       //名
	private String familyNameKana;  //姓仮名
	private String firstNameKana;   //名仮名
	private String sex;             //性別
	private String mail;
//	private String secretQuestion;
//	private String secretAnswer;
	private String email;           //メールアドレス
	private String telNumber;       //電話番号
	private String userAddress;     //住所

	private Map<String,Object> session;

	private static final String ERRORPAGE = "errorPage";

	public String execute() {

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

		return SUCCESS;
	}


	//getter,setter
	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

//	public String getSecretQuestion() {
//		return secretQuestion;
//	}
//
//	public void setSecretQuestion(String secretQuestion) {
//		this.secretQuestion = secretQuestion;
//	}
//
//	public String getSecretAnswer() {
//		return secretAnswer;
//	}
//
//	public void setSecretAnswer(String secretAnswer) {
//		this.secretAnswer = secretAnswer;
//	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public static String getErrorpage() {
		return ERRORPAGE;
	}

}

