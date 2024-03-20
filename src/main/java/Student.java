import java.util.Scanner;

/**
 * 
 * @author Asus
 */
public class Student extends Person {
    private double DiemTB;

    public Student() {
        super(); // Gọi constructor của lớp cha
    }

    public double getDiemTB() {return DiemTB;}
    public void setDiemTB(double DiemTB){this.DiemTB=DiemTB;}

    @Override
    public void nhap() {
        super.nhap(); // Gọi phương thức nhập của lớp cha
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem trung binh: ");
        this.DiemTB = sc.nextDouble();
        while (this.DiemTB > 10 || this.DiemTB < 0) {
            System.out.println("Diem khong hop le, vui long nhap lai!");
            System.out.print("Nhap diem trung binh: ");
            this.DiemTB = sc.nextDouble();
        }
    }
    @Override
    public void hienthi() {
        super.hienthi(); // Gọi phương thức hiển thị của lớp cha
        System.out.printf("Diem trung binh: %.2f\n", this.DiemTB);
    }
    public String xeploai() {
        double DiemTB = DiemTB();
        if (DiemTB >= 8.0) {
            return "Gioi";
        } else if (DiemTB >= 6.5) {
            return "Kha";
        } else if (DiemTB >= 5.0) {
            return "Trung binh";
        } else {
            return "Yeu";
        }
    }

    private double DiemTB() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


