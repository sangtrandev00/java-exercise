package java1;

import java.util.Scanner;

public class TiepThi extends NhanVien {
    private double doanhSo;
    private double hueHong;

    public TiepThi(Scanner scanner, String maNv, String hoTen, double luongNv, double doanhSo, double hueHong) {
        super(scanner, maNv, hoTen, luongNv);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    public TiepThi(double doanhSo, double hueHong) {
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    public TiepThi() {

    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHueHong() {
        return hueHong;
    }

    public void setHueHong(double hueHong) {
        this.hueHong = hueHong;
    }

    public void nhapNv() {
        super.nhapNv();
        System.out.println("Doanh so ban hang: ");
        this.doanhSo = scanner.nextDouble();
        System.out.println("Phan tram hue hong: ");
        this.hueHong = scanner.nextDouble();
    }

    public double getThuNhap() {
        return super.getLuongNv() + this.doanhSo * this.hueHong;
    }

    public void xuatNv() {
        System.out.printf(
                "Ma nhan vien: %-10s, ho ten: %-20s, tien luong: %-12.2f VND, doanh so: %-12.2f VND, hue hong: %-5.2f, thu nhap: %-12.2f VND, thue: %-10.2f VND\n",
                this.getMaNv(),
                this.getHoTen(), this.getLuongNv(), this.doanhSo, this.hueHong, this.getThuNhap(), this.getThueTN());
    }
}
