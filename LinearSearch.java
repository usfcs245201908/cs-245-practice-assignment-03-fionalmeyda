public class LinearSearch implements Practice03Search{
	public String searchName(){
		String s = "Linear search";
		return s;

	}
	public int search(int arr[], int x){
		for(int i = 0; i<arr.length;i++){
			if(arr[i]==x){
				return i;
			}
			
		}
		return -1;

	}
}