package lab6bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class MainSanPham {
    public static void main(String[] args) {
        // SanPham sp = new SanPham();

        ArrayList<SanPham> sanPhamList = new ArrayList<SanPham>();
        Scanner scanner = new Scanner(System.in);
        // Nhap danh sach 5 san pham.
        for (int i = 0; i < 5; i++) {
            // System.out.printf("Nhap san pham thu %d", i + 1);
            // scanner.nextLine();
            System.out.println("Ten san pham: ");
            String tenSp = scanner.nextLine();
            System.out.println("Gia san pham: ");
            double giaSp = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Hang san xuat: ");
            String hangSx = scanner.nextLine();

            SanPham sanpham = new SanPham(tenSp, giaSp, hangSx); // co phuong phap khac khong can nhat thiet phai dung
                                                                 // constructor nay de thay doi.
            sanPhamList.add(sanpham);
        }

        // Xuat thong tin san pham co hang la nokia.
        int count = 0;
        System.out.println("Danh sach cac san pham thuoc hang Nokia la: ");
        for (int i = 0; i < 5; i++) {
            if (sanPhamList.get(i).getHangSp().equalsIgnoreCase("nokia")) {
                sanPhamList.get(i).xuatSanPham();
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Khong tim thay san pham co hang nokia trong danh sach!");
        }

    }
}
