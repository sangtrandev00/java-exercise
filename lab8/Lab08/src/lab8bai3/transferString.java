package lab8bai3;

public class transferString {
    public static String toUpperFirstChar(String s) {
        String[] newArr = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < newArr.length; i++) {
            String item = newArr[i];
            if (!item.equals("")) {
                String ch = item.trim().substring(0, 1);
                String newWord = ch.toUpperCase() + item.trim().substring(1);
                sb.append(newWord).append(" ");
            }
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println("Chuyen doi " + "tran nhat sang ->" + toUpperFirstChar("    tran        nhat sang     "));
    }

}
