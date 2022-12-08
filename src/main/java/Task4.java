import java.util.List;

public class Task4 {
  public static void main(String[] args){
    List<Integer> list = List.of(5, 2, 4, 2, 1);
    String str = list.stream()
        .map(String::valueOf)
        .reduce((a, b) -> a.concat(b))
        .get();
    System.out.println(str);
  }
}
