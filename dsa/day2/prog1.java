import java.util.*;
public class prog1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList <Integer> list=new LinkedList<>();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            list.add(x);
        }
        System.out.println(list);
    }
}