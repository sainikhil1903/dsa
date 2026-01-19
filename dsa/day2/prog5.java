import java.util.*;
public class prog5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            list.add(x);
        }
        System.out.println(list);
        LinkedList<Integer> reverse=new LinkedList<>();
        for(int i=list.size()-1;i>=0;i--){
            reverse.add(list.get(i));
        }
        System.out.println(reverse);
    }
}