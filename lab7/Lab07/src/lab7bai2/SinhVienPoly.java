package lab7bai2;

import java.util.Scanner;

abstract public class SinhVienPoly {
    String hoTen;
    String nganhHoc;
    Scanner scanner = new Scanner(System.in);

    public SinhVienPoly(String hoTen, String nganhHoc) {
        this.hoTen = hoTen;
        this.nganhHoc = nganhHoc;
    }

    public SinhVienPoly() {

    }

    // getter vs setter
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    abstract public double getDiem();

    public String getHocLuc() {
        if (getDiem() >= 9) {
            return "Xuat sac";
        } else if (getDiem() >= 7.5) {
            return "Gioi";
        } else if (getDiem() >= 6.5) {
            return "Kha";
        } else if (getDiem() >= 5) {
            return "Trung binh";
        } else if (getDiem() < 5) {
            return "Yeu";
        } else {
            return "So diem cua ban nhap khong chinh xac!";
        }
    }

    public void nhap() {
        System.out.println("Nhap ho ten: ");
        this.hoTen = scanner.nextLine();
        System.out.println("Nhap nganh hoc: ");
        this.nganhHoc = scanner.nextLine();
    }

    abstract public void xuat();

}