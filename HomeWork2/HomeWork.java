
import java.io.ObjectInputFilter.Status;
import java.text.spi.NumberFormatProvider;

public class HomeWork2 {
    public static void main(String[] args){
        //task1
        //основание -5 степень 3, результат равен
        //основание 127 степень 2, результат равен
        //основание 33 степень 15, результат равен
        //основание 4 степень 7, результат равен

        //task2
        //Самолет построим сами,
        //     Понесемся над лесами,
        // Понесемся над лесами, 
        //     А потом вернемся к маме
        System.out.println("\n\n Задание 1. \n");
        System.out.println(parse_string("основание -5 степень 3, результат равен")); 
        System.out.println(parse_string("127 степень 2, результат равен")); 
        System.out.println(parse_string("33 степень 15, результат равен")); 
        System.out.println(parse_string("4 степень 7, результат равен")); 
        System.out.println(parse_string("основание 2 степень 10, результат равен")); 
        System.out.println(parse_string("основание 0 степень 0, результат равен")); 

        System.out.println("\n\n Задание 2. Сравнение скорости работы string и StringBuilder \n\n");
        String my_string  = """
            Самолет построим сами,
                 Понесемся над лесами,
             Понесемся над лесами, 
                 А потом вернемся к маме
            """;
            String query = "лесами";
            double begin = System.currentTimeMillis();
            
            System.out.println("Исходный текст: \n" + my_string);
            System.out.println(my_string.replace(query, "полями"));
            double end = System.currentTimeMillis();
            System.out.println("Time for string is:" + (end - begin));
            
            begin = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder(my_string);
            while(sb.indexOf(query)>0){
                sb.replace(sb.indexOf(query),sb.indexOf(query) + query.length(),"полями");
            }
            System.out.println(sb);
            end = System.currentTimeMillis();
            System.out.println("Time for stringBuilder is:" + (end - begin));
    }

    public static String parse_string(String in_string){
        String[] strings = in_string.split(" ");
        int base =0;
        int power =0;
        double product = 0;
        for(int i=0; i < strings.length;i++){
            strings[i] = strings[i].replace(",","");
            try{
                Integer.parseInt(strings[i]);
                if (base == 0){
                    base = Integer.parseInt(strings[i]);
                } else{
                    power = Integer.parseInt(strings[i]);
                }
            } catch (NumberFormatException e)
                {
                    continue;
                }
            }
            product = Math.pow(base,power);
            return in_string + " " + String.valueOf(product);
        }
    }
