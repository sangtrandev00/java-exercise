package java1;

import java.util.Scanner;

public class NhanVien {
    Scanner scanner = new Scanner(System.in);
    private String maNv;
    private String hoTen;
    private double luongNv;

    public NhanVien(Scanner scanner, String maNv, String hoTen, double luongNv) {
        this.scanner = scanner;
        this.maNv = maNv;
        this.hoTen = hoTen;
        this.luongNv = luongNv;
    }

    public NhanVien() {

    }

    // getter and setter.

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuongNv() {
        return luongNv;
    }

    public void setLuongNv(double luongNv) {
        this.luongNv = luongNv;
    }

    // some methods.

    public void nhapNv() {
        System.out.println("Ma nhan vien: ");
        this.maNv = scanner.nextLine();

        System.out.println("Ho va ten: ");
        this.hoTen = scanner.nextLine();

        System.out.println("Luong nhan vien: ");
        this.luongNv = scanner.nextDouble();
        scanner.nextLine();
    }

    public double getThuNhap() {
        return this.luongNv;
    }

    public double getThueTN() {
        if (this.getThuNhap() >= 15000000) {
            return this.getThuNhap() * 0.12;
        } else if (this.getThuNhap() >= 9000000) {
            return this.getThuNhap() * 0.1;
        } else {
            return 0;
        }
    }

    public void xuatNv() {
        System.out.printf(
                "Ma nhan vien: %-10s, ho ten: %-20s, tien luong: %-12.2f VND, thu nhap: %-12.2f VND, thue: %-10.2f VND\n",
                this.getMaNv(),
                this.getHoTen(), this.getLuongNv(), this.getThuNhap(), this.getThueTN());
    }

}