import java.util.Arrays;
import java.util.Random;

public class HomeWork1 {


    public static void main(String[] args) {

        // 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        int i;
        Random random = new Random();
        i = random.nextInt(2000);
        
        System.out.println("i=" + i);
        // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int n = high_bit(i);
        System.out.println("higher bit is: " + n);
        // 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        int[] m1 = new int[(Short.MAX_VALUE-i)/n];  // create array of exact size
        int j = i;
        int count = 0;  // counter for generated array
        while (j <  Short.MAX_VALUE ) {
            if (j % n == 0){
                m1[count] = j;
                count ++;
                j += n;
            }
            else{
                j++;
            }
        }
        System.out.println("Array: " + Arrays.toString(m1)); 

        //4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        int m2[] = new int[((-Short.MIN_VALUE) + i) - ((-Short.MIN_VALUE) + i)/n];
        j = Short.MIN_VALUE;
 
        count = 0;
        while (j <= i){
            if (j%n != 0){
                m2[count] = j;
                count ++;
                j++;
            }
            else{
                j ++;
            }
        }
        //System.out.println("\n \n Array: " + Arrays.toString(m2));  //very large array to output!!!
    
    }
    public static int high_bit(int x) {
        int t = 1;
        if (x >= t << 8) t <<= 8; // if we expect num > 32768 => add "if (x >= t << 16) t <<= 16"
        if (x >= t << 4) t <<= 4;
        if (x >= t << 2) t <<= 2;
        if (x >= t << 1) t <<= 1;
        return t;
     }

}