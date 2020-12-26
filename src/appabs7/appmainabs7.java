package appabs7;

import java.util.Scanner;

import parentchildabs7.Smartphone;

public class appmainabs7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enbter mobile Id");
		int mobileid=sc.nextInt();
		sc.nextLine();
		System.out.println("Emter the brand name");
		String brandname=sc.nextLine();
		System.out.println("Enter the price");
		float price=sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter camera details");
		String details=sc.nextLine();
		System.out.println("Enter Network Supported");
		String Network=sc.nextLine();
		Smartphone smartphone=new Smartphone(mobileid,brandname,price,details,Network);
		System.out.println("Monile Id-"+smartphone.getMobileId());
		System.out.println("Brandname-"+smartphone.getBrandname());
		System.out.println("Price-"+smartphone.getPrice());
		System.out.println("Camera Dertails-"+smartphone.getCameraDetails());
		System.out.println("Network suppoerted-"+smartphone.getNetworkSupport());
		System.out.println("Discount amount:"+smartphone.calculateDiscount());

	}

}
