package Test1;

import java.util.Scanner;

public abstract class Person {
	private String name;
	private int age;
	private String address;

	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Name: ");
		this.name = sc.nextLine();

		System.out.print("Age: ");
		this.age = sc.nextInt();
		sc.nextLine();

		System.out.print("Address: ");
		this.address = sc.nextLine();
	}
	
	abstract void xuat();
//		System.out.println("Name: " + getName());
//		System.out.println("Age: " + age);
//		System.out.println("Address: " + address);
//        System.out.printf("%-20s %-8s %-20s\n", getName(),getAge(),getAddress());
    }