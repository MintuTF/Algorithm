
import java.util.*;

public class GCD {

    private static List<Integer> nStore;


    public  List<Integer> divisorStor(int n){
        List<Integer> nStore=new ArrayList<>();
        for (int i=2 ;i<=n/2;i++){
            if(n%i==0){
                nStore.add(i);
            }
        }
        nStore.add(n);
        return nStore;
    }


 public  int gcd(int n,int m){

        List<Integer> nStore = divisorStor(n);
          for (int i=nStore.size()-1;i>=0;i--){
              if(m%nStore.get(i)==0){
                  return nStore.get(i);
            }
        }
          return 1;
 }


public static void main(String[] arg){
         GCD g=new GCD();
        System.out.println(g.gcd(12,9));

}
}

