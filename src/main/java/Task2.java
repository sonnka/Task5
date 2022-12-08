import java.util.List;

public class Task2 {

  public static void main(String[] args){
    List<String> list = List.of("І","коня","я","мав,"
        ,"І","стежку","я","знав,"
        ,"І","мати","пускала,"
        ,"Найменша","сестра");
    long unique = list.stream().distinct().filter(x -> x.length() > 6).count();
    System.out.println(unique);
  }

}
