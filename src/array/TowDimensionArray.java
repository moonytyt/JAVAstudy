package array;

public class TowDimensionArray {

	public static void main(String[] args) {

		int[][] arr = {{1,2,3},{4,5,6}};
		
		//arr.length는 행의 길이
		for(int i = 0; i<arr.length;i++){
			//arr[i].length는 열의 길이
			for(int j = 0; j< arr[i].length;j++){
				System.out.println(arr[i][j]);
			}
		}
	}

}
