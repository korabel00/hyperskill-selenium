package Hyperskill.strategy.maxandminstrategy;

interface FindingStrategy {

    /**
     * Returns search result
     */
    int getResult(int[] numbers);

}

class MaxFindingStrategy implements FindingStrategy {

    public int getResult(int[] numbers) {

        if (numbers == null || numbers.length == 0) {
            return Integer.MIN_VALUE;
        }

        int maximum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }
        return maximum;
    }
}

class MinFindingStrategy implements FindingStrategy {

    public int getResult(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return Integer.MAX_VALUE;
        }

        int minimum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }
        return minimum;
    }
}