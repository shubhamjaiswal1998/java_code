public class string {
   static void op1(){
     String str1="abc";
     String str2="abc";
     System.out.println(str1==str2);
     System.out.println(str1=="ab"+"c");//true
     String r1="c";
     System.out.println(str1=="ab"+r1);//false


    }
    public static void main(String[] args) {
        op1();
    }
}
