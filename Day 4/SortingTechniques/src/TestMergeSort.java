import java.util.Arrays;

public class TestMergeSort {

	public static void main(String[] args) {
       int[] arr= {65,35,26,13,23,12,91};
		System.out.println("Given array :");
		System.out.println(Arrays.toString(arr));
		//pass start, and end as last index position
		mergesort(arr,0,arr.length-1);
		System.out.println("sorted Array : ");
		System.out.println(Arrays.toString(arr));

	}

	private static void mergesort(int[] arr, int start, int end) {
		if(start<end) {
			int mid=(start+end)/2;
			mergesort(arr,start,mid);  //generate left tree
			mergesort(arr,mid+1,end);  //generate right iteratiron
			merge(arr,start,end,mid); //merge 2 sorted array
			
		}
		
	}

	private static void merge(int[] arr, int start, int end, int mid) {
		int i,j,k;
		int n1=mid-start+1; //size of left array
		int n2=end-mid;     //size of rigth array
		/*generate tempary array*/
		int[] leftarr=new int[n1];
		int[] rightarr=new int[n2];
		for(i=0;i<n1;i++) {
			leftarr[i]=arr[start+i];
		}
		for(i=0;i<n2;i++) {
			rightarr[i]=arr[mid+1+i];
		}
		i=0;
		j=0;
		k=start;
		
		while(i<n1 && j<n2) {
			if(leftarr[i]<rightarr[j]) {
				arr[k]=leftarr[i];
				i++;
				k++;
			}else {
				arr[k]=rightarr[j];
				j++;
				k++;
			}
		}
		while(i<n1) {
			arr[k]=leftarr[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=rightarr[j];
			j++;
			k++;
		}
		System.out.println("start :"+start+" end : "+end+" mid :"+mid);
		System.out.println(Arrays.toString(arr));
		
	}

}
