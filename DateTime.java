
public class DateTime {
  public static void main(String[] args) {
      Timestamp time = new Timestamp(System.currentTimeMillis());
      System.out.println(time);
      String str = time.toString();
      System.out.println(str);
      Timestamp time2 = Timestamp.valueOf(str);
            System.out.println(time2);
  }
}