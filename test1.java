import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class test1 {
  public static void main(String[] args) {
    
    List<Integer> o1=Arrays.asList(1,4,2,7,3,6,75,69,42);
    List<Integer> o2=o1.stream().filter((n)->n%2==0)
                     .map((n)->n+3).map((n->n*2)).
                     collect(Collectors.toList());
    System.out.println(o2);      

       o2.forEach((n)->System.out.print(n+" "));
       for (int i = 0; i < o2.size(); i++) {
         System.out.print(o2.get(i)+" ");
       }
       System.out.println();
       for (int i:o2) {
        System.out.print(i+" ");
      System.out.println();
      ///////////////////////////////////////////////////////////////
      List<String> o3=Arrays.asList("aman","baban","gfg","vijay","cat");
                  o3.stream().sorted().collect(Collectors.toList());
        System.out.println(o3);   
            
        Optional<String> s= o3.stream().max(String::compareTo);
        System.out.println(s);
        List<Integer> s1= o3.stream().map(String::length).collect(Collectors.toList());
         System.out.println(s1);
      
   
  }
}
}




