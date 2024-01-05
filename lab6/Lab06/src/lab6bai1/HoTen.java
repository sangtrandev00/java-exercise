package lab6bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class HoTen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao ho va ten: ");
        String hoTen = scanner.nextLine();

        if (!hoTen.trim().contains(" ")) {
            System.out.println("ten: " + hoTen);
        }

        // String[] stringArr = hoTen.split(" ");
        // ArrayList<String> stringList = new ArrayList<String>();

        // for (int i = 0; i < stringArr.length; i++) {
        // if (stringArr[i] != "") {
        // stringList.add(stringArr[i]);
        // }
        // }
        // if (stringList.size() == 2) {
        // System.out.println("Ho ten: ");
        // for (String name : stringList) {
        // System.out.printf("%s", name);
        // }
        // }

        String firstName = hoTen.substring(hoTen.trim().lastIndexOf(" ") + 1);
        String lastName = hoTen.substring(0, hoTen.trim().indexOf(" "));
        String subName = hoTen.substring(hoTen.trim().indexOf(" ") + 1, hoTen.trim().lastIndexOf(" "));

        System.out.printf("ho, ten dem va ten: %s %s %s ", lastName.toUpperCase(), subName, firstName.toUpperCase());
    }
}