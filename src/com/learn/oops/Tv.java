package com.learn.oops;

public class Tv {
	
	
	String brand;
	String modelname;
	Integer price;
	Integer screensize;
	String colour;
	String displaytype;
	
	void insertData(String b,String mn,Integer p,Integer sz,String c,String dt) {
		brand=b;
		modelname=mn;
		price=p;
		screensize=sz;
		colour=c;
		displaytype=dt;
		
	}
	void displayTv() {
		System.out.println(brand+" "+modelname);
	}
	
	
	public static void main(String[] args) {
		
		
		Tv lg =new  Tv();
		
		Tv samsungframe =new Tv();
		
		lg.brand="LG";
		lg.modelname="LGOLED 75 TV";
		lg.price=100000;
		lg.screensize=55;
		lg.colour="Block";
		lg.displaytype="OLED";
		
		
		
		
		
		samsungframe.insertData("Samsung", "SamusungT04050", 15000, 32, "Black", "LED");
		lg.displayTv();
		samsungframe.displayTv();
		
	}
	

}
