import java.util.*;
public class prog4{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<Integer> arr =new ArrayList<>();
        for(int i=0;i<n;i++){
            int x=s.nextInt();
            arr.add(x);
        }
        // ArrayList<Integer> arr1 =new ArrayList<>();
        // for(int i=arr.size()-1;i>=0;i-- ){
        //     arr1.add(arr.get(i));
        // }
        // System.out.println(arr1);
        int a=0;
        int b=arr.size()-1;
        while(a<b){
            int temp=arr.get(a);
            arr.set(a,arr.get(b));
            arr.set(b,temp);
            a++;
            b--;
        }
        System.out.println(arr);

    }
}
