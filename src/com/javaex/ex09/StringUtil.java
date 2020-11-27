package com.javaex.ex09;

public class StringUtil {
	
	//필드 생략
	//생성자 생략
	//메소드 생략

	//기본 메소드
	public static String concatString(String[] arr){
		String result =""; //문자열 최초값을 불러오기 위해 반드시 필요함.
		
		for(int i=0; i<arr.length; i++) {
			result = result + arr[i];
		}
		
		return result;
    }

}
