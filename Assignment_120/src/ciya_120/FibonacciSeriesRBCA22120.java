package ciya_120;

public class FibonacciSeriesRBCA22120 {
	public static int[] generateSeries(int n) {
        int[] series = new int[n];
        if (n >= 1) {
            series[0] = 0;
        }
        if (n >= 2) {
            series[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }
        return series;
    }
    
    public static void printSeries(int[] series) {
        System.out.print("Fibonacci Series: ");
        for (int num : series) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int n = 10; 
        int[] series = generateSeries(n);
        printSeries(series);
    }

}
