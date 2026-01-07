import java.util.*;
public class prog4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            list.add(x);
        }
        System.out.println("Enter element to search");
        int k=sc.nextInt();
        int f=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)==k){
                System.out.println(i);
                f=1;
                break;
            }
        }
        if(f==0){
            System.out.println("Element is not found");
        }
    }
}

