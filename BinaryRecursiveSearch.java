public class BinaryRecursiveSearch implements Practice03Search{
	int start;
	int end;
	public String searchName(){
		String s = " Binary Recursive search";
		return s;

	}
	public int search(int[] arr , int target){
		
		int middle=(start+end)/2;
		if(end<start){
			return -1;
		}
		if(target<arr[middle]){
			
			return search(arr,target) + middle-1;
		}
		if(target>arr[middle]){
			return search(arr,target)+ middle+1;
		}
		if(target==arr[middle]){
			return middle;
		}
		return -1;

	}
}