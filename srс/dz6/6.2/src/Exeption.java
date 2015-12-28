
import java.util.Scanner;

public class Exeption {

    public static void main(String[] args) {
        System.out.println("Ведите возраст ");

        final Scanner scanner = new Scanner(System.in);

        final String userinput = scanner.next();

        try {

            final int age = Integer.parseInt(userinput);
            if (age < 0) {

                throw new Negative(age);
            }
            if (age < 18) {
                throw new Adulthood(age);

            }
            System.out.println("Ваш возраст " + age);
        } catch (NumberFormatException ex) {
            System.out.println("Ваш возраст должен быть целым числом ");


        } catch (Negative e) {
            System.out.println("[Ошибка]"  +"Ваш возраст   "+ e.getAgeValue() + "  Возраст не может быть отрицательным числом ");

        } catch (Adulthood e) {
            System.out.println("Ваш возраст  " + e.getAge()+ "  Извините,вы не достигли 18 лет");

        }

    }


}
