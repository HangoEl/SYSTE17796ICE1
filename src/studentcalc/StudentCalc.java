package studentcalc;

public class StudentCalc {

    public static void main(String[] args) {
        double[] studentGrades = {71, 38, 91, 30, 94, 36, 85, 8, 23, 58};
        var average = avgCalc(studentGrades);
        System.out.println(average);
    }
    
    static double avgCalc(double[] array) {
        double total = 0;
        double average = 0;
        for(int x = 0; x < array.length; x++) {
            if (array[x] < 0) {
                total += 0;
            } else {
                total += array[x];
            }
        }
        average = total / array.length;
        return average;
    }
}
