import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Write a method that takes a list of numbers (Integer, Double, etc.)
        // as input and calculates the average of those numbers. Use an upper
        // bounded wildcard to ensure that the method accepts lists of any type
        // that extends Number.
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        List<Double> doubleList = List.of(1.5, 2.5, 3.5, 4.5, 5.5);

        double intAvg = calculateAverage(intList);
        double doubleAvg = calculateAverage(doubleList);

        System.out.println("Average of intList: " + intAvg);   // Output: 3.0
        System.out.println("Average of doubleList: " + doubleAvg); // Output: 3.5

    }
    public static double calculateAverage(List<? extends Number> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("The list of numbers must not be null or empty.");
        }

        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }

        return sum / numbers.size();
    }

}