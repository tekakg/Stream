import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //creating empty object.
        Stream stream=Stream.empty();

        //array, object and collection.
        String[] arr={"abc","def","ghi"};
        List<Integer>list=new ArrayList<>();
        list.add(1);list.add(2);list.add(3);
        Stream stream1=Stream.of(list);
        stream1.forEach(i->{System.out.println(i);});

        // using builder function.
        Stream stream2=Stream.builder().build();

    }
}