import java.util.Scanner;

public class Lab1Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai: ");
        double chieuDai = sc.nextDouble();
        System.out.println("Nhap vao chieu rong");
        double chieuRong = sc.nextDouble();
        double chuVi = (chieuDai + chieuRong) * 2;
        double dienTich = (chieuDai * chieuRong);

        System.out.printf("Chu vi cua chieu dai va chieu rong la: %f", chuVi);
        System.out.printf("Dien tich cua chieu dai va chieu rong la: %f", dienTich);
        System.out.printf("Max cua chieu dai va chieu rong la: %f", Math.max(chieuDai, chieuRong));
    }
}
