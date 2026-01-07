import java.util.*;
public class prog6{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int x=s.nextInt();
            arr.add(x);
        }
        int largest=arr.get(0);
        for(int i=0;i<n;i++){
            if(arr.get(i)>largest){
                largest=arr.get(i);
            }
        }
        Integer secondl=null;
        for(int i=0;i<n;i++){
            int curr=arr.get(i);
            if(curr<largest){
                if(secondl==null || curr>secondl){
                    secondl=curr;
                }
            }
        }
        if(secondl==null){
            System.out.println("No second largest");
        }
        else{
            System.out.println("Second Largest: " + secondl);
        }

    }
}