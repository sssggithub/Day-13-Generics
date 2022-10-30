package Day13;

public class Max_Float {
	public static Float testMax(Float value1, Float value2, Float value3) {
		Float max = value1;

		if (value2.compareTo(max) > 0) {
			max = value2;
		}
		if (value3.compareTo(max) > 0) {
			max = value3;
		}
		return max;

	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Maximum Float is " + testMax(76.56f, 64.78f, 87.65f));
	}

}
