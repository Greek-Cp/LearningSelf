public class for_loop {
    public static void main(String[]args){

        int arr[] = {1,10,50,30,60};
        int n = arr.length; //5
        int temp;
        for(int i = 0; i< arr.length; i++){
            for(int b = 1; b< n - i; b++){
                System.out.println("B:" + b);
                if(arr[b - 1] > arr[b]){
                    temp = arr[b - 1];
                    arr[b - 1] = arr[b];
                    arr[b] = temp;

                }
            }
        }
        int array[] = {90,30,40,20};
        int nLen = array.length;
        int temprary;
        for(int i = 0; i< nLen; i++){
            for(int b = 1; b< nLen - i; b++){
                if(array[b - 1] > array[b]){
                    temprary = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = temprary;
                    System.out.println("[B]" + "{" + array[b] + "}" + " i + " + i);
                }
            }
        }
        for(int s = 0; s< array.length ; s++){
            System.out.println(array[s]);
        }

        int b[] = {20,10,40,25};
        int nB = b.length;
        int temporaryB;
        for(int c = 0; c< nB ; c++){
            for(int i = 1 ; i < nB - c; i++){
                if(b[i-1] < b[i]){
                    temporaryB = b[ i - 1];
                    b[i - 1] = b[i];
                    b[i] = temporaryB;
                }
            }
        }
        for(int s = 0 ; s< b.length; s++){
            System.out.println(b[s]);
        }
    }
}
