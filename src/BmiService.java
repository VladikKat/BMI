public class BmiService {
    public int calculate(int weightinkg, double heigtinmeters) {
        int calculate = (int) (weightinkg / heigtinmeters / heigtinmeters);
        return (int) calculate;
    }



}

