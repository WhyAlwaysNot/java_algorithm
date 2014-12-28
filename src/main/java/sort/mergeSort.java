package sort;

public class mergeSort {

	private static void sort(int nums[],int left,int right){
		
		int mid = (left+right)/2;
		if(left<right){
			sort(nums,left,mid);
			sort(nums,mid+1,right);
			merge(nums,left,mid,right);
		}
	}
	
	private static void merge(int[] nums,int left,int mid,int right){
		int[] temp =  new int[right-left+1];
		int i=left;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=right){
			if(nums[i]<nums[j]){
				temp[k++]=nums[i++];
			}else{
				temp[k++]=nums[j++];
			}
		}
		while(i<=mid){
			temp[k++]=nums[i++];
		}
		while(j<=right){
			temp[k++]=nums[j++];
		}
		for(int p=0;p<temp.length;p++){
			nums[left+p] = temp[p];
		}
	}
	
	public static void main(String[] args) {

		int[] nums = new int[100];
		for(int i=0;i<nums.length;i++){
			int num = (int) (Math.random()*1000);
			nums[i]=num;
			System.out.print(num+" ");
		}
		System.out.println();
		sort(nums,0,nums.length-1);
		
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]+" ");
		}
	}

}
