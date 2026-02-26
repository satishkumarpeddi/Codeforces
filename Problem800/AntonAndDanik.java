package Problem800;
import java.io.*;
public class AntonAndDanik {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine().trim());
        String str = bf.readLine().trim();
        int countAnton=0;
        int countDanik=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='A') countAnton++;
            else countDanik++;
        }
        System.out.println(countAnton>countDanik?"Anton":countAnton<countDanik?"Danik":"Friendship");
    }
}
