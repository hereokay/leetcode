
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        int limitX = n/2;
        int limitY = n/2;

        if (n%2==0){
            limitX -=1;
        }

        for (int i = 0; i <= limitX; i++) {
            for (int j = 0; j < limitY; j++) {
                int curX = i;
                int curY = j;

                int before = matrix[curX][curY];

                for (int k = 0; k < 4; k++) {
                    int[] next = getNext(curX, curY, n);

                    // swap
                    int tmp = matrix[next[0]][next[1]];
                    matrix[next[0]][next[1]] = before;
                    before = tmp;

                    curX = next[0];
                    curY = next[1];
                }
            }
        }
    }

    public int[] getNext(int a, int b, int n) {
        return new int[]{b, n-1-a};
    }

}