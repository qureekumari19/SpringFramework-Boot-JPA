import java.util.*;
import java.util.stream.*;

class frequencyOfString {
    public static void main(String[] args) {
        List<String> list=List.of("AWS","Quree","AWS","Quree","Hello","Bye");
        Stream<String> s=list.stream();
//        Map<String, Long> m = list.stream()
//                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        Map<String,Long> m=list.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        System.out.println(m);
    }
}