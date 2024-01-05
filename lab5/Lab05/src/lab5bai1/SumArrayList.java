package lab5bai1;

import java.util.Scanner;
import java.util.ArrayList;

public class SumArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numDoubleList = new ArrayList<Double>();
        System.out.println("Nhap vao so luong so thuc: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap so thu o vi tri %d: ", i);
            double doubleNum = sc.nextDouble();
            numDoubleList.add(doubleNum);
        }
        double sum = 0;
        for (double num : numDoubleList) {
            sum += num;
        }

        System.out.println("Danh sach cac so thuc : " + numDoubleList);
        System.out.println("Tong cac so thuc : " + sum);
    }
}
