import java.util.Arrays;

public class kollatz {
    public static void main(String[] argv ){
        int chislo = Integer.parseInt(argv[0]);
        int[] maxlen = Count(chislo);
        System.out.println(Arrays.toString(maxlen));
    }

    public static int[] Count(int up){

        int[] values = new int [2];
       int max =0;
        for (int i=1;i<up;i++)
        {
            int locmax=1;
           long k=i;
            while(k!=1)
            {
                if((k%2)==1){
                    k= 3*k+1;
                    locmax++;
                }
                else{
                    k/=2;
                    locmax++;
                }
            }
            if (locmax>max)
            {
                max = locmax;
                values[0] = i;
                values[1] = locmax;

            }
        }
        return values;
    }
}





