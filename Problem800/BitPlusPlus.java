package Problem800;
import java.io.*;
public class BitPlusPlus {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine().trim());
        int count=0;
        while(n-->0){
            String str = bf.readLine();
            if(str.toUpperCase().equals("++X")||str.toUpperCase().equals("X++"))  count++;
            else count--;
        }
        System.out.println(count);
    }
}
