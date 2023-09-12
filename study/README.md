![KakaoTalk_20230912_015846537_01](https://github.com/Jino0403/Algorithm/assets/89855707/db67e477-ec54-41db-91f7-f46ec1f62ab0)

1. 그래프

&nbsp;1) 정의

 &nbsp;&nbsp; - 노드와 그 노드를 연결하는 간선을 하나로 모아 놓은 자료 구조
 &nbsp;&nbsp; - 연결되어 있는 객체 간의 관계를 표현할 수 있는 구조
 &nbsp;&nbsp; - 방향과 무방향 그래프가 모두 존재한다.(방향, 무방향, 양방향 가능)
 &nbsp;&nbsp; - 네트워크 모델
 &nbsp;&nbsp;  - 루트 노드, 부모&자식 관계 개념 X
 &nbsp;&nbsp;  - 간선의 개수 자유, 없을수도 있음

&nbsp;2) 예시

   &nbsp;&nbsp; - 지도, 지하철 노선도의 최단 경로 등

&nbsp;3) 순회 방식

   &nbsp;&nbsp; - DFS, BFS

![KakaoTalk_20230912_015846537](https://github.com/Jino0403/Algorithm/assets/89855707/ce87bc09-bdcc-4d5c-9cba-b3a814081ceb)

2. 트리

&nbsp;1)  정의

&nbsp;&nbsp;- 그래프의 한 종류, 노드로 이루어진 자료구조
&nbsp;&nbsp;- 방향성 존재 (방향 그래프만 존재)
&nbsp;&nbsp;- 두 개의 노드 사이에 반드시 1개의 경로만 가짐(단방향)
&nbsp;&nbsp;- 사이클이 존재하지 않는 방향 그래프
&nbsp;&nbsp;- 부모&자식 관계 성립으로 계층형 모델로도 불림
&nbsp;&nbsp;- N개의 노드를 가진 트리는 항상 N-1개의 간선을 가짐

&nbsp;2) 예시

&nbsp;&nbsp;- 이진 트리, 이진 탐색트리 등

&nbsp;3) 순회 방식

&nbsp;&nbsp;- DFS, BFS 방식의 전위, 중위, 후위 순회

3. 깊이 우선 탐색(DFS , Depth-First Search

&nbsp;1)  정의

&nbsp;&nbsp;- 최대한 깊이 내려간 뒤, 더이상 깊이 갈 곳이 없을 경우 옆으로 이동
&nbsp;&nbsp;- 루트노드(혹은 다른 임의의 노드) 에서 시작해서 다음 분기로 넘어가기 전까지
&nbsp;&nbsp;  해당분기를 완벽하게 탐색하는 방식
&nbsp;&nbsp;- 깊이 우선 탐색(DFS)가 너비 우선 탐색(BFS)보다 좀 더 간단하다.
&nbsp;&nbsp;- 하지만 검색 속도 자체는 너비 우선 탐색(BFS)에 비해 느리다
&nbsp;&nbsp;- 모든 노드 방문 시 사용

&nbsp;2)  예시

&nbsp;&nbsp;- 미로찾기를 할 때, 최대한 한 방향으로 갈 수 있을때까지 가다가 막다른길이거나, 더 이상 갈 수 없게되면
&nbsp;&nbsp;  가장 가까운 갈림길로 돌아와서 그 갈림길부터 다시 다른 방향으로 탐색을 진행하는 것

&nbsp;3)  구현

 nbsp;&nbsp;   - 스택 또는 재귀함수

&nbsp;4)  동작 과정

&nbsp;&nbsp;- 탐색 시작 노드를 스택에 삽입하고 방문 처리합니다.
&nbsp;&nbsp;- 스택의 최상단 노드에 방문하지 않은 인접한 노드가 하나라도 있으면 그 노드를 스택에 넣고 방문 처리합니다. 방문하지 않은 인접 노드가 없으면 스택에서 최상단 노드를 꺼냅니다.
&nbsp;&nbsp;- 더 이상 2번의 과정을 수행할 수 없을 때까지 반복합니다.

