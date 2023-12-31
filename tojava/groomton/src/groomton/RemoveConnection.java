package groomton;

import java.util.*;

public class RemoveConnection {
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int[] dx = {0, 0, 1, -1};
			int[] dy = {1, -1, 0, 0};

			int N = scanner.nextInt();
			int K = scanner.nextInt();
			int Q = scanner.nextInt();
			scanner.nextLine();  // Consume the newline

			List<String[]> matrix = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				matrix.add(scanner.nextLine().split(""));
			}
			
			for (int i = 0; i < Q; i++) {
				// 명령어 입력
				int y = scanner.nextInt() - 1;
				int x = scanner.nextInt() - 1;
				String c = scanner.next();
				
				// 매트릭스 상태 변경
				matrix.get(y)[x] = c;
				
				
				// 변경된 위치를 기준으로 탐색
				Queue<int[]> queue = new LinkedList<>();
				queue.add(new int[]{y, x});
				boolean[][] visited = new boolean[N][N];
				visited[y][x] = true;
				
				// 방문한 좌표를 기록할 Path 변수
				List<int[]> path = new ArrayList<>();
				while (!queue.isEmpty()) {
					int[] current = queue.poll();
					path.add(current); // add 를 사용해도 됩니다.
					for (int j = 0; j < 4; j++) {
						int nextX = current[1] + dx[j];
						int nextY = current[0] + dy[j];
						// 범위 탐색
						if (nextX >= 0 && nextX < N && nextY >= 0 && nextY < N) {
							// 조건 방문하지 않으면서, 좌표의 값이 c와 같은 경우
							if (!visited[nextY][nextX] && matrix.get(nextY)[nextX].equals(c)) {
								visited[nextY][nextX] = true;
								queue.offer(new int[]{nextY, nextX});
							}
						}
					}
				}
				// Path의 길악 K 이상이라면 matrix의 값을 . 으로 수정
				if (path.size() >= K) {
					for (int[] coords : path) {
						matrix.get(coords[0])[coords[1]] = ".";
					}
				}
				
			}
			for(String[] m : matrix) {
				for(String a : m) {
					System.out.print(a);
				}
				System.out.println();
			}
		}
	}
