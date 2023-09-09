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
				// ���ɾ� �Է�
				int y = scanner.nextInt() - 1;
				int x = scanner.nextInt() - 1;
				String c = scanner.next();
				
				// ��Ʈ���� ���� ����
				matrix.get(y)[x] = c;
				
				
				// ����� ��ġ�� �������� Ž��
				Queue<int[]> queue = new LinkedList<>();
				queue.add(new int[]{y, x});
				boolean[][] visited = new boolean[N][N];
				visited[y][x] = true;
				
				// �湮�� ��ǥ�� ����� Path ����
				List<int[]> path = new ArrayList<>();
				while (!queue.isEmpty()) {
					int[] current = queue.poll();
					path.add(current); // add �� ����ص� �˴ϴ�.
					for (int j = 0; j < 4; j++) {
						int nextX = current[1] + dx[j];
						int nextY = current[0] + dy[j];
						// ���� Ž��
						if (nextX >= 0 && nextX < N && nextY >= 0 && nextY < N) {
							// ���� �湮���� �����鼭, ��ǥ�� ���� c�� ���� ���
							if (!visited[nextY][nextX] && matrix.get(nextY)[nextX].equals(c)) {
								visited[nextY][nextX] = true;
								queue.offer(new int[]{nextY, nextX});
							}
						}
					}
				}
				// Path�� ��� K �̻��̶�� matrix�� ���� . ���� ����
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