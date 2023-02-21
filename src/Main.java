import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //methods of stream
        //filer(predicate ->boolean value function)
        // In predicate we use lambda expression.

        //map(function -> it returns the value)
        /* each element operation*/

        List<String> listString = List.of("Aman", "Ankit", "Durgesh");
        // now to filer out all those elements started with A.
        List<String> ans = listString.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(ans);

        // now to square out every element.
        List<Integer> listNumber = List.of(4, 5, 3, 2, 1);
        List<Integer> squareNumber = listNumber.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(listNumber.stream().min((x, y) -> x.compareTo(y)).get());
    }
}