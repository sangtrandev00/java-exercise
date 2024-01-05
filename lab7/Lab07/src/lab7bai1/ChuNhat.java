package lab7bai1;

import java.util.Scanner;

public class ChuNhat {
    private double chieuRong;
    private double chieuDai;
    Scanner scanner = new Scanner(System.in);

    public double getChuVi() {
        return (this.chieuDai + this.chieuRong) * 2;
    }

    public double getDienTich() {
        return (this.chieuDai * this.chieuRong);
    }

    public ChuNhat(double chieuRong, double chieuDai) {
        this.chieuRong = chieuRong;
        this.chieuDai = chieuDai;
    }

    public ChuNhat() {

    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void nhap() {
        System.out.println("Nhap chieu dai: ");
        this.chieuDai = scanner.nextDouble();
        System.out.println("Nhap chieu rong: ");
        this.chieuRong = scanner.nextDouble();
    }

    public void xuat() {
        System.out.printf("chieu dai: %.2f, chieu rong: %.2f, chu vi: %.2f, dien tich: %.2f\n", this.chieuDai,
                this.chieuRong, this.getChuVi(), this.getDienTich());
    }

}