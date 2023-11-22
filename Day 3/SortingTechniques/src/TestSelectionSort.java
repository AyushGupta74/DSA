import java.util.Arrays;

public class TestSelectionSort {
	public static void main(String[] args) {
		int[] arr= {65,35,26,13,23,12,91};
		
		System.out.println("Given array :");
		System.out.println(Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("sorted Array : ");
		System.out.println(Arrays.toString(arr));
	}

	private static void selectionSort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			//assum the i th number is smallest
			int min_idx=i;
			//find the position of minimum number in the array
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min_idx]){
					min_idx=j;
				}
				
			}
			//put smallest number at ith location
			int temp=arr[i];
			arr[i]=arr[min_idx];
			arr[min_idx]=temp;
			
			
		}
		
		
	}

}
