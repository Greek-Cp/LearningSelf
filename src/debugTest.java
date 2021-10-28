public class debugTest {
    public  static void main(String[]args){

        String name = "hello World";
        int n = name.length();
        char temp[] = new char[name.length()];
        for(int p = 0; p < n; p++){
            temp[p] = name.charAt(p);
        }
        char temps;
        for(int b = 0; b< temp.length; b++){
            for(int s = 1; s< temp.length - b; s++){
                if(temp[s - 1] % 2 == 0 ){
                    temps = temp[s - 1];
                    temp[s - 1] = temp[s];
                    temp[s] = temps;
                }
            }
        }
        for(int iterationLoop = 0; iterationLoop < temp.length; iterationLoop++){
            System.out.println(temp[iterationLoop]);
        }
    }
}
