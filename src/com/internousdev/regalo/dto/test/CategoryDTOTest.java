package com.internousdev.regalo.dto.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

import com.internousdev.regalo.dto.CategoryDTO;

class CategoryDTOTest {

	//get Id test
		@Test
		public void testGetId1() {
			CategoryDTO dto = new CategoryDTO();
			int expected = 0;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetId2() {
			CategoryDTO dto = new CategoryDTO();
			int expected = 2147483647;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetId3() {
			CategoryDTO dto = new CategoryDTO();
			int expected = -2147483647;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetId4() throws Exception{
			CategoryDTO dto = new CategoryDTO();
			try{
				int postalMax = Integer.parseInt("214748364");
				dto.setId(postalMax);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetId5() throws Exception{
			CategoryDTO dto = new CategoryDTO();
			try{
				int postalMin = Integer.parseInt("-214748364");
				dto.setId(postalMin);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}


		// set Id test
		@Test
		public void testSetId1() {
			CategoryDTO dto = new CategoryDTO();
			int expected = 0;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetId2() {
			CategoryDTO dto = new CategoryDTO();
			int expected = 2147483647;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetId3() {
			CategoryDTO dto = new CategoryDTO();
			int expected = -2147483647;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetId4() throws Exception{
			CategoryDTO dto = new CategoryDTO();
			try{
				int postalMax = Integer.parseInt("214748364");
				dto.setId(postalMax);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetId5() throws Exception{
			CategoryDTO dto = new CategoryDTO();
			try{
				int postalMin = Integer.parseInt("-214748364");
				dto.setId(postalMin);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}


		// get CategoryId test
		@Test
		public void testGetCategoryId1() {
			CategoryDTO dto = new CategoryDTO();
			int expected = 0;

			dto.setCategoryId(expected);
			int actual = dto.getCategoryId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetCategoryId2() {
			CategoryDTO dto = new CategoryDTO();
			int expected = 2147483647;

			dto.setCategoryId(expected);
			int actual = dto.getCategoryId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetCategoryId3() {
			CategoryDTO dto = new CategoryDTO();
			int expected = -2147483647;

			dto.setCategoryId(expected);
			int actual = dto.getCategoryId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetCategoryId4() throws Exception{
			CategoryDTO dto = new CategoryDTO();
			try{
				int postalMax = Integer.parseInt("214748364");
				dto.setCategoryId(postalMax);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetCategoryId5() throws Exception{
			CategoryDTO dto = new CategoryDTO();
			try{
				int postalMin = Integer.parseInt("-214748364");
				dto.setCategoryId(postalMin);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}

		// set CategoryId test
		@Test
		public void testSetCategoryId() {
			CategoryDTO dto = new CategoryDTO();
			int expected = 0;

			dto.setCategoryId(expected);
			int actual = dto.getCategoryId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetCategoryId2() {
			CategoryDTO dto = new CategoryDTO();
			int expected = 2147483647;

			dto.setCategoryId(expected);
			int actual = dto.getCategoryId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetCategoryId3() {
			CategoryDTO dto = new CategoryDTO();
			int expected = -2147483647;

			dto.setCategoryId(expected);
			int actual = dto.getCategoryId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetCategoryId4() throws Exception{
			CategoryDTO dto = new CategoryDTO();
			try{
				int postalMax = Integer.parseInt("214748364");
				dto.setCategoryId(postalMax);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetCategoryId5() throws Exception{
			CategoryDTO dto = new CategoryDTO();
			try{
				int postalMin = Integer.parseInt("-214748364");
				dto.setCategoryId(postalMin);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}

		// get CategoryName test
		@Test
		public void testGetCategoryName1() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "0";

			dto.setCategoryName(expected);
			String actual = dto.getCategoryName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetCategoryName2() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "2147483647";

			dto.setCategoryName(expected);
			String actual = dto.getCategoryName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetCategoryName3() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "-2147483647";

			dto.setCategoryName(expected);
			String actual = dto.getCategoryName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetCategoryName4() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "null";

			dto.setCategoryName(expected);
			String actual = dto.getCategoryName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetCategoryName5() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "";

			dto.setCategoryName(expected);
			String actual = dto.getCategoryName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetCategoryName6() {
			CategoryDTO dto = new CategoryDTO();
			String expected = " ";

			dto.setCategoryName(expected);
			String actual = dto.getCategoryName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetCategoryName7() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "　";

			dto.setCategoryName(expected);
			String actual = dto.getCategoryName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetCategoryName8() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "abc123";

			dto.setCategoryName(expected);
			String actual = dto.getCategoryName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetCategoryName9() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "あいう１２３";

			dto.setCategoryName(expected);
			String actual = dto.getCategoryName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetCategoryName10() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "abc123あいう１２３";

			dto.setCategoryName(expected);
			String actual = dto.getCategoryName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetCategoryName11() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setCategoryName(expected);
			String actual = dto.getCategoryName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetCategoryName12() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setCategoryName(expected);
			String actual = dto.getCategoryName();
			assertEquals(expected, actual);
		}



		// Set CategoryName test
		@Test
		public void testSetCategoryName1() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "0";

			dto.setCategoryName(expected);
			String actual = dto.getCategoryName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetCategoryName2() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "2147483647";

			dto.setCategoryName(expected);
			String actual = dto.getCategoryName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetCategoryName3() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "-2147483647";

			dto.setCategoryName(expected);
			String actual = dto.getCategoryName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetCategoryName4() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "null";

			dto.setCategoryName(expected);
			String actual = dto.getCategoryName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetCategoryName5() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "";

			dto.setCategoryName(expected);
			String actual = dto.getCategoryName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetCategoryName6() {
			CategoryDTO dto = new CategoryDTO();
			String expected = " ";

			dto.setCategoryName(expected);
			String actual = dto.getCategoryName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetCategoryName7() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "　";

			dto.setCategoryName(expected);
			String actual = dto.getCategoryName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetCategoryName8() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "abc123";

			dto.setCategoryName(expected);
			String actual = dto.getCategoryName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetCategoryName9() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "あいう１２３";

			dto.setCategoryName(expected);
			String actual = dto.getCategoryName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetCategoryName10() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "abc123あいう１２３";

			dto.setCategoryName(expected);
			String actual = dto.getCategoryName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetCategoryName11() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setCategoryName(expected);
			String actual = dto.getCategoryName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetCategoryName12() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setCategoryName(expected);
			String actual = dto.getCategoryName();
			assertEquals(expected, actual);
		}


		// get CategoryDescription test
		@Test
		public void testGetCategoryDescription1() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "0";

			dto.setCategoryDescription(expected);
			String actual = dto.getCategoryDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetCategoryDescription2() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "2147483647";

			dto.setCategoryDescription(expected);
			String actual = dto.getCategoryDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetCategoryDescription3() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "-2147483647";

			dto.setCategoryDescription(expected);
			String actual = dto.getCategoryDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetCategoryDescription4() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "null";

			dto.setCategoryDescription(expected);
			String actual = dto.getCategoryDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetCategoryDescription5() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "";

			dto.setCategoryDescription(expected);
			String actual = dto.getCategoryDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetCategoryDescription6() {
			CategoryDTO dto = new CategoryDTO();
			String expected = " ";

			dto.setCategoryDescription(expected);
			String actual = dto.getCategoryDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetCategoryDescription7() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "　";

			dto.setCategoryDescription(expected);
			String actual = dto.getCategoryDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetCategoryDescription8() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "abc123";

			dto.setCategoryDescription(expected);
			String actual = dto.getCategoryDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetCategoryDescription9() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "あいう１２３";

			dto.setCategoryDescription(expected);
			String actual = dto.getCategoryDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetCategoryDescription10() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "abc123あいう１２３";

			dto.setCategoryDescription(expected);
			String actual = dto.getCategoryDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetCategoryDescription11() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setCategoryDescription(expected);
			String actual = dto.getCategoryDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetCategoryDescription12() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setCategoryDescription(expected);
			String actual = dto.getCategoryDescription();
			assertEquals(expected, actual);
		}


		// set Category_descriprion test
		@Test
		public void testSetCategoryDescription1() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "0";

			dto.setCategoryDescription(expected);
			String actual = dto.getCategoryDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetCategoryDescription2() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "2147483647";

			dto.setCategoryDescription(expected);
			String actual = dto.getCategoryDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetCategoryDescription3() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "-2147483647";

			dto.setCategoryDescription(expected);
			String actual = dto.getCategoryDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetCategoryDescription4() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "null";

			dto.setCategoryDescription(expected);
			String actual = dto.getCategoryDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetCategoryDescription5() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "";

			dto.setCategoryDescription(expected);
			String actual = dto.getCategoryDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetCategoryDescription6() {
			CategoryDTO dto = new CategoryDTO();
			String expected = " ";

			dto.setCategoryDescription(expected);
			String actual = dto.getCategoryDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetCategoryDescription7() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "　";

			dto.setCategoryDescription(expected);
			String actual = dto.getCategoryDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetCategoryDescription8() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "abc123";

			dto.setCategoryDescription(expected);
			String actual = dto.getCategoryDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetCategoryDescription9() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "あいう１２３";

			dto.setCategoryDescription(expected);
			String actual = dto.getCategoryDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetCategoryDescription10() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "abc123あいう１２３";

			dto.setCategoryDescription(expected);
			String actual = dto.getCategoryDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetCategoryDescription11() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setCategoryDescription(expected);
			String actual = dto.getCategoryDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetCategoryDescription12() {
			CategoryDTO dto = new CategoryDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setCategoryDescription(expected);
			String actual = dto.getCategoryDescription();
			assertEquals(expected, actual);
		}


		// get  InsertDate test
		@Test
		public void testGetInsertDate1() {
			CategoryDTO dto = new CategoryDTO();
			Date expected = null;

			dto.setInsertDate(expected);
			Date actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate2() throws ParseException {
			CategoryDTO dto = new CategoryDTO();

			SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
			Date expected = sdf.parse("20180420 12:00:00");
			dto.setInsertDate(expected);
			assertEquals(expected, dto.getInsertDate());
		}

		// set InsertDate test
		@Test
		public void testSetInsertDate1() {
			CategoryDTO dto = new CategoryDTO();
			Date expected = null;

			dto.setInsertDate(expected);
			Date actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate2() throws ParseException {
			CategoryDTO dto = new CategoryDTO();

			SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
			Date expected = sdf.parse("20180420 12:00:00");
			dto.setInsertDate(expected);
			assertEquals(expected, dto.getInsertDate());
		}

		// get  UpdateDate test
		@Test
		public void testGetUpdateDate1() {
			CategoryDTO dto = new CategoryDTO();
			Date expected = null;

			dto.setUpdateDate(expected);
			Date actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate2() throws ParseException {
			CategoryDTO dto = new CategoryDTO();

			SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
			Date expected = sdf.parse("20180420 12:00:00");
			dto.setUpdateDate(expected);
			assertEquals(expected, dto.getUpdateDate());
		}

		// set UpdateDate test
		@Test
		public void testSetUpdateDate1() {
			CategoryDTO dto = new CategoryDTO();
			Date expected = null;

			dto.setUpdateDate(expected);
			Date actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate2() throws ParseException {
			CategoryDTO dto = new CategoryDTO();

			SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
			Date expected = sdf.parse("20180420 12:00:00");
			dto.setUpdateDate(expected);
			assertEquals(expected, dto.getUpdateDate());
		}
}
