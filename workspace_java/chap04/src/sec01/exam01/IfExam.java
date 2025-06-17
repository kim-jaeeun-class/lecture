package sec01.exam01;

public class IfExam {

	public static void main(String[] args) {
		{
			{
				int score = 93;
				System.out.print("IF는 ");
				
				if (score >= 90) {
					System.out.println("점수가 90보다 큽니다.");
					System.out.println("A등급");
				}
				
				if (score < 90) {
					System.out.println("점수가 90보다 작습니다.");
					System.out.println("B등급");
				}
			}
			
			{
				int score = 74;
				System.out.print("ELSE는 ");
				
				if (score >= 90) {
					System.out.println("점수가 90보다 큽니다.");
					System.out.println("A등급");
				}
				
				else {
					System.out.println("점수가 90보다 작습니다.");
					System.out.println("B등급");
				}
			}
			
			{
				int score = 69;
				System.out.print("ELSE IF는 ");
				
				if (score >= 90) {
					System.out.println("점수가 90점보다 큽니다.");
					System.out.println("A등급");
				}
				
				else if(score >= 80) { // if 블럭에서 score가 90 이상인 경우는 이미 제거됨. !(score >= 90) && (score >=80)과 동일.
					System.out.println("점수가 80~89점입니다.");
					System.out.println("B등급");
				}
				
				else if(score >= 70) {
					System.out.println("점수가 70~79점입니다.");
					System.out.println("C등급");
				}
				
				else {
					System.out.println("점수가 70점보다 작습니다.");
					System.out.println("D등급");
				}
			}
			
			
		}
		
		{ // 위쪽 else if 참고용
			int score = 91;
			boolean a = (!(score >= 90) && (score >=80));
			System.out.println("ELSE IF 참고 : " + a);
		}
		
		{
			int score = 95;
			System.out.print("IF in IF는 ");
			
			if (score >= 90) {
				System.out.print("90점 이상");
				if (score >= 95) {
					System.out.println("이고, 95점 이상이기도 하다.");
				}
			}
		}
		
		{ // 홀짝 판단 if문
			int x = 3;
			if (x%2 == 0) {
				System.out.println("짝수");
			}
			else { // else if로 !=0이나 == 1로 써도 됨.
				System.out.println("홀수");
			}
		}
		
		{
			double ran1 = Math.random();
			System.out.println(ran1);
			System.out.printf("%.5f \n", ran1);
			
			int dice = (int) (Math.random() * 5) + 1; // +1하는 이유 : 0이 나올 수도 있음.
			System.out.println("dice : " + dice);
			
			int num = (int) (Math.random() * 45) + 1;
			int num2 = ((int) (Math.random() * 10000)) % 45 + 1;
			System.out.println("lotto1 : " + num);
			System.out.println("lotto2 : " + num2);
		}
		
		{
			int dice = (int) (Math.random() * 5) + 1;
			
			if (dice == 1) {
				System.out.println("1번이 나왔습니다.");
			}
			else if(dice == 2) {
				System.out.println("2번이 나왔습니다.");
			}
			else if(dice == 3) {
				System.out.println("3번이 나왔습니다.");
			}
			else if(dice == 4) {
				System.out.println("4번이 나왔습니다.");
			}
			else if(dice == 5) {
				System.out.println("5번이 나왔습니다.");
			}
			else {
				System.out.println("6번이 나왔습니다.");
			}
		}
		
		{
			int dice = (int) (Math.random() * 5) + 1;
			switch(dice) {
				case 1 :
					System.out.println("1번이 나왔습니다.");
					break;
				case 2 :
					System.out.println("2번이 나왔습니다.");
					break;
				case 3 :
					System.out.println("3번이 나왔습니다.");
					break;
				case 4 :
					System.out.println("4번이 나왔습니다.");
					break;
				case 5 :
					System.out.println("5번이 나왔습니다.");
					break;
				default :
					System.out.println("6번이 나왔습니다.");
				}
			}
		
		{
			int num = 1;
			if ( num == 1 ) {
				System.out.println("num은 1입니다.");
			}
			else if ( num == 2 ) {
				System.out.println("num은 2입니다.");
			}
			else {
				System.out.println("num은 1과 2가 아닙니다.");
			}
			
			switch(num) {
			case 1 :
				System.out.println("num은 1입니다.");
				break;
			case 2 :
				System.out.println("num은 2입니다.");
				break;
			default :
				System.out.println("num은 1과 2가 아닙니다.");
				break;
			}
		}
		
		{
			// 여기서 계절은 3월부터 3개월씩으로 잡기.
			int month = 13;
			
			if ( month < 1 || month >12 ) {
				System.out.println("Not Valid Value");
			}			
			else if (month >= 3 && month <= 5) {
				System.out.println("Season : Spring");
			}
			else if (month >= 6 && month <= 8) {
				System.out.println("Season : Summer");
			}
			else if (month >= 9 && month <= 11) {
				System.out.println("Season : Fall");
			}
			else {
				System.out.println("Season : Winter");
			}
			
			// 위 코드를 switch를 쓰면... case 값에 해당 안 되면 어차피 통과되니 이렇게 사용 가능.
			// 가독성을 위해 사용하는 경우.
			
			switch(month) {
			case 3 : 
			case 4 : 
			case 5 : 
				System.out.println("Season : Spring");
				break;
				
			case 6 : 
			case 7 : 
			case 8 : 
				System.out.println("Season : Summer");
				break;
				
			case 9 : 
			case 10 :
			case 11 : 
				System.out.println("Season : Fall");
				break;
				
			case 12 : 
			case 1 : 
			case 2 : 
				System.out.println("Season : Winter");
				break;
			
			default :
				System.out.println("Not Valid Value");
				break;
			}
			
		}
			
		} // public 블럭
		
	}
