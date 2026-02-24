package Problem800;
import java.io.*; 
import java.util.*;
public class HelpfulMaths {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str[] = bf.readLine().trim().split("\\+");
        Arrays.sort(str);
        System.out.println(String.join("+",str));
        // char[] strArr = str.toCharArray();
        // StringBuilder result = new StringBuilder();
        // int[] arr = new int[strArr.length%2!=0?(strArr.length+1)/2:(strArr.length)/2];
        // int j=0;
        // for(int i=0;i<strArr.length;i++){
        //     if(Character.isDigit(strArr[i]))
        //         arr[j++]=(strArr[i])-'0';
        // }
        // Arrays.sort(arr);
        // for(int i=0;i<arr.length;i++){
        //     if(i!=arr.length-1)
        //         result.append(arr[i]+"+");
        // }
        // result.append(arr[arr.length-1]);
        // System.out.println(result.toString());

    }
}
