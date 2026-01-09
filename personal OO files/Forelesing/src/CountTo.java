public class CountTo {
    int limit;
    int counter;
    
    public CountTo(int limit) {
        this.limit = limit;
    }

    public void CountUp() {
        if (! isFinished()) counter += 1;

    }

    // Note: There is a typo in the original isFInished, corrected below:
    public boolean isFinished() {
        return counter == limit;

    }

    // This is the required, standard main method for the JVM to find:
    public static void main(String[] args) {
        // Now you can write code to use your CountTo class here
        CountTo counter = new CountTo(5); // Create an instance
        while (!counter.isFinished()) {
            counter.CountUp();
            System.out.println("Counter is at: " + counter.counter);
        }
        System.out.println("Finished counting!");
    }
}
