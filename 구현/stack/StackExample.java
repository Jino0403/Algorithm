import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

class StackExample {

    public static ArrayList<String> arrayStack = new ArrayList<String>();
    public static String str;
    public static Scanner sc = new Scanner(System.in);
    public static void apush() {
        arrayStack.add(str);
        System.out.println(arrayStack);
    }

    public static void apop() {
        if (arrayStack.size() == 0) {
            System.out.print("데이터가 존재하지 않습니다.");
        }
        arrayStack.remove(arrayStack.size() - 1);
    }

    public static void apeek() {
        if (arrayStack.size() == 0) {
            System.out.print("데이터가 존재하지 않습니다.");
        }
        System.out.println(arrayStack.get(arrayStack.size() - 1));
    }

    public static void aprint() {
        if (arrayStack.size() == 0 ) {
            System.out.print("데이터가 존재하지 않습니다.");
        }
        System.out.println(arrayStack);
    }

    public static void main(String[] args) {
        str = "";
        boolean check = true;

        while (check) {
            str = sc.next();
            if (!str.equals("exit")){
                apush();
                break;
            } else {
                check = false;
            }
        }

        check = true;
        while (check) {
            str = sc.next();

            if (str.equals("pop")) {
                apop();
            } else if (str.equals("peek")) {
                apeek();
            } else if (str.equals("print")) {
                aprint();
            } else if (str.equals("exit")){
                System.exit(0);
            } else {
                apush();
            }
        }
    }
}