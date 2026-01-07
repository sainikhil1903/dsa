import java.util.*;
public class prog5{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int x=s.nextInt();
            arr.add(x);
        }
        ArrayList<Integer> unique =new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            if(!unique.contains(arr.get(i))){
                unique.add(arr.get(i));
            }
        }
        System.out.println(unique);

    }
}
