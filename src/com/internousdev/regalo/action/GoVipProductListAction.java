package com.internousdev.regalo.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.regalo.dao.VipProductInfoDAO;
import com.internousdev.regalo.dto.ProductInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class GoVipProductListAction extends ActionSupport implements SessionAware{

	private Map<String,Object> session;

	private List<ProductInfoDTO> productInfoList = new ArrayList<>();

	public String execute() {


		String result = SUCCESS;

		VipProductInfoDAO productInfoDAO = new VipProductInfoDAO();

		productInfoList = productInfoDAO.getProductInfo();

		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public List<ProductInfoDTO> getProductInfoList() {
		return productInfoList;
	}

	public void setProductInfoList(List<ProductInfoDTO> productInfoList) {
		this.productInfoList = productInfoList;
	}




}
