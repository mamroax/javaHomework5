import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /**Реализуйте структуру телефонной книги с помощью HashMap.
         Программа также должна учитывать, что во входной структуре
         будут повторяющиеся имена с разными телефонами, их необходимо
         считать, как одного человека с разными телефонами.
         Вывод должен быть отсортирован по убыванию числа телефонов. */

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", 123);
        phoneBook.add("Ivanov", 1234);
        phoneBook.add("Petrov", 546585);
        phoneBook.add("Petrov", 8956477);

        phoneBook.add("Ivanov", 123);
        phoneBook.add("Ivanov", 1234);
        phoneBook.add("Petrov", 546585);
        phoneBook.add("Petrov", 8956477);

        phoneBook.add("Petrov", 12356233);
        phoneBook.add("Petrov", 787897);

        phoneBook.add("Pavlov", 18626378);
        phoneBook.add("Pavlov", 28734);
        phoneBook.add("Pavlov", 23423433);

        phoneBook.add("Vasiliev", 234433);
        phoneBook.add("Vasiliev", 233);
        phoneBook.printBook();
    }
}