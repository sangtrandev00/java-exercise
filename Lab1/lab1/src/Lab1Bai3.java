import java.util.Scanner;

public class Lab1Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("xin moi nhap vao mot cancua khoi lap phuong");
        float canh = sc.nextFloat();
        System.out.printf("The tich cua khoi lap phuong co canh %f la %f", canh, Math.pow(canh, 3));
    }
}
