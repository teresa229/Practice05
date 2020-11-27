package com.javaex.ex07;    //String name = sc.nextLine();

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in); //입력값 준비

        System.out.println("친구를 3명 등록해 주세요");

        //친구정보 3명 입력 로직 --> 반복문 사용  

        for(int i=0; i<3; i++) { //3을 friendArray.length로 적을수도 있다.
            
        	// 이름 입력받기
	        System.out.print("이름: ");
	        String name = sc.nextLine(); //네임이라는 변수를 만드세요. 값을 입력하면~스태틱 부분에 들어온다.
	        
	        // 핸드폰 입력받기
	        System.out.print("핸드폰: ");
	        String hp = sc.nextLine(); 
	        
	        // 학교 입력받기
	        System.out.print("학교: ");
	        String school = sc.nextLine();
	        
	        Friend fr = new Friend(); //new-> 메모리에 올려라. "="->대입해라.
	        fr.setName(name);
	        fr.setHp(hp);
	        fr.setSchool(school);
	        
	        friendArray[i] = fr;
        } //가로를 벗어나면 변수들이 모두 사라짐.

        System.out.println("-------------------------------");
        
        for(int i = 0; i <friendArray.length; i++) {
        	friendArray[i].showInfo(); //친구정보 출력 메소드 호출
        //	friendArray.showInfo(); 이것과 헷갈리지 말아라.
        }

        sc.close();
    }

}
