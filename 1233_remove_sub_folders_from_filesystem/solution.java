import java.util.*;

public class solution {
    public static List<String> removeSubfolders(String[] folder) {
        LinkedList<String> ans = new LinkedList<>();
        Arrays.sort(folder);
        
        for (String f: folder) {
            if (ans.isEmpty() || !f.startsWith(ans.peekLast() + '/')) {
                ans.offer(f);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String[] folder = new String[] {"/a","/a/b","/c/d","/c/d/e","/c/f"};

        List<String> ans = removeSubfolders(folder);

        System.out.println(ans);
    }
}