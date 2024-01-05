import java.util.Scanner;

class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Vui long nhap so nguyen: ");
            int a = sc.nextInt();

        } catch (Exception ex) {
            System.out.println("Vui long nhap so: ");
        }
    }
}