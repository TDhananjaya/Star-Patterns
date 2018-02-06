public class starpattern3{

    public static void main(String[] args) {
         int i, j, k=1;
        for(i=0; i<5; i++)
        {
            for(j=0; j<k; j++)
            {
                System.out.print("# ");
            }
            k = k + 3;
            System.out.println();
        }
    }
}
