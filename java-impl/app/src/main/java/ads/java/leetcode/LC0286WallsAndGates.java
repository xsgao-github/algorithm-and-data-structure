package ads.java.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class LC0286WallsAndGates {

	/**
	 * -2: gate, -1: wall, 0: not visited
	 * 
	 * @param map
	 */
	public void wallsAndGates(int[][] map) {
		Deque<int[]> queue = new LinkedList<>();
		// find all gates
		for (int r = 0; r < map.length; r++) {
			for (int c = 0; c < map[0].length; c++) {
				if (map[r][c] == -2) {
					queue.add(new int[] { r, c });
				}
			}
		}

		// BFS
		int depth = 0;
		while (queue.size() > 0) {
			depth++;

			// pull from queue
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				int[] cell = queue.poll();
				int r = cell[0];
				int c = cell[1];
				mark(map, queue, depth, r - 1, c);
				mark(map, queue, depth, r, c + 1);
				mark(map, queue, depth, r + 1, c);
				mark(map, queue, depth, r, c - 1);
			}
		}
	}

	/**
	 * Mark a cell and add it's adjacent cells to queue.
	 * 
	 * @param map
	 * @param queue
	 * @param depth
	 * @param r
	 * @param c
	 */
	private void mark(int[][] map, Deque<int[]> queue, int depth, int r, int c) {
		// boundary check
		if (r < 0 || r >= map.length || c < 0 || c >= map[0].length) {
			return;
		}

		// gate or wall
		if (map[r][c] <= -1) {
			return;
		}

		// set depth and add to queue
		if (map[r][c] == 0 || map[r][c] > depth) {
			map[r][c] = depth;
			queue.add(new int[] { r, c });
		}
	}
}
