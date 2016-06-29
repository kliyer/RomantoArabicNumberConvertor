package com.ArabicConvertorClient;
import com.ArabicConvertorLogic.*;

public class TestDriverForRomantoArabic {

	public static void main(String[] args) {
		RomantoArabic rm = new RomantoArabic();
		System.out.println("TEST CASE 1 : XXV is equal to 25: "+ rm.convertRomantoArabic("XXV").equals("25"));
		System.out.println("TEST CASE 2 : LM is invalid: "+ rm.convertRomantoArabic("LM").equals("Invalid Roman Number"));
		System.out.println("TEST CASE 3 : CML is equal to 950: "+ rm.convertRomantoArabic("CML").equals("950"));
		System.out.println("TEST CASE 4 : LIIX is wrong: "+ rm.convertRomantoArabic("LIIX").equals("Invalid Roman Number"));
		System.out.println("TEST CASE 5 : CMXCV is 985: "+ rm.convertRomantoArabic("CMXCV").equals("985"));
		System.out.println("TEST CASE 6 : CMXCV is 995: "+ rm.convertRomantoArabic("CMXCV").equals("995"));
		System.out.println("TEST CASE 7 : AB is not valid: "+ rm.convertRomantoArabic("AB").equals("Invalid Roman Number"));
	}

}
