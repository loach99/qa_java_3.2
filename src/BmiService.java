public class BmiService {
    public int calculate(double weight_kg, double height_mt) {
        double finish_mt = height_mt * height_mt;
        double bmi = weight_kg / finish_mt;
        return (int) bmi;
    }
}