import java.util.Arrays;
import java.util.Scanner;

// 90 %

public class Lab3Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong sinh vien: ");
        int n = sc.nextInt();

        String[] hoTen = new String[n];
        float[] diemSv = new float[n];
        String[] hocLuc = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap sv thu %d", i + 1);
            sc.nextLine();

            System.out.println("Ten sinh vien: ");
            hoTen[i] = sc.nextLine();

            System.out.println("Diem sinh vien: ");
            diemSv[i] = sc.nextFloat();
            sc.nextLine();

            if (diemSv[i] >= 9) {
                hocLuc[i] = "Xuat sac";
            } else if (diemSv[i] >= 7.5) {
                hocLuc[i] = "Gioi";
            } else if (diemSv[i] >= 6.5) {
                hocLuc[i] = "Kha";
            } else if (diemSv[i] >= 5) {
                hocLuc[i] = "Trung Binh";
            } else {
                hocLuc[i] = "Yeu";
            }

        }

        System.out.println("=============Danh sach sinh vien truoc khi sap xep ================");
        System.out.println("Ho ten : " + Arrays.toString(hoTen));
        System.out.println("Diem   : " + Arrays.toString(diemSv));
        System.out.println("Hoc luc: " + Arrays.toString(hocLuc));

        // sap xep sinh vien tang dan theo diem.
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (diemSv[i] > diemSv[i + 1]) {
                    String hoTenTemp = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = hoTenTemp;

                    float diemTemp = diemSv[i];
                    diemSv[i] = diemSv[j];
                    diemSv[j] = diemTemp;

                    String hocLucTemp = hocLuc[i];
                    hocLuc[i] = hocLuc[j];
                    hocLuc[j] = hocLucTemp;

                }
            }
        }

        System.out.println("=============Danh sach sinh vien sau khi sap xep tang dan theo diem la:==============");
        System.out.println("Ho ten : " + Arrays.toString(hoTen));
        System.out.println("Diem   : " + Arrays.toString(diemSv));
        System.out.println("Hoc luc: " + Arrays.toString(hocLuc));
    }

}
