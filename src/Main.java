public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(67, 1.73);

        System.out.println(bmi + " - индекс массы тела");

    }

}
