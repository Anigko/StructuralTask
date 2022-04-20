public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        int target = arg0 + arg1;
        return target;
    }

    @Override
    public int mult(int arg0, int arg1) {
        int target = arg0 * arg1;
        return target;
    }

    @Override
    public int pow(int a, int b) {
        int target = (int) Math.pow(a, b);
        return target;
    }
}