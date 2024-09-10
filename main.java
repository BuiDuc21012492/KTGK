public class main {
    public static void main(String[] args) {
       
        double[] signal = {1, 2, 3, 4, 5};
        DiscreteSignal1 discreteSignal = new DiscreteSignal1(signal);


        discreteSignal.printSignalAt(4);

        Radar radar = new Radar();
        radar.printX(4);
    }
}