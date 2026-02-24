package com.junaid.creational.simplefactory;

public class FactoryDemo {

	public static void main(String[] args) {
	
		Product product= ProductFactory.getChart("pie");
		product.draw();
		
	}

}
