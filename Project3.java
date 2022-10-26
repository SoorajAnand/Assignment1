
public class Project3 {
    public static void main(String args[]) {
        int n = 7;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int row = 5;
        int col = 14;
        for (int k = 1; k <= row; k++) {
            for (int l = 1; l <= col; l++) {
                if (k < 1 || l == 1 || k == row || l == col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
