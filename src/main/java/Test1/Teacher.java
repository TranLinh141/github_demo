package Test1;

import java.util.Scanner;

public class Teacher extends Person{
    private int teaching_hours;
	private float salary;
	private float allowance;

	public Teacher(String name, int age, String address, int teaching_hours, float salary, float allowance) {
        super(name, age, address);
        this.teaching_hours = teaching_hours;
        this.salary = salary;
        this.allowance = allowance;
    }
	public int getTeachingHours() {
		return teaching_hours;
	}

	public void setTeachingHours(int teaching_hours) {
		this.teaching_hours = teaching_hours;
	}
        
	public float getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
        
	public float getAllowance() {
		return salary;
	}

	public void setAllowance(int allowance) {
		this.allowance = allowance;
	}
        
        
	public float Salary(){
		return salary*teaching_hours + allowance;
	}

	@Override
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("So gio day: ");
		this.teaching_hours = sc.nextInt();

		System.out.print("Luong co ban: ");
		this.salary = sc.nextFloat();
		
		System.out.print("Tro cap: ");
		this.allowance = sc.nextFloat();
	}
    
	@Override
	public void xuat() {
//		super.xuat();
//		System.out.println("So gio day: " + teaching_hours);
//		System.out.println("Luong co ban: " + salary);
//		System.out.println("Tro cap: " + allowance);
//            System.out.println("--------------------------------------------------");
//            System.out.printf("%-20s %-8s %-15s %-15s %-15s %-15s %-15s\n", "Ho Ten","Tuoi","Dia Chi","So Gio Day","Luong Co Ban","Phu Cap","Tien Luong");
            System.out.printf("%-20s %-8s %-15s %-15s %-15s %-15s %-15s\n", getName(),getAge(),getAddress(),getTeachingHours(),getSalary(),getAllowance(),Salary());
	}
}