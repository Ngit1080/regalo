package com.internousdev.regalo.action;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.regalo.dao.AddressInfoDAO;
import com.internousdev.regalo.dao.CartDAO;
import com.internousdev.regalo.dto.AddressInfoDTO;
import com.internousdev.regalo.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;



public class BuyProductConfirmAction extends ActionSupport implements SessionAware {
	//定数
	private static final String DESTINATION = "destination";
	private static final String ERRORPAGE = "errorPage";

	private Map<String, Object> session;
	private int totalPrice =0;
	private int productCount;
	private int settlement;
	private List<CartDTO> cartList = new ArrayList<CartDTO>();
	private List<AddressInfoDTO> addressInfoListDTO = new ArrayList<AddressInfoDTO>();
	String userId;



//メソッド
	public String execute() throws SQLException{
		String result = ERROR;

		if(!(session.containsKey("loginFlg"))) {
			return ERRORPAGE;
		}

		//ログインしていれば宛先情報を取得する
		if((Boolean) session.get("loginFlg")){
			AddressInfoDAO addressInfoDAO = new AddressInfoDAO();

			System.out.println(session.get("userId").toString());
			addressInfoListDTO = addressInfoDAO.getAddressInfo(session.get("userId").toString());
			session.put("addressInfoListDTO",addressInfoListDTO);

			System.out.println("addressInfoListDTO.size()"+addressInfoListDTO.size());

		//宛先情報があれば
			if(addressInfoListDTO.size() > 0) {
//				if(session.addressInfolistDTO.size() > 0) {
				result = SUCCESS;
				//ログインしているが宛先情報がなければ
			}
			//				else {
//
//				result =DESTINATION;
//				return result;
//			}

		//ログインしていなければ
		}else if(!(boolean)session.get("loginFlg")){


				result = ERROR;
				session.put("settlement", true);


				return result;

	     }

//カート情報取得
		CartDAO dao = new CartDAO();
		cartList = dao.getCartDtoList(session.get("userId").toString());

		System.out.println("BuyProductConfirmAction"+session.get("userId").toString

());

		System.out.println("BuyProductConfirmAction.cartList.size():"+cartList.size

());

				if(cartList.size() > 0) {
					result = SUCCESS;
				}

				for(CartDTO dto: cartList) {
					totalPrice += dto.getPrice() * dto.getProductCount

();

				}

				session.put("buyFlg", true);

				return result;

    }

	public static String getErrorpage() {
		return ERRORPAGE;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public static String getDestination() {
		return DESTINATION;
	}
	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}
	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public int getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}


	public int getProductCount() {
		return productCount;
	}





	public List<CartDTO> getCartList() {
		return cartList;
	}


	public void setCartList(List<CartDTO> cartList) {
		this.cartList = cartList;
	}


	public int getSettlement() {
		return settlement;
	}


	public void setSettlement(int settlement) {
		this.settlement = settlement;
	}
	public List<AddressInfoDTO> getAddressInfoListDTO() {
		return addressInfoListDTO;
	}
	public void setAddressInfoListDTO(List<AddressInfoDTO> addressInfoListDTO) {
		this.addressInfoListDTO = addressInfoListDTO;
	}
}