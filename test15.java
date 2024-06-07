import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.*;

public class test15 {
    public static void main(String[] args) {
        
        List<String> ob=Arrays.asList("abcd","cat","dog","apple","babanana");
                 int count=0;
                for (int i = 0; i <ob.size(); i++) {
                    count=count+1;
                }
                System.out.println(count);
    }
}
