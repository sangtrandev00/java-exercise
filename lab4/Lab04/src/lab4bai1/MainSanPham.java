package lab4bai1;

import java.util.Scanner;

public class MainSanPham {
    public static void main(String[] args) {

        SanPham sp1 = new SanPham("Banh Mi", 90000, 10);
        SanPham sp2 = new SanPham("Banh tet", 80000);

        sp1.xuat();
        sp2.xuat();
    }
}
