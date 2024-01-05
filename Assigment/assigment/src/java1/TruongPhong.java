package java1;

import java.util.Scanner;

public class TruongPhong extends NhanVien {
    private double trachNhiem;

    public TruongPhong(Scanner scanner, String maNv, String hoTen, double luongNv, double trachNhiem) {
        super(scanner, maNv, hoTen, luongNv);
        this.trachNhiem = trachNhiem;
    }

    public TruongPhong(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    public TruongPhong() {

    }

    public void nhapNv() {
        super.nhapNv();
        System.out.println("Nhap tien trach nhiem: ");
        this.trachNhiem = scanner.nextDouble();
    }

    public double getThuNhap() {
        return this.trachNhiem + super.getLuongNv();
    }

    public void xuatNv() {
        System.out.printf(
                "Ma nhan vien: %-10s, ho ten: %-20s, tien luong: %-12.2f VND, tien trach nhiem: %-12.2f VND, thu nhap: %-12.2f VND, thue: %-10.2f VND\n",
                this.getMaNv(),
                this.getHoTen(), this.getLuongNv(), this.trachNhiem, this.getThuNhap(), this.getThueTN());
    }

}
