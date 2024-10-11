import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Student{

    public int id;
    public String name;
    public String city;
//    List<Subject> sub;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Student(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }
}

class studentStream {
    public static void main(String[] args) {
      Student s1=new Student(1,"A","BLR");
      Student s2=new Student(2,"B","BLR");
      Student s3=new Student(3,"C","MAA");
      List<Student> list=List.of(s1,s2,s3);
        Stream<Student> stream=list.stream();
        stream.map(Student::getCity).distinct().forEach(System.out::println);
    }
}