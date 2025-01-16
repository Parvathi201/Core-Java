import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String r="";
        char ch;
        for(int i=s.length()-1;i>=0;i--){
            ch=s.charAt(i);
            r=r+ch;
        }
        System.out.println(r);
    }
}
