package hashtable;

import java.util.HashSet;
/**
 * Leetcode36: Valid Soduko 题目： 给定一个数独，check这个数独是否valid。
 * 思路：对于每一行每一列和每一个box建立一个hashset。检查hashset不能含有重复数字。 值得注意的就是理清box的id和行列之间的关系即可
 * 
 * @author qiuyi
 *
 */
public class solution36 {
	public boolean isValidSudoku(char[][] board) {
		for (int i = 0; i < 9; i++) {
			HashSet<Integer> row = new HashSet<>();
			HashSet<Integer> coloum = new HashSet<>();
			HashSet<Integer> box = new HashSet<>();
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.' && (!row.add(board[i][j] - '0')))
					return false;
				if (board[j][i] != '.' && (!coloum.add(board[j][i] - '0')))
					return false;
				int a = 3 * (i / 3) + (j / 3);
				int b = 3 * (i % 3) + (j % 3);
				if (board[a][b] != '.' && (!box.add(board[a][b] - '0')))
					return false;
			}
		}
		return true;
	}
}
