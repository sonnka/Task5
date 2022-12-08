import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Task3 {
  public static void main(String[] args){
    Map<String, Integer> data = new HashMap<>();
    data.put("milk", 21);
    data.put("eggs",54);
    data.put("biscuits",30);
    data.put("bread", 20);
    data.put("yoghurt",21);
    data.put("potatoes", 20);
    data.put("cake", 190);

    int sum = data.entrySet().stream().filter(k -> k.getKey().length() < 7)
        .mapToInt(Entry::getValue).sum();

    System.out.println(sum);
  }
}
