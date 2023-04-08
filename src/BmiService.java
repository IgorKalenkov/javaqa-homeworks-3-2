public class BmiService {

    public int calculate(double bodyWeightKilo, double growthMetre) {
        double growthSquared  = Math.pow (growthMetre, 2);
        double index = bodyWeightKilo / growthSquared;
        return (int) index;
    }
}
