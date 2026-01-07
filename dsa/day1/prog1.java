
import java.util.*;
public class prog1{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int x=s.nextInt();
            arr.add(x);
        }
         System.out.println(arr);  
            }
}