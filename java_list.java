import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            String operation = in.next();
            if (operation.equals("Insert")) {
                int index = in.nextInt();
                int value = in.nextInt();
                list.add(index, value);
            } else if (operation.equals("Delete")) {
                int index = in.nextInt();
                list.remove(index);
            }
        }
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}
