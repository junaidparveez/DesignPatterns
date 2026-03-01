package com.junaid.creational.factory;

public class CatFactory extends AnimalFactory{

	@Override
	public Animal createAnimal() {
		// TODO Auto-generated method stub
		return new Cat();
	}

}
