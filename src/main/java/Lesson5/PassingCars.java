package Lesson5;

public class PassingCars {
	public int getCount(int[] A){
		int carsGoingEast = 0;
		int result = 0;
		for(int a : A) {
			if(a==0) {
				carsGoingEast++;
			}else {
				result+=carsGoingEast;
			}

			if(result > 1000000000) {
				return -1;
			}
		}

		return result;
	}
}
