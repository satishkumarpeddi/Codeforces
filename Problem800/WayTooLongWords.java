package Problem800;
import java.io.*;
public class WayTooLongWords {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine().trim();
        String result = "";
        result +=str.charAt(0);
        result +=String.valueOf(str.length()-2);
        result +=str.charAt(str.length()-1);
        System.out.println(result);
        
    }
}