![KakaoTalk_20230912_015839851](https://github.com/Jino0403/Algorithm/assets/89855707/8711a207-3c3e-41fe-9377-604df152164d)

![KakaoTalk_20230912_015839851_03](https://github.com/Jino0403/Algorithm/assets/89855707/efffbbda-7ea9-4046-9329-2ddd5614b2bd)

4. 너비 우선 탐색(BFS, Breath-First Search)

&nbsp;1)  정의

&nbsp;&nbsp;- 최대한 넓게 이동한 다음, 더 이상 갈 수 없을 때 아래로 이동 (옆으로 간다는..)
&nbsp;&nbsp;- 루트노드(혹은 다른 임의의 노드) 에서 시작해서 가장 근접한 노드를 먼저 탐색하는 방법
&nbsp;&nbsp;  시작 정점으로부터 가까운 정점부터 먼저 방문 후, 멀리 떨어진 정점은 나중에 방문
&nbsp;&nbsp;- 두 노드 사이 최단경로 찾을 때 주로 사용

&nbsp;2)  예시

&nbsp;&nbsp;- 지구 상에 존재하는 모든 친구 관계를 그래프로 표현한 후 Sam과 Eddie사이에 존재하는 경로를 찾는 경우
  => 깊이 우선 탐색(DFS)로 진행 시 모든 친구관계 다 살펴봐야 하지만
  너비 우선 탐색(BFS)로 진행시 Sam과 가까운 관계부터 탐색

&nbsp;3)  구현

&nbsp;&nbsp;- 큐를 이용해 구현

![KakaoTalk_20230912_015839851](https://github.com/Jino0403/Algorithm/assets/89855707/8711a207-3c3e-41fe-9377-604df152164d)

<img width="493" alt="BFS" src="https://github.com/Jino0403/Algorithm/assets/89855707/d457944a-7177-4b5c-8485-1e70ef7ec092">

&nbsp;4)  동작 과정

&nbsp;&nbsp;- 탐색 시작 노드를 큐에 삽입하고 방문 처리를 합니다.
&nbsp;&nbsp;- 큐에서 노드를 꺼낸 뒤에 해당 노드의 인접 노드 중에는 방문하지 않은 노드를 모두 큐에 삽입하고 방문 처리합니다.
&nbsp;&nbsp;- 더 이상 2번의 과정을 수행할 수 없을 때까지 반복합니다.

5. 기타

&nbsp;- 노드 ? 정점이라고도 부르며 데이터가 저장된다. ( ex\_ 0,1,2,3)
&nbsp;- 간선 ? 노드(정점)을 연결하는 선으로 link , branch라고도 부름
&nbsp;- 루트노드(root node) ? 부모가 없는 노드
&nbsp;- 재귀함수 ? 자기 자신을 다시 호출하는 함수 , while문이라 for문을 사용하지 않아도 특정 값 무한대로 호출 가능
  => 이 때문에, 종료 조건을 반드시 명시해야함. 그렇지 않으면 무한 호출
&nbsp;- DFS, BFS의 전위, 중위 후위 방식 ?
  <img width="618" alt="깊이 우선 탐색 예시" src="https://github.com/Jino0403/Algorithm/assets/89855707/5f4894b4-90e0-4f92-a97a-47c4bbfd2f2d">

&nbsp;&nbsp;  1.  전위 : 루트 -> 왼쪽 자식 -> 오른쪽 자식 순으로 순회한다.
      10 -> 6 -> 3 -> 8 -> 15 -> 20
&nbsp;&nbsp;  2.  중위 : 왼쪽 자식 -> 루트 -> 오른쪽 자식 순으로 순회한다.
      3 -> 6 -> 8 -> 10 -> 15 -> 20
&nbsp;&nbsp;  3.  후위 : 왼쪽 자식 -> 오른쪽 자식 -> 루트 순으로 순회한다.
      3 -> 8 -> 6 -> 20 -> 15 -> 10
