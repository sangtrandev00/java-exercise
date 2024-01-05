package lab6bai2;

import java.util.Scanner;

public class SanPham {
    private String tenSp;
    private double giaSp;
    private String hangSp;

    public static Scanner scanner = new Scanner(System.in);

    public SanPham(String tenSp, double giaSp, String hangSp) {
        this.tenSp = tenSp;
        this.giaSp = giaSp;
        this.hangSp = hangSp;
    }

    public SanPham() {

    }

    public String getTenSp() {
        return tenSp;
    }

    public String getHangSp() {
        return hangSp;
    }

    public void setHangSp(String hangSp) {
        this.hangSp = hangSp;
    }

    public double getGiaSp() {
        return giaSp;
    }

    public void setGiaSp(double giaSp) {
        this.giaSp = giaSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public void nhapSanPham() {
        System.out.println("Nhap ten:");
        this.tenSp = scanner.nextLine();
        System.out.println("Nhap gia: ");
        this.giaSp = scanner.nextDouble();
        System.out.println("Nhap hang san xuat: ");
        this.hangSp = scanner.nextLine();
    }

    public void xuatSanPham() {
        System.out.printf("Ten san pham: %s, gia: %.2f, hang san xuat: %s\n", this.tenSp, this.giaSp, this.hangSp);
    }

}
