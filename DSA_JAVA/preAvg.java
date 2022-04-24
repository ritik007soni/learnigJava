import java.util.*;

public class preAvg {
    public static void main(String args[]){
        int i,j,k;
        long[] exTime = new long[100];
        for(i=1;i<100;i++){

            Random random = new Random();

            float[] arr;
            arr = new float[100];
            for(j=0;j<i;j++){
                arr[j] = 1+random.nextInt(i);
            }

            long start1 = System.nanoTime();

            for(j=0;j<i;j++){
                float sum = 0f;
                for(k=0;k<=i;k++){
                    sum = sum+arr[k];
                }
                arr[j] = sum/(j+1);
            }

            long end1 = System.nanoTime();

            exTime[i] = end1-start1;

        }

        for(i=0;i<100;i++){
            System.out.println(exTime[i]);
        }
    }
}
