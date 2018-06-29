package com.internousdev.regalo.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.regalo.dao.CategoryDAO;
import com.internousdev.regalo.dto.CategoryDTO;
import com.opensymphony.xwork2.ActionSupport;
public class GoUserCreateAction extends ActionSupport implements SessionAware{


	private String deleteFlg;
	Map<String,Object> session;
	private List<CategoryDTO> categoryList = new ArrayList<>();

	public String execute() {

		if(deleteFlg.equals("true")){
			session.remove("familyName");
			session.remove("firstName");
			session.remove("familyNameKana");
			session.remove("firstNameKana");
			session.remove("userId");
			session.remove("email");
		}

		//カテゴリリストを取得
		CategoryDAO categoryDAO = new CategoryDAO();

		categoryList = categoryDAO.getCategoryList();

		session.put("categoryList", categoryList);

		return SUCCESS;
	}


	public String getDeleteFlg() {
		return deleteFlg;
	}


	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}


	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}