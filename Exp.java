import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Exp {
    static void f1() {
        try {
            FileInputStream ob = new FileInputStream("abc.txt");
            int c;
            while (true) {
                c = ob.read();
                if (c == -1) {
                    break;
                }
                System.out.print((char) c + " ");
            }
            ob.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
//////////////////////////////////////////////////////////////////
    static void f2() {
        try {
           FileOutputStream ob = new FileOutputStream("abc.txt");
            String str = "abcdefghijklmnopqrstuvwxyz";
            byte[] b = str.getBytes();
            ob.write(b);
            System.out.println("sucessfully compiled");
            ob.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    //////////////////////////////////////////////////////////////////////////
    static void f3() {

    }

    public static void main(String[] args) {
        f2();
        f1();
    }
}
