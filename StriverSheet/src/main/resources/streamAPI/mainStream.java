import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class mainStream {
    public static void main(String[] args) {
      //create a list and filter even Number
        List<Integer> list=List.of(20, 25, 30, 12, 11, 6,20);
        List<String> list1=List.of("am","quree","querty","hello","ki","abhi","deepak");

        //using stream API

//        Stream<Integer> stream=list.stream();
//        List<Integer> l=stream.filter(i->i%2==0).collect(Collectors.toList());
//        System.out.println(l);

        //if List has greater element than 35
//        List<Integer> l=stream.filter(i->i>35).collect(Collectors.toList());
//        System.out.println(l);
//

//        Stream<String> s=list1.stream();
//        List<String> l=s.filter(i->i.length()>2).collect(Collectors.toList());
//        System.out.println(l);

//        Stream<Integer> stream=list.stream();
//        List<Integer> l=stream.map(i->i+i).collect(Collectors.toList());
//        int a=l.stream().min((i,j)->i.compareTo(j)).get();
//        System.out.println(a);

//        Stream<Integer> stream=list.stream();
//        List<Integer> l=stream.filter(i->i%5==0).collect(Collectors.toList());
//        System.out.println(l);

        Stream<Integer> stream=list.stream();
        stream
                .map(i->i*2)
                .filter(i->i>2)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}