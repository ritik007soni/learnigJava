import java.util.*;

class modPreAvg {
    public static long[] myPreAvg(long[] arr,int n){
        long sum = 0;
        int i;
        for(i=0;i<n;i++){
            sum = sum+arr[i];
            arr[i] = sum/(i+1);
        }
        return arr;
    }

    public static void main(String args[]){
        long[] exTim = new long[100];
        long[] arr = new long[100];
        Random random = new Random();
        for(int i=0;i<100;i++){
            for(int j=0;j<i;j++){
                arr[j] = 1+random.nextInt(i);
            }
            long statTime = System.nanoTime();
            arr = myPreAvg(arr,i);
            long endTime = System.nanoTime();
            exTim[i] = endTime-statTime;
        }
        for(int i=0;i<100;i++){
            System.out.println("execution time is"+exTim[i]);
            System.out.println("Averaged array is "+arr[i]);
            System.out.println("number of inputs is"+(i+1));
        }
    }
}
