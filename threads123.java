class comp{
    int n; boolean flag;
     public  void pro(int n){
       this.n=n;
       System.out.println("produce "+n);
       
     }
     public  int consume(){
        
        System.out.println("consume "+this.n);
        return this.n;
      }

}
public class threads123 {
     
    public static void main(String[] args) {
      try {
        String str = null;
        int length = str.length(); // This line will throw NullPointerException
        if () {
          
        }
        System.out.println("Length: " ); // This line won't be executed
        System.out.println("hello");
    } catch (Exception e) {
        System.out.println("Error: Null pointer exception");
    }

    }
}
