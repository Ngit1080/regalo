package com.internousdev.regalo.action;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com. internousdev.regalo.dao.ProductIdCheckDAO;
import com.internousdev.regalo.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;


public class ProductInsertConfirmAction extends ActionSupport implements SessionAware{
	private static final String ERRORPAGE = "errorPage";
	//商品ID
	private int productId;

	//商品名
	private String productName;

	//商品名かな
	private String productNameKana;

	//商品詳細
	private String productDescription;

	//カテゴリID
	private int categoryId;

	//価格
	private int price;

	//画像ファイルパス
	private String imageFilePath = "./images";

	//画像ファイル名
	private String imageFileName;

	//販売年月
	private Date releaseDate;

	//販売会社
	private String releaseCompany;

	//ステータス
	private int status;

	//登録日
	private Date registDate;

	//更新日
	private Date updateDate;

	//ProductId重複確認
	/*private ProductIdCheckDAO productIdCheckDAO = new ProductIdCheckDAO();*/

	private List<String> categoryIdErrorMessageList = new ArrayList<String>();
	private List<String> productIdErrorMessageList = new ArrayList<String>();
	private List<String> productNameErrorMessageList = new ArrayList<String>();
	private List<String> productNameKanaErrorMessageList = new ArrayList<String>();
	private List<String> productDescriptionErrorMessageList = new ArrayList<String>();
	private List<String> priceErrorMessageList = new ArrayList<String>();
	private List<String> imageFileNameErrorMessageList = new ArrayList<String>();
	private List<String> releaseCompanyErrorMessageList = new ArrayList<String>();

	private Map<String, Object> session;
	public String newImageFileName;

	//情報を受け取る為の変数の定義（画像情報）
		private File userImage;

		private String userImageFileName;






	public String execute() {

		if(!(session.containsKey("loginFlg"))) {
			return ERRORPAGE;
		}

		String result = ERROR;

		/*
		 * 画像のアップロード
		 */

		System.out.println("ItemInsertAction:userImageFileName"+userImageFileName);

		//ファイルアップロードの処理（userImageFileNameが空でない場合）
				if(!(userImageFileName == null)){
					String filePath = ServletActionContext.getServletContext().getRealPath("/").concat("images");
					System.out.println("Image Location:" + filePath);
					File fileToCreate = new File(filePath, userImageFileName);

					try {
						FileUtils.copyFile(userImage, fileToCreate);

						imageFileName = "./images/"+ userImageFileName;

						System.out.println("imageFileName:"+imageFileName);

					} catch (IOException e) {
						e.printStackTrace();
					}
				} else {
					 imageFileNameErrorMessageList.add("画像ファイルを選択してください");
					 session.put("imageFileNameErrorMessageList", imageFileNameErrorMessageList);
				 	return ERROR;
				}


		session.remove("productIdErrorMessageList");
		session.remove("productNameErrorMessageList");
		session.remove("productNameKanaErrorMessageList");
		session.remove("productDescriptionErrorMessageList");
		session.remove("priceErrorMessageList");
		session.remove("releaseCompanyErrorMessageList");
		session.remove("categoryIdErrorMessageList");
		session.remove("imageFileNameErrorMessageList");

		/*String fileName ;


			 fileName = new File(imageFilePath).getName();

			 if(fileName.isEmpty() || fileName == null){
				 imageFileNameErrorMessageList.add("画像ファイルを選択してください");
				 session.put("imageFileNameErrorMessageList", imageFileNameErrorMessageList);
			 	return ERROR;
			 }else{
				 imageFileName = fileName;
				 imageFileName = "./images/" + fileName;
			 }
			System.out.println(imageFileName);*/

			session.put("productId", productId);
			session.put("productName", productName);
			session.put("productNameKana", productNameKana);
			session.put("productDescription", productDescription);
			session.put("categoryId", categoryId);
			session.put("price", price);
			session.put("imageFilePath", imageFilePath);
			session.put("fileName", userImageFileName);
			session.put("imageFileName", imageFileName);
			session.put("releaseCompany", releaseCompany);


//		} else {
//			//confirmの表示画像
//			newImageFileName = "./images/" + imageFileName;
//
//			System.out.println(newImageFileName);
//		}



		InputChecker inputChecker = new InputChecker();

		productIdErrorMessageList = inputChecker.check("商品ID", session.get("productId").toString(), 1, 3, false, false, false, false, true, false, false);
		productNameErrorMessageList = inputChecker.check("商品名", productName, 1, 16, true, true, true, true, true, true, true);
		productNameKanaErrorMessageList = inputChecker.check("商品名かな", productNameKana, 1, 16, false, false, true, false, false, false, false);
		productDescriptionErrorMessageList = inputChecker.check("商品詳細", productDescription, 1, 200, true, true, true, true, true, true, true);
		priceErrorMessageList = inputChecker.check("価格", session.get("price").toString(), 1, 8, false, false, false, false, true, false, false);
		releaseCompanyErrorMessageList = inputChecker.check("販売会社", releaseCompany, 1, 16, true, true, true, true, true, true, true);

		if(productIdErrorMessageList.size()==0
		&& productNameErrorMessageList.size()==0
		&& productNameKanaErrorMessageList.size()==0
		&& productDescriptionErrorMessageList.size()==0
		&& priceErrorMessageList.size()==0
		&& releaseCompanyErrorMessageList.size()==0) {
			/*result = SUCCESS;*/


			ProductIdCheckDAO dao = new ProductIdCheckDAO();

			boolean flg = false;
			try {
				flg = dao.existsProductId(productId);
			} catch (SQLException e) {
				e.printStackTrace();
			}

			if(flg){
				String productIdError = "存在している商品IDです";
				productIdErrorMessageList.add(productIdError);
				session.put("productIdErrorMessageList", productIdErrorMessageList);

			} else {
				result = SUCCESS;
			}



		}else {

			session.put("productIdErrorMessageList", productIdErrorMessageList);
			session.put("productNameErrorMessageList", productNameErrorMessageList);
			session.put("productNameKanaErrorMessageList", productNameKanaErrorMessageList);
			session.put("productDescriptionErrorMessageList", productDescriptionErrorMessageList);
			session.put("priceErrorMessageList", priceErrorMessageList);
			session.put("releaseCompanyErrorMessageList", releaseCompanyErrorMessageList);
			result = ERROR;
		}

		if(categoryId==1){
			categoryIdErrorMessageList.add("カテゴリーを選択してください");
			 session.put("categoryIdErrorMessageList", categoryIdErrorMessageList);
		 	result = ERROR;
		}



		return result;
	}



