package Problem800;
import java.io.*;
public class YoungPhysicist {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine().trim());
        int sum = 0;
        for(int i=0;i<n;i++){
            String[] line = bf.readLine().trim().split("\\s+");
            for(int j=0;j<line.length;j++)
                sum+=Integer.parseInt(line[j]); 
        }
        System.out.println(sum==0?"YES":"NO");
    }
}
