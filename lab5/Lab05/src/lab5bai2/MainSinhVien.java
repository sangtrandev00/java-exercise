package lab5bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainSinhVien {

    // SinhVien sv = new SinhVien();
    public static void main(String[] args) {
        ArrayList<String> studentNameList = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so luong sinh vien: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.flush();
            System.out.printf("nhap ho ten thu %d ", i + 1);
            String name = null;
            name = sc.nextLine();
            studentNameList.add(name);
        }

        System.out.println("Danh sach ho ten vua nhap la: ");
        for (String name : studentNameList) {
            System.out.println(name);
        }

        Collections.shuffle(studentNameList);
        System.out.println("Danh sach ho ten sau khi xao tron ngau nhien la: ");
        for (String name : studentNameList) {
            System.out.println(name);
        }

        Collections.sort(studentNameList);
        Collections.reverse(studentNameList);

        System.out.println("Danh sach sinh vien sau khi sap xep giam dan la: ");

        for (String name : studentNameList) {
            System.out.println(name);
        }

    }
}
