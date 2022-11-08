package com.learn.encapsulation;

public class Pulsar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bike bike=new Bike();
bike.setBikename("pulsar");
bike.setPrice(150000);
bike.setCc(225);
bike.setColour("black");

System.out.println(bike.getBikename()+" "+bike.getPrice());
	}

}
