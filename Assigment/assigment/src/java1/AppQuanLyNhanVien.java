package java1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class AppQuanLyNhanVien {
    Scanner scanner = new Scanner(System.in);

    static ArrayList<NhanVien> nhanVienList = new ArrayList<NhanVien>();
    NhanVien nhanvien = new NhanVien();

    public void nhapDanhSach() {
        int choose = 0;
        System.out.println(
                "Moi nhap nhan vien hanh chinh ( bam phim 1), truong phong ( bam phim 2), tiep thi (bam phim 3):  ");
        choose = Integer.parseInt(scanner.nextLine());
        int n;
        switch (choose) {
            case 1: {
                System.out.println("Moi nhap so luong nhan vien hanh chinh: ");
                n = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < n; i++) {
                    System.out.printf("Nhan vien thu %d\n", i + 1);
                    NhanVien nv = new NhanVien();
                    nv.nhapNv();
                    nhanVienList.add(nv);
                }

                break;
            }

            case 2: {
                System.out.println("Moi nhap so luong truong phong: ");
                n = Integer.parseInt(scanner.nextLine());

                for (int i = 0; i < n; i++) {
                    System.out.printf("truong phong thu %d\n", i + 1);
                    NhanVien tp = new TruongPhong();
                    tp.nhapNv();
                    nhanVienList.add(tp);
                }
                break;
            }

            case 3: {
                System.out.println("moi nhap vao so luong nhan vien tiep thi: ");
                n = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < n; i++) {
                    System.out.printf("nhan vien tiep thi thu %d\n", i + 1);
                    NhanVien tiepThi = new TiepThi();
                    tiepThi.nhapNv();
                    nhanVienList.add(tiepThi);
                }

                break;
            }

            default:
                System.out.println("Ban nhap so khong chinh xac!");
                break;
        }

    }

    public static void xuatDanhSach() {
        System.out.println("==========DANH SACH NHAN VIEN =============");
        for (NhanVien nv : nhanVienList) {
            System.out.printf("STT: %d\t", nhanVienList.indexOf(nv) + 1);
            nv.xuatNv();
        }
    }

    public void timKiemVaHienThi() {
        System.out.println("Moi nhap ma so nhan vien can tim: ");
        String maTim = scanner.nextLine();
        int found = 0;
        System.out.printf("-----------------Nhan vien sau khi tim theo ma %s la: ", maTim);
        for (NhanVien nv : nhanVienList) {
            if (nv.getMaNv().equalsIgnoreCase(maTim)) {
                nv.xuatNv();
                found++;
            }
        }

        if (found == 0) {
            System.out.printf("Khong tim thay ma so %s trong danh sach sinh vien!\n", maTim);
        }
    }

    public void timVaXoaNhanVien() {
        System.out.println("Moi nhap vao ma so nhan vien can xoa: ");
        // scanner.nextLine();
        String maXoa = scanner.nextLine();
        Boolean check = false;
        for (NhanVien nv : nhanVienList) {
            if (nv.getMaNv().equals(maXoa)) {
                // System.out.println("Ma nhan vien tim thay: " + nv.getMaNv());
                check = true;
                nhanVienList.remove(nhanVienList.indexOf(nv)); // method remove co van de gi
                break;
            }
        }

        if (check == false) {
            System.out.printf("-----> Khong tim thay ma so %s trong danh sach sinh vien! <-----\n", maXoa);
        } else {
            System.out.printf("Ma xoa: %s\n", maXoa);
            System.out.printf("-------------Danh sach nhan vien khi  xoa ma: %s la: ---------------\n", maXoa);
            for (NhanVien nv : nhanVienList) {
                nv.xuatNv();
            }
        }
    }

    public void capNhatNhanVien() {
        System.out.println("Nhap ma nhan vien can cap nhat: ");
        String maCapNhat = scanner.nextLine();
        int found = 0;
        for (NhanVien nv : nhanVienList) {
            if (nv.getMaNv().equalsIgnoreCase(maCapNhat)) {
                found++;
                System.out.printf("Xin moi nhap vao thong tin nhan vien voi ma so: %s\n", maCapNhat);
                nv.nhapNv();
                int index = nhanVienList.indexOf(nv);
                nhanVienList.set(index, nv);
            }
        }

        if (found == 0) {
            System.out.printf("Khong tim thay ma so %s trong danh sach de cap nhat sinh vien\n", maCapNhat);
        } else {
            System.out.printf("------------Danh sach nhan vien sau khi cap nhat theo ma so: %s la: -----------\n",
                    maCapNhat);
            // for (NhanVien nv : nhanVienList) {
            // nv.xuatNv();
            // }
            xuatDanhSach();
        }
    }

    public void timNhanVienTheoKhoangLuong() {
        System.out.println("Nhap khoang luong can tim");
        System.out.println("Muc luong thap nhat: ");
        double minLuong = scanner.nextDouble();

        System.out.println("Muc luong cao nhat: ");
        double maxLuong = scanner.nextDouble();
        int found = 0;
        System.out.printf(
                "=====================DANH SACH NHAN VIEN THEO KHOANG THU NHAP TU %.2f TOI %.2f LA: ====================\n",
                minLuong, maxLuong);
        for (NhanVien nv : nhanVienList) {
            if (nv.getLuongNv() >= minLuong && nv.getLuongNv() <= maxLuong) {
                nv.xuatNv();
                found++;
            }
        }

        if (found == 0) {
            System.out.printf("Khong tim thay nhan vien co khoang luong tu %.2f toi %.2f\n", minLuong, maxLuong);
        }
    }

    Comparator<NhanVien> compTen = new Comparator<NhanVien>() {
        @Override
        public int compare(NhanVien o1, NhanVien o2) {

            return o1.getHoTen().compareTo(o2.getHoTen());
        }
    };

    Comparator<NhanVien> compThuNhap = new Comparator<NhanVien>() {
        @Override
        public int compare(NhanVien o1, NhanVien o2) {
            Double obj1 = o1.getThuNhap();
            Double obj2 = o2.getThuNhap();
            return obj1.compareTo(obj2);
        }
    };

    Comparator<NhanVien> compThuNhap5Max = new Comparator<NhanVien>() {
        @Override
        public int compare(NhanVien o1, NhanVien o2) {
            Double obj1 = o1.getThuNhap();
            Double obj2 = o2.getThuNhap();
            return obj2.compareTo(obj1);
        }
    };

    public void sapXepNhanVienTheoTen() {
        System.out.println("============Danh sach nhan vien theo sap xep ten tang dan ===============");
        Collections.sort(nhanVienList, compTen);
        // for (NhanVien nv : nhanVienList) {
        // nv.xuatNv();
        // }
        xuatDanhSach();
    }

    public void sapXepNhanVienTheoThuNhap() {
        System.out.println("=============Danh sach nhan vien sap xep theo 'thu nhap' tang dan===============");
        Collections.sort(nhanVienList, compThuNhap);
        // for (NhanVien nv : nhanVienList) {
        // nv.xuatNv();
        // }

        xuatDanhSach();
    }

    public void xuat5NvLuongCaoNhat() {
        System.out.println("================Danh sach 5 nhan vien co thu nhap cao nhat ===================");
        Collections.sort(nhanVienList, compThuNhap5Max);
        for (int i = 0; i < 5; i++) {
            nhanVienList.get(i).xuatNv();
        }
    }

}
