import java.util.Scanner;
//Пользователь вводит строку.
// Посчитайте количество слов в строке и выведите в консоль.
// Разделителем между словами считать только пробел.
// Если в строке есть слова, которые длиннее трёх символов,
// то вывести эти слова в консоль.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем строку пользователя
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        // Разбиваем строку на слова и считаем их количество
        String[] words = input.split(" ");
        int wordCount = words.length;

        // Выводим количество слов в консоль
        System.out.println("Количество слов: " + wordCount);

        // Ищем слова, длиннее трех символов, и выводим их в консоль
        System.out.println("Слова, длиннее трех символов:");
        for (String word : words) {
            if (word.length() > 3) {
                System.out.println(word);
            }
        }
    }
}

