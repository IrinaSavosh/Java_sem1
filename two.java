package seminar_1;

public class two {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,0,1,1,1,1,0,1,1,1,1,1};
    int count = 0;
    int countmax = 0;
    for (int i: arr){
        if (i == 1) {
            count++;
        }
        else {
            if (count > countmax) {
                countmax = count;
            }
            count = 0;
        }
    }  
    if (count > countmax) {
        countmax = count;}
    System.out.println(countmax);
    }}
// Дан массив двоичных чисел, например [1,1,0,1,1,1,1,0,1,1,1],
// вывести максимальное количество подряд идущих 1.

// Вывод: 4


