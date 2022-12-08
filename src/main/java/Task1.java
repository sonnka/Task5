import java.util.List;

public class Task1 {

  public static void main(String[] args){
    List<Integer> list = List.of(15,32,3,4,95,7,1,6,5,8,12,47,3);

    double avg = list.stream().mapToInt(Integer::intValue)
        .filter(x -> x % 5 == 0 && x % 2 != 0)
        .average().getAsDouble();

    System.out.println(avg);
  }

}
