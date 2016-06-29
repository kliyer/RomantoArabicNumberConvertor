package com.ArabicConvertorLogic;


import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomantoArabic {
	HashMap <Character,Integer> numberMap = new HashMap <Character,Integer>();
	public RomantoArabic(){
		loadMappingValues();
	}
	public void loadMappingValues(){//method accessible to other classes
		numberMap.put('I', 1);
		numberMap.put('X',10);
		numberMap.put('C', 100);
		numberMap.put('M', 1000);
		numberMap.put('V', 5);
		numberMap.put('L', 50);
		numberMap.put('D', 500);

	}
	private boolean isValidRomanNumber(String numeral){
		String numeral_Pattern = "\\bM{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})\\b";
		Pattern p = Pattern.compile(numeral_Pattern);
		Matcher m = p.matcher(numeral);
		return m.matches();
	}
	private int equivalentArabicValue(String numeral){
		char [] numerals = numeral.toCharArray();
		int value = 0;
		int tempval = 0;
		for (int i=numerals.length-1;i>=0;i--){
			if (tempval <= this.numberMap.get(numerals[i])){
				value = value + this.numberMap.get(numerals[i]);
				tempval = this.numberMap.get(numerals[i]);
			}
			else {
				value = value - this.numberMap.get(numerals[i]);
				tempval = this.numberMap.get(numerals[i]);
			}
		}
		return value;
	}
	public String convertRomantoArabic(String numeral){//  method accessible to other classes
		if(isValidRomanNumber(numeral)){
			String value = Integer.toString(equivalentArabicValue(numeral));
			return value;
		}
		return "Invalid Roman Number";	
	}


}

