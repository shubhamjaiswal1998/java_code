sealed class ram permits shyam,sohan{ //sealed can be  extended with permission
 void ram(){
    System.out.println("ram in sealed class");
 }
}
final class shyam  extends ram{ // final can not be extended

    void shyam(){
        System.out.println("shyam in final class ");
    }
}
non-sealed class sohan extends ram{ //do final or non-sealed
    void sohan(){
        System.out.println("sohan in non-sealed class");
    }
}
public class switch1 {
    public static void main(String[] args) {
        sohan o1=new sohan();
        o1.ram();
       // o1.shyam(); can not acess 
        o1.sohan();
        
        shyam o2=new shyam();
        o2.shyam();
        o2.ram();
    }
}
