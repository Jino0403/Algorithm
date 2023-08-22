import java.util.Scanner;

class problem2455 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int max =0;

        for (int i=1;i<5;i++) {
            int down = sc.nextInt();
            int up = sc.nextInt();

            if (i < 4) {
                sum = (sum-down) + up;
            }

            if (max < sum) {
                max = sum;
            }

        }
        System.out.println(max);
    }
}