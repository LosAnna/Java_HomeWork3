import java.util.Arrays;


public class Sort_merge {
    /**
     * Реализовать алгоритм сортировки слиянием
     */
    public static int[] sortMerge(int[] sortArr) {
        int[] num1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] num2 = new int[sortArr.length];
        int[] result = sortMergeInner(num1, num2, 0, sortArr.length);
        return result;
    }

    public static int[] sortMergeInner(int[] num1, int[] num2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return num1;
        }

        //сортировка
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = sortMergeInner(num1, num2, startIndex, middle);
        int[] sorted2 = sortMergeInner(num1, num2, middle, endIndex);

        //слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == num1 ? num2 : num1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
    public static void main(String args[]) {
        int[] sortArr = {15, 54, 37, 96, 21, 42, 33, 71, 11, 65};
        int[] result = sortMerge(sortArr);

        System.out.println("\nИзначальный массив:\n" + Arrays.toString(sortArr));
        System.out.println("После сортировки:\n" +Arrays.toString(result));
    }
}