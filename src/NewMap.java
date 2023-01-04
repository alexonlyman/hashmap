import java.util.HashMap;
import java.util.Map;

public class NewMap {
    private static final Map<String, Integer> intMap = new HashMap<>();

    private static void addNumber(String s, Integer i) {
        var value = intMap.get(s);
        if (value != null && value.equals(i))
         {
            throw new RuntimeException(intMap + "значения совпадают");
        }
        intMap.put(s, i);
    }

    public static void main(String[] args) {
        addNumber("строка2",4);
        addNumber("строка2",9);
        addNumber("строка1",3);
        addNumber("строка5",2);
        System.out.println(intMap);

    }
}

