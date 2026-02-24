package Problem900;
import java.io.*;
public class BeautifulMatrix {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int row=0,col=0;
        for(int i=1;i<=5;i++){
            String[] line = bf.readLine().trim().split("\\s+");
            for(int j=1;j<=5;j++){
                if(Integer.parseInt(line[j-1])==1){
                    row=i;
                    col=j;
                }
            }
        }
        System.out.println((Math.abs(row-3)+Math.abs(col-3)));
    }
}
