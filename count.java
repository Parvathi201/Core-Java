import java.util.*;
public class count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int alp,num,spl;
        char ch;
        alp=num=spl=0;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(ch >='a' && ch<='z'|| ch>='A' && ch<='Z'){
                alp+=1;
            }
            else if (ch>='0' && ch<='9'){
                num+=1;
            }
            else{
                spl+=1;
            }
        }
        System.out.println("alphabet:"+alp);
        System.out.println("digit:"+num);
        System.out.println("special character:"+spl);
    }
}
