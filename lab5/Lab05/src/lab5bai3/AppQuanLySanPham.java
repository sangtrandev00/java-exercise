package lab5bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class AppQuanLySanPham {
    ArrayList<SanPham> productList = new ArrayList<SanPham>();
    Scanner scanner = new Scanner(System.in);
    SanPham sp = new SanPham();

    public void nhapSanPham() {
        System.out.println("Nhap so luong san pham: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String tenSp;
        double giaSp;
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap ten san pham: ");
            tenSp = scanner.nextLine();

            System.out.println("Nhap gia san pham: ");
            giaSp = scanner.nextDouble();
            scanner.nextLine();
            SanPham sp = new SanPham(tenSp, giaSp);
            productList.add(sp);
        }

    }

    public void xuatSanPham() {
        for (int i = 0; i < productList.size(); i++) {
            System.out.printf("San pham %d--", i + 1);
            System.out.printf("San pham: %s -- gia: %.2f VND\n", productList.get(i).getTenSanPham(),
                    productList.get(i).getGiaSanPham());
        }
    }

    public void sapXepSanPham() {
        Collections.sort(productList, (a, b) -> (int) (a.getGiaSanPham() - b.getGiaSanPham()));
    }

    public void sapXepSanPhamV2() {
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                Double newObj1 = o1.getGiaSanPham();
                Double newObj2 = o2.getGiaSanPham();
                return newObj2.compareTo(newObj1);
            }
        };

        Collections.sort(productList, comp);
    }

    public void chucNang3() {
        sapXepSanPhamV2();
        xuatSanPham();
    }

    public void timVaXoaSanPham() {
        String tenCanTim;
        System.out.println("Moi nhap vao ten can tim");
        tenCanTim = scanner.nextLine();
        SanPham foundSp = null;
        for (SanPham product : productList) {
            if (product.getTenSanPham().equals(tenCanTim)) {
                foundSp = product;
                break;
            }
        }

        if (foundSp != null) {
            productList.remove(foundSp);
            System.out.printf(" San pham '%s' da tim thay va dc xoa khoi danh sach ", foundSp.getTenSanPham());
        }
        System.out.println("danh sach cac san pham con lai la: ");
        xuatSanPham();
    }

    public void xuatGiaTrungBinh() {

        double sumGia = 0;
        for (SanPham product : productList) {
            sumGia += product.getGiaSanPham();
        }
        System.out.println("Gia trung binh cua cac san pham la: " + sumGia / productList.size());
    }

}
