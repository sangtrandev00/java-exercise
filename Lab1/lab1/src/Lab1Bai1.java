import java.util.Scanner;

public class Lab1Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho ten: ");
        String hoTen = sc.nextLine();
        System.out.println("Diem trunh binh: ");
        float diemTrungBinh = sc.nextFloat();
        System.out.printf("<<%s>> <<%.2f>>", hoTen, diemTrungBinh);
    }
}