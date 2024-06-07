import java.util.function.Function;
class method_ref_lamda{
  //static fn
   public static String reverse(String str){
       String str1="";
       for (int i= str.length()-1;i>=0; i--) {
            str1=str1+str.charAt(i);
       }
       return str1;
   }
   //instance fn
   //////////////////////////////
   public int fibo(int n){//take only one parameter
       int f=1;
       for (int i = 1; i <=n; i++) {
        f=f*i;
       }
      return f;
   }
   //constructer 
   public method_ref_lamda(int num){
      System.out.println("it is constructer "+num);
   }
}
//////////////////////////////////////////////////////////////////////////
@FunctionalInterface
interface xyz1 {
    public void prints();
}
@FunctionalInterface
interface xyz2 {
    public int sum(int a, int b);
}
////////////////////////////////////////////////////////////////////////////

interface xyz3{
    abstract public void print_1(int a,int b);
}
class xyz4 implements xyz3{
    @Override
    public void print_1(int a,int b){
        System.out.println(a+b);
    }
}
//////////////////////////////////////////////////////////////////////////////////
public class fninterface {
    public static void main(String[] args) {
       /*  xyz1 p = new xyz1() {
            @Override
            public void prints() {
                {
                    System.out.println("hello world");
                }
            }
        };
        xyz2 s = new xyz2() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            } 
        };
        p.prints();
        System.out.println(s.sum(40, 50));

        xyz4 o1=new xyz4();
        o1.print_1(2,3);  */
        ///use method reference to static
        Function<String,String> ob1=method_ref_lamda::reverse;
           System.out.println(ob1.apply("abcd"));

        //////////////////////
        //reference to instance
        method_ref_lamda ob2=new method_ref_lamda(5);//random value for this 
        Function<Integer,Integer> ob3=ob2::fibo;//but not used value
        System.out.println(ob3.apply(5));

        //////////////////////////
        // refernce to constructer
        Function<Integer,method_ref_lamda> o4=method_ref_lamda::new ;
        o4.apply(60);
        
        //////////////////////////////////////////////////////////////////
        


    }
}
