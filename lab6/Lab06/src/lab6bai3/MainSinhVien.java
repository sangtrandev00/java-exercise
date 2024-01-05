package lab6bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class MainSinhVien {
    public static Scanner scanner = new Scanner(System.in);

    public static ArrayList<SinhVien> studentList = new ArrayList<SinhVien>();

    public static void main(String[] args) {
        do {
            System.out.println("Nhap ho ten: ");
            String hoTen = scanner.nextLine();

            // verify email
            System.out.println("Nhap email: ");
            String email = scanner.nextLine();
            String reEmail = "^^(?=.{1,64}@)[A-Za-z0-9\\+_-]+(\\.[A-Za-z0-9\\+_-]+)*@"
                    + "[^-][A-Za-z0-9\\+-]+(\\.[A-Za-z0-9\\+-]+)*(\\.[A-Za-z]{2,})$";
            if (!email.matches(reEmail)) {
                System.out.println("Ban nhap khong dung email!");
                continue;
            }

            // verify phone number
            System.out.println("Nhap so dien thoai: ");
            String soDienThoai = scanner.nextLine();
            String reSoDienThoai = "0\\d{9,10}";
            if (!soDienThoai.matches(reSoDienThoai)) {
                System.out.println("Ban nhap khong dung so dien thoai!");
                continue;
            }

            // verify cmnd
            System.out.println("Nhap cmnd: ");
            String cmnd = scanner.nextLine();
            String reCmnd = "[0-9]{9}";
            if (!cmnd.matches(reCmnd)) {
                System.out.println("Ban nhap khong dung so cmnd!");
                continue;
            }

            // add student into arraylist.
            SinhVien student = new SinhVien(hoTen, email, soDienThoai, cmnd);
            studentList.add(student);

            if (studentList.size() >= 5) {
                break;
            }
        } while (true);

        // Danh sach 5 sinh vien, da dien day thong tin:
        System.out.println("===============Danh sach 5 sinh vien:==================");
        for (SinhVien sinhvien : studentList) {
            sinhvien.xuatSinhVien();
        }
    }

}
