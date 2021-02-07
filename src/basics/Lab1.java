package basics;

public class Lab1 {

	public static void main(String[] args) {
		double[] arr = { 9, 8, -453, 5, 987, 11, 9, 8 };

		System.out.println(factorial(5));
		System.out.println(avg(arr));
		System.out.println(min(arr));
		System.out.println(max(arr));

	}

	// This method will give you the factorial of a number.
	public static int factorial(int x) {
		int sum = 0;
		int y = x;

		if (x == 0 || x == 1) {
			return 1;
		} else
			while (x > 1) {
				if (x == y) {
					sum = (x * (x - 1)) + sum;
					x = x - 2;
				} else {
					sum = sum * x;
					x--;
				}
			}
		return sum;
	}

	// This method will return the min, max, or average of the values inside an
	// array.
	public static double avg(double[] x) {

		double[] y = x;
		int size = y.length;
		int trueSize = size - 1;
		double sum = y[trueSize] + y[trueSize - 1];

		trueSize = trueSize - 2;

		while (trueSize >= 0) {
			sum = y[trueSize] + sum;
			trueSize--;
		}

		return sum / size;

	}

	// This function will return the min in an array.
	public static double min(double[] x) {

		double[] y = x;
		int size = y.length - 1;
		double min = y[size];

		while (size >= 0) {
			if (y[size] < min) {
				min = y[size];
			}
			size--;
		}

		return min;

	}

	// This function will return the max in an array.
	public static double max(double[] x) {

		double[] y = x;
		int size = y.length - 1;
		double max = y[size];

		while (size >= 0) {
			if (y[size] > max) {
				max = y[size];
			}
			size--;
		}

		return max;

	}

}
