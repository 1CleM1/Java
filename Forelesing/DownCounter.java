public class DownCounter {
    int counter;

    // Fixed capitalization to match the class name (DownCounter)
    public DownCounter(int inicounter) {
        counter = inicounter;
    }

    public void CountDown() {
        if (counter > 0) {
            counter -= 1;
        }
    } // <-- Added missing closing brace here

    public boolean isFinished() {
        return counter == 0;
    }

    // The main entry point with example logic added
    public static void main(String[] args) {
        // 1. Create a new instance starting from 10
        DownCounter myCounter = new DownCounter(10); 
        
        System.out.println("Starting countdown from: " + myCounter.counter);

        // 2. Loop until the counter is finished
        while (!myCounter.isFinished()) {
            myCounter.CountDown(); // Decrease the counter
            System.out.println("Counter is at: " + myCounter.counter);
        }
        
        System.out.println("Finished counting! Counter reached 0.");
    }
}
