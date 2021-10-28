public class for_loop2 {
    public static void main(String[] args) {
        int n = 10;
        for(int i = 0; i< n ; i++){
            for(int b = 1; b< n - i; b++){
                System.out.println("[" + (b - 1) + "]" + "[" + b + "]");
            }
        }
    }
}
