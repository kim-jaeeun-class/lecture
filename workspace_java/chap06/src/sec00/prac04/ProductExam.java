package sec00.prac04;

import java.util.Scanner;

public class ProductExam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Product p = new Product();
		boolean shopping = true;
		
		while(shopping) {
			System.out.println("1. 전체 상품 출력 | 2. 카테고리별 상품 출력 | 3. 할인율 입력 | 4. 현재 할인 상품 | 5. (직원용) 상품 추가 | 0. 종료 ");
			System.out.println("원하시는 서비스 번호를 입력해주세요.");
			int choice = sc.nextInt();
			sc.nextLine(); // 오류 날까봐 넣는다...
			
			if (choice == 0) {
				System.out.println("상품 조회 서비스를 종료합니다.");
				shopping = false;
			}
			else if (choice == 1) {	// 전체 상품 출력
				p.all();
			}
			else if (choice == 2) {	// 카테고리 조건 만족 시 출력
				System.out.println("조회하고 싶은 제품의 카테고리 번호를 입력해주세요.");
				System.out.println("1. 채소 | 2. 유제품 | 3. 면/통조림류 | 4. 생활용품 | 5. 기타");
				int cNum = sc.nextInt();
				
			    if (cNum >= 1 && cNum <= 4) {	// 기존 카테고리 해당하면 출력
			        p.printByC(cNum);
			    }
			    else if (cNum == 5) {	// 기타... 근데 기타에 든 게 없다.
			        System.out.println("기타의 제품입니다.");
			        boolean found = false;  // 그... 전에 얘기 있었던 깃발. 일단 찾은 상품 없음이라 내림.

			        for (ProInfo pr : p.pro) {	// 향상된 for문 돌려서 만족하는 상품 있나 찾기
			            if (pr.category < 1 || pr.category > 4) {
			                System.out.println("상품명: " + pr.name + ", 가격: " + pr.price + ", 할인율: " + pr.rate + "%");
			                found = true;  // 기타 제품이 하나라도 있음. 깃발 들기.
			            }
			        }
			        if (!found) {	// 찾는 상품 없음. 여전히 깃발 내리기.
			            System.out.println("해당하는 기타 제품이 없습니다.");
			        }
			    }
			    else {	// 잘못 입력 시
			        System.out.println("잘못된 카테고리 번호입니다.");
			    }
			}
			else if (choice == 3) {	// 지정 할인율 이상 제품만 출력
			    System.out.println("기준이 되는 최소 할인율(%)을 입력해주세요.");
			    int inputRate = sc.nextInt();	//
			    p.printByR(inputRate);
			}
			else if (choice == 4) {	// 할인 상품만 출력
				 p.printOnlyDis();
			}
			else if (choice == 5) {	// 직원용 : 상품 추가
			    System.out.println("새로 등록할 상품의 정보를 입력해주세요.");

			    System.out.print("상품명 : ");
			    String name = sc.nextLine();

			    System.out.print("가격(소수점 입력은 불가합니다!) : ");
			    int price = sc.nextInt();

			    System.out.print("카테고리 번호 (1.채소 | 2.유제품 | 3.면/통조림류 | 4.생활용품) : ");
			    int category = sc.nextInt();

			    System.out.print("할인율(%) : ");
			    int rate = sc.nextInt();
			    sc.nextLine(); // 버퍼 비우기...

			    ProInfo newP = new ProInfo();
			    newP.name = name;
			    newP.price = price;
			    newP.category = category;
			    newP.rate = rate;

			    p.addPro(newP);
			}
			else {	// 잘못 입력 시
				System.out.println("잘못된 입력입니다.");
			}
		}
		
		sc.close();
	}

}
