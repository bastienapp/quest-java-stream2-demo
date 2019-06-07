import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class Step5 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("aA", "bB", "cC", "dD", "eE", "fF"));

        List<String> listMapped = list.stream()
                .map(new Function<String, String>() {
                    @Override
                    public String apply(String item) {
                        return item.toUpperCase();
                    }
                })
                .collect(Collectors.toList());

        System.out.println(listMapped.toString());
    }
}