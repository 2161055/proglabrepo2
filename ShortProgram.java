import java.util.*;

public class ShortProgram {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);
        int a=0,b=1023,n,t;
        String s;
        
        n=in.nextInt();
        while(n--!=0){
            s=in.next();
            t=in.nextInt();
            if(Objects.equals(s,"&")){
                a&=t;
                b&=t;
            }
            if(Objects.equals(s,"|")){
                a|=t;
                b|=t;
            }
            if(Objects.equals(s,"^")){
                a^=t;
                b^=t;
            }
        }
        System.out.println(3+"\n& "+(a|b)+"\n^ "+(a&(1023^b))+"\n| "+(a&b));
    }
}
