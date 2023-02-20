import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        List<Integer>nlist=new ArrayList<>();
        System.out.println(list1);
        for(Integer val:list1){
            if(val%2==1){nlist.add(val);}
        }
        System.out.println(nlist);
    }
}