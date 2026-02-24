package Problem800; 
import java.io.*;
public class QueueAtTheSchool {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = bf.readLine().trim().split("\\s+");
        int n = Integer.parseInt(firstLine[0]);
        int t = Integer.parseInt(firstLine[1]);
        String str = bf.readLine().trim();
        char[] charArr = str.toCharArray();
        for(int i=0;i<t;i++){
            for(int j=0;j<n-1;j++){
                if(charArr[j]=='B'&&charArr[j+1]=='G'){
                    char temp = charArr[j];
                    charArr[j]=charArr[j+1];
                    charArr[j+1]=temp;
                    j+=1;
                }
            }
        }
        StringBuilder result = new  StringBuilder();
        for(char ch:charArr)
            result.append(ch);
        System.out.println(result.toString());
    }
}
