package lab8bai1;

public class Sum {
    public static final double sum(double... x) {

        double sum = 0;
        for (double num : x) {
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Tong cua cac tham so truyen vao la: ( 1,2,3,4,5 ): " + sum(1, 2, 3, 4, 5));
        System.out.println(
                "Tong cua cac tham so truyen vao la: ( 1.5 ,2.5 ,3.5 ,4.5 ,5.5  ): " + sum(1.5, 2.5, 3.5, 4.5, 5));
        System.out.println("Tong cua cac tham so truyen vao la: ( 10,11,12 ): " + sum(10, 11, 12));
    }
}