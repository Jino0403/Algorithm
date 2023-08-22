import java.util.Scanner;

class problem2577 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int multi = a*b*c;
        String strNum = Integer.toString(multi);
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        int cnt4 = 0;
        int cnt5 = 0;
        int cnt6 = 0;
        int cnt7 = 0;
        int cnt8 = 0;
        int cnt9 = 0;

        int[] arrNum = new int[strNum.length()];
        for (int i=0;i<strNum.length();i++){
            arrNum[i] = strNum.charAt(i) - '0';

            if (arrNum[i] == 0){
                cnt0++;
            } else if (arrNum[i] == 1){
                cnt1++;
            } else if (arrNum[i] == 2) {
                cnt2++;
            } else if (arrNum[i] == 3) {
                cnt3++;
            } else if (arrNum[i] == 4) {
                cnt4++;
            } else if (arrNum[i] == 5) {
                cnt5++;
            } else if (arrNum[i] == 6) {
                cnt6++;
            } else if (arrNum[i] == 7) {
                cnt7++;
            } else if (arrNum[i] == 8) {
                cnt8++;
            } else if (arrNum[i] == 9) {
                cnt9++;
            }
        }

        System.out.println(cnt0);
        System.out.println(cnt1);
        System.out.println(cnt2);
        System.out.println(cnt3);
        System.out.println(cnt4);
        System.out.println(cnt5);
        System.out.println(cnt6);
        System.out.println(cnt7);
        System.out.println(cnt8);
        System.out.print(cnt9);

    }
}
