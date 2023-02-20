import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        Stream<Integer> stream=list1.stream();
        List<Integer>evenList=stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(evenList );
    }
}