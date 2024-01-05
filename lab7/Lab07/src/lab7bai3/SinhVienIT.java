package lab7bai3;

import java.util.Scanner;

import lab7bai2.SinhVienPoly;

public class SinhVienIT extends SinhVienPoly {
    Scanner scanner = new Scanner(System.in);
    private double diemJava;
    private double diemHtml;
    private double diemCss;

    public SinhVienIT(double diemJava, double diemHtml, double diemCss) {
        this.diemJava = diemJava;
        this.diemHtml = diemHtml;
        this.diemCss = diemCss;
    }

    public SinhVienIT() {

    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemHtml() {
        return diemHtml;
    }

    public void setDiemHtml(double diemHtml) {
        this.diemHtml = diemHtml;
    }

    public double getDiemCss() {
        return diemCss;
    }

    public void setDiemCss(double diemCss) {
        this.diemCss = diemCss;
    }

    @Override
    public double getDiem() {
        // TODO Auto-generated method stub
        return (2 * this.diemJava + this.diemHtml + this.diemCss) / 4;
    }

    public void nhap() {
        super.nhap();
        System.out.println("Diem Java: ");
        this.diemJava = scanner.nextDouble();
        System.out.println("Diem HTML: ");
        this.diemHtml = scanner.nextDouble();
        System.out.println("Diem css: ");
        this.diemCss = scanner.nextDouble();
        scanner.nextLine();
    }

    @Override
    public void xuat() {
        // TODO Auto-generated method stub
        System.out.printf(
                "Ho ten: %s, nganh hoc: %s, diem Java: %.2f, diem HTML: %.2f,diem css: %.2f, diem Trung binh: %.2f, hoc luc: %s\n",
                super.getHoTen(), super.getNganhHoc(), this.diemJava, this.diemHtml, this.diemCss, this.getDiem(),
                super.getHocLuc());
    }

}
