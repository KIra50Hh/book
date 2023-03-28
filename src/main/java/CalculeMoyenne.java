public class CalculeMoyenne {

    public static void main(String[] args) {
        double[] nums = {1,2,3,4,5};

        double sum = 0;
        for (double num : nums){
            sum += num;
        }

        double average = sum / nums.length;
    }

    public static double calculeSomme(double[] nums){
        double sum = 0;
        for (double num : nums){
            sum += num;
        }
        return sum;
    }

    public static double calculeMoyenne(double[] nums){
        double sum = 0;
        for(double num : nums){
            sum += num;
        }
        double average = sum / nums.length;
        return average;
    }

}
