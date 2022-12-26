import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Random;

public class Min_max_mean {
    /**
     * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
     * */
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int num = random.nextInt(50);
            array.add(num);
            count += num;
        }
        System.out.println("\nCписок ArrayList:\n" +array);
        Collections.sort(array);

        System.out.println("Минимальное число: " + array.get(0));
        System.out.println("Максимальное число: " + array.get(9));
        System.out.println("Среднее из этого списка: " + count/10);
    }

}
