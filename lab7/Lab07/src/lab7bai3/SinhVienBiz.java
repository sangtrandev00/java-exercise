package lab7bai3;

import java.util.Scanner;

import lab7bai2.SinhVienPoly;

public class SinhVienBiz extends SinhVienPoly {
    private double diemMark;
    private double diemSale;
    Scanner scanner = new Scanner(System.in);

    public SinhVienBiz(String hoTen, String nganhHoc, double diemMark, double diemSale) {
        super(hoTen, nganhHoc);
        this.diemMark = diemMark;
        this.diemSale = diemSale;
    }

    public SinhVienBiz(double diemMark, double diemSale) {
        this.diemMark = diemMark;
        this.diemSale = diemSale;
    }

    public SinhVienBiz() {

    }

    public double getDiemMark() {
        return diemMark;
    }

    public void setDiemMark(double diemMark) {
        this.diemMark = diemMark;
    }

    public double getDiemSale() {
        return diemSale;
    }

    public void setDiemSale(double diemSale) {
        this.diemSale = diemSale;
    }

    @Override
    public double getDiem() {
        // TODO Auto-generated method stub
        return (2 * this.diemMark + this.diemSale) / 3;
    }

    public void nhap() {
        super.nhap();
        System.out.println("Diem marketing: ");
        this.diemMark = scanner.nextDouble();
        System.out.println("Diem sale: ");
        this.diemSale = scanner.nextDouble();
        scanner.nextLine();
    }

    @Override
    public void xuat() {
        // TODO Auto-generated method stub
        System.out.printf(
                "Ho ten: %s, nganh hoc: %s, diem marketing: %.2f, diem Sale: %.2f, diem Trung binh: %.2f, hoc luc: %s\n",
                super.getHoTen(), super.getNganhHoc(), this.diemMark, this.diemSale, this.getDiem(), super.getHocLuc());
    }
}
