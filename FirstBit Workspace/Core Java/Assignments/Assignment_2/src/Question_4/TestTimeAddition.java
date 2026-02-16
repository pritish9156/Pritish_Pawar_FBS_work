package Question_4;

import java.util.Scanner;

class Time{
	int hr, min, sec;
	
	public Time() {
		this.hr = 0;
		this.min = 0;
		this.sec = 0;
	}
	
	Time(int hr, int min, int sec) {
		this.hr = hr;
		this.min = min;
		this.sec = sec;
	}

	int getHr() {
		return hr;
	}

	void setHr(int hr) {
		this.hr = hr;
	}

	int getMin() {
		return min;
	}

	void setMin(int min) {
		this.min = min;
	}

	int getSec() {
		return sec;
	}

	void setSec(int sec) {
		this.sec = sec;
	}
	
	//methods for time addition
	
	Time add(Time t1, Time t2) {
		Time timeAddition = new Time();
		
		timeAddition.sec = t1.sec + t2.sec;
		timeAddition.min = t1.min + t2.min;
		timeAddition.hr = t1.hr + t2.hr;
		
		if(timeAddition.sec >= 60) {
			timeAddition.min += timeAddition.sec / 60;
			timeAddition.sec %= 60; 
		}
		
		if(timeAddition.min >= 60) {
			timeAddition.hr += timeAddition.min / 60;
			timeAddition.min %= 60; 
		}
		
		if(timeAddition.hr >= 24) {
			timeAddition.hr %= 24; 
		}
		
		return timeAddition;
	}
	
	Time add(Time t1, int t, boolean isHrs, boolean isMin, boolean isSec) {
		
		Time timeAddition = new Time(t1.hr, t1.min, t1.sec);
		
		if(isHrs == true)
			timeAddition.hr += t;
			
		if(isMin == true)
			timeAddition.min += t;
		
		if(isSec == true)
			timeAddition.sec += t;
		
		
		
		if(timeAddition.sec >= 60) {
			timeAddition.min += timeAddition.sec / 60;
			timeAddition.sec %= 60; 
		}
		
		if(timeAddition.min >= 60) {
			timeAddition.hr += timeAddition.min / 60;
			timeAddition.min %= 60; 
		}
		
		if(timeAddition.hr >= 24) {
			timeAddition.hr %= 24; 
		}
		
		return timeAddition;
	}
	
}

public class TestTimeAddition {

	public static void main(String[] args) {
		
		Time t1 = new Time(10, 10, 10);
		Time t2 = new Time(10, 10, 10);
		Time addResult = new Time();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Add two Time objects " + "\n2. Add a Time object and an integer" );
		System.out.println("Enter Your Choice: ");
		int choice = sc.nextInt();
		
		switch(choice) {
		
			case 1:
				addResult = addResult.add(t1, t2);		
				System.out.println("\nResult: " + addResult.hr +"hrs : " + addResult.min + "min : " + addResult.sec + "sec");
				break;
				
			case 2:
				addResult = addResult.add(t1, 20, false, false, true);
				System.out.println("\nResult: " + addResult.hr +"hrs : " + addResult.min + "min : " + addResult.sec + "sec");
				break;
		}
		
		sc.close();

	}

}
