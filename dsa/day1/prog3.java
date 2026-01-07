import java.util.*;
public class prog3{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<Integer> arr =new ArrayList<>();
        for(int i=0;i<n;i++){
            int x=s.nextInt();
            arr.add(x);
        }
        int ec=0;
        int oc=0;
       for(int i=0;i<arr.size();i++){
        if(arr.get(i)%2==0){
            ec+=1;
        }
        else{
            oc+=1;
        }
       }
       System.out.println("even count"+ec);
       System.out.println("odd count"+oc);
    }
}
