package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member no1 = new Member("jws", "정우성", 50000);
		no1.showInfo();
	//	System.out.println(no1.toString());
		
		Member no2 = new Member("yjs", "유재석", 30000);
		no2.showInfo();

		Member no3 = new Member("ihr", "이효리", 40000);
		no3.showInfo();
	}

}
