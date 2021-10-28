import java.util.Scanner;

public class AscendingIfElse {
    public static void main(String[]args){

        boolean state = true;
        int c = 0;
        int n[] = new int[10];
        int nums;
        Scanner inp = new Scanner(System.in);
        while(state){
            System.out.println("Input Number: ");
            nums = inp.nextInt();

            n[c] = nums;
            c++;
            System.out.println("c:" + c);
            if(c == 10){
                state = false;
            }
        }
        int arr[] = new int[n.length];
        int temp;
        for(int p = 0; p< n.length; p++){
            for(int t = 1; t< p; t++){
                if(n[t - 1] < n[t]){
                    temp = n[t - 1];
                    n[t - 1] = n[t];
                    n[t] = temp;
                }
            }

        }
        for(int s = 0; s< n.length; s++){
            arr[s] = n[s];
        }
        for(int p = 0; p < arr.length; p++){
            System.out.println(arr[p]);
        }

    }
}
