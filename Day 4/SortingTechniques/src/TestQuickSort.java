import java.util.Arrays;

public class TestQuickSort {

	public static void main(String[] args) {
		int[] arr= {65,35,26,13,23,12,91};
		
		System.out.println("Given array :");
		System.out.println(Arrays.toString(arr));
		quickSort(arr,0,arr.length-1);
		System.out.println("sorted Array : ");
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int start, int end) {
		if(start<end) {
			int p=partition(arr,start,end);
			//this will sort the left portion of the array
			quickSort(arr,start,p-1);
			//this will sort the right portion of the array
			quickSort(arr,p+1,end);
		}
		
	}

	private static int partition(int[] arr, int first, int last) {
		int pivot=first;
		int i=first;
		int j=last;
		while(i<j){
			//increament i till the value at i th position is <= pivot value
			while(i<last && arr[i]<=arr[pivot]) {
				i++;
			}
			//decreament j till the value at j th position is > pivot value
			while(j>pivot && arr[j]>arr[pivot]) {
				j--;
			}
			if(i<j) {
				//swap i and j
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
		//swap j and pivot
		int temp=arr[j];
		arr[j]=arr[pivot];
		arr[pivot]=temp;
		return j;
				
		
	}

}
