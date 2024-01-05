package lab5bai1;

import java.util.Scanner;
import java.util.ArrayList;

public class SumArrayListV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numDoubleList = new ArrayList<Double>();

        String choose = "";

        while (true) {
            System.out.println("nhap so thuc: ");
            double doubleNum = sc.nextDouble();
            numDoubleList.add(doubleNum);
            sc.nextLine();
            System.out.println("Ban muon nhap tiep neu co bam ( Y/y ) khong (N/n)");
            choose = sc.nextLine();

            if (choose.equals("y") || choose.equals("Y")) {
                continue;
            }
            if (choose.equals("n") || choose.equals("N")) {
                break;
            }
        }
        double sum = 0;
        for (double num : numDoubleList) {
            sum += num;
        }

        System.out.println("Danh sach cac so thuc trong arraylist la: " + numDoubleList);
        System.out.println("Tong cac so thuc trong arraylist la: " + sum);
    }
}
