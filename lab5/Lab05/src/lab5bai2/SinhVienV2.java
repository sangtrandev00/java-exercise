package lab5bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SinhVienV2 {
    ArrayList<String> danhSach = new ArrayList<String>();

    // nhap danh sach.
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap ho ten: ");
            String hoTen = sc.nextLine();
            if (hoTen.isEmpty()) {
                break;
            }
            danhSach.add(hoTen);
        } while (true);
    }

    // Xuat danh sach
    public void xuat() {
        System.out.println("Danh sach ho ten: ");
        for (String x : danhSach) {
            System.out.println("Ho ten:" + x);
        }
    }

    // Xuat danh sach ngau nhien
    public void xuatNgauNhien() {
        Collections.shuffle(danhSach);
        xuat();
    }

    // Sap xep giam dan va xuat danh sach.
    // c1:
    public void sapXepGiamDan() {
        Collections.sort(danhSach);
        Collections.reverse(danhSach);
        xuat();
    }

    // public void sapXep() {
    // Collections.sort(danhSach, (a,b) -> a.compareTo(b)); // lambda expression ???
    // cach sap xep(ky thuat ) nay co nghia la gi
    // xuat();
    // }

    // Tim va xoa ho ten nhap tu ban phim
    public void timVaXoa() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten can tim va xoa: ");
        String hoTen = sc.nextLine();
        for (String x : danhSach) {
            if (x.equals(hoTen))
                danhSach.remove(x);
            break;
        }
        xuat();
    }
    // ket thuc

    public void hienThiMenu() {
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("----------------------------------");
            System.out.println("Menu chuc nang cua chuong trinh: ");
            System.out.println("1. Nhap danh sach");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Sap xep danh sach");
            System.out.println("4. Hien thi ngau nhien danh sach");
            System.out.println("5. Tim kiem va xoa ho ten trong danh sach");
            System.out.println("6. thoat chuong trinh");
            System.out.println("Lua chon cua ban: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;

                case 3:
                    System.out.println("Danh sach sinh vien sau khi sap xep giam dan la: ");
                    sapXepGiamDan();
                    break;
                case 4:
                    xuatNgauNhien();
                    break;

                case 5:
                    timVaXoa();
                    break;

                case 6:
                    System.out.println("Finish Program LAB5_2!!!");
                    System.exit(0);
                    break;

            }
        } while (true);
    }
}
