class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m*n;

        k%=(total);
        int[][] res = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int index=i*n+j;

                int newindex=(index+k)%total;

                int newrow=newindex/n;
                int newcol=newindex%n;

                res[newrow][newcol]=grid[i][j];
            }
        }

        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<m;i++){
            List<Integer> row= new ArrayList<>();

            for(int j=0;j<n;j++){
                row.add(res[i][j]);
            }

            list.add(row);
        }

        return list;

    }
}