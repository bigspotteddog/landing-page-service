import java.math.BigDecimal;

public class HelloWorld {
  public static void main(String[] args) {
    {
      Double max = Double.MAX_VALUE;
      Double min = Double.MIN_VALUE;

      System.out.println(BigDecimal.valueOf(min).toPlainString());
    }
  }
}