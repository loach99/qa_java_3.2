import java.lang.module.FindException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height_mt = 1.32; // рост человека
        double weight_kg = 80; // вес человека
        int bmi = service.calculate(weight_kg, height_mt);
        System.out.println("Ваш BMI =" + bmi);
    }
}