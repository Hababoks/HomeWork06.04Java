//Пользователь вводит строку.
// Разместите буквы в строке по алфавиту и выведите в консоль.
import java.util.Arrays;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем строку от пользователя
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        // Преобразуем строку в массив символов  с приведентем всех букв к нижнему регистру
        char[] charArray = input.toLowerCase().toCharArray();

        // Сортируем массив символов по алфавиту
        Arrays.sort(charArray);

        // Преобразуем массив символов обратно в строку и выводим ее в консоль
        String alphString = new String(charArray);
        System.out.println("Отсортированная строка: " + alphString);
    }
}
