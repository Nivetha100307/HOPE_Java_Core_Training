package DAY8;
import java.util.*;

public class waveform {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        char ch[] = s.toCharArray();
        int n = ch.length;
        char[] result = new char[n];
        int j = 0;
        int a;
        if (n%2==0){
            a = n/2;
        }
        else{
            a = (n+1)/2;
        }
        for (int i = 0; i<n; i++){
            if(i%2==0){
                result[j] = ch[i];
                j++;
            }
            else{
                result[a] = ch[i];
                a++;
            }
        }
        System.out.println(new String(result));
        sc.close();
    }
}
