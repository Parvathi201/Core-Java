import java.util.*;
public class pattern2 {
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            if (i==0 || i%2==0){
                System.out.print(" ");
            }
            for(int j=0;j<4;j++){
                System.out.print("+");
            }
            System.out.println();
            //system.exit();
        }
    }
}
