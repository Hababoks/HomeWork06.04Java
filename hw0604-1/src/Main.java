import java.util.Arrays;
// n - номер дома, в котором Вы живёте (без учёта дробей, корпусов, строений и т.д).
// Создайте массив целых чисел.
// Заполните массив числами от 0 до n*10, выведите массив в консоль.

public class Main {
    public static void main(String[] args) {
        int n = 8;
        // Создаем массив целых чисел от 0 до n*10
        int[] array = new int[n * 10 + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
    }
}
