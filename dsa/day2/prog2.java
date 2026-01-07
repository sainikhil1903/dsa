import java.util.*;
public class prog2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            list.add(x);
        }
        System.out.println("before inserting elements"+list);
        System.out.println(" Enter Insert at beginning ");
        int y=sc.nextInt();
        list.addFirst(y);
        System.out.println("Insert at beginning"+list);
        System.out.println(" Enter Insert at Ending ");
        int z=sc.nextInt();
        list.addLast(z);
        System.out.println("Insert at Ending"+list);

    }
}