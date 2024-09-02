import java.util.Arrays;
import java.util.List;

public class EmptyString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        for (String str : strings) {
            if (!str.isEmpty()) {
                System.out.println(str);
            }
        }
    }
}

// Output
abc
bc
efg
abcd
jkl
