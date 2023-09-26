
import java.util.Scanner;

public class Virus {
    static int conn[][];   // 컴퓨터 연결 정보를 나타내는 인접 행렬
    static boolean visit[]; // 컴퓨터 방문 여부를 나타내는 배열
    static int n, m, v; // 컴퓨터 수, 연결된 컴퓨터 쌍의 수, 시작 정점
    // 시작정점은 몇 번 컴퓨터부터 시작할지를 정하는건데,
    // 여기서는 1부터 시작해야하므로 v =1로 지정함
    static int count = 0; // 바이러스에 걸리는 컴퓨터 수

    // 깊이 우선 탐색을 수행하는 함수
    public static int dfs(int i) {
        visit[i] = true; // 현재 컴퓨터를 방문했음을 표시

        for (int j = 1; j <= n; j++) {
            if (conn[i][j] == 1 && !visit[j]) { // 연결되어 있고 아직 방문하지 않은 컴퓨터라면
                // conn[i][j]가 1인 경우는 컴퓨터 i와 j가 연결되어있다는것을 의미함.
                // conn[i][j] =1 이라 함은 컴퓨터 i와 j가 연결되어있다는것을 의미하고
                // 만약 conn[i][j] = 0이라하면 연결되어있지 않다는 것

                count++; // 바이러스가 전파됨
                dfs(j); // 재귀적으로 탐색
            }
        }

        return count; // 바이러스에 걸린 컴퓨터 수 반환
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt(); // 컴퓨터 수
        m = scan.nextInt(); // 연결된 컴퓨터 쌍의 수
        v = 1; // 시작 정점 (1번 컴퓨터)
        conn = new int[n + 1][n + 1]; // 인접 행렬 초기화, 이유는 컴퓨터 번호가 1부터 시작하므로 배열의 크기를 n+1로 설정하여 0번 인덱스를 사용하지 않도록 함
        //conn의 배열을 int[n+1][n+1]로 하면 conn[1][1] 부터 conn[n][n]까지의 인덱스를 사용하여 컴퓨터 간의 연결 관계 저장할 수 있음
        visit = new boolean[n + 1]; // 방문 여부 배열 초기화

        // 컴퓨터 연결 정보 입력
        for (int i = 0; i < m; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            conn[a][b] = conn[b][a] = 1; // 양방향 연결
        }

        // 시작 정점에서 DFS 수행
        System.out.println(dfs(v)); // 1번 컴퓨터를 제외한 바이러스에 걸린 컴퓨터 수 출력
        scan.close();
    }
}
