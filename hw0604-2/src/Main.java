
//Создайте случайно заполненный числовой массив,
// выведите его в консоль.
// Найдите максимальное по модулю число в массиве и выведите его в консоль.
import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        // Создаем массив из 10 случайных чисел от -100 до 500
        int[] arr = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(601) - 100;
        }

        // Выводим массив в консоль
        System.out.println("Массив: " + Arrays.toString(arr));

        // Находим максимальное по модулю число в массиве
        int maxAbsValue = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(maxAbsValue)) {
                maxAbsValue = arr[i];
            }
        }
        System.out.println("Максимальное по модулю число в массиве: " + maxAbsValue);
    }
}
