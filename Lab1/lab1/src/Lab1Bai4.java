import java.util.Scanner;
import java.lang.Math;

public class Lab1Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap vao a: ");
        int a = sc.nextInt();
        System.out.println("nhap vao b: ");
        int b = sc.nextInt();
        System.out.println("nhap vao c: ");
        int c = sc.nextInt();

        double delta = b * b - 4 * a * c;
        double sqrtDelta = Math.sqrt(delta);

        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Phuong trinh co vo so nghiem");
        } else if (a == 0 && b == 0 && c != 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (a == 0 && b != 0) {
            System.out.printf("Phuong trinh co nghiem la :%f", -c / b);
        } else {
            if (delta == 0) {
                float x = -b / (2 * a);
                System.out.printf("Phuong trinh co nghiem kep la: x1 = x2 = %f", x); // sai cai gi nhi ?
            } else if (delta > 0) {
                System.out.printf("Phuong trinh co 2 nghiem la: x1= %f, x2=%f", (-b + sqrtDelta) / (2 * a),
                        (-b - sqrtDelta) / (2 * a));
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }
}
