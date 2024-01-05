package lab4bai1;

import java.util.Scanner;

public class SanPham {

    private String tenSp;
    private double giaSp;
    private double giamGia;

    // constructor

    public SanPham(String tenSp, double giaSp, double giamGia) {
        this.tenSp = tenSp;
        this.giaSp = giaSp;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSp, double giaSp) {
        this.tenSp = tenSp;
        this.giaSp = giaSp;
        this.giamGia = 0;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getTenSp() {
        return this.tenSp;
    }

    public void setGiaSp(double giaSp) {
        this.giaSp = giaSp;
    }

    public double getGiaSp() {
        return this.giaSp;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public double getGiamGia() {
        return this.giamGia;
    }

    public void nhap() {

    
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten san pham: ");
        this.tenSp = sc.nextLine();
        System.out.println("Nhap gia san pham: ");
        this.giaSp = sc.nextDouble();
        System.out.println("Nhap giam gia: ");
        this.giamGia = sc.nextDouble();
    }

    private double getThueNhapKhau() {

        return this.giaSp * 0.1;
    }


    public void xuat() {
        System.out.printf("San pham %s -- Gia: %.2f -- Giam Gia: %.2f -- Thue nhap Khau %.2f\n", this.tenSp, this.giaSp,

            this.giamGia, this.getThueNhapKhau());
    }

}