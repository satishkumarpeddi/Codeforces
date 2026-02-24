package Problem900;
import java.io.*;
public class NextRound {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = bf.readLine().trim().split("\\s+");
        int n = Integer.parseInt(firstLine[0]);
        int k = Integer.parseInt(firstLine[1]);
        String[] strArr = bf.readLine().trim().split("\\s+");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = Integer.parseInt(strArr[i]);
        int count=0;
        int kthScore = arr[k-1];
        for(int num:arr){
            if(num>0&&num>=kthScore) count++;
        }
        System.out.println(count);
    }
}
