import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task5 {

  public static void main(String[] args){
    List<Person> list = new ArrayList<>();

    list.add(new Person("Dima","Pokrenko",20));
    list.add(new Person("Volodimir","Kylenko",54));
    list.add(new Person("FFFFFFFFFFFFFFFFFFFFFF","Edison",80));
    list.add(new Person("Sonya","Kazantseva",18));
    list.add(new Person("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE","Krab",42));

    Person result = list.stream().filter(x -> x.getFirstName().length() < 15)
        .max(Comparator.comparing(Person::getAge))
        .get();
    System.out.println(result.toString());
  }
}
