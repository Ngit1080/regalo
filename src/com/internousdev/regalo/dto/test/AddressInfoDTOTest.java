package com.internousdev.regalo.dto.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

import com.internousdev.regalo.dto.AddressInfoDTO;

class AddressInfoDTOTest {

	// get Id test
		@Test
		public void testGetId1() {
			AddressInfoDTO dto = new AddressInfoDTO();
			int expected = 0;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetId2() {
			AddressInfoDTO dto = new AddressInfoDTO();
			int expected = 2147483647;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetId3() {
			AddressInfoDTO dto = new AddressInfoDTO();
			int expected = -2147483647;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetId4() throws Exception{
			AddressInfoDTO dto = new AddressInfoDTO();
			try{
				int postalMax = Integer.parseInt("214748364");
				dto.setId(postalMax);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetId5() throws Exception{
			AddressInfoDTO dto = new AddressInfoDTO();
			try{
				int postalMin = Integer.parseInt("-214748364");
				dto.setId(postalMin);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}


		//set Id test
		@Test
		public void testSetId1() {
			AddressInfoDTO dto = new AddressInfoDTO();
			int expected = 0;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetId2() {
			AddressInfoDTO dto = new AddressInfoDTO();
			int expected = 2147483647;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetId3() {
			AddressInfoDTO dto = new AddressInfoDTO();
			int expected = -2147483647;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetId4() throws Exception{
			AddressInfoDTO dto = new AddressInfoDTO();
			try{
				int postalMax = Integer.parseInt("214748364");
				dto.setId(postalMax);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetId5() throws Exception{
			AddressInfoDTO dto = new AddressInfoDTO();
			try{
				int postalMin = Integer.parseInt("-214748364");
				dto.setId(postalMin);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}

		@Test
		public void testGetUserId1() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected = "0";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId2() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected = "2147483647";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId3() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected = "-2147483647";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId4() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected = "null";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId5() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected = "";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId6() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected = " ";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId7() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected = "　";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId8() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected = "abc123";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId9() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected = "あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId10() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected = "abc123あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId11() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId12() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		//set UserId test
		@Test
		public void testSetUserId1() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="0";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId2() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="2147483647";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId3() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="-2147483647";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId4() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="null";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId5() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId6() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected=" ";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId7() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="　";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId8() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="abc123";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId9() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId10() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="abc123あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId11() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="abcあいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId12() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		//get FamilyName test
		@Test
		public void testGetFamilyName1() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="0";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName2() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="2147483647";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName3() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="-2147483647";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName4() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="null";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName5() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName6() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected=" ";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName7() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="　";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName8() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="abc123";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName9() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="abc123";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName10() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="abc123あいう１２３";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName11() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="abc123あいう１２３漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName12() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}




		// set Family Name test
		@Test

		public void testSetFamilyName1() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="0";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName2() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="2147483647";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName3() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="-2147483647";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName4() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="null";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName5() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName6() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected=" ";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName7() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="　";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName8() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="abc123";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName9() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="abc123";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName10() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="abc123あいう１２３";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName11() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="abc123あいう１２３漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName12() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		// get FirstName test
		@Test
		public void testGetFirstName1() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="0";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName2() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="2147483647";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName3() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="-2147483647";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName4() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="null";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName5() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName6() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= " ";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName7() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "　";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName8() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "abc123";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName9() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "あいう１２３";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName10() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "abc123あいう１２３";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName11() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName12() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		//set First Name test
		@Test
		public void testSetFirstName1() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="0";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName2() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="2147483647";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName3() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="-2147483647";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName4() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="null";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName5() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName6() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= " ";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName7() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "　";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName8() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "abc123";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName9() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "あいう１２３";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName10() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "abc123あいう１２３";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName11() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName12() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}


		// get FamilyNameKana test
		@Test
		public void testGetFamilyNameKana1() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="0";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana2() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="2147483647";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana3() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="-2147483647";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana4() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="null";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana5() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana6() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected=" ";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana7() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="　";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana8() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="abc123";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana9() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="あいう１２３";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana10() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="abc123あいう１２３";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana11() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="abc123あいう１２３漢字";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana12() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		// set FamilyNameKana test
		@Test
		public void testSetFamilyNameKana1() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="0";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana2() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="2147483647";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana3() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="-2147483647";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana4() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="null";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana5() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana6() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected=" ";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana7() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="　";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana8() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="abc123";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana9() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="abc123";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana10() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="abc123あいう１２３";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana11() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="abc123あいう１２３漢字";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana12() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

			// get FirstNameKana test
		@Test
		public void testGetFirstNameKana() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="0";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana2() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="2147483647";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana3() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="-2147483647";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana4() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="null";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana5() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana6() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= " ";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana7() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "　";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana8() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "abc123";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana9() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "あいう１２３";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana10() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "abc123あいう１２３";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana11() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana12() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstNameKana1() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="0";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana2() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="2147483647";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana3() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="-2147483647";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana4() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="null";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana5() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected="";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana6() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= " ";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana7() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "　";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana8() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "abc123";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana9() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "あいう１２３";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana10() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "abc123あいう１２３";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana11() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}


		// get UserAddress test
		@Test
		public void testGetUserAddress1() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "0";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserAddress2() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "2147483647";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserAddress3() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "-2147483647";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserAddress4() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "null";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserAddress5() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserAddress6() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= " ";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserAddress7() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "　";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserAddress8() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "abc123";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserAddress9() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "あいう１２３";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserAddress10() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "abc123あいう１２３";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserAddress11() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserAddress12() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}


		//set UserAddress test
		@Test
		public void testSetUserAddress1() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "0";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserAddress2() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "2147483647";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserAddress3() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "-2147483647";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserAddress4() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "null";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserAddress5() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserAddress6() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= " ";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserAddress7() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "　";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserAddress8() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "abc123";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserAddress9() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "あいう１２３";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserAddress10() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "abc123あいう１２３";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserAddress11() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserAddress12() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}


		// get Telnumber test
		@Test
		public void testGetTelNumber1() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "0";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetTelNumber2() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "2147483647";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetTelNumber3() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "-2147483647";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetTelNumber4() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "null";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetTelNumber5() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetTelNumber6() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= " ";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetTelNumber7() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "　";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetTelNumber8() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "abc123";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetTelNumber9() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "あいう１２３";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetTelNumber10() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "abc123あいう１２３";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetTelNumber11() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetTelNumber12() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

			//set TelNumber
		@Test
		public void testSetTelNumber1() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "0";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetTelNumber2() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "2147483647";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetTelNumber3() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "-2147483647";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetTelNumber4() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "null";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetTelNumber5() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetTelNumber6() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= " ";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetTelNumber7() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "　";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetTelNumber8() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "abc123";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetTelNumber9() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "あいう１２３";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetTelNumber10() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "abc123あいう１２３";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetTelNumber11() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetTelNumber12() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}


		// get Email test
		@Test
		public void testGetEmail1() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "0";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail2() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "2147483647";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail3() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "-2147483647";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail4() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "null";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail5() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail6() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= " ";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail7() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "　";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail8() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "abc123";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail9() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "あいう１２３";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail10() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "abc123あいう１２３";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail11() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail12() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		//set Email test
		@Test
		public void testSetEmail1() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "0";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail2() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "2147483647";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail3() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "-2147483647";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail4() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "null";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail5() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail6() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= " ";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail7() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "　";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail8() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "abc123";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail9() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "あいう１２３";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail10() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "abc123あいう１２３";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail11() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail12() {
			AddressInfoDTO dto = new AddressInfoDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		// get RegistDate test
		@Test
		public void testGetRegistDate1() {
			AddressInfoDTO dto = new AddressInfoDTO();
			Date expected = null;

			dto.setRegistDate(expected);
			Date actual = dto.getRegistDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetRegistDate2() throws ParseException {
			AddressInfoDTO dto = new AddressInfoDTO();

			SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
			Date expected = sdf.parse("20180420 12:00:00");
			dto.setRegistDate(expected);
			assertEquals(expected, dto.getRegistDate());
		}

		//set RegistDate test
		@Test
		public void testSetRegistDate1() {
			AddressInfoDTO dto = new AddressInfoDTO();
			Date expected = null;

			dto.setRegistDate(expected);
			Date actual = dto.getRegistDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetRegistDate2() throws ParseException {
			AddressInfoDTO dto = new AddressInfoDTO();

			SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
			Date expected = sdf.parse("20180420 12:00:00");
			dto.setRegistDate(expected);
			assertEquals(expected, dto.getRegistDate());
		}


		// get UpdateDate test
		@Test
		public void testGetUpdateDate1() {
			AddressInfoDTO dto = new AddressInfoDTO();
			Date expected = null;

			dto.setUpdateDate(expected);
			Date actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate2() throws ParseException{
			AddressInfoDTO dto = new AddressInfoDTO();

			SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
			Date expected = sdf.parse("20180420 12:00:00");
			dto.setUpdateDate(expected);
			assertEquals(expected,dto.getUpdateDate());
		}

		@Test
		public void testSetUpdateDate1() {
			AddressInfoDTO dto = new AddressInfoDTO();
			Date expected = null;

			dto.setUpdateDate(expected);
			Date actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate2() throws ParseException{
			AddressInfoDTO dto = new AddressInfoDTO();

			SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
			Date expected = sdf.parse("20180420 12:00:00");
			dto.setUpdateDate(expected);
			assertEquals(expected,dto.getUpdateDate());
		}
}