	public List<String> getCategoryIdErrorMessageList() {
		return categoryIdErrorMessageList;
	}



	public void setCategoryIdErrorMessageList(List<String> categoryIdErrorMessageList) {
		this.categoryIdErrorMessageList = categoryIdErrorMessageList;
	}



	public int getProductId() {
		return productId;
	}



	public void setProductId(int productId) {
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



	public int getCategoryId() {
		return categoryId;
	}



	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}




	public String getImageFileName() {
		return imageFileName;
	}



	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}



	public String getImageFilePath() {
		return imageFilePath;
	}



	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}



	public Date getReleaseDate() {
		return releaseDate;
	}



	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}



	public String getReleaseCompany() {
		return releaseCompany;
	}



	public void setReleaseCompany(String releaseCompany) {
		this.releaseCompany = releaseCompany;
	}



	public int getStatus() {
		return status;
	}



	public void setStatus(int status) {
		this.status = status;
	}



	public Date getRegistDate() {
		return registDate;
	}



	public void setRegistDate(Date registDate) {
		this.registDate = registDate;
	}



	public String getNewImageFileName() {
		return newImageFileName;
	}



	public void setNewImageFileName(String newImageFileName) {
		this.newImageFileName = newImageFileName;
	}


	public Date getUpdateDate() {
		return updateDate;
	}



	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}



	public List<String> getProductIdErrorMessageList() {
		return productIdErrorMessageList;
	}



	public void setProductIdErrorMessageList(List<String> productIdErrorMessageList) {
		this.productIdErrorMessageList = productIdErrorMessageList;
	}



	public List<String> getProductNameErrorMessageList() {
		return productNameErrorMessageList;
	}



	public void setProductNameErrorMessageList(List<String> productNameErrorMessageList) {
		this.productNameErrorMessageList = productNameErrorMessageList;
	}



	public List<String> getProductNameKanaErrorMessageList() {
		return productNameKanaErrorMessageList;
	}



	public void setProductNameKanaErrorMessageList(List<String> productNameKanaErrorMessageList) {
		this.productNameKanaErrorMessageList = productNameKanaErrorMessageList;
	}



	public List<String> getProductDescriptionErrorMessageList() {
		return productDescriptionErrorMessageList;
	}



	public void setProductDescriptionErrorMessageList(List<String> productDescriptionErrorMessageList) {
		this.productDescriptionErrorMessageList = productDescriptionErrorMessageList;
	}



	public List<String> getPriceErrorMessageList() {
		return priceErrorMessageList;
	}



	public void setPriceErrorMessageList(List<String> priceErrorMessageList) {
		this.priceErrorMessageList = priceErrorMessageList;
	}



	public List<String> getImageFileNameErrorMessageList() {
		return imageFileNameErrorMessageList;
	}



	public void setImageFileNameErrorMessageList(List<String> imageFileNameErrorMessageList) {
		this.imageFileNameErrorMessageList = imageFileNameErrorMessageList;
	}



	public List<String> getReleaseCompanyErrorMessageList() {
		return releaseCompanyErrorMessageList;
	}



	public void setReleaseCompanyErrorMessageList(List<String> releaseCompanyErrorMessageList) {
		this.releaseCompanyErrorMessageList = releaseCompanyErrorMessageList;
	}



	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}



	public File getUserImage() {
		return userImage;
	}



	public void setUserImage(File userImage) {
		this.userImage = userImage;
	}



	public String getUserImageFileName() {
		return userImageFileName;
	}



	public void setUserImageFileName(String userImageFileName) {
		this.userImageFileName = userImageFileName;
	}
}
