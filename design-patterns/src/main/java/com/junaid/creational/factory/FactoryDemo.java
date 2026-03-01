package com.junaid.creational.factory;

public class FactoryDemo {

	public static void main(String[] args) {
	
		AnimalFactory animalFactory=new TigerFactory();
		Animal tiger=animalFactory.createAnimal();
		tiger.action();
		tiger.speak();
		
		AnimalFactory animalFactory2=new CatFactory();
		Animal cat=animalFactory2.createAnimal();
		cat.action();
		cat.speak();

	}

}
