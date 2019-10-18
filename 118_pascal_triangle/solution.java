import java.util.*;

public class solution {
    public static List<List<Integer>> generate(int n) {
        List<List<Integer>> res = new ArrayList<>();

        if (n <= 0) {
            return res;
        }

        List<Integer> pre = new ArrayList<>();
        pre.add(1);
        res.add(pre);

        for (int i = 2; i <= n; ++i) {
            List<Integer> cur = new ArrayList<>();

            cur.add(1);

            for (int j = 0 ; j < pre.size() - 1; ++j) {
                cur.add(pre.get(j) + pre.get(j + 1));
            }
            
            cur.add(1);

            res.add(cur);
            pre = cur;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();

        List<List<Integer>> res = generate(n);

        System.out.println(res);
    }
}