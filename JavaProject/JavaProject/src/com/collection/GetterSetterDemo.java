package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Car {
	int model_no;
	String cname;
	int price;

	public int getModel_no() {
		return model_no;
	}

	public void setModel_no(int model_no) {
		this.model_no = model_no;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}

public class GetterSetterDemo {

	public static void main(String[] args) {
		ArrayList<Car> al = new ArrayList();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i <= 2; i++) {
			System.out.println("Enter the model");
			int model = sc.nextInt();

			System.out.println("Enter the car name");
			String cname = sc.next();

			System.out.println("Enter the price");
			int price = sc.nextInt();

			Car c = new Car();
			c.setModel_no(model);
			c.setCname(cname);
			c.setPrice(price);

			al.add(c);

		}
		Iterator<Car> it = al.iterator();
		while (it.hasNext()) {
			Car c = it.next();

			System.out.println(c.getModel_no() + " " + c.getCname() + " " + c.getPrice());
		}

	}

}
