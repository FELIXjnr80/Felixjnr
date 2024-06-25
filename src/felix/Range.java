package felix;

public class Range <T extends Number>{
    private T min;
    private T max;

    // Constructor to initialize min and max
    public Range(T min, T max) {
        if (min.doubleValue() > max.doubleValue()) {
            throw new IllegalArgumentException("Min cannot be greater than Max");
        }
        this.min = min;
        this.max = max;
    }

    // Getter for min
    public T getMin() {
        return min;
    }

    // Getter for max
    public T getMax() {
        return max;
    }

    // Overriding toString for meaningful output
    @Override
    public String toString() {
        return "Range [min=" + min + ", max=" + max + "]";
    }

    public static void main(String[] args) {
        Range<Integer> intRange = new Range<>(1, 10);
        System.out.println("Integer Range: " + intRange);
        System.out.println("Min: " + intRange.getMin() + ", Max: " + intRange.getMax());

        // Testing with Double
        Range<Double> doubleRange = new Range<>(1.5, 10.5);
        System.out.println("Double Range: " + doubleRange);
        System.out.println("Min: " + doubleRange.getMin() + ", Max: " + doubleRange.getMax());

        // Testing with Float
        Range<Float> floatRange = new Range<>(1.2f, 9.8f);
        System.out.println("Float Range: " + floatRange);
        System.out.println("Min: " + floatRange.getMin() + ", Max: " + floatRange.getMax());

        // Testing invalid range
        try {
            Range<Integer> invalidRange = new Range<>(10, 1);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

}
