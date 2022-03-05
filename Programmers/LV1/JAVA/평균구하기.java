package Programmers.level1;

public class 평균구하기 {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		
		   double answer = 0;
	        
	        int len = arr.length;
	        for(int i=0; i<len; i++){
	            answer += arr[i];
	        }
	        
	        answer = answer / len;
	            
	}

}
