package com.internousdev.regalo.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.regalo.dao.ProductDeleteDAO;
import com.internousdev.regalo.dao.ProductInfoDAO;
import com.internousdev.regalo.dto.ProductInfoDTO;
import com.opensymphony.xwork2.ActionSupport;


public class DeleteOrUpdateAction extends ActionSupport implements SessionAware {
	private static final String ERRORPAGE = "errorPage";
	public Map<String, Object> session;
	private String productId;
	private String productName;
	private String productNameKana;
	private String productDescription;
	private String categoryId;
	private String price;
	private String imageFilePath;
	private String releaseCompany;
	private String deleteFlg;
	private String changeFlg;
	private String dMessage;
	private ArrayList<ProductInfoDTO> productInfoDTOList;




	public String execute() throws SQLException {

		String result = ERROR;
		if(!(session.containsKey("loginFlg"))) {
			return ERRORPAGE;
		}

		System.out.println("deleteFlg:"+deleteFlg);
		System.out.println("changeFlg:"+changeFlg);

	//		削除
		if (deleteFlg != null) {
			System.out.println("削除");
			result = this.delete(productId);
			ProductInfoDAO dao = new ProductInfoDAO();
			productInfoDTOList = (ArrayList<ProductInfoDTO>) dao.getProductInfo();
			System.out.println(productInfoDTOList.size());
		}

	//	商品情報変更
		if (changeFlg != null) {
			System.out.println(changeFlg);
			result = this.update(productId);
		}




		return result;
	}



//	商品削除
	private String delete(String product_id) throws SQLException {

		String result = SUCCESS;

		System.out.println(product_id+"aaaa");

		int count = 0;

		ProductDeleteDAO dao = new ProductDeleteDAO();

		count += dao.productDelete(Integer.parseInt(product_id));

		if (count > 0) {
			this.dMessage = "削除できました。";
//			return SUCCESS;
		}
		return result;
	}


//	商品情報変更
	private String update(String product_id) throws NumberFormatException, SQLException {

		System.out.println(product_id);

		System.out.println("チェック→" + product_id);


		return "masterChange";

	}



	public String getProductId() {
		return productId;
	}



	public void setProductId(String productId) {
		this.productId = productId;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public String getProductNameKana() {
		return productNameKana;
	}



	public void setProductNameKana(String productNameKana) {
		this.productNameKana = productNameKana;
	}



	public String getProductDescription() {
		return productDescription;
	}



	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}



	public String getCategoryId() {
		return categoryId;
	}



	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}






	public String getPrice() {
		return price;
	}



	public void setPrice(String price) {
		this.price = price;
	}



	public String getImageFilePath() {
		return imageFilePath;
	}



	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}



	public String getReleaseCompany() {
		return releaseCompany;
	}



	public void setReleaseCompany(String releaseCompany) {
		this.releaseCompany = releaseCompany;
	}



	public String getDeleteFlg() {
		return deleteFlg;
	}



	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}



	public String getChangeFlg() {
		return changeFlg;
	}



	public void setChangeFlg(String changeFlg) {
		this.changeFlg = changeFlg;
	}



	public String getdMessage() {
		return dMessage;
	}



	public void setdMessage(String dMessage) {
		this.dMessage = dMessage;
	}



	public Map<String, Object> getSession() {
		return session;
	}


	public ArrayList<ProductInfoDTO> getProductInfoDTOList() {
		return productInfoDTOList;
	}


	public void setProductInfoDTOList(ArrayList<ProductInfoDTO> productInfoDTOList) {
		this.productInfoDTOList = productInfoDTOList;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}







}
