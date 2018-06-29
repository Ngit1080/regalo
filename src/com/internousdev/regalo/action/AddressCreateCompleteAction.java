package com.internousdev.regalo.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.regalo.dao.AddressInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

public class AddressCreateCompleteAction extends ActionSupport implements SessionAware {

	private String familyName;       //姓
	private String firstName;        //名
	private String familyNameKana;   //姓仮名
	private String firstNameKana;    //名仮名
	private String sex;              //性別
	private List<String> sexList = new ArrayList<String>();
	private String email;            //メールアドレス
	private String telNumber;        //電話番号
	private String userAddress;      //住所
	private String categoryId;       //カテゴリーID

	private Map<String,Object> session;

	private static final String ERRORPAGE = "errorPage";

	public String execute() {

		String result = ERROR;

		if(!(session.containsKey("loginFlg"))) {
			return ERRORPAGE;
		}

		AddressInfoDAO addressInfoDao = new AddressInfoDAO();

		int count = addressInfoDao.insert(String.valueOf(session.get("userId")),familyName,firstName,familyNameKana,firstNameKana,email,telNumber,userAddress);
		if(count>0){
			result = SUCCESS;
			System.out.println("AddressCreateCompleteAction成功");
		}
		return result;
	}

	//getter,setter
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

	public List<String> getSexList() {
		return sexList;
	}

	public void setSexList(List<String> sexList) {
		this.sexList = sexList;
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

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
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