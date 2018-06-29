package com.internousdev.regalo.dto.test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import com.internousdev.regalo.dto.MyPageDTO;

class MyPageDTOTest {

	// get UserId test
		@Test
		public void testGetUserId1() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "0";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId2() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "2147483647";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId3() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "-2147483647";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId4() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "null";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId5() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId6() {
			MyPageDTO dto = new MyPageDTO();
			String expected = " ";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId7() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "　";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId8() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "abc123";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId9() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId10() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "abc123あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId11() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId12() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}


		// set UserID test
		@Test
		public void testSetUserId1() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "0";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId2() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "2147483647";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId3() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "-2147483647";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId4() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "null";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId5() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId6() {
			MyPageDTO dto = new MyPageDTO();
			String expected = " ";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId7() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "　";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId8() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "abc123";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId9() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId10() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "abc123あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId11() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId12() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}


		// get Password test
		@Test
		public void testGetPassword1() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "0";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword2() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "2147483647";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword3() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "-2147483647";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword4() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "null";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword5() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword6() {
			MyPageDTO dto = new MyPageDTO();
			String expected = " ";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword7() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "　";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword8() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "abc123";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword9() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "あいう１２３";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword10() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "abc123あいう１２３";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword11() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword12() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}



		// set Password test
		@Test
		public void testSetPassword1() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "0";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword2() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "2147483647";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword3() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "-2147483647";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword4() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "null";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword5() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword6() {
			MyPageDTO dto = new MyPageDTO();
			String expected = " ";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword7() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "　";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword8() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "abc123";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword9() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "あいう１２３";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword10() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "abc123あいう１２３";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword11() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword12() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}


		// get FamilyName
		@Test
		public void testGetFamilyName() {
			MyPageDTO dto = new MyPageDTO();
			String expected="0";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName2() {
			MyPageDTO dto = new MyPageDTO();
			String expected="2147483647";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName3() {
			MyPageDTO dto = new MyPageDTO();
			String expected="-2147483647";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName4() {
			MyPageDTO dto = new MyPageDTO();
			String expected="null";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName5() {
			MyPageDTO dto = new MyPageDTO();
			String expected="";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName6() {
			MyPageDTO dto = new MyPageDTO();
			String expected=" ";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName7() {
			MyPageDTO dto = new MyPageDTO();
			String expected="　";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName8() {
			MyPageDTO dto = new MyPageDTO();
			String expected="abc123";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName9() {
			MyPageDTO dto = new MyPageDTO();
			String expected="abc123";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName10() {
			MyPageDTO dto = new MyPageDTO();
			String expected="abc123あいう１２３";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName11() {
			MyPageDTO dto = new MyPageDTO();
			String expected="abc123あいう１２３漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName12() {
			MyPageDTO dto = new MyPageDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyName1() {
			MyPageDTO dto = new MyPageDTO();
			String expected="0";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName2() {
			MyPageDTO dto = new MyPageDTO();
			String expected="2147483647";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName3() {
			MyPageDTO dto = new MyPageDTO();
			String expected="-2147483647";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName4() {
			MyPageDTO dto = new MyPageDTO();
			String expected="null";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName5() {
			MyPageDTO dto = new MyPageDTO();
			String expected="";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName6() {
			MyPageDTO dto = new MyPageDTO();
			String expected=" ";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName7() {
			MyPageDTO dto = new MyPageDTO();
			String expected="　";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName8() {
			MyPageDTO dto = new MyPageDTO();
			String expected="abc123";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName9() {
			MyPageDTO dto = new MyPageDTO();
			String expected="abc123";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName10() {
			MyPageDTO dto = new MyPageDTO();
			String expected="abc123あいう１２３";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName11() {
			MyPageDTO dto = new MyPageDTO();
			String expected="abc123あいう１２３漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName12() {
			MyPageDTO dto = new MyPageDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}


		// get FirstName test
		@Test
		public void testGetFirstName1() {
			MyPageDTO dto = new MyPageDTO();
			String expected="0";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName2() {
			MyPageDTO dto = new MyPageDTO();
			String expected="2147483647";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName3() {
			MyPageDTO dto = new MyPageDTO();
			String expected="-2147483647";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName4() {
			MyPageDTO dto = new MyPageDTO();
			String expected="null";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName5() {
			MyPageDTO dto = new MyPageDTO();
			String expected="";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName6() {
			MyPageDTO dto = new MyPageDTO();
			String expected= " ";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName7() {
			MyPageDTO dto = new MyPageDTO();
			String expected= "　";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName8() {
			MyPageDTO dto = new MyPageDTO();
			String expected= "abc123";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName9() {
			MyPageDTO dto = new MyPageDTO();
			String expected= "あいう１２３";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName10() {
			MyPageDTO dto = new MyPageDTO();
			String expected= "abc123あいう１２３";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName11() {
			MyPageDTO dto = new MyPageDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName12() {
			MyPageDTO dto = new MyPageDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}


		// set FirstName test
		@Test
		public void testSetFirstName1() {
			MyPageDTO dto = new MyPageDTO();
			String expected="0";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName2() {
			MyPageDTO dto = new MyPageDTO();
			String expected="2147483647";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName3() {
			MyPageDTO dto = new MyPageDTO();
			String expected="-2147483647";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName4() {
			MyPageDTO dto = new MyPageDTO();
			String expected="null";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName5() {
			MyPageDTO dto = new MyPageDTO();
			String expected="";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName6() {
			MyPageDTO dto = new MyPageDTO();
			String expected= " ";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName7() {
			MyPageDTO dto = new MyPageDTO();
			String expected= "　";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName8() {
			MyPageDTO dto = new MyPageDTO();
			String expected= "abc123";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName9() {
			MyPageDTO dto = new MyPageDTO();
			String expected= "あいう１２３";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName10() {
			MyPageDTO dto = new MyPageDTO();
			String expected= "abc123あいう１２３";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName11() {
			MyPageDTO dto = new MyPageDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName12() {
			MyPageDTO dto = new MyPageDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}


		// get FamilyNameKana
		@Test
		public void testGetFamilyNameKana1() {
			MyPageDTO dto = new MyPageDTO();
			String expected="0";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana2() {
			MyPageDTO dto = new MyPageDTO();
			String expected="2147483647";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana3() {
			MyPageDTO dto = new MyPageDTO();
			String expected="-2147483647";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana4() {
			MyPageDTO dto = new MyPageDTO();
			String expected="null";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana5() {
			MyPageDTO dto = new MyPageDTO();
			String expected="";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana6() {
			MyPageDTO dto = new MyPageDTO();
			String expected=" ";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana7() {
			MyPageDTO dto = new MyPageDTO();
			String expected="　";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana8() {
			MyPageDTO dto = new MyPageDTO();
			String expected="abc123";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana9() {
			MyPageDTO dto = new MyPageDTO();
			String expected="あいう１２３";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana10() {
			MyPageDTO dto = new MyPageDTO();
			String expected="abc123あいう１２３";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana11() {
			MyPageDTO dto = new MyPageDTO();
			String expected="abc123あいう１２３漢字";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana12() {
			MyPageDTO dto = new MyPageDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}



		// set FmailyNameKana test
		@Test
		public void testSetFamilyNameKana1() {
			MyPageDTO dto = new MyPageDTO();
			String expected="0";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana2() {
			MyPageDTO dto = new MyPageDTO();
			String expected="2147483647";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana3() {
			MyPageDTO dto = new MyPageDTO();
			String expected="-2147483647";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana4() {
			MyPageDTO dto = new MyPageDTO();
			String expected="null";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana5() {
			MyPageDTO dto = new MyPageDTO();
			String expected="";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana6() {
			MyPageDTO dto = new MyPageDTO();
			String expected=" ";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana7() {
			MyPageDTO dto = new MyPageDTO();
			String expected="　";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana8() {
			MyPageDTO dto = new MyPageDTO();
			String expected="abc123";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana9() {
			MyPageDTO dto = new MyPageDTO();
			String expected="あいう１２３";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana10() {
			MyPageDTO dto = new MyPageDTO();
			String expected="abc123あいう１２３";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana11() {
			MyPageDTO dto = new MyPageDTO();
			String expected="abc123あいう１２３漢字";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana12() {
			MyPageDTO dto = new MyPageDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}



		// get FirstNameKana test
		@Test
		public void testGetFirstNameKana1() {
			MyPageDTO dto = new MyPageDTO();
			String expected="0";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana2() {
			MyPageDTO dto = new MyPageDTO();
			String expected="2147483647";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana3() {
			MyPageDTO dto = new MyPageDTO();
			String expected="-2147483647";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana4() {
			MyPageDTO dto = new MyPageDTO();
			String expected="null";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana5() {
			MyPageDTO dto = new MyPageDTO();
			String expected="";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana6() {
			MyPageDTO dto = new MyPageDTO();
			String expected= " ";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana7() {
			MyPageDTO dto = new MyPageDTO();
			String expected= "　";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana8() {
			MyPageDTO dto = new MyPageDTO();
			String expected= "abc123";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana9() {
			MyPageDTO dto = new MyPageDTO();
			String expected= "あいう１２３";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana10() {
			MyPageDTO dto = new MyPageDTO();
			String expected= "abc123あいう１２３";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana11() {
			MyPageDTO dto = new MyPageDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana12() {
			MyPageDTO dto = new MyPageDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}




		// set FirstNameKana test
		@Test
		public void testSetFirstNameKana1() {
			MyPageDTO dto = new MyPageDTO();
			String expected="0";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana2() {
			MyPageDTO dto = new MyPageDTO();
			String expected="2147483647";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana3() {
			MyPageDTO dto = new MyPageDTO();
			String expected="-2147483647";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana4() {
			MyPageDTO dto = new MyPageDTO();
			String expected="null";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana5() {
			MyPageDTO dto = new MyPageDTO();
			String expected="";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana6() {
			MyPageDTO dto = new MyPageDTO();
			String expected= " ";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana7() {
			MyPageDTO dto = new MyPageDTO();
			String expected= "　";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana8() {
			MyPageDTO dto = new MyPageDTO();
			String expected= "abc123";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana9() {
			MyPageDTO dto = new MyPageDTO();
			String expected= "あいう１２３";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana10() {
			MyPageDTO dto = new MyPageDTO();
			String expected= "abc123あいう１２３";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana11() {
			MyPageDTO dto = new MyPageDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana12() {
			MyPageDTO dto = new MyPageDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

}
