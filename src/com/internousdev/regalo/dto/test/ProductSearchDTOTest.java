package com.internousdev.regalo.dto.test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import com.internousdev.regalo.dto.ProductSearchDTO;

class ProductSearchDTOTest {

	@Test
	public void testGetId1() {
		ProductSearchDTO dto = new ProductSearchDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId2() {
		ProductSearchDTO dto = new ProductSearchDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId3() {
		ProductSearchDTO dto = new ProductSearchDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId4() throws Exception{
		ProductSearchDTO dto = new ProductSearchDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetId5() throws Exception{
		ProductSearchDTO dto = new ProductSearchDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	@Test
	public void testSetId1() {
		ProductSearchDTO dto = new ProductSearchDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	public void testSetId2() {
		ProductSearchDTO dto = new ProductSearchDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	public void testSetId3() {
		ProductSearchDTO dto = new ProductSearchDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId4() throws Exception{
		ProductSearchDTO dto = new ProductSearchDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetId5() throws Exception{
		ProductSearchDTO dto = new ProductSearchDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}


	// get Product_id test
	@Test
	public void testGetProduct_id1() {
		ProductSearchDTO dto = new ProductSearchDTO();
		int expected = 0;

		dto.setProduct_id(expected);
		int actual = dto.getProduct_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_id2() {
		ProductSearchDTO dto = new ProductSearchDTO();
		int expected = 2147483647;

		dto.setProduct_id(expected);
		int actual = dto.getProduct_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_id3() {
		ProductSearchDTO dto = new ProductSearchDTO();
		int expected = -2147483647;

		dto.setProduct_id(expected);
		int actual = dto.getProduct_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_id4() throws Exception{
		ProductSearchDTO dto = new ProductSearchDTO();
		try{
			int postalMax=Integer.parseInt("2147483648");
			dto.setProduct_id(postalMax);

		}catch(RuntimeException e){
		assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetProduct_id5() throws Exception{
		ProductSearchDTO dto = new ProductSearchDTO();
		try{
			int postalMin=Integer.parseInt("-2147483648");
			dto.setProduct_id(postalMin);

		}catch(RuntimeException e){
		assertEquals(e.getMessage(),"For input string: \"-2147483648\"");
		}
	}

	@Test
	public void testSetProduct_id1() {
		ProductSearchDTO dto = new ProductSearchDTO();
		int expected = 0;

		dto.setProduct_id(expected);
		int actual = dto.getProduct_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_id2() {
		ProductSearchDTO dto = new ProductSearchDTO();
		int expected = 2147483647;

		dto.setProduct_id(expected);
		int actual = dto.getProduct_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_id3() {
		ProductSearchDTO dto = new ProductSearchDTO();
		int expected = -2147483647;

		dto.setProduct_id(expected);
		int actual = dto.getProduct_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_id4() throws Exception{
		ProductSearchDTO dto = new ProductSearchDTO();
		try{
			int postalMax=Integer.parseInt("2147483648");
			dto.setProduct_id(postalMax);

		}catch(RuntimeException e){
		assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}
	}

	public void testSetProduct_id5() throws Exception{
		ProductSearchDTO dto = new ProductSearchDTO();
		try{
			int postalMin=Integer.parseInt("-2147483648");
			dto.setProduct_id(postalMin);

		}catch(RuntimeException e){
		assertEquals(e.getMessage(),"For input string: \"-2147483648\"");
		}
	}

	@Test
	public void testGetProduct_name() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="0";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name2() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="2147483647";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name3() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="-2147483647";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name4() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="null";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name5() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name6() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected =" ";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name7() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="　";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name8() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="abc123";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name9() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="あいう１２３";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name10() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="abc123あいう１２３";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name11() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name12() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="ａｂｃあいう１２３漢字";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProduct_name1() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="0";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name2() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="2147483647";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name3() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="-2147483647";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name4() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="null";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name5() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name6() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected =" ";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name7() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="　";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name8() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="abc123";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name9() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="あいう１２３";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name10() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="abc123あいう１２３";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name11() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name12() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="ａｂｃあいう１２３漢字";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}


	// get Product_name_kana test
	@Test
	public void testGetProduct_name_kana1() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "0";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name_kana2() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "2147483647";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name_kana3() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "-2147483647";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name_kana4() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "null";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name_kana5() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name_kana6() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = " ";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name_kana7() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "　";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name_kana8() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "abc123";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name_kana9() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "あいう１２３";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name_kana10() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "abc123あいう１２３";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name_kana11() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name_kana12() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}



	// set Product_name_kana test
	@Test
	public void testSetProduct_name_kana1() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "0";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name_kana2() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "2147483647";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name_kana3() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "-2147483647";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name_kana4() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "null";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name_kana5() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name_kana6() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = " ";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name_kana7() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "　";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name_kana8() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "abc123";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name_kana9() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "あいう１２３";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name_kana10() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "abc123あいう１２３";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}

	public void testSetProduct_name_kana11() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}

	public void testSetProduct_name_kana12() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}


	//  get Product_description test
	@Test
	public void testGetProduct_description1() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "0";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_description2() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "2147483647";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_description3() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "-2147483647";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_description4() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "null";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_description5() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_description6() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = " ";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_description7() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "　";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_description8() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "abc123";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_description9() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "あいう１２３";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_description10() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "abc123あいう１２３";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_description11() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_description12() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}



	// set Product_description test
	@Test
	public void testSetProduct_description() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "0";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_description2() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "2147483647";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_description3() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "-2147483647";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_description4() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "null";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_description5() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_description6() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = " ";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_description7() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "　";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_description8() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "abc123";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_description9() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "あいう１２３";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_description10() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "abc123あいう１２３";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_description11() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_description12() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}



	// get Category_id test
	@Test
	public void testGetCategory_id1() {
		ProductSearchDTO dto = new ProductSearchDTO();
		int expected = 0;

		dto.setCategory_id(expected);
		int actual = dto.getCategory_id();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCategory_id2() {
		ProductSearchDTO dto = new ProductSearchDTO();
		int expected = 2147483647;

		dto.setCategory_id(expected);
		int actual = dto.getCategory_id();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCategory_id3() {
		ProductSearchDTO dto = new ProductSearchDTO();
		int expected = -2147483647;

		dto.setCategory_id(expected);
		int actual = dto.getCategory_id();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCategory_id4() throws Exception {
		ProductSearchDTO dto = new ProductSearchDTO();
		try{
			int postalMax = Integer.parseInt("2147483647");
			dto.setCategory_id(postalMax);

		}catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string:\"2147483648\"");
		}
	}
	@Test
	public void testGetCategory_id5() throws Exception {
		ProductSearchDTO dto = new ProductSearchDTO();
		try{
			int postalMin = Integer.parseInt("-2147483647");
			dto.setCategory_id(postalMin);

		}catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string:\"-2147483648\"");
		}
	}


	// set Category_id test
	@Test
	public void testSetCategory_id1() {
		ProductSearchDTO dto = new ProductSearchDTO();
		int expected = 0;

		dto.setCategory_id(expected);
		int actual = dto.getCategory_id();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCategory_id2() {
		ProductSearchDTO dto = new ProductSearchDTO();
		int expected = 2147483647;

		dto.setCategory_id(expected);
		int actual = dto.getCategory_id();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCategory_id3() {
		ProductSearchDTO dto = new ProductSearchDTO();
		int expected = -2147483647;

		dto.setCategory_id(expected);
		int actual = dto.getCategory_id();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCategory_id4() throws Exception {
		ProductSearchDTO dto = new ProductSearchDTO();
		try{
			int postalMax = Integer.parseInt("2147483647");
			dto.setCategory_id(postalMax);

		}catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string:\"2147483648\"");
		}
	}
	@Test
	public void testSetCategory_id5() throws Exception {
		ProductSearchDTO dto = new ProductSearchDTO();
		try{
			int postalMin = Integer.parseInt("-2147483647");
			dto.setCategory_id(postalMin);

		}catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string:\"-2147483648\"");
		}
	}





	// get Product_count test
	@Test
	public void testGetProduct_count1() {
		ProductSearchDTO dto = new ProductSearchDTO();
		int expected = 0;

		dto.setProduct_count(expected);
		int actual = dto.getProduct_count();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_count2() {
		ProductSearchDTO dto = new ProductSearchDTO();
		int expected = 9999999;

		dto.setProduct_count(expected);
		int actual = dto.getProduct_count();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProduct_count3() {
		ProductSearchDTO dto = new ProductSearchDTO();
		int expected = -9999999;

		dto.setProduct_count(expected);
		int actual = dto.getProduct_count();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProduct_count4() throws Exception{
		ProductSearchDTO dto = new ProductSearchDTO();
		try{
			int postalMax =10000000;
			dto.setProduct_count(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}
	@Test
	public void testGetProduct_count5() throws Exception{
		ProductSearchDTO dto = new ProductSearchDTO();
		try{
			int postalMax =-10000000;
			dto.setProduct_count(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}



	// set Product_count test
	@Test
	public void testSetProduct_count1() {
		ProductSearchDTO dto = new ProductSearchDTO();
		int expected = 0;

		dto.setProduct_count(expected);
		int actual = dto.getProduct_count();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_count2() {
		ProductSearchDTO dto = new ProductSearchDTO();
		int expected = 9999999;

		dto.setProduct_count(expected);
		int actual = dto.getProduct_count();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProduct_count3() {
		ProductSearchDTO dto = new ProductSearchDTO();
		int expected = -9999999;

		dto.setProduct_count(expected);
		int actual = dto.getProduct_count();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProduct_count4() throws Exception{
		ProductSearchDTO dto = new ProductSearchDTO();
		try{
			int postalMax =10000000;
			dto.setProduct_count(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}
	@Test
	public void testSetProduct_count5() throws Exception{
		ProductSearchDTO dto = new ProductSearchDTO();
		try{
			int postalMax =-10000000;
			dto.setProduct_count(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}


	// get Image_file_name test
	@Test
	public void testGetImage_file_name1() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImage_file_name6() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected =" ";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImage_file_name7() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="　";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImage_file_name8() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="abc123";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImage_file_name9() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="あいう１２３";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImage_file_name10() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="abc123あいう１２３";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImage_file_name11() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImage_file_name12() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="ａｂｃあいう１２３";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected,actual);
	}



	// set Image_file_name test
	@Test
	public void testSetImage_file_name() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImage_file_name6() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected =" ";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImage_file_name7() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="　";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImage_file_name8() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="abc123";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImage_file_name9() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="あいう１２３";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImage_file_name10() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="abc123あいう１２３";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImage_file_name11() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImage_file_name12() {
		ProductSearchDTO dto = new ProductSearchDTO();
		String expected ="ａｂｃあいう１２３";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected,actual);
	}







	// get Total_price test
		@Test
		public void testGetTotal_price1() {
			ProductSearchDTO dto = new ProductSearchDTO();
			int expected = 0;

			dto.setTotal_price(expected);
			int actual = dto.getTotal_price();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetTotal_price2() {
			ProductSearchDTO dto = new ProductSearchDTO();
			int expected = 9999999;

			dto.setTotal_price(expected);
			int actual = dto.getTotal_price();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetTotal_price3() {
			ProductSearchDTO dto = new ProductSearchDTO();
			int expected = -9999999;

			dto.setTotal_price(expected);
			int actual = dto.getTotal_price();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetTotal_price4() throws Exception{
			ProductSearchDTO dto = new ProductSearchDTO();
			try{
				int postalMax =10000000;
				dto.setTotal_price(postalMax);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
			}
		}
		@Test
		public void testGetTotal_price5() throws Exception{
			ProductSearchDTO dto = new ProductSearchDTO();
			try{
				int postalMax =-10000000;
				dto.setTotal_price(postalMax);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
			}
		}



		// set Total_price test
		@Test
		public void testSetTotal_price1() {
			ProductSearchDTO dto = new ProductSearchDTO();
			int expected = 0;

			dto.setTotal_price(expected);
			int actual = dto.getTotal_price();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetTotal_price2() {
			ProductSearchDTO dto = new ProductSearchDTO();
			int expected = 9999999;

			dto.setTotal_price(expected);
			int actual = dto.getTotal_price();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTotal_price3() {
			ProductSearchDTO dto = new ProductSearchDTO();
			int expected = -9999999;

			dto.setTotal_price(expected);
			int actual = dto.getTotal_price();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTotal_price4() throws Exception{
			ProductSearchDTO dto = new ProductSearchDTO();
			try{
				int postalMax =10000000;
				dto.setTotal_price(postalMax);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
			}
		}
		@Test
		public void testSetTotal_price5() throws Exception{
			ProductSearchDTO dto = new ProductSearchDTO();
			try{
				int postalMax =-10000000;
				dto.setTotal_price(postalMax);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
			}
		}


		// get Pay test
			@Test
			public void testGetPay1() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="0";

				dto.setPay(expected);
				String actual = dto.getPay();
				assertEquals(expected,actual);
			}

			@Test
			public void testGetPay2() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="2147483647";

				dto.setPay(expected);
				String actual = dto.getPay();
				assertEquals(expected,actual);
			}

			@Test
			public void testGetPay3() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="-2147483647";

				dto.setPay(expected);
				String actual = dto.getPay();
				assertEquals(expected,actual);
			}

			@Test
			public void testGetPay4() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="null";

				dto.setPay(expected);
				assertEquals(expected,dto.getPay());
			}
			@Test
			public void testGetPay5() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="";

				dto.setPay(expected);
				assertEquals(expected,dto.getPay());
			}
			@Test
			public void testGetPay6() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected =" ";

				dto.setPay(expected);
				assertEquals(expected,dto.getPay());
			}
			@Test
			public void testGetPay7() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="　";

				dto.setPay(expected);
				assertEquals(expected,dto.getPay());
			}
			@Test
			public void testGetPay8() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="abc123";

				dto.setPay(expected);
				assertEquals(expected,dto.getPay());
			}
			@Test
			public void testGetPay9() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="あいう１２３";

				dto.setPay(expected);
				assertEquals(expected,dto.getPay());
			}
			@Test
			public void testGetPay10() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="abc123あいう１２３";

				dto.setPay(expected);
				String actual = dto.getPay();
				assertEquals(expected,actual);
			}
			@Test

			public void testGetPay11() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="abc123あいう１２３漢字";

				dto.setPay(expected);
				String actual = dto.getPay();
				assertEquals(expected,actual);
			}

			@Test
			public void testGetPay12() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="ａｂｃあいう１２３";

				dto.setPay(expected);
				String actual = dto.getPay();
				assertEquals(expected,actual);
			}



			// set Pay test
			@Test
			public void testSetPay1() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="0";

				dto.setPay(expected);
				String actual = dto.getPay();
				assertEquals(expected,actual);
			}

			@Test
			public void testSetPay2() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="2147483647";

				dto.setPay(expected);
				String actual = dto.getPay();
				assertEquals(expected,actual);
			}

			@Test
			public void testSetPay3() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="-2147483647";

				dto.setPay(expected);
				String actual = dto.getPay();
				assertEquals(expected,actual);
			}

			@Test
			public void testSetPay4() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="null";

				dto.setPay(expected);
				assertEquals(expected,dto.getPay());
			}
			@Test
			public void testSetPay5() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="";

				dto.setPay(expected);
				assertEquals(expected,dto.getPay());
			}
			@Test
			public void testSetPay6() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected =" ";

				dto.setPay(expected);
				assertEquals(expected,dto.getPay());
			}
			@Test
			public void testSetPay7() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="　";

				dto.setPay(expected);
				assertEquals(expected,dto.getPay());
			}
			@Test
			public void testSetPay8() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="abc123";

				dto.setPay(expected);
				assertEquals(expected,dto.getPay());
			}
			@Test
			public void testSetPay9() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="あいう１２３";

				dto.setPay(expected);
				assertEquals(expected,dto.getPay());
			}
			@Test
			public void testSetPay10() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="abc123あいう１２３";

				dto.setPay(expected);
				String actual = dto.getPay();
				assertEquals(expected,actual);
			}

			@Test
			public void testSetPay11() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="abc123あいう１２３漢字";

				dto.setPay(expected);
				String actual = dto.getPay();
				assertEquals(expected,actual);
			}

			@Test
			public void testSetPay12() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="ａｂｃあいう１２３";

				dto.setPay(expected);
				String actual = dto.getPay();
				assertEquals(expected,actual);
			}

			// get Product_stock test
			@Test
			public void testGetProduct_stock1() {
				ProductSearchDTO dto =new ProductSearchDTO();
				int expected = 0;

				dto.setProduct_stock(expected);
				int actual = dto.getProduct_stock();
				assertEquals(expected, actual);
			}

			@Test
			public void testGetProduct_stock2() {
				ProductSearchDTO dto =new ProductSearchDTO();
				int expected = 9999999;

				dto.setProduct_stock(expected);
				int actual = dto.getProduct_stock();
				assertEquals(expected, actual);
			}

			@Test
			public void testGetProduct_stock3() {
				ProductSearchDTO dto =new ProductSearchDTO();
				int expected = -9999999;

				dto.setProduct_stock(expected);
				int actual = dto.getProduct_stock();
				assertEquals(expected, actual);
			}

			@Test
			public void testGetProduct_stock4() throws Exception{
				ProductSearchDTO dto =new ProductSearchDTO();
				try{
					int postalMax =10000000;
					dto.setProduct_stock(postalMax);
				}catch(RuntimeException e){
					assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
				}
			}

			@Test
			public void testGetProduct_stock5() throws Exception{
				ProductSearchDTO dto =new ProductSearchDTO();
				try{
					int postalMax =-10000000;
					dto.setProduct_stock(postalMax);
				}catch(RuntimeException e){
					assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
				}
			}

			// set Product_stock test
			@Test
			public void testSetProduct_stock1() {
				ProductSearchDTO dto =new ProductSearchDTO();
				int expected = 0;

				dto.setProduct_stock(expected);
				int actual = dto.getProduct_stock();
				assertEquals(expected, actual);
			}

			@Test
			public void testSetProduct_stock2() {
				ProductSearchDTO dto =new ProductSearchDTO();
				int expected = 9999999;

				dto.setProduct_stock(expected);
				int actual = dto.getProduct_stock();
				assertEquals(expected, actual);
			}


			@Test
			public void testSetProduct_stock3() {
				ProductSearchDTO dto =new ProductSearchDTO();
				int expected = -9999999;

				dto.setProduct_stock(expected);
				int actual = dto.getProduct_stock();
				assertEquals(expected, actual);
			}

			@Test
			public void testSetProduct_stock4() throws Exception{
				ProductSearchDTO dto =new ProductSearchDTO();
				try{
					int postalMax =10000000;
					dto.setProduct_stock(postalMax);
				}catch(RuntimeException e){
					assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
				}
			}

			@Test
			public void testSetProduct_stock5() throws Exception{
				ProductSearchDTO dto =new ProductSearchDTO();
				try{
					int postalMax =-10000000;
					dto.setProduct_stock(postalMax);
				}catch(RuntimeException e){
					assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
				}
			}

			// get Total_count test
			@Test
			public void testGetTotal_count1() {
				ProductSearchDTO dto =new ProductSearchDTO();
				int expected = 0;

				dto.setTotal_count(expected);
				int actual = dto.getTotal_count();
				assertEquals(expected, actual);
			}

			@Test
			public void testGetTotal_count2() {
				ProductSearchDTO dto =new ProductSearchDTO();
				int expected = 9999999;

				dto.setTotal_count(expected);
				int actual = dto.getTotal_count();
				assertEquals(expected, actual);
			}

			@Test
			public void testGetTotal_count3() {
				ProductSearchDTO dto =new ProductSearchDTO();
				int expected = -9999999;

				dto.setTotal_count(expected);
				int actual = dto.getTotal_count();
				assertEquals(expected, actual);
			}

			@Test
			public void testGetTotal_count4() throws Exception{
				ProductSearchDTO dto =new ProductSearchDTO();
				try{
					int postalMax =10000000;
					dto.setTotal_count(postalMax);
				}catch(RuntimeException e){
					assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
				}
			}

			@Test
			public void testGetTotal_count5() throws Exception{
				ProductSearchDTO dto =new ProductSearchDTO();
				try{
					int postalMax =-10000000;
					dto.setTotal_count(postalMax);
				}catch(RuntimeException e){
					assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
				}
			}

			// set Total_count test
			@Test
			public void testSetTotal_count1() {
				ProductSearchDTO dto =new ProductSearchDTO();
				int expected = 0;

				dto.setTotal_count(expected);
				int actual = dto.getTotal_count();
				assertEquals(expected, actual);
			}

			@Test
			public void testSetTotal_count2() {
				ProductSearchDTO dto =new ProductSearchDTO();
				int expected = 9999999;

				dto.setTotal_count(expected);
				int actual = dto.getTotal_count();
				assertEquals(expected, actual);
			}


			@Test
			public void testSetTotal_count3() {
				ProductSearchDTO dto =new ProductSearchDTO();
				int expected = -9999999;

				dto.setTotal_count(expected);
				int actual = dto.getTotal_count();
				assertEquals(expected, actual);
			}

			@Test
			public void testSetTotal_count4() throws Exception{
				ProductSearchDTO dto =new ProductSearchDTO();
				try{
					int postalMax =10000000;
					dto.setTotal_count(postalMax);
				}catch(RuntimeException e){
					assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
				}
			}

			@Test
			public void testSetTotal_count5() throws Exception{
				ProductSearchDTO dto =new ProductSearchDTO();
				try{
					int postalMax =-10000000;
					dto.setTotal_count(postalMax);
				}catch(RuntimeException e){
					assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
				}
			}

			// get Product_type_count test
			@Test
			public void testGetProduct_type_count1() {
				ProductSearchDTO dto =new ProductSearchDTO();
				int expected = 0;

				dto.setProduct_type_count(expected);
				int actual = dto.getProduct_type_count();
				assertEquals(expected, actual);
			}

			@Test
			public void testGetProduct_type_count2() {
				ProductSearchDTO dto =new ProductSearchDTO();
				int expected = 9999999;

				dto.setProduct_type_count(expected);
				int actual = dto.getProduct_type_count();
				assertEquals(expected, actual);
			}

			@Test
			public void testGetProduct_type_count3() {
				ProductSearchDTO dto =new ProductSearchDTO();
				int expected = -9999999;

				dto.setProduct_type_count(expected);
				int actual = dto.getProduct_type_count();
				assertEquals(expected, actual);
			}

			@Test
			public void testGetProduct_type_count4() throws Exception{
				ProductSearchDTO dto =new ProductSearchDTO();
				try{
					int postalMax =10000000;
					dto.setProduct_type_count(postalMax);
				}catch(RuntimeException e){
					assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
				}
			}

			@Test
			public void testGetProduct_type_count5() throws Exception{
				ProductSearchDTO dto =new ProductSearchDTO();
				try{
					int postalMax =-10000000;
					dto.setProduct_type_count(postalMax);
				}catch(RuntimeException e){
					assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
				}
			}

			// set Product_type_count test
			@Test
			public void testSetProduct_type_count1() {
				ProductSearchDTO dto =new ProductSearchDTO();
				int expected = 0;

				dto.setProduct_type_count(expected);
				int actual = dto.getProduct_type_count();
				assertEquals(expected, actual);
			}

			@Test
			public void testSetProduct_type_count2() {
				ProductSearchDTO dto =new ProductSearchDTO();
				int expected = 9999999;

				dto.setProduct_type_count(expected);
				int actual = dto.getProduct_type_count();
				assertEquals(expected, actual);
			}


			@Test
			public void testSetProduct_type_count3() {
				ProductSearchDTO dto =new ProductSearchDTO();
				int expected = -9999999;

				dto.setProduct_type_count(expected);
				int actual = dto.getProduct_type_count();
				assertEquals(expected, actual);
			}

			@Test
			public void testSetProduct_type_count4() throws Exception{
				ProductSearchDTO dto =new ProductSearchDTO();
				try{
					int postalMax =10000000;
					dto.setProduct_type_count(postalMax);
				}catch(RuntimeException e){
					assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
				}
			}

			@Test
			public void testSetProduct_type_count5() throws Exception{
				ProductSearchDTO dto =new ProductSearchDTO();
				try{
					int postalMax =-10000000;
					dto.setProduct_type_count(postalMax);
				}catch(RuntimeException e){
					assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
				}
			}

			// get How_product_search test
			@Test
			public void testGetHow_product_search1() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="0";

				dto.setHow_product_search(expected);
				String actual = dto.getHow_product_search();
				assertEquals(expected,actual);
			}

