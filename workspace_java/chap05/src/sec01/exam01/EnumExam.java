package sec01.exam01;

public class EnumExam {

	public static void main(String[] args) {
		Week week;
		Week month= Week.월;

		if (month == Week.월) {
			System.out.println("월요일");
		}
		else if (month == Week.화) {
			System.out.println("화요일");
		}

	}

}
