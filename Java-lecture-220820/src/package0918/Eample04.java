package package0918;

public class Eample04 {
	public static void main(String[] args) {
		// 20, 16, 21, 6, 7, 19, 33, 26, 1 중에서
		// 가장 큰 값과 가장 작은 값을 출력
		
		int[] arr = new int[] {20, 16, 21, 6, 7, 19, 33, 26, 1};
		
		int bigger = arr[0];
		int smaller = arr[0];

		for (int i = 0;i < arr.length; i++) {
			// 조건 연산자를 이용
			bigger = bigger >= arr[i] ? bigger : arr[i];
			smaller = smaller <= arr[i] ? smaller : arr[i];
			// 조건 문을 이용 예시
			// if (smaller > arr[i]) smaller  = arr[i];
		}
		
		System.out.println("Bigger's number >>> " + bigger);
		System.out.println("smaller's number >>> " + smaller);
		
	}
}
