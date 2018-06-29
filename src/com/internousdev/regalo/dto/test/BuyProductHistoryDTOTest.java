package com.internousdev.regalo.dto.test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import com.internousdev.regalo.dto.BuyProductHistoryDTO;

class BuyProductHistoryDTOTest {

	// get Id test
	@Test
	public void testGetId1() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId2() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		int expected = 9999999;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId3() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		int expected = -9999999;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId4() throws Exception{
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		try{
			int postalMax =10000000;
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}

	@Test
	public void testGetId5() throws Exception{
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		try{
			int postalMax =-10000000;
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}

	// set Id test
	@Test
	public void testSetId1() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId2() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		int expected = 9999999;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}


	@Test
	public void testSetId3() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		int expected = -9999999;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId4() throws Exception{
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		try{
			int postalMax =10000000;
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}

	@Test
	public void testSetId5() throws Exception{
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		try{
			int postalMax =-10000000;
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}

	// get UserId test
	@Test
	public void testGetUserId1() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		int expected = 0;

		dto.setUserId(expected);
		int actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId2() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		int expected = 9999999;

		dto.setUserId(expected);
		int actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId3() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		int expected = -9999999;

		dto.setUserId(expected);
		int actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId4() throws Exception{
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		try{
			int postalMax =10000000;
			dto.setUserId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}

	@Test
	public void testGetUserId5() throws Exception{
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		try{
			int postalMax =-10000000;
			dto.setUserId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}

	// set UserId test
	@Test
	public void testSetUserId1() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		int expected = 0;

		dto.setUserId(expected);
		int actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId2() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		int expected = 9999999;

		dto.setUserId(expected);
		int actual = dto.getUserId();
		assertEquals(expected, actual);
	}


	@Test
	public void testSetUserId3() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		int expected = -9999999;

		dto.setUserId(expected);
		int actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId4() throws Exception{
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		try{
			int postalMax =10000000;
			dto.setUserId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}

	@Test
	public void testSetUserId5() throws Exception{
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		try{
			int postalMax =-10000000;
			dto.setUserId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}

	// get ProductId test
	@Test
	public void testGetProductId1() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId2() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		int expected = 9999999;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId3() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		int expected = -9999999;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId4() throws Exception{
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		try{
			int postalMax =10000000;
			dto.setProductId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}

	@Test
	public void testGetProductId5() throws Exception{
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		try{
			int postalMax =-10000000;
			dto.setProductId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}

	// set ProductId test
	@Test
	public void testSetProductId1() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId2() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		int expected = 9999999;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}


	@Test
	public void testSetProductId3() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		int expected = -9999999;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId4() throws Exception{
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		try{
			int postalMax =10000000;
			dto.setProductId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}

	@Test
	public void testSetProductId5() throws Exception{
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		try{
			int postalMax =-10000000;
			dto.setProductId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}

	// get Price test
	@Test
	public void testGetPrice1() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice2() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		int expected = 9999999;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice3() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		int expected = -9999999;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice4() throws Exception{
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		try{
			int postalMax =10000000;
			dto.setPrice(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}

	@Test
	public void testGetPrice5() throws Exception{
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		try{
			int postalMax =-10000000;
			dto.setPrice(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}

	// set Price test
	@Test
	public void testSetPrice1() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice2() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		int expected = 9999999;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}


	@Test
	public void testSetPrice3() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		int expected = -9999999;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice4() throws Exception{
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		try{
			int postalMax =10000000;
			dto.setPrice(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}

	@Test
	public void testSetPrice5() throws Exception{
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		try{
			int postalMax =-10000000;
			dto.setPrice(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}


	// get DestinationId test
	@Test
	public void testGetDestinationId1() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		int expected = 0;

		dto.setDestinationId(expected);
		int actual = dto.getDestinationId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetDestinationId2() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		int expected = 9999999;

		dto.setDestinationId(expected);
		int actual = dto.getDestinationId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetDestinationId3() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		int expected = -9999999;

		dto.setDestinationId(expected);
		int actual = dto.getDestinationId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetDestinationId4() throws Exception{
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		try{
			int postalMax =10000000;
			dto.setDestinationId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}

	@Test
	public void testGetDestinationId5() throws Exception{
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		try{
			int postalMax =-10000000;
			dto.setDestinationId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}

	// set DestinationId test
	@Test
	public void testSetDestinationId1() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		int expected = 0;

		dto.setDestinationId(expected);
		int actual = dto.getDestinationId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetDestinationId2() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		int expected = 9999999;

		dto.setDestinationId(expected);
		int actual = dto.getDestinationId();
		assertEquals(expected, actual);
	}


	@Test
	public void testSetDestinationId3() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		int expected = -9999999;

		dto.setDestinationId(expected);
		int actual = dto.getDestinationId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetDestinationId4() throws Exception{
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		try{
			int postalMax =10000000;
			dto.setDestinationId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}

	@Test
	public void testSetDestinationId5() throws Exception{
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		try{
			int postalMax =-10000000;
			dto.setDestinationId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}

	// get ReleaseCompany test
	@Test
	public void testGetReleaseCompany1() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected="0";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany2() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected="2147483647";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseCompany3() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected="-2147483647";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany4() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected="null";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany5() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected="";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany6() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected=" ";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany7() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected="　";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany8() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected="abc123";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany9() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected="あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany10() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected="abc123あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany11() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected="abc123あいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany12() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected="ａｂｃあいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}


	// set ReleaseCompany test
	@Test
	public void testSetReleaseCompany1() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected="0";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany2() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected="2147483647";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany3() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected="-2147483647";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany4() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected="null";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany5() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected="";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany6() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected=" ";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany7() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected="　";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany8() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected="abc123";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany9() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected="あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany10() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected="abc123あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany11() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected="abc123あいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany12() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected="ａｂｃあいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName1() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "0";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName2() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "2147483647";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName3() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "-2147483647";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName4() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "null";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName5() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName6() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = " ";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName7() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "　";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName8() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "abc123";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName9() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName10() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName11() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName12() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}


	// set ImageFileName
	@Test
	public void testSetImageFileName1() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "0";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName2() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "2147483647";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName3() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "-2147483647";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName4() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "null";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName5() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName6() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = " ";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName7() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "　";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName8() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "abc123";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName9() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName10() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName11() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName12() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	// get ProductName test
	@Test
	public void testGetProductName1() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="0";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName2() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName3() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="-2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName4() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="null";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName5() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName6() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected =" ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName7() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName8() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="abc123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName9() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName10() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName11() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName12() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="ａｂｃあいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}


	// set ProductName test
	@Test
	public void testSetProductName1() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="0";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName2() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName3() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="-2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName4() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="null";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName5() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName6() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected =" ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName7() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName8() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="abc123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName9() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName10() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName11() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName12() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="ａｂｃあいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath1() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "0";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath2() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "2147483647";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath3() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "-2147483647";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath4() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "null";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath5() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath6() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath7() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath8() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "abc123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath9() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath10() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath11() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath12() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}


	// set ImageFilePath test
	@Test
	public void testSetImageFilePath1() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "0";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath2() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "2147483647";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath3() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "-2147483647";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath4() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "null";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath5() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath6() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath7() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath8() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "abc123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath9() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath10() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath11() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath12() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	// get ReleaseDate test
	@Test
	public void testGetReleaseDate1() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="0";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseDate2() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="2147483647";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseDate3() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="-2147483647";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseDate4() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="null";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseDate5() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseDate6() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected =" ";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseDate7() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="　";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseDate8() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="abc123";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseDate9() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseDate10() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="abc123あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseDate11() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseDate12() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="ａｂｃあいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}


	@Test
	public void testSetReleaseDate1() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="0";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseDate2() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="2147483647";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseDate3() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="-2147483647";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseDate4() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="null";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseDate5() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseDate6() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected =" ";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseDate7() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="　";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseDate8() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="abc123";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseDate9() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseDate10() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="abc123あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseDate11() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseDate12() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected ="ａｂｃあいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	// get ProductNameKana test
	@Test
	public void testGetProductNameKana1() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "0";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana2() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "2147483647";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana3() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "-2147483647";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana4() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "null";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana5() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana6() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana7() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana8() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "abc123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana9() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana10() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana11() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana12() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}


	// set ProductNameKana test
	@Test
	public void testSetProductNameKana1() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "0";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana2() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "2147483647";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana3() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "-2147483647";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana4() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "null";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana5() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana6() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana7() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana8() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "abc123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana9() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana10() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana11() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana12() {
		BuyProductHistoryDTO dto =new BuyProductHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

}
