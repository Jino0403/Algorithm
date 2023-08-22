import java.util.Scanner;

class problem2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        String reverse1 = "";
        String reverse2 = "";


        for (int j=str1.length()-1; j>=0; j--) {
            reverse1 = reverse1 + str1.charAt(j);

        }
        int number1 = Integer.parseInt(reverse1);
        for (int j=str2.length()-1; j>=0; j--) {
            reverse2 = reverse2 + str2.charAt(j);
        }
        int number2 = Integer.parseInt(reverse2);

        if (number1 > number2) {
            System.out.println(number1);
        } else if (number2 > number1) {
            System.out.println(number2);
        }

    }
}