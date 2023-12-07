public class recursionExercise {
    public static void main(String[] args) {
        int i = 5;
        double result = computeM(i);
        System.out.println(result);
    }

    public static double computeM(int i) {
        if (i == 1) {
            return 1.0;
        } else {
            return 1.0 / i + computeM(i - 1);
        }
    }
}
