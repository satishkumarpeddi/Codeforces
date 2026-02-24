package Problem900;
import java.io.*;
public class Team {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine().trim());
        int count=0;
        for(int i=0;i<n;i++){
            String[] row = bf.readLine().trim().split(" ");
            int sum=0;
            for(int j=0;j<3;j++){ 
                sum+=Integer.parseInt(row[j]);
            } 
            if(sum>=2) count++;
        }
        System.out.println(count);
    }
}
