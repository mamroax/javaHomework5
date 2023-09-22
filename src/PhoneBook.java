import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    /**
     * Реализуйте структуру телефонной книги с помощью HashMap.
     * Программа также должна учитывать, что во входной структуре
     * будут повторяющиеся имена с разными телефонами, их необходимо
     * считать, как одного человека с разными телефонами.
     * Вывод должен быть отсортирован по убыванию числа телефонов.
     */

    HashMap<String, ArrayList<Integer>> hashMap = new HashMap<>();
    ArrayList<Integer> checkNumber = new ArrayList<>();

    public boolean add(String name, Integer phone) {
        if (checkNumber.contains(phone)) { // проверка на повторение номера(не смог достать все номера из списка списков)
            // поэтому добавил лишний список для соблюдения уникальности номера телефона
            return false;
        } else {
            checkNumber.add(phone);
        }
        if (hashMap.containsKey(name)) {
            hashMap.get(name).add(phone);
        } else {
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(phone);
            hashMap.put(name, numbers);
        }
        return true;
    }

    public void printBook() {
//        hashMap.entrySet().stream()
//                .sorted(Map.Entry.comparingByKey())
//                .forEach(System.out::println);
        ArrayList<Integer> sort = new ArrayList<>();
        for (ArrayList<Integer> item : hashMap.values()) {
//            System.out.println(item);
            sort.add(item.size());
        }
        sort.sort(Comparator.reverseOrder());
        for (int i = 0; i < sort.size(); i++) {
            for (Map.Entry<String, ArrayList<Integer>> entry : hashMap.entrySet()) {
                if (sort.get(i) == entry.getValue().size()) {
                    System.out.printf("Имя: %s \n Телефоны: %s \n",entry.getKey(), entry.getValue());
                }
            }
        }
//        hashMap.entrySet().stream()
//                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
//                .forEach(System.out::println);
    }
}
