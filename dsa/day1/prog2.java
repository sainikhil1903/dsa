import java.util.*;
public class prog2 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int x=s.nextInt();
            arr.add(x);
        }
        int min1=arr.get(0);
        int max1=arr.get(0);
        for(int i=1;i<arr.size();i++){
            if (arr.get(i)<min1){
                min1=arr.get(i);
            }
            if (arr.get(i)>max1){
                max1=arr.get(i);
            }
        }
        System.out.println(min1);
        System.out.println(max1);

    }
}
