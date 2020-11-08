public class BmiService {

        public int calculate(int bodyMasse){

            int height = 180;
            int bodyMassIndex = bodyMasse / height ;
            System.out.println(bodyMassIndex);

            return bodyMassIndex;

    }
}
