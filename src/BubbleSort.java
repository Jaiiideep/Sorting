
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {5, 4, 3, 2, 1};
		System.out.print("Array before sorting: ");
		printArray(arr);
		
		arr = bubbleSort(arr);
		
		System.out.print("Array after sorting: ");
		printArray(arr);
	}

	private static int[] bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
		{
			for (int j = 0; j < n - i - 1; j++)
			{
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
		return arr;
	}
	
	private static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
