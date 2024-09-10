public class ContinuousSignal implements Signal {
    @Override
    public void processSignal() {
        System.out.println("Processing continuous signal.");
    }

    public void filterSignal() {
        System.out.println("Filtering continuous signal.");
    }
}
