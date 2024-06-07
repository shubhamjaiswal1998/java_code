import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class test12 {
    static void f1(){
    List<Integer> o1=Arrays.asList(2,4,7,8,23,56,18,19,40,20,6);
    List<Integer> o2=new ArrayList<>();
    Stream o2=o1.stream().filter((n)->n%2==0).filter((n)->n%8==0).filter((n)->n%20==0);
    o2.forEach(n->System.out.println(n));
     
    List<String> ob1=Arrays.asList("abcd","vijay","cat","dog","puppy");
    boolean ob=ob1.stream().anyMatch((n)->n.equals("abcd"));
   // ob.forEach(n->System.out.print(n+" "));  
   System.out.println(ob);       
     int n1=0;  
     for (int i = 0; i < ob1.size(); i++) {
        if (ob1.get(i)=="cat") {
           // System.out.println("yes");
            n1=1;
             break; 
        } 
     }
     if (n1==0) {
        System.out.println("not");
     } else {
        System.out.println("yes");
     }
    }
    public static void main(String[] args) {
        f1();
    }
}
