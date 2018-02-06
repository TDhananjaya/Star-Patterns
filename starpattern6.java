public class starpattern4{

       public static void main(String[] args) {
        int i, j, n = 8;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(" ");
            }
            n = n - 3;
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
