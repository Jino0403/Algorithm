import java.util.Scanner;

public class Bubble {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("배열 크기를 입력하세요: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("배열 요소를 입력하세요:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        bubbleSort(arr);
        
        System.out.println("정렬된 배열:");
        printArray(arr);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped = true; // 처음에는 최소 한 번은 실행
        
        while (swapped) {
            swapped = false; // 패스 시작 시 교환이 없다고 가정
            
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // 두 요소를 교환
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true; // 교환이 발생하면 true로 변경
                }
            }
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