import java.util.*;

public class B {

   public static void main (String [] args) {
   
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int [] a = new int[s.length()+1];
      int [] b = new int[s.length()+1];
      for (int k=1; k<=s.length(); k++) {
         a[k]=a[k-1]+(s.charAt(k-1)=='a'?1:0);
         b[k]=b[k-1]+(s.charAt(k-1)=='b'?1:0);
      }
      int size = 0;
      for (int i=0; i<=s.length(); i++)
         for (int j=i; j<=s.length(); j++)
            size=Math.max(size, a[i]+b[j]-b[i]+a[s.length()]-a[j]);
      System.out.println(size);      
   }
}