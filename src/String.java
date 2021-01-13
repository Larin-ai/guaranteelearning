import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class String {
    public static void main(java.lang.String[] args) {
        java.lang.String text = "AAABCCDDDD";//вводим любую последовательность букв
        java.lang.String[] arr = text.split("");

        Map<java.lang.String, Long> map = Arrays.stream(arr).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        map.forEach((k, v) -> System.out.print(k + (v > 1 ? v : "")));
    }
}
