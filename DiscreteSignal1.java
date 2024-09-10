public class DiscreteSignal1 {
    private double[] signalValues;
    public DiscreteSignal1(double[] signalValues) {
        if (signalValues == null || signalValues.length == 0) {
            throw new IllegalArgumentException("Mảng tín hiệu không được rỗng");
        }
        this.signalValues = signalValues;
    }

    public int delta(int n) {
        return (n == 0) ? 1 : 0;
    }

    public double processSignal(int n) {
        double result = 0;
        for (int k = 0; k < signalValues.length; k++) {
            result += signalValues[k] * delta(n - k);
        }
        return result;
    }

    public void printSignalAt(int n) {
        if (n < 0 || n >= signalValues.length) {
            System.out.println("Giá trị n ngoài phạm vi của tín hiệu.");
        } else {
            System.out.println("x(" + n + ") = " + processSignal(n));
        }
    }
}
