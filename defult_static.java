
interface Innerdefult_static {
   // default method
    default public void f1() {// for default must specify body
        System.out.println("default method in interface ");
    }

    // static method in interface can be called usings
    // interface.method_name in main method
    public static void f2() {
        System.out.println("static method f2 in interface");
    }
    ///////// abstract method
    abstract public void f3();// no need to implementation in interface
}
class cyz implements Innerdefult_static {
    @Override
    public void f1() {
        System.out.println("default1 method in class");// optional Override
        // bcoz default method
    }
  @Override // not optional must be overriden in class bcoz abstract
    public void f3() {
        System.out.println("abstract overriden method in class ");
    }
// here we can not write @Override bcoz f2 is separate static fn in
    // class cyz so static fn can not Override in class
    public static void f2() {
        System.out.println("separate static fn f2 in class ");
    }

}
public class defult_static {
    public static void main(String[] args) {
        cyz o = new cyz();
        o.f1();
        o.f3();
        Innerdefult_static.f2();
        cyz.f2();}
}
