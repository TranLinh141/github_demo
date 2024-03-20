/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class Person {
    private String hoTen, namSinh, queQuan;
    protected double tinDaiCuong, chinhTriPL;
    public String getHoTen() {return hoTen;}
    public void setHoTen(String hoTen){this.hoTen=hoTen;}
    public String getnamSinh() {return namSinh;}
    public void setnamSinh(String namSinh){this.namSinh=namSinh;}
    public String getqueQuan() {return queQuan;}
    public void setqueQuan(String queQuan){this.queQuan= queQuan;}
    Scanner sc = new Scanner(System.in);
    public void nhap(){
        System.out.print("Nhap ho ten: "); this.hoTen=sc.nextLine();
        System.out.print("Nhap nam sinh: "); this.namSinh=sc.nextLine();
        System.out.print("Nhap que quan: "); this.queQuan=sc.nextLine();
        System.out.print("Nhap diem Tin dai cuong: "); this.tinDaiCuong=sc.nextDouble();
    }
    public void hienthi(){
        System.out.println("-----------------------------------------");
        System.out.println("Ho ten: " + this.hoTen);
        System.out.println("Nam sinh: " + this.namSinh);
        System.out.println("Que Quan: " + this.queQuan);
    }
}

