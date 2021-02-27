package Lesson5;

public class PassingCars {
	public int solution(int[] A){
		int increment = 0;
		int result = 0;
		for(int a : A) {
			if(a==0) {
				increment++;
			}else {
				result+=increment;
			}

			if(result > 1000000000) {
				return -1;
			}
		}

		return result;
	}
}
