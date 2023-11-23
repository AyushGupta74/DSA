import java.util.Arrays;

public class TestHeapSort {

	public static void main(String[] args) {
		int[] arr= {65,35,26,13,23,12,91};
	
		System.out.println("Given array :");
		System.out.println(Arrays.toString(arr));
		heapSort(arr);
		System.out.println("sorted Array : ");
		System.out.println(Arrays.toString(arr));

	}

	private static void heapSort(int[] arr) {
		int n=arr.length;
		//convert the array into max heap
		for(int i= n/2-1;i>=0;i--) {
			heapify(arr,n,i);
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i=n-1;i>=0;i--) {
		int temp=arr[0];
		arr[0]=arr[i];
		 arr[i]=temp;
		 heapify(arr,i,0);
		 System.out.println("size:"+i);
		 System.out.println(Arrays.toString(arr));
		}
		
	}

	//arr is array, n number of elements in the array, 
	//index of root of the tree the one which we want to heapify
	private static void heapify(int[] arr, int n, int i) {
		int largest=i;
		int l=2*i+1;
		int r=2*i+2;
		if(l<n && arr[l]>arr[largest] ) {
			largest=l;
		}
		if(r<n && arr[r] >arr[largest]) {
			largest=r;
		}
		if(largest!=i) {
			int temp=arr[largest];
			arr[largest]=arr[i];
			arr[i]=temp;
			heapify(arr,n,largest);
		}
		
	}

}
