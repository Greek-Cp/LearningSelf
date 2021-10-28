package Exam;

public class BubbleSortExam {
    static int[]    BubbleSortAscending(int p[], int n ) {
        int temprary;
        for(int i = 0; i < n ; i++){
            for(int b = 1 ; b < n - i; b++){
                if( p[ b - 1] > p[b]){
                    temprary = p[ b - 1];
                    p[b - 1] = p[b];
                    p[b] = temprary;
                }
            }
        }

        return p;
    }
    static int []BubbleSortDescending(int array[] , int n){
        int tmp;
        for(int cv = 0; cv < n; cv++){
            for(int x = 1; x < n - cv; x++){
                if(array[x - 1] < array[x]){
                    tmp = array[x - 1];
                    array[x - 1] = array[x];
                    array[x] = tmp;
                }
            }
        }
        return array;
    }
    static void getData( int arr[]) {
        for(int b = 0; b< arr.length; b++){
            System.out.print("\n arr" + arr[b]);
        }
    }
    static int[] experimentalSort(int arr[] , int n ){
        int temp;
        for(int c = 1; c<= arr.length - 1; c++){
            if(arr[c - 1]  < arr[c]){
                temp = arr[c - 1];
                arr[ c  - 1] = arr[c];
                arr[c] = temp;
                System.out.println("Succes");;
            }
        }
        getData(arr);
        return  arr;
    }
    static void before(){
        System.out.println("+----------------BEFORE----------------+");
    }
    static void after(){
        System.out.println("+----------------AFTER----------------+");
    }
    static int[]ExperimentalsBubbbleShort1(int arr[], int n ){
        int tempN;
        for(int s = 0; s< arr.length; s++){
            for(int i = 1 ; i < n - s; i++){
                if(arr[i - 1] > arr[i]){
                    tempN = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i]  = tempN;
                }
            }
        }
        getData(arr);
        return  arr;
    }
    static int[]ExperimentalBubbleShort2(int arr[], int n){
        int temp;
        for(int y = 0; y< arr.length; y++){
            for(int i = 2; i < n - y; i++){
                if(arr[i - 2] < arr[i]) {
                   temp = arr[i - 2];
                   arr[i-2] = arr[i];
                   arr[i] = temp;
                   return  arr;
                }
            }
        }
        before();
        getData(arr);
        int tmp1;
        for(int b = 0; b< arr.length; b++){
            for(int s = 1; s< arr.length - b; s++){
                if(arr[s - 1] > arr[s]){
                 tmp1 = arr[ s - 1];
                 arr[s - 1] = arr[s ];
                 arr[s] = tmp1;
                }
            }
        }
        after();
        getData(arr);

        return arr;
    }

    public static void main(String[]args){
        int array[] = {50,12,34,51,511,412};
        int n = array.length;
        int descending[] = BubbleSortDescending(array,n);
        for(int b  = 0 ; b < descending.length; b++){
            System.err.println("descending: " + descending[b]);
        }
        experimentalSort(array,n);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        int datas[] = { 1,2,3,4,5,6,7,8};
        int myArray[] = ExperimentalBubbleShort2(datas,datas.length);
        int twoArray[] = ExperimentalsBubbbleShort1(myArray,myArray.length);
        //123456
        //1 3 5 7
        //7 2 3 5 6 1
        // 1 3 5 7
        //7254361
    }
}
