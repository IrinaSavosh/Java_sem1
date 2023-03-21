
import java.util.Scanner;
public class hw_3 {
   public static void main (String[] args){
      /*Реализовать простой калькулятор (+ - / *)
Ввод числа ->
Ввод знака ->
Ввод числа ->*/
      System.out.print("Введите число: ");
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();

      System.out.print("Введите символ +, -, * или /: ");
      String symbol = in.next(); //toString();

      System.out.print("Введите число: ");
      int m = in.nextInt();

      result(n, symbol, m);

      in.close();
   }

   public static void result(int one, String symbol, int two){
      if(symbol.equals("+")){
         int sum = one + two;
         System.out.println(sum);
      }
      if(symbol.equals("-")){
         System.out.println(one - two);
      }
      if(symbol.equals("*")){
         System.out.println(one * two);
      }
      if(symbol.equals("/")){
         if (one % two == 0){
            System.out.println(one / two);
         }
         else{
            System.out.println((double)one / (double)two);
         }
      }
   }
}
