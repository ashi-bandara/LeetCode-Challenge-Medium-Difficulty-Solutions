class Solution {
    public int findCircleNum(int[][] isConnected) {
        int provinces = 0;
        boolean[] visited = new boolean[isConnected.length];

        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) {
                provinces++;
                dfs(isConnected, visited, i);
            }
        }

        return provinces;
    }

    private void dfs(int[][] isConnected, boolean[] visited, int city) {
        visited[city] = true;
        for (int j = 0; j < isConnected[city].length; j++) {
            if (isConnected[city][j] == 1 && !visited[j]) {
                dfs(isConnected, visited, j);
            }
        }
    }
}
