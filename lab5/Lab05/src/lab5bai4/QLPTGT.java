package lab5.Lab05.src.lab5bai4;

import java.util.Scanner;

public class QLPTGT {
    private String maXe;
    private double VXiLanh;
    private double triGia;
    private String chuXe;
    private String mauXe;

    public QLPTGT() {

    }

    public QLPTGT(String maXe, double vXiLanh, double triGia, String chuXe, String mauXe) {
        this.maXe = maXe;
        this.VXiLanh = vXiLanh;
        this.triGia = triGia;
        this.chuXe = chuXe;
        this.mauXe = mauXe;
    }

    public String getMaXe() {
        return maXe;
    }

    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }

    public double getVXiLanh() {
        return VXiLanh;
    }

    public void setVXiLanh(double vXiLanh) {
        VXiLanh = vXiLanh;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }

    public String getChuXe() {
        return chuXe;
    }

    public void setChuXe(String chuXe) {
        this.chuXe = chuXe;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma xe: ");
        this.maXe = sc.nextLine();
        System.out.println("The tich xi lanh: ");
        this.VXiLanh = sc.nextDouble();
    }

    public void xuat() {

    }

    public double getTax() {

        if (this.triGia > 500) {
            return (3 / 100) * this.triGia;
        }

        if (this.triGia >= 100 && this.triGia <= 500) {
            return 0.02 * this.triGia;
        }

        return 0.01 * this.triGia;
    }
}
