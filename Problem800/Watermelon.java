package Problem800;
import java.io.*;
public class Watermelon{
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(bf.readLine().trim()); 
        System.out.println(n>2&&n%2==0?"YES":"NO");
    }
}