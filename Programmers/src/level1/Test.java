package level1;

public class Test {
	public static void main(String[] args) {
	 int[][] arr1=  {{1,2},{3,4}};
	 int[][] arr2= {{3,4},{5,6}};
	 int[][] answer=new int[2][2];
	 
	 for(int i=0;i<arr1.length;i++) {
		 for(int j=0;j<arr1[i].length;j++) {
			answer[i][j]= arr1[i][j]+arr2[i][j];
			System.out.println(answer[i][j]);
		 }
	 }
	 
	
	}

}
