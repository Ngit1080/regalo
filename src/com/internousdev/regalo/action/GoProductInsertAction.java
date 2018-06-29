package com.internousdev.regalo.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class GoProductInsertAction extends ActionSupport implements SessionAware{

	private static final String ERRORPAGE = "errorPage";
	Map<String, Object> session;


	public String execute() throws SQLException{

		if(!(session.containsKey("loginFlg"))) {
			return ERRORPAGE;
		}

		System.out.println("インサート画面へGO");

		return "success";

	}

	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
