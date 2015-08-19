public class q3 {

	public static void main(String[] args) {
		double[] ts = { 7, -10, 13, 8, 4, -7.2, -12, -3.7, 3.5, -9.6, 6.5,
				-1.7, -6.2, 7 };

		double result = q3.closestToZero(ts);
		System.out.println("Result: " + result);
	}

	private static double closestToZero(double[] ts) {
		double limMin = 273;
		double limMax = 5526;
		double min;
		if (ts == null)
			throw new NullPointerException("ts n�o pode ser null!");
		if (ts.length == 0)
			return 0;
		min = ts[0];
		for (int i = 0; i < ts.length; i++) {
			if (Math.abs(ts[i]) < min)
				min = Math.abs(ts[i]);
		}
		return min;

	}
}
