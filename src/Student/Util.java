package Student;

import java.util.Scanner;

public class Util {
	static  Scanner sc = new Scanner(System.in);
	
	public static int numberCheck() {

		if (sc.hasNextInt()) {
			return sc.nextInt();

		} else {
			sc.nextLine(); // 버퍼 비우기
			return -1;
		}

	}

	
}
