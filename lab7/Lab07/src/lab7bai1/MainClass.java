package lab7bai1;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        HinhVuong hv = new HinhVuong();
        ChuNhat cn = new ChuNhat();
        ChuNhat cn1 = new ChuNhat();
        System.out.println("Nhap 2 hinh chu nhat");
        System.out.println("Hinh cn 1--");
        cn.nhap();
        System.out.println("Hinh cn 2--");
        cn1.nhap();

        System.out.println("Nhap 1 hinh vuong");
        hv.nhap();

        System.out.println("==================Hinh chu nhat====================");
        System.out.println("Hinh 1: --");
        cn.xuat();
        System.out.println("Hinh 2: --");
        cn1.xuat();

        System.out.println("==================Hinh vuong ======================");
        hv.xuat();
    }
}
