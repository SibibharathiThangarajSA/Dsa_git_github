package my_dsa8;

public class frequencyCount {
	public void find(int num) {
		int arr[] = {23,52,67,52,52,34,52,36};
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==num) {
				count++;
			}
		}
		System.out.println("Frequency count is "+count);
	}
	public static void main(String[] args) {
		frequencyCount ts = new frequencyCount();
		ts.find(52);
	}

}
