import java.util.Scanner;

public class Select {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("배열의 크기를 입력하세요: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("배열 요소를 입력하세요:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        selectionSort(arr);
        
        System.out.println("정렬된 배열:");
        printArray(arr);
        
        // 스캐너를 닫지 않고 종료합니다. (권장되지 않는 방식)
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}