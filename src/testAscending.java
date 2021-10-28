import java.util.Scanner;

public class testAscending {
    public  static  void main(String[]args){
        Scanner input = new Scanner(System.in);
        int x , y , z;
        System.out.println("input X: ");
        x = input.nextInt();
        System.out.println("input Y: ");
        y = input.nextInt();
        System.out.println("input Z: ");
        z = input.nextInt();
        if( x < y && y < z){
            System.out.print(x);
            System.out.print(y);
            System.out.print(z);
        } else if (y < x && y < z){
            System.out.print(x);
            System.out.print(y);
            System.out.print(z);
        } else if ( z < x && z < y) {
            System.out.print(x);
            System.out.print(y);
            System.out.print(z);
        }

    }

}
