import java.util.ArrayList;

public class fibis_Rec {
    static int fibo(int n){
       if (n<=0) {
        return 0;
       }
        else if(n==1){
        return 1;
       }
       else{
        return fibo(n-1)+fibo(n-2);
       }
    }
    static void print_fibo(int n){
        ArrayList<Integer> ob=new ArrayList<>();
       for (int i = 0; i <=n; i++) {
        //System.out.print(fibo(i)+" ");
            ob.add(fibo(i));
            
       }
       System.out.println(ob);
    }
    public static void main(String[] args) {
        print_fibo(15);
    }
}
