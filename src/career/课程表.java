package career;

import java.util.ArrayList;
import java.util.List;

/**
 * Topic
 * Description
 *
 * @author zhouh
 * @version 1.0
 * Create by 2022/8/24 14:55
 */
public class 课程表 {
    public static void main(String[] args) {

    }
    List<List<Integer>> list;
    int[] visited;
    boolean isValid = true;   // 有环标记为false
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        list = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            list.add(new ArrayList<>());
        }
        visited = new int[numCourses];
        for (int[] info : prerequisites) {
            list.get(info[1]).add(info[0]);   // 要学0，得先学1，拓扑排序先排1；1——>0，即get info[1]得到info[0]
        }
        for (int i = 0; i < numCourses && isValid; i++) {
            if (visited[i] == 0) dfs(i);
        }
        return isValid;
    }

    private void dfs(int i) {
        visited[i] = 1;
        for (int v : list.get(i)) {
            if (visited[v] == 0) {
                dfs(v);
                if (!isValid) return;
            } else if (visited[v] == 1) {
                isValid = false;
                return;
            }
        }
        visited[i] = 2;
    }
}
