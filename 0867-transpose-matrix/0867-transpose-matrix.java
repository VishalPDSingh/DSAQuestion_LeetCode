class Solution {
    public int[][] transpose(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        int arr1[][] = new int[c][r];
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                if(i==j)
                {
                    arr1[i][j] = arr[i][j];
                }else
                {
                    arr1[j][i] = arr[i][j];
                }
            }
        }
        return arr1;
    }
}