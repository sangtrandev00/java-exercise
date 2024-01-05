package lab7bai1;

import java.util.Scanner;

public class HinhVuong extends ChuNhat {

    private double canh;

    public HinhVuong(double chieuRong, double chieuDai, double canh) {
        super(chieuRong, chieuDai);
        // TODO Auto-generated constructor stub
        this.canh = canh;
    }

    public HinhVuong() {

    }

    public void nhap() {
        System.out.println("Nhap canh hinh vuong: ");
        this.canh = scanner.nextDouble();
    }

    public double getChuVi() {
        return this.canh * 4;
    }

    public double getDienTich() {
        return this.canh * this.canh;
    }

    public void xuat() {
        System.out.printf("Canh: %.2f, Chu vi: %.2f, dien Tich: %.2f\n", this.canh, this.getChuVi(),
                this.getDienTich());
    }
}
