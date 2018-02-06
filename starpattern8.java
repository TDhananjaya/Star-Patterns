public class starpattern8{

       public static void main(String args[]) {
        int i, j, n = 1;
        for (i = 0; i < 5; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(n + " ");
                n++;
                n++;
            
            }
            System.out.println();
        }
    }
}
