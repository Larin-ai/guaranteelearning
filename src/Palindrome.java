import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Palindrome {
    public static void main(String[] args) {
        String text = "AAABCCDDDD";//вводим любую последовательность букв
        String[] arr = text.split("");

        Map<String, Long> map = Arrays.stream(arr).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        map.forEach((k, v) -> System.out.print(k + (v > 1 ? v : "")));
    }
}