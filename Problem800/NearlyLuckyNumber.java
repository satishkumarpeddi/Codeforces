package Problem800;
import java.io.*;
public class NearlyLuckyNumber {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String number = bf.readLine().trim();
        boolean flag = true;
        int count=0;
        for(int i=0;i<number.length();i++){ 
            if(number.charAt(i)=='4'&&number.charAt(i)=='7'){count++;}
        }
        String countArr = String.valueOf(count);
        for(int i=0;i<countArr.length();i++){
            if(countArr.charAt(i)!='4'&&countArr.charAt(i)!='7'){
                flag=false;
                break;
            }
        }
        System.out.println(flag?"YES":"NO");
    }
}
