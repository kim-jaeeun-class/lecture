package sec01.exam01;

public class ArrayPrac02 {

	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		int countTF = 0;
		
		
		lotto[0] = (int) (Math.random() * 45) + 1;
		
		while(countTF < 6) {
			boolean TF = false;
			int num = (int) (Math.random() * 45) + 1;
			
			for(int i1 = 0; i1 < countTF; i1++) {
				
				if(lotto[i1] == num) {
					TF = true;
					break;
				}
					
				if(!TF) {
					lotto[countTF] = num;
					countTF++;
				}
			}
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.println(":: " + lotto[i]);
		}

	}

}
