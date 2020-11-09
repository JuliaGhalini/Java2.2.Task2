public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float growth = 1.8F;
        float weight = 60;
        float bodyMassIndex = service.calculate (weight,growth);
        System.out.println(bodyMassIndex);
    }
}

