package seminar_1;
import java.util.Scanner;
public class hw_1 {
   public static void main (String[] args){
      /*Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
      Ввод:5
      Треугольное число 1 + 2 + 3 + 4 + 5 = 15
      n! 1 * 2 * 3 * 4 * 5 = 120
      */
      System.out.print("Введите число: ");
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();

      System.out.println(triangular_number(n));
      System.out.print(factorial(n));
      in.close();
   }
   public static Integer triangular_number (int n){
      int sum = 0;
      for (int i = 0; i <= n; i++) {
         sum += i;
      }
      return (sum);
   }
   public static Integer factorial (int n){
      int f = 1;
      for (int j = 1; j <= n; j++) {
         f = f * j;
      }
      return (f);
   }
}



