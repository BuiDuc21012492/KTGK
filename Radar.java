public class Radar {
    public double calculateX(int n) {
        if (n >= 0 && n <= 15) {
            return 1 - (n / 15.0);
        } else {
            return 0;
        }
    }

    public void printX(int n) {
        System.out.println("X(" + n + ") = " + calculateX(n));
    }
}
