public class methodOverLoading1 {
    public class addmethod1{
        //add number both integer
        public static int add(int a,int b){
            return  a+b;
        }
        //add number both float
        public static float add(float a,float b){
            return  a+b;
        }
        //add number 1 int and 2 double
        public static double add(double a,int b){
            return  a+b;
        }
        public static double add(int a,double b){
            return  a+b;
        }
        public static int add(int a,int b,int c){
            return  a+b+c;
        }
        public static float add(float a,float b,float c){
            return a+b+c;
        }
    }
    
    public static void main(String[] args) {
    System.out.println(methodOverLoading1.addmethod1.add(2, 5));//7
    System.out.println(methodOverLoading1.addmethod1.add(3.0, 2));//5.0
    System.out.println(methodOverLoading1.addmethod1.add(3, 9,5));//17
    
        
    }
    }
    
