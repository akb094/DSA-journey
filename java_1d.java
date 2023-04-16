import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        return canWin(leap, game, 0);
    }

    private static boolean canWin(int leap, int[] game, int i) {
        if (i >= game.length) {
            return true;
        } else if (i < 0 || game[i] == 1) {
            return false;
        }

        game[i] = 1;

        return canWin(leap, game, i + leap) ||
               canWin(leap, game, i + 1) ||
               canWin(leap, game, i - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        while (q-- > 0) {
            int n = scanner.nextInt();
            int leap = scanner.nextInt();
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scanner.nextInt();
            }
            System.out.println(canWin(leap, game) ? "YES" : "NO");
        }
        scanner.close();
    }
}
