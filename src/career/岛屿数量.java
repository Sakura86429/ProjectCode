package career;

/**
 * Topic
 * Description
 *
 * @author zhouh
 * @version 1.0
 * Create by 2022/8/19 11:50
 */
public class 岛屿数量 {
    public static void main(String[] args) {
        char[][] str = new char[3][4];
        str[0] = new char[] {'1', '1', '1', '1'};
        str[1] = new char[] {'1', '0', '0', '0'};
        str[2] = new char[] {'0', '0', '1', '0'};
        System.out.println(numIsland(str));
    }
    public static int numIsland(char[][] island) {
        int count = 0;
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[0].length; j++) {
                if (island[i][j] == '1') {
                    dfs(island, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private static void dfs(char[][] island, int i, int j) {
        if (i < 0 || j < 0 || i > island.length - 1 || j > island[0].length - 1 || island[i][j] == '0') return;
        island[i][j] = '0';
        dfs(island, i + 1, j);
        dfs(island, i - 1, j);
        dfs(island, i, j + 1);
        dfs(island, i, j - 1);
    }
}
