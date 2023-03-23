import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>(Arrays.asList(
                new Person("Petr", "la-Petrov", 16),
                new Person("Albert", "Van-Der-fon-Gor", 21),
                new Person("Kir", "Der-fon-Persi", 15),
                new Person("Ivan", "la-Ivanov", 18)
        ));

        System.out.println(person); // вывод первоначального списка

        System.out.println();
        System.out.println("=== Ниже список после удаления младше 18 лет ===");
        System.out.println();

        //person.removeIf(persona -> persona.getAge() < 18); //это как более упрощенный вариант
        Predicate<Person> isAgeLessThan18 = persona -> persona.getAge() < 18;
        person.removeIf(isAgeLessThan18);
        System.out.println(person); // вывод списка после удаления элементов
    }
}
