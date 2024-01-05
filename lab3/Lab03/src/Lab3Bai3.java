import java.util.Arrays;
import java.util.Scanner;

public class Lab3Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu cua mang: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap arr[%d]: ", i);
            arr[i] = sc.nextInt();
        }
        // sap xep va print out the array. Increasing array.

        Arrays.sort(arr);
        System.out.println("Cac phan tu cua mang sau khi sap xep la: " + Arrays.toString(arr));

        // print out the minimum number of arrray.
        int min = arr[0];
        int count = 0;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] % 3 == 0) {
                sum += arr[i];
                count++;
            }
        }
        System.out.println("Phan tu co gia tri nho nhat cua mang la: " + min);
        System.out.printf("Trung binh cong cac phan tu chia het cho 3 la: %.2f", (float) sum / (float) count);
        // xuat ra man hinh trung binh cac phan tu chia het cho 3
    }
}