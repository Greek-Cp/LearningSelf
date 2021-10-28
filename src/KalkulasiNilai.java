import java.util.Scanner;

public class KalkulasiNilai {
    static void forLoop(int n){
        char grade;
        int nilai = n;
        System.out.println(nilai);
        if (nilai <= 70 && nilai > 68) {
            System.out.println("nilai C");
            grade = 'C';
        } else if (nilai >= 80 && nilai <= 90) {
            grade = 'B';
        } else if (nilai >= 91 && nilai <= 100) {
            grade = 'A';
        } else if (nilai <= 70 && nilai >= 60) {
            grade = 'F';
        } else if (nilai <= 50 && nilai >= 40) {
            grade = 'G';
        } else {
            grade = 'E';
        }
        switch (grade) {
            case 'A':
                System.out.println("Grade Kamu A ");
                break;
            case 'B':
                System.out.println("Grade Kamu B ");
                break;
            case 'C':
                System.out.println("Grade Kamu C");
                break;
            case 'D':
                System.out.println("Grade Kamu D");
                break;
            case 'E':
                System.out.println("Grade Kamu E");
                break;
            case 'F':
                System.err.println("Grade Kamu F");
                break;
            case 'G':
                System.err.println("Grade Kamu G");
                break;
            default:
                System.err.println("Grade Kamu Tidak Ada");

                break;
        }
    }
    public static void main(String[]args){
        int nilai;
        char grade;

        boolean state = true;
        Scanner input = new Scanner(System.in);
        int nLoops = input.nextInt();
        for(int i = 0; i< nLoops; i++){
            forLoop(i);
        }

        }



    }

