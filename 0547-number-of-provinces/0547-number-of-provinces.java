class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int group = 0;

        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) {
                dfs(i, isConnected, visited);
                group++;
            }
        }

        return group;
    }

    private void dfs(int i, int[][] isConnected, boolean[] visited) {
        visited[i] = true;

        for (int j = 0; j < isConnected[0].length; j++) {
            if (!visited[j] && isConnected[i][j] == 1) {
                dfs(j, isConnected, visited);
            }
        }
    }
}