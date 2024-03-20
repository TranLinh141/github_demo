package Test1;

import java.util.Scanner;

public class entry {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("Nhap so sinh vien: ");
	int n = sc.nextInt();
	Student[] students = new Student[n];
	for(int i = 0; i < n; i++){
            System.out.println("\nNhap thong tin cho sinh vien " + (i + 1) +" : ");
            students[i] = new Student("", i, "", i);
            students[i].nhap();
	}

        System.out.println("--------------------------------------------------");
        System.out.printf("%-20s %-8s %-20s %-20s %-15s\n", "Ho Ten","Tuoi","Dia Chi","GPA","Xep Loai");
	for (Student student : students){
            student.xuat();
//          System.out.println("Xep loai: " + student.xepLoai());
	}

        System.out.print("Nhap so giao vien: ");
	int m = sc.nextInt();
        Teacher[] teachers = new Teacher[m];
        for(int i = 0; i < m; i++){
            System.out.println("\nNhap thong tin cho giao vien " + (i + 1) +" : ");
            teachers[i] = new Teacher("", i, "", i, i, i);
            teachers[i].nhap();
	}

        System.out.println("--------------------------------------------------");
        System.out.printf("%-20s %-8s %-15s %-15s %-15s %-15s %-15s\n", "Ho Ten","Tuoi","Dia Chi","So Gio Day","Luong Co Ban","Phu Cap","Tien Luong");
	for (Teacher teacher : teachers){
            teacher.xuat();
//          System.out.println("Tien luong: " + teacher.Salary());
	}
        sc.close();
	}
}