
import java.util.Scanner;
import java.util.Arrays;

public class Lab3Bai3C2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap n phan tu: ");
        // int n = sc.nextInt();
        int n = Integer.parseInt(sc.nextLine());

        int[] arr = new int[n];
        // Nhap phan tu.
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap arr[%d]: ", i);
            arr[i] = sc.nextInt();
        }
        // Xuat phan tu.
        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d] == %d\n", i, arr[i]);
        }

        // Sap xep va sap xep mang vua nhap
        System.out.println("Mang sau khi sap xep tang dan la: ");
        Arrays.sort(arr);
        for (int item : arr) {
            System.out.println(item);
        }

        // System.out.println("Phan tu co gia tri nho nhat: ");
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, arr[i]);
        }

        System.out.println("Phan tu co gia tri nho nhat mang la: " + min);

        // Trung binh cong cua cac phan tu chia het cho 3
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0) {
                sum += arr[i];
                count++;
            }
        }

        System.out.println("Trung binh cong cac phan tu chia het cho 3 la: " + sum / count);
    }
}
