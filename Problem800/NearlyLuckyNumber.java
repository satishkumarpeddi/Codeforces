package Problem800;
import java.io.*;
public class NearlyLuckyNumber {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String number = bf.readLine().trim();
        boolean flag = true;
        for(int i=0;i<number.length();i++){
            // System.out.println(number.charAt(i));
            if(number.charAt(i)!='4'&&number.charAt(i)!='7'){ flag=false; break;}
        }
        System.out.println(flag?"YES":"NO");
    }
}
