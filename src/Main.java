public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bodyMass = 60;
        int height = service.calculate(bodyMass);
        System.out.println(bodyMass);
    }
}

