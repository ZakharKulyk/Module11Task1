import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortNames {
    public static void main(String[] args) {

        String[] names = {"Zakhar", "Peter", "Roman", "julia"};
        ArrayList<String> ListOfNames = new ArrayList<>(Arrays.asList(names));
        String collect = IntStream.range(0, ListOfNames.size())
                .filter(index -> index % 2 == 0)
                .mapToObj(i -> (i + 1) + "." + ListOfNames.get(i))
                .collect(Collectors.joining(","));
        System.out.println(collect);


    }
}
