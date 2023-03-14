package seminar_1;

public class hw_2 {
   public static void main (String[] args){
      // Вывести все простые числа от 1 до 1000
      for (int i = 0; i <= 1000; i++) {
         simple(i);
      }
      
   }
   public static void simple(int number) {
      boolean flag = true;
      if(number < 2){
         flag = false;
      }
      for(int j = 2; j < number; j++) {
         if(number % j == 0) {
            flag = false;
         }
      }
      if(flag == true){
         // System.out.print(number);
         System.out.print(number + " ");
      }
   }
}