			@Test
			public void testGetHow_product_search2() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="2147483647";

				dto.setHow_product_search(expected);
				String actual = dto.getHow_product_search();
				assertEquals(expected,actual);
			}

			@Test
			public void testGetHow_product_search3() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="-2147483647";

				dto.setHow_product_search(expected);
				String actual = dto.getHow_product_search();
				assertEquals(expected,actual);
			}

			@Test
			public void testGetHow_product_search4() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="null";

				dto.setHow_product_search(expected);
				assertEquals(expected,dto.getHow_product_search());
			}
			@Test
			public void testGetHow_product_search5() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="";

				dto.setHow_product_search(expected);
				assertEquals(expected,dto.getHow_product_search());
			}
			@Test
			public void testGetHow_product_search6() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected =" ";

				dto.setHow_product_search(expected);
				assertEquals(expected,dto.getHow_product_search());
			}
			@Test
			public void testGetHow_product_search7() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="　";

				dto.setHow_product_search(expected);
				assertEquals(expected,dto.getHow_product_search());
			}
			@Test
			public void testGetHow_product_search8() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="abc123";

				dto.setHow_product_search(expected);
				assertEquals(expected,dto.getHow_product_search());
			}
			@Test
			public void testGetHow_product_search9() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="あいう１２３";

				dto.setHow_product_search(expected);
				assertEquals(expected,dto.getHow_product_search());
			}
			@Test
			public void testGetHow_product_search10() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="abc123あいう１２３";

				dto.setHow_product_search(expected);
				String actual = dto.getHow_product_search();
				assertEquals(expected,actual);
			}
			@Test

			public void testGetHow_product_search11() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="abc123あいう１２３漢字";

				dto.setHow_product_search(expected);
				String actual = dto.getHow_product_search();
				assertEquals(expected,actual);
			}

			@Test
			public void testGetHow_product_search12() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="ａｂｃあいう１２３";

				dto.setHow_product_search(expected);
				String actual = dto.getHow_product_search();
				assertEquals(expected,actual);
			}



			// set How_product_search test
			@Test
			public void testSetHow_product_search1() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="0";

				dto.setHow_product_search(expected);
				String actual = dto.getHow_product_search();
				assertEquals(expected,actual);
			}

			@Test
			public void testSetHow_product_search2() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="2147483647";

				dto.setHow_product_search(expected);
				String actual = dto.getHow_product_search();
				assertEquals(expected,actual);
			}

			@Test
			public void testSetHow_product_search3() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="-2147483647";

				dto.setHow_product_search(expected);
				String actual = dto.getHow_product_search();
				assertEquals(expected,actual);
			}

			@Test
			public void testSetHow_product_search4() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="null";

				dto.setHow_product_search(expected);
				assertEquals(expected,dto.getHow_product_search());
			}
			@Test
			public void testSetHow_product_search5() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="";

				dto.setHow_product_search(expected);
				assertEquals(expected,dto.getHow_product_search());
			}
			@Test
			public void testSetHow_product_search6() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected =" ";

				dto.setHow_product_search(expected);
				assertEquals(expected,dto.getHow_product_search());
			}
			@Test
			public void testSetHow_product_search7() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="　";

				dto.setHow_product_search(expected);
				assertEquals(expected,dto.getHow_product_search());
			}
			@Test
			public void testSetHow_product_search8() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="abc123";

				dto.setHow_product_search(expected);
				assertEquals(expected,dto.getHow_product_search());
			}
			@Test
			public void testSetHow_product_search9() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="あいう１２３";

				dto.setHow_product_search(expected);
				assertEquals(expected,dto.getHow_product_search());
			}
			@Test
			public void testSetHow_product_search10() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="abc123あいう１２３";

				dto.setHow_product_search(expected);
				String actual = dto.getHow_product_search();
				assertEquals(expected,actual);
			}

			@Test
			public void testSetHow_product_search11() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="abc123あいう１２３漢字";

				dto.setHow_product_search(expected);
				String actual = dto.getHow_product_search();
				assertEquals(expected,actual);
			}

			@Test
			public void testSetHow_product_search12() {
				ProductSearchDTO dto = new ProductSearchDTO();
				String expected ="ａｂｃあいう１２３";

				dto.setHow_product_search(expected);
				String actual = dto.getHow_product_search();
				assertEquals(expected,actual);
			}

}
