package com.d.builder;

public class Test {

	public static void main(String[] args) {
		Builder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		director.construct();

		Product product = builder.getProduct();

		System.out.println(product.getPart1());
		System.out.println(product.getPart2());
	}
}
