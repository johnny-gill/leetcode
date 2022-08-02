class Solution {
    public int kthSmallest(int[][] matrix, int k) {
		int length = matrix.length;
		int[] newMatrix = new int[length*length];
		
		int cnt = 0;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				newMatrix[cnt++] = matrix[i][j];
			}
		}
		Arrays.sort(newMatrix);
		
		return newMatrix[k - 1];
    }
}