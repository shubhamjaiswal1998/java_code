import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream3 {
   public static void f1(){

      ArrayList<Integer> o1=new ArrayList<>();
       o1.add(12);
       o1.add(1);
       o1.add(13);
       o1.add(7);
       o1.add(89);
      System.out.println(o1.stream().count());
      o1.forEach((n)->System.out.print(n+" "));

      System.out.println();
      List<Integer> o2=Arrays.asList(4,5,6,3,2,11,78,96);
      Stream o3=o2.stream().filter((n)->n%2==0).map((n)->n*2);
      o3.forEach((n)->System.out.print(n+" "));

      System.out.println();
      List<Integer> o4=Arrays.asList(4,5,6,3,2,11,78,96);
      int o5=o4.stream().filter((n)->n%2==0).map((n)->n*2).reduce(0,(c,e)->c+e);
      System.out.println(o5);
      

      List<Integer> o6=Arrays.asList(4,5,6,3,2,11,78,96);
      List<Integer> o7=o6.stream().filter((n)->n%2==0).collect(Collectors.toList());
      o7.forEach((n)->System.out.print(n+" "));
      System.out.println("list is ");
      System.out.println(o7);
     
      ////////////////////////////////////////print
  

     


    }
    public static void main(String[] args) {
        f1();
    }
}
