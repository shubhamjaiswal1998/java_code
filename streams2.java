import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
public class streams2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ajay", "Bob", "Charlie");
        long count = names.stream().count();
        System.out.println(count);// 3
        ////////////////////////////////////////////////

        List<Integer> numbers1 = Arrays.asList(3, 5, 1, 2, 4);
        Optional<Integer> min = numbers1.stream().min(Integer::compareTo);
        System.out.println(min);// Optional[1]

        /////////////////////////////////////////////////////////////////
        List<Integer> numbers2 = Arrays.asList(3, 5, 1, 2, 4);
        Optional<Integer> max = numbers2.stream().max(Integer::compareTo);
        System.out.println(max);// Optional[5]

        ///////////////////////////////////////////////////////////////////
        List<String> names1 = Arrays.asList("Alice", "Bob", "Charlie");
        boolean hasAlice = names1.stream().anyMatch(name -> name.equals("Alice"));
        System.out.println(hasAlice);// true

        //////////////////////////////////////////////////////////////
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);// 15

        ////////////////////////////////////////////////////////////

        List<String> names2 = Arrays.asList("Alice", "Bob", "Charlie");
        List<Integer> nameLengths = names2.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(nameLengths);// [5, 3, 7]
        /////////////////////////////////////////////////////////////////
        List<String> names3 = Arrays.asList("Charlie", "Alice", "Bob");
        List<String> sortedNames = names3.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedNames);// [Alice, Bob, Charlie]

        /////////////////////////////////////////////////////////////

        List<Integer> numbers4 = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> distinctNumbers = numbers4.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctNumbers); // [1, 2, 3, 4, 5]

        ////////////////////////////////////////////////////////////////
        List<String> names4 = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> processedNames = names4.stream()
                .peek(name -> System.out.println("Processing: " + name))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(processedNames); // [ALICE, BOB, CHARLIE]

        ////////////////////////////////////////////////////////////

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a", "b", "c"),
                Arrays.asList("d", "e", "f"),
                Arrays.asList("g", "h", "i"));
        List<String> flattenedList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(flattenedList);  //[a, b, c, d, e, f, g, h, i]    
        
        //////////////////////////////////////////////////////////////
        List<Integer> t1=new ArrayList<>();

    }
}

