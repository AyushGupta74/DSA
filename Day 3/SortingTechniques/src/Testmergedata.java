import java.util.Arrays;

public class Testmergedata {
	public static void main(String[] args) {
		int[] arr1= {5,7,10,12,30};
		int[] arr2= {8,9,10,12,15,18,35,45};
		int[] arr3=new int[arr1.length+arr2.length];
		merge(arr1,arr2,arr3);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}

	private static void merge(int[] arr1, int[] arr2, int[] arr3) {
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				arr3[k]=arr1[i];
				i++;
				k++;
			}else {
				arr3[k]=arr2[j];
				j++;
				k++;
			}
		}
		while(i<arr1.length) {
			arr3[k]=arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			arr3[k]=arr2[j];
			j++;
			k++;
		}
		
		
	}

}
