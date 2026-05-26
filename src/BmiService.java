public class BmiService {
    public int calculate(double high, int weight) {
        return (int) (weight / (high * high));
    }
}
