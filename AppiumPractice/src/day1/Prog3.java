package day1;

public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day = 22;
		switch (day) {
		case 1: {
			System.out.println("Monday");
			break;
		}
		case 2: {
			System.out.println("Tuesday");
			break;
		}
		case 3: {
			System.out.println("Wed");
			break;
		}
		case 4: {
			System.out.println("Thur");
			break;
		}
		case 5: {
			System.out.println("Friday");
			break;
		}
		case 6: {
			System.out.println("Sat");
			break;
		}
		case 7: {
			System.out.println("Sun");
			break;
		}
		
		default:
			System.out.println("Please select the proper day");
			throw new IllegalArgumentException("Unexpected value: " + day);
		}
	}
}
