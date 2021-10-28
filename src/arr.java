public class arr {
    public static void main(String[] args) {
        int a[] = {10,20,40,50,12,30};
        int n = a.length;
        for(int b = 1; b < n; b++){
            if(a[b] < a[b - 2]){
                System.out.println(a[b + 1]);
                System.out.println(a[b]);
            }
        }
    }
}
