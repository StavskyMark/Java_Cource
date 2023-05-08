import java.io.*;
import java.util.*;


public class sem4_homework{

    public static void main(String[] args) throws Exception{
//1.Сохранить в файл строку и загрузить из файла строку с выводом в консоль используя классы FileWriter и FileReader
        System.out.println("\n 1.Сохранить в файл строку и загрузить из файла строку с выводом в консоль используя классы FileWriter и FileReader");
        String some_text = "some text";
        
        FileWriter fw = new FileWriter( "example.txt" );
        fw.write(some_text);
        fw.close();
        
        FileReader fr = new FileReader( "example.txt" );
        System.out.println("\nИз файла прочитано: ");
        Scanner scan = new Scanner(fr);
            while (scan.hasNextLine()) {
                System.out.print(scan.nextLine());
            }
        
        
        scan.close();
        fr.close();
        

//2.Загрузить из файла многострочный текст формата ФИО возраст и пол через пробелы. Разбить по строкам и вывести в консоль в формате "Иванов И.И. 32 М"
    System.out.println("\n\n 2.Загрузить из файла многострочный текст формата ФИО возраст и пол через пробелы. Разбить по строкам и вывести в консоль в формате \"Иванов И.И. 32 М\" \n ");
       
    fr = new FileReader( "text.txt" );
    scan = new Scanner(fr);
    ArrayList<String> list_fio = new ArrayList<>();
    System.out.println("Из файла прочитано:");
    while (scan.hasNextLine()) {
        String line = scan.nextLine();
        list_fio.add(line);
        System.out.println(line);
        }
    
    //System.out.println(list_fio);
    fr.close();

//3.Загруженный и разбитый по строкам текст загрузить в подготовленные списки. Фамилии, имена, отчества, возрас и пол в отдельных списках.
    System.out.println("\n 3.Загруженный и разбитый по строкам текст загрузить в подготовленные списки. Фамилии, имена, отчества, возрас и пол в отдельных списках");

    ArrayList<Integer> list_id = new ArrayList<>();
    ArrayList<String> list_surname = new ArrayList<>();
    ArrayList<String> list_name = new ArrayList<>();
    ArrayList<String> list_second_name = new ArrayList<>();
    ArrayList<Integer> list_age = new ArrayList<>();
    ArrayList<String> list_gender = new ArrayList<>();

    Iterator<String> iterator = list_fio.iterator();
    int i =0;
    while (iterator.hasNext()){
        String line = iterator.next();
        list_id.add(i);
        i++;
        list_surname.add(line.split(" ")[0]);
        list_name.add(line.split(" ")[1]);
        list_second_name.add(line.split(" ")[2]);
        list_age.add(Integer.parseInt(line.split(" ")[3]));
        list_gender.add(line.split(" ")[4]);
     
    }
    System.out.println("list of surname:" + list_surname);
    System.out.println("list of name" + list_name);
    System.out.println("list of second_name" + list_second_name);
    System.out.println("list of age" + list_age);
    System.out.println("list of gender" + list_gender);
    //System.out.println("list of id" + list_id);

//4.Отсортировать по возрасту используя дополнительный список индексов.
    System.out.println("\n 4.Отсортировать по возрасту используя дополнительный список индексов.");
    List<Integer> age = new ArrayList<Integer>(list_age);
    for (i=0; i<list_age.size(); i++){
        int temp = 0;
        //int min_age = list_age.get(i);
        for (int j=1; j<list_age.size(); j++){
            if (age.get(j) > age.get(j-1)){
                temp = age.get(j);
                age.set(j, age.get(j-1));
                age.set(j-1, temp); 

                temp = list_id.get(j);
                list_id.set(j, list_id.get(j-1));
                list_id.set(j-1, temp); 
            }
    }

    }
//    System.out.println("age =" + age);
//    System.out.println("id =" + list_id);
    for (i=0; i<list_age.size(); i++){
        System.out.print(list_surname.get(list_id.get(i)) + " ");
        System.out.print(list_name.get(list_id.get(i))+ " ");
        System.out.print(list_second_name.get(list_id.get(i))+ " ");
        System.out.print(list_age.get(list_id.get(i))+ " ");
        System.out.print(list_gender.get(list_id.get(i))+ " ");
        System.out.println();
        }


    }

    
}
