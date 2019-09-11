public class BinaryIterativeSearch implements Practice03Search{
	public String searchName(){
		String s = "binary iterative search";
		return s;

	}
	public int search(int[] arr , int target){
		int start = 0;
		int end = arr.length -1;

		while(start<= end){
			int middle = (start+end)/2;
			if(target<arr[middle]){
				end = middle-1;
			}
			if(target>arr[middle]){
				start =middle+1;
			}
			if(target == arr[middle]){
				return middle;
			}
		}
		return -1;
	}
}