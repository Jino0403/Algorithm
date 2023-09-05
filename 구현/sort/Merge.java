import java.util.Scanner;

public class Merge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("배열의 크기를 입력하세요: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("배열 요소를 입력하세요:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        mergeSort(arr);
        
        System.out.println("정렬된 배열:");
        printArray(arr);
    }

    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return; // 배열 크기가 1 이하면 이미 정렬된 상태
        }

        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        // 원본 배열을 왼쪽과 오른쪽으로 분할
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = arr[i];
        }

        // 왼쪽과 오른쪽 배열을 재귀적으로 정렬
        mergeSort(left);
        mergeSort(right);

        // 정렬된 왼쪽과 오른쪽 배열을 병합
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int n1 = left.length;
        int n2 = right.length;
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // 남은 요소들을 복사
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
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