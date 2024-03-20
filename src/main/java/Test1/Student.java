package Test1;

import java.util.Scanner;

public class Student extends Person{
    private double gpa;

	public Student(String name, int age, String address, double gpa) {
        super(name, age, address);
        this.gpa = gpa;
    }
	public double getGPA() {
		return gpa;
	}

	public void setGPA(int gpa) {
		this.gpa = gpa;
	}

    public String xepLoai() {
        if (gpa >= 8.0) {
            return "Gioi";
        } else if (gpa >= 6.5) {
            return "Kha";
        } else if (gpa >= 5.0) {
            return "Trung binh";
        } else {
            return "Yeu";
        }
    }

	@Override
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("GPA: ");
		this.gpa = sc.nextDouble();
	}

	@Override
	public void xuat() {
//        System.out.println("--------------------------------------------------");
//        System.out.printf("%-20s %-8s %-20s %-20s\n", "Ho Ten","Tuoi","Dia Chi","GPA");
        System.out.printf("%-20s %-8s %-20s %-20s %-15s\n", getName(),getAge(),getAddress(),getGPA(),xepLoai());
//		System.out.println("GPA: " + gpa);
	}
}