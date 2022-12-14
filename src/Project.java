import java.time.temporal.ValueRange;

public class Project {
    public static void main(String[] args) {
        ComplexAlgorithm algorithm = new RealAlgorithm();
        System.out.println(algorithm.complexAlgorithm(10,20));
    }
}
