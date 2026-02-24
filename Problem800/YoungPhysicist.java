package Problem800;
import java.io.*;
// import java.util.*;
public class YoungPhysicist {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine().trim());
        int sumX = 0,sumY=0,sumZ=0;
        for(int i=0;i<n;i++){
            String[] line = bf.readLine().trim().split("\\s+");
            // System.out.println(Arrays.toString(line));
            sumX+=Integer.parseInt(line[0]);
            sumY+=Integer.parseInt(line[1]);
            sumZ+=Integer.parseInt(line[2]);
        }
        System.out.println(sumX==0&&sumY==0&&sumZ==0?"YES":"NO");
    }
}
