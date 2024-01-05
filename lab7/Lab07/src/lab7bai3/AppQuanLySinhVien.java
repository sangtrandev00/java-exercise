package lab7bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import lab7bai2.SinhVienPoly;

public class AppQuanLySinhVien {
    ArrayList<SinhVienPoly> sinhVienList = new ArrayList<SinhVienPoly>();
    Scanner scanner = new Scanner(System.in);

    // Nhap sinh vien.

    public void nhapDanhSachSv() {
        System.out.println("Chon chuyen nganh cua sinh vien: IT(bam phim 1), BIZ(bam phim 2): ");
        int choose = 0;
        choose = scanner.nextInt();
        int n;
        if (choose == 1) {
            System.out.println("Nhap sinh vien IT: ");
            System.out.println("Nhap so luong sinh vien");
            n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.printf("Nhap sinh vien thu %d", i + 1);
                SinhVienPoly svIt = new SinhVienIT();
                svIt.nhap();
                sinhVienList.add(svIt);
            }
        }

        if (choose == 2) {
            System.out.println("Nhap sinh vien Biz: ");
            System.out.println("Nhap so luong sinh vien");
            n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.printf("Nhap sinh vien thu %d", i + 1);
                SinhVienPoly svBiz = new SinhVienBiz();
                svBiz.nhap();
                sinhVienList.add(svBiz);
            }
        }
    }

    public void xuatDanhSachSv() {
        for (SinhVienPoly sv : sinhVienList) {
            sv.xuat();
        }
    }

    // 3. Danh sach sinh vien co hoc luc gioi

    public void xuatDSHocLucGioi() {
        System.out.println("Danh sach sinh vien co hoc luc gioi");
        int count = 0;

        for (SinhVienPoly sv : sinhVienList) {
            if (sv.getHocLuc().equals("Gioi")) {
                count++;
                sv.xuat();
            }
        }

        if (count == 0) {
            System.out.println("Khong co sinh vien co hoc luc gioi trong danh sach!");
        }
    }

    // 4. Sap xep sinh vien theo diem giam dan.

    public void sapXepSinhVien() {
        Comparator<SinhVienPoly> comp = new Comparator<SinhVienPoly>() {
            @Override
            public int compare(SinhVienPoly o1, SinhVienPoly o2) {
                Double newObj1 = o1.getDiem();
                Double newObj2 = o2.getDiem();
                return newObj2.compareTo(newObj1);
            }
        };
        Collections.sort(sinhVienList, comp);
    }

}
