import java.util.*;

public class collection1 {

    static void map1(){

        Map<String,Integer> ob=new HashMap<>();
         ob.put("ajay", 12);
         ob.put("vijay", 16);
         ob.put("dijay", 44);
         ob.put("kojay", 50);
         ob.put("sohan", 50);//value can be reapeat
         ob.put("vijay", 75);//remove 1st vijay key
         // so key behave like set but value behave like list
         System.out.println(ob);

         ///////////////
         // values is iterable bcoz list so use loop
        Collection o2= ob.values();
        for (Object object : o2) {
            System.out.print(" "+object);
        }
        
        ////////////////////////////
        // here  key is set ,set can be also print through Iterable so use iterable 
        //interface then print
        Set<String> o3=  ob.keySet();
        Iterator o4=o3.iterator();
        while (o4.hasNext()) {
            System.out.print(o4.next()+" ");
        }
        System.out.println();
        ////////////////////////////////////////////////////////////////
        System.out.println("value of vijay key "+ob.get("vijay"));
        Set<String> keys=ob.keySet();
        for (String i : keys) {
            System.out.println("keys "+i+" their values "+ob.get(i));

        }  

      }
  
  //////////////////////////////////////////////////////////////////////////////
    static void set1() {

        Set<Integer> o1 = new HashSet<>();
        o1.add(45);
        o1.add(46);
        o1.add(45);
        o1.add(46);
        System.out.println(o1);// [45, 46]//remove duplicte value

        /////////

        Set<Integer> o2=new TreeSet<>();//it will give sorted set
        o2.add(45);
        o2.add(46);
        o2.add(45);
        o2.add(46);
        o2.add(90);
        o2.add(78);
        System.out.println(o2);//[45, 46, 78, 90]

        //print ele of set through Iterater Interface
        Iterator<Integer>  iter=o2.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next()+" ");
  
        }
        


    }

    /////////////////////////////////////////////////////////////////////
    @SuppressWarnings("unchecked")
    static void List1() {
        Collection<Integer> o1 = new ArrayList<>();
        o1.add(5);
        o1.add(8);
        o1.add(9);
        // ob.add("abc");
        System.out.println(o1);// [5, 8, 9]

        for (Object i : o1) {
            System.out.println(i);
        }
        ////////////////////////////////////////////
        List<String> o2 = new ArrayList<>();// List have get method
        o2.add("abc");
        o2.add("bbc");
        o2.add("ajay");
        o2.add("vijay");
        System.out.println("index of ajay " + o2.indexOf("ajay"));
        for (int i = 0; i < o2.size(); i++) {
            System.out.print(o2.get(i) + " ");
        }
        System.out.println();
        for (String i : o2) {
            System.out.print(i + " ");
        }
        //////////////////////////////////////////////////////////////////

        Collection o3 = new ArrayList();
        o3.add(12);
        o3.add(78);
        o3.add(79);
        // o3.add("abc"); this line can give runtime exception so use <Integer>
        // then y will know error at compiletime for that line
        System.out.println();
        for (Object i : o3) {
            System.out.print((Integer) (i) * 2 + " ");// can't do opration with object
            // so do type casting
        }

        //////////////////////////////////////////////////////////////////
        //sort list with Collections class & Comparater Interface
        List<Integer> list12=new ArrayList<>();
        list12.add(45); 
        list12.add(43); 
        list12.add(62); 
        list12.add(49); 
        list12.add(41); 

        Comparator<Integer> com=new Comparator<Integer>() {
             @Override
            public int compare(Integer i,Integer j){
                    if (i%10>j%10) {
                        return 1;
                    } else {
                        return -1;
                    }}
                };
        Collections.sort(list12,com);    
        System.out.println(list12);   
    }

    public static void main(String[] args) {
        List1();
       // set1();
     //  map1();
    }
}
