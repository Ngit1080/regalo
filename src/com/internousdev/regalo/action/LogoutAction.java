package com.internousdev.regalo.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware{

	private Map<String,Object> session;
	private static final String ERRORPAGE ="errorPage";

	//Logoutはsessionに保存してあるuserのIdを消して、loginFlgの判定をfalseにするだけ。


	public String execute(){

		System.out.println("-----LogoutAction");

		if((!session.containsKey("loginFlg"))){
        	return ERRORPAGE;
        }

		//keyの指定してuserIdの削除。
		session.remove("userId");
		session.remove("familyName");
		session.remove("firstName");
		session.remove("familyNameKana");
		session.remove("firstNameKana");
		session.remove("loginId");
		session.remove("email");
		session.remove("masterId");
		session.remove("rank");
		//loginしているかの判定はfalseの更新だけでよい。
		session.put("loginFlg", false);

		if(session.containsKey("masterFlg")) {
			session.put("masterFlg", false);
		}

		//home画面
		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
