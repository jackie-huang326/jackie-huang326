package likou1;

public class LC1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int [] array = new int[]{0,0,1,1,1,2,2,2,2,3,3,3,3,3};
	
	int i = 1;
	int j = 1;
	int n = array.length;
	while(i<n) {
		if(array[i] != array[i - 1]) {
			array[j] = array[i];
			j ++;
		}
	i++;
	}
	for(int a = 0; a < j; a++) {
		System.out.println(array[a]);
	}
	}


}
