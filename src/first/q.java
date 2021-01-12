package first;

public class q {

    public static void main(String[] args) {
        int[] values = new int[5];



        for (int i = 0; i < values.length; i++) {
            values[i] = (int)( Math.round(Math.random()*10) ) - 5;
        }

        for (int value : values) {
            System.out.print(value + " ");
        }

        int maxValue = values[0];
        int minValue = values[0];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < values.length; i++) {

            if (values[i] > maxValue) {
                maxValue = values[i];
                maxIndex = i;
            }

            if (values[i] < minValue) {
                minValue = values[i];
                minIndex = i;
            }

        }

        System.out.println("\nMin value is " + minValue);
        System.out.println("Max value is " + maxValue);
        System.out.println("Max index is " + maxIndex);
        System.out.println("Min index is " + minIndex);

        values[maxIndex] = minValue;
        values[minIndex] = maxValue;


        for (int v : values) {
            System.out.print(v + " ");
        }

    }

    // Если два элемента максимальное значение, то уменьшить одно из них на 1, если 2 минимальное - увеличить  на 1

}