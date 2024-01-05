import java.util.Scanner;

public class TryCatchV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Xin moi nhap vao mot chuoi: ");
        try {
            String s = sc.nextLine();
            int a = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println(e);

        }

    }
}