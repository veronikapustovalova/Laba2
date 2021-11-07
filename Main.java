
public class Main {
public static void main(String[] args) {
  System.out.println("Наше выражение: (5+7)^2");
  System.out.print("Стек: ");
  System.out.println(Calculator.ExpressiontoRPN("(5+7)^2"));
  System.out.print("Значение выражения: ");
  System.out.println(Calculator.RPNtoAnswer(Calculator.ExpressiontoRPN("(5+7)^2")));
  System.out.print("Возведение в степень");
  System.out.println("");
 }
}