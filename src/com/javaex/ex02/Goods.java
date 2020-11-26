package com.javaex.ex02;

public class Goods {

	private String name;
	private int price;

	//생성자 2개가 필요하다.
	public Goods() {}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//메소드
	public String getName() {
		return name;
	}
    //public으로 수정. private는 안된다.
	public void setName(String name) {  
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void showInfo() {
		System.out.println("상품명:" + name + ", 가격:" + price);
	}
	
}








