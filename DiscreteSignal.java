public class DiscreteSignal implements Signal {
    @Override
    public void processSignal() {
        System.out.println("Processing discrete signal.");
    }

    public void sampleSignal() {
        System.out.println("Sampling discrete signal.");
    }
}
