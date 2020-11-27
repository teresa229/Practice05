package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");

        //친구정보 3명 입력 로직 --> 반복문 사용  
        	// 친구정보(이름) 입력받기
        friendArray[0] = 
        	// 친구정보(핸드폰) 입력받기
        
        	// 친구정보(학교) 입력받기

           // Friend 인스턴스 생성하여 데이터 넣기
        Friend friendArray01 = new Friend();
    	friendArray01.setName("정우성");
    	friendArray01.setHp("010-1111-1111");
    	friendArray01.setSchool("서울초등학교");
    	
    	Friend friendArray02 = new Friend();
    	friendArray02.setName("이효리");
    	friendArray02.setHp("010-2222-2222");
    	friendArray02.setSchool("제주중학교");
    	
    	Friend friendArray03 = new Friend();
    	friendArray03.setName("유재석");
    	friendArray03.setHp("010-3333-3333");
    	friendArray03.setSchool("강남고등학교");
    	
            // 인스턴스 주소를 배열에 대입

        System.out.println("-------------------------------");
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
        	friendArray[i].showInfo();
        }

        sc.close();
    }

}
