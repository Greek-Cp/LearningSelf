import java.util.Scanner;

public class RefrenctionTelevision {
    static int automateCheck(int n , int ctvNum){
        int getNum = 0;
        for(int j = 0; j< n ; j++){
            if(j == ctvNum){
                System.out.println("Ctv Found !" + j);
                getNum = j;
            }
        }
        return getNum;
    }
    public static void main(String[]args){
        int n , x;
        String next , prev , option;
        next = "next"; prev = "prev";

        Scanner user = new Scanner(System.in);
        n = 1;
        x = 99;
        int ctv = 56;
        boolean state = false;
        while(state){
            System.out.println("Input");
            option = user.nextLine();
            if(option == next){
                n += 1;
            } else if ( option == prev){
                n -= 1;
                
                if( n == 0){
                    n = x;
                }
            } else if(n ==  56){
                System.out.println("Channel DItemukan Berada di " + ctv );
                state = true;
            }
        }
        automateCheck(n,ctv);

    }
}
