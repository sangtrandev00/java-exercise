package java1;

import java.util.Scanner;

public class MenuSinhVien {
    AppQuanLyNhanVien qlnv = new AppQuanLyNhanVien();
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        int choose = 0;
        do {
            System.out.println("+==========================MENU================================+");
            System.out.println("+1.  Nhap danh sach nhan vien tu ban phim                      +");
            System.out.println("+2.  Xuat danh sach nhan vien tu ra man hinh                   +");
            System.out.println("+3.  Tim va hien thi nhan vien theo ma nhap tu ban phim        +");
            System.out.println("+4.  Xoa nhan vien theo ma nhap tu ban phim                    +");
            System.out.println("+5.  Cap nhap thong tin nhan vien theo ma nhap tu ban phim     +");
            System.out.println("+6.  Tim cac nhan vien theo khoang luong nhap tu ban phim      +");
            System.out.println("+7.  Sap xep nhan vien theo ho va ten                          +");
            System.out.println("+8.  Sap xep nhan vien theo thu nhap                           +");
            System.out.println("+9.  Xuat 5 nhan vien co thu nhap cao nhat                     +");
            System.out.println("+10. Thoat chuong trinh                                        +");
            System.out.println("+Moi nhap vao chuc nang: ( 1, 2,3,4,5,6,7,8,9, 10 ):           +");
            System.out.println("+==============================================================+");

            choose = Integer.parseInt(scanner.nextLine());
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
                    chucNang5();
                    break;
                case 6:
                    chucNang6();
                    break;

                case 7:
                    chucNang7();
                    break;

                case 8:
                    chucNang8();
                    break;

                case 9:
                    chucNang9();
                    break;
                case 10:
                    System.out.println("End game!");
                    System.exit(0);
                default:
                    System.out.println("Ban nhap sai chuc nang moi nhap lai!");
            }
        } while (true);
    }

    public void chucNang1() {
        qlnv.nhapDanhSach();
    }

    public void chucNang2() {
        qlnv.xuatDanhSach();

    }

    public void chucNang3() {
        qlnv.timKiemVaHienThi();
    }

    public void chucNang4() {
        qlnv.timVaXoaNhanVien();
    }

    public void chucNang5() {
        qlnv.capNhatNhanVien();
    }

    public void chucNang6() {
        qlnv.timNhanVienTheoKhoangLuong();
    }

    public void chucNang7() {
        qlnv.sapXepNhanVienTheoTen();
    }

    public void chucNang8() {
        qlnv.sapXepNhanVienTheoThuNhap();
    }

    public void chucNang9() {
        qlnv.xuat5NvLuongCaoNhat();
    }
}
