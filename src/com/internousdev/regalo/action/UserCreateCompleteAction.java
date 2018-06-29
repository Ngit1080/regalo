package com.internousdev.regalo.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.regalo.dao.CartDAO;
import com.internousdev.regalo.dao.UserCreateCompleteDAO;
import com.internousdev.regalo.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware {

	Map<String, Object> session;

	private String userId;

	private String password;

	private String familyName;

	private String firstName;

	private String familyNameKana;

	private String firstNameKana;
	private static final String ERRORPAGE = "errorPage";
	/**
	 * 0:男性、1:女性
	 */
	private String sex1;

	private int sex;
	private String email;


//メソッド　　　　～DBにユーザ登録し、カートの情報を引き継ぐ～
	public String execute() throws SQLException {
		UserCreateCompleteDAO dao = new UserCreateCompleteDAO();
		LoginDTO dto = new LoginDTO();

//		dto.userId(familyName, firstName, familyNameKana, firstNameKana);
//		if (sex.equals("0")) {
//			dto.setSex(false);
//		} else if (sex.equalsIgnoreCase("1")) {
//			dto.setSex(true);
//		}

		if(!(session.containsKey("loginFlg"))) {
			return ERRORPAGE;
		}
		userId = String.valueOf(session.get("userId"));
		password = String.valueOf(session.get("password"));
		familyName = String.valueOf(session.get("familyName"));
		firstName = String.valueOf(session.get("firstName"));
		familyNameKana = String.valueOf(session.get("familyNameKana"));
		firstNameKana = String.valueOf(session.get("firstNameKana"));
		email = String.valueOf(session.get("email"));
		sex1 = String.valueOf(session.get("sex"));

		sex =Integer.parseInt(sex1);

		dto.setSex(sex);
		dto.setEmail(email);
		dto.setUserId(userId);
		dto.setPassword(password);
		dto.setFamilyName(familyName);
		dto.setFamilyNameKana(familyNameKana);
		dto.setFirstName(firstName);
		dto.setFirstNameKana(firstNameKana);


		String result = ERROR;
		int count = dao.registerUser(dto);

		System.out.println(count);
		if(count > 0){
			session.put("userId", userId);
			session.put("loginFlg", true);

			// カーとの情報を引き継ぐ
			CartDAO cartDAO = new CartDAO();
			cartDAO.linkToLoginId(session.get("tempUserId").toString(), session.get("userId").toString());
			result = SUCCESS;
			}
		return result;
		}




	public String getSex1() {
		return sex1;
	}




	public void setSex1(String sex1) {
		this.sex1 = sex1;
	}




	public static String getErrorpage() {
		return ERRORPAGE;
	}




	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
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



	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
}