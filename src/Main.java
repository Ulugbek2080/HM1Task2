//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double high = 1.87;
        int weight = 98;
        int bmi = service.calculate(high, weight);
        System.out.println(bmi);

    }
}
