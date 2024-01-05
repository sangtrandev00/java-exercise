package lab7bai3;

import java.util.Scanner;

public class MenuSinhVien {
    AppQuanLySinhVien qlsv = new AppQuanLySinhVien();

    public void Menu() {

        Scanner scanner = new Scanner(System.in);

        int choose = 0;
        String button = null;
        do {
            System.out.println("===========MENU CHUONG TRINH ====================");
            System.out.println("1. Nhap danh sach sinh vien: ");
            System.out.println("2. Xuat thong tin danh sach sinh vien");
            System.out.println("3. Xuat danh sach sinh vien co hoc luc gioi");
            System.out.println("4. Sap xep danh sach sinh vien theo diem ");
            System.out.println("5. Ket thuc");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    chucNang1();
                    break;
                case 2:
                    chucNang2();
                    break;
                case 3:
                    chucNang3();
                    break;
                case 4:
                    chucNang4();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
            System.out.println("Tiep tuc chuong trinh bam(Y/y) khong tiep tuc (N/n): ");
            button = scanner.nextLine();

            // if (button.equalsIgnoreCase("Y")) {
            // continue;
            // }
            if (button.equalsIgnoreCase("N")) {
                break;
            }
            if (button.equalsIgnoreCase("Y")) {
                continue;
            }

        } while (true);

    }

    public void chucNang1() {
        qlsv.nhapDanhSachSv();
    }

    public void chucNang2() {
        qlsv.xuatDanhSachSv();
    }

    public void chucNang3() {
        qlsv.xuatDSHocLucGioi();
    }

    public void chucNang4() {
        qlsv.sapXepSinhVien();
        qlsv.xuatDanhSachSv();
    }
}
