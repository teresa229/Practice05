package com.javaex.ex10;

public class Book {
    //필드
    private int bookNo;
    private String title;
    private String author;
    private int stateCode;
    
    //생성자
    public Book(int bookNo,String title, String author) {
    	this.bookNo = bookNo;
    	this.title = title;
    	this.author = author;
    	
    }
    
    //메소드
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	
    //기본 메소드
    public void rent() {
    	int defaultstateCode = 1;
    	if(stateCode == 0) {
    		System.out.println(title +"이(가) 대여 됐습니다.");
        }else {
        	this.stateCode = defaultstateCode;
        }	
    }
    
    public void print() {
    	if(stateCode == 0) {
    	System.out.println(bookNo+"책제목:" + title +", 작가: "+ author + "대여 유무: 대여중");
        }if(stateCode == 1) {
        	System.out.println(bookNo+"책제목:" + title +", 작가: "+ author + "대여 유무: 재고있음");}
        }
}

