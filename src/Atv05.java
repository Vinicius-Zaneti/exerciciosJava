import java.util.ArrayList;
import java.util.List;

public class Atv05 {
    public static void main (String[] args) {
        List<String> carros = new ArrayList<>();
        carros.add("fiesta");
        carros.add("tesla");
        carros.add("chevette");
        carros.add("fusca");

        carros.forEach(carros -> System.out.println(carros))
    }
}
