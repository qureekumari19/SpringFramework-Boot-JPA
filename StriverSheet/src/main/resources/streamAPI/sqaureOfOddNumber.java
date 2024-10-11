import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

class sqaureOfOddNumber {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4,43,5,7,2,1);
        Stream<Integer> s=list.stream();
        List<Integer> l=s.filter(i->i%2!=0).collect(Collectors.toList());
        l.stream().map(i->i*i).forEach(System.out::println);
    }
}