import java.util.*;
public class countofnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i= sc.nextInt();
        int f= sc.nextInt();
        int count=0;
        while (i>0){
            int rem=i%10;
            if (rem==f){
                count=count+1;
            }
            i=i/10;
        }
        System.out.println(count);
    }
}
