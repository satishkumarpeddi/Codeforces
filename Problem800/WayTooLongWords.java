package Problem800;
import java.io.*;
public class WayTooLongWords {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(bf.readLine().trim());
        while(testCases-->0){
            String str = bf.readLine().trim();
            if(str.length()>10){
                String result = "";
                result +=str.charAt(0);
                result +=String.valueOf(str.length()-2);
                result +=str.charAt(str.length()-1);
                System.out.println(result);
            }else{
                System.out.println(str);
            }
        }
        
    }
}
