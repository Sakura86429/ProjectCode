package career;

import java.util.ArrayList;
import java.util.List;

/**
 * Topic
 * Description
 *
 * @author zhouh
 * @version 1.0
 * Create by 2022/8/24 15:10
 */
public class 课程表II {
    public static void main(String[] args) {

    }
    List<List<Integer>> list;
    int[] visited;
    boolean isValid = true;
    int[] res;
    int index;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        list = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            list.add(new ArrayList<>());
        }
        for (int[] info : prerequisites) {
            list.get(info[1]).add(info[0]);
        }
        visited = new int[numCourses];
        res = new int[numCourses];
        index = numCourses - 1;   // 只有定义在此函数外面，才能被所有函数使用
        for (int i = 0; i < numCourses && isValid; i++) {
            if (visited[i] == 0) dfs(i);
        }
        if (!isValid) return new int[0];
        return res;
    }

    private void dfs(int i) {
        visited[i] = 1;
        for (int v : list.get(i)) {
            if (visited[v] == 0) {
                dfs(v);   // dfs每次出来后isValid要判断是否变化
                if (!isValid) return;   // 为false，有环
            } else if (visited[v] == 1) {
                isValid = false;
                return;
            }
        }
        visited[i] = 2;
        res[index--] = i;
    }
}
