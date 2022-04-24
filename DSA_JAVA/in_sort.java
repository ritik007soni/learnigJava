import java.util.*;

class in_sort {
    public static void sort(int[] arr){
        for(int j=1;j<arr.length;j++){
            int key = arr[j];
            int i = j-1;
            while(i>=0 && arr[i]>key){
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = key;
        }
    }

    public static void main(String args[]){
        int[] arr = new int[100];
        long[] exTime = new long[100];
        Random random = new Random();
        int i;
        for(i=0;i<100;i++){
            for(int j=0;j<i;j++){
                arr[j] = 1+random.nextInt(i);
            }
            long startTime = System.nanoTime();
            sort(arr);
            long endTime = System.nanoTime();
            exTime[i] = endTime-startTime;
        }

        for(i=0;i<100;i++){
            System.out.println("input size is"+(i+1));
            System.out.println("execution time is"+exTime[i]);
            System.out.println("sorted array is"+arr[i]);
        }
    }
}
