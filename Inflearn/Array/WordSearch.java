package Graph_DFS_BFS;

public class WordSearch {
	public static void main(String[] args) {

		char[][] grid = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "ABCCED";
		WordSearch a = new WordSearch();
		System.out.println(a.solve(grid, word));
	}

	int[][] dirs = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	int m, n;

	private boolean solve(char[][] grid, String word) {
		// 1.
		if (grid.length == 0 || grid[0].length == 0 || grid == null)
			return false;

		m = grid.length;
		n = grid[0].length;
		boolean[][] visited = new boolean[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (dfs(grid, visited, i, j, 0, word))
					return true;
			}

		}
		return false;

	}

	private boolean dfs(char[][] grid, boolean[][] visited, int x, int y, int start, String word) {
		if (start == word.length())
			return true;
		if (x < 0 || x >= m || y < 0 || y >= n)
			return false;
		if (visited[x][y])
			return false;
		if (grid[x][y] != word.charAt(start))
			return false; // dfs의 조건은 하나라도 맞지않은애들은 다 던진다는 개념
		// 0,0이 A이 같아야하는데 첫번째경우로 볼때 ! 이부분이 핵심 같지않으면 false

		visited[x][y] = true;
		for (int[] dir : dirs) {
			int dx = x + dir[0];
			int dy = y + dir[1];
			if (dfs(grid, visited, dx, dy, start + 1, word)) {
				return true;
			}
		}

		visited[x][y] = false;
		return false;
		
	}

}
