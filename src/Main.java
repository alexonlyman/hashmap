import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> telephoneMap = new HashMap<>();
        telephoneMap.put("Борисов Ярослав", "77174909644");
        telephoneMap.put("Волков Тимофей", "77274909644");
        telephoneMap.put("Голиков Ярослав", "77374909644");
        telephoneMap.put("Горелов Владимир", "77434909644");
        telephoneMap.put("Григорьев Марк", "77054509644");
        telephoneMap.put("Давыдов Евгений", "77066909644");
        telephoneMap.put("Ефремов Владими", "77776909644");
        telephoneMap.put("Зимин Антон", "77874909744");
        telephoneMap.put("Иванов Арсений", "77974609644");
        telephoneMap.put("Котов Артём", "77174909844");
        System.out.println(telephoneMap);


        System.out.println("задание 3");

        Set<Driver> drivers = new HashSet<>();
        drivers.add(new Driver("Михаил","Городовой","категория B"));
        drivers.add(new Driver(" Генадий","Городовой","категория B"));
        drivers.add(new Driver("Михаил","Городовой","категория B"));
        drivers.add(new Driver("Виктор","Молодой","категория D"));
        System.out.println();
        Iterator<Driver> iter = drivers.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


    }
    }
