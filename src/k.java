import java.util.Scanner;

public class k {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int n = 9;
        int array[] = new int[n];
        boolean state = true;
        int x , y, z;
        int iteration = 0;
        while( state){
            System.out.print("inputkan Bilangan Pertama:");
            x = user.nextInt();
            array[iteration] = x;
            iteration++;
            System.out.print("inputkan Bilangan Kedua: ");
            y = user.nextInt();
            array[iteration] = y;
            iteration++;
            System.out.print("inputkan Bilangan Ketiga: ");
            z = user.nextInt();
            array[iteration] = z;
            iteration++;
            System.out.println(iteration);
            if(iteration==9){
                state = false;
            }
        }
        for(int s = 0; s< array.length; s++){
            for(int b = 0; b< s; b++){
                System.out.println("bilangan pertama: " + array[b]);
                System.out.println("bilangan kedua: " + array[b +1]);
                System.out.println("bilangan ketiga: " + array[b + 2]);
            }

        }
    }
}
