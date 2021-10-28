package Exam;

public class test {
    public static void main(String[]args){

        int min = 1;
        int rand = (int) (Math.random() * 1000) + 1;
        int max = 10;
        int range = (rand - min) + 1; // 10

       int arr[] = new int[100];
        for(int i = 0; i<= arr.length - 1; i++){
            arr[i] = (int) (Math.random() * range) + min;
        }
        for(int v = 0; v< arr.length; v++){
            if(v % 10 == 0){
                System.out.println();
            } else{
                System.out.print(arr[v] + " ");
            }
        }
        for(int v =0; v < arr.length; v++){
                if(v % 2 != 0){
                    for(int x = 1; x< arr.length; x++){
                        if(arr[x- 1] > arr[x]){
                            int tmp = arr[x-1];
                            arr[x - 1] = arr[x];
                            arr[x] = tmp;
                        }
                    }
                } else {
                    for(int z = 0; z<arr.length; z++){
                        for(int d = 1; d< arr.length; d++){
                            if(arr[d - 1] < arr[d]){
                                int tmp = arr[d - 1];
                                arr[d - 1] = arr[d];
                                arr[d] = tmp;
                            }
                        }
                    }
                }


        }

        System.out.println("Sesudah Sorting");
        for(int d= 0;d<= arr.length - 1;d++){
            if(d % 10 == 0){
                System.out.println();
            } else{
                if(d % 2 != 0){
                    System.out.print(" |"  + arr[d] +"| ");
                } else{
                    System.out.print(arr[d] + " ");
                }
                 }
        }
    }


}
