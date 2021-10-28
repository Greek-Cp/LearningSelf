import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSortAlgorithm {
    /*
     *Bubble Sort Algorithm
     */
    static int[] bubbleSortFuncAscending(int arr[]){
        int n = arr.length;
        int tmpNum;
        for(int s = 0; s< n; s++){
            for (int i = 1; i < n - s; i++){
                if(arr[i - 1] > arr[i]){
                    tmpNum = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = tmpNum;
                }
            }
        }
        return arr;
    }
    static int[] bubbleSortFuncDescending(int[] arr){
        int tmp;
        int n = arr.length;
        for(int i = 0 ; i < n; i++){
            for(int s = 1; s < (n - 1); s++){
                if(arr[s - 1] < arr[s]){
                    tmp = arr[s - 1];
                    arr[s - 1] = arr[s];
                    arr[s]  = tmp;
                }
            }
        }
        return arr;
    }

    static int[] bubbleSortEqualsAscending(int arr[]){
        int n = arr.length;
        int tmp;
        ArrayList<Integer> myData = new ArrayList<>();
        int l = 0;
        for(int i = 0; i<n ; i++){
            for(int s = 1; s< n - 1; s++){
                if(arr[s - 1] == arr[s] || arr[s - 1] > arr[s]){
                    tmp = arr[s - 1];
                    arr[s - 1] = arr[s];
                    arr[s] = tmp;
                }
            }
        }

        return arr;
    }
    static int[] bubbleSortEqualsDescending(int arr[]){
        int n = arr.length;
        int tmp;
        for(int i = 0; i<= n - 1; i++){
            for(int b = 1; b< n - i ; b++){
                if(arr[b - 1] == arr[b] || arr[b - 1] < arr[b] ){
                    tmp = arr[ b - 1];
                    arr[b - 1] = arr[b];
                    arr[b] = tmp;
                }
            }
        }
        return  arr;
    }
    static void getArray(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\n");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int newArray[] = new int[10];
        boolean state = true;
        int ns;
        int i = 0;
        while(state){
            System.out.print("Input Number: ");
            ns = input.nextInt();

            newArray[i] = ns;
            i++;
            System.out.println(i);
            if(i == 10){
                state = false;
            }
        }
        bubbleSortFuncAscending(newArray);
        getArray(newArray);
        int p[] = bubbleSortEqualsAscending(newArray);
        System.out.println("total equals = " + p);

        int arrays[] = {10,50,30,20};
        int tmps;
        for(int s = 0; s< arrays.length; s++){
            for(int d = 1; d< s; d++){
                if(arrays[d - 1] > arrays[d]){
                    tmps = arrays[d - 1];
                    arrays[ d - 1] = arrays[d];
                    arrays[d] = tmps;
                }
            }
        }
        for(int s = 0; s< arrays.length; s++){
            System.out.println(arrays[s]);
        }
    }
}
