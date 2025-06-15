package sec00.prac04;

import java.util.ArrayList;

public class Product {
	
//	주말 마트 할인 행사
//
//	1. 상품(Product) 클래스
//	 - 필드 : 상품명, 정가, 카테고리, 할인율(% 기준)
//	 - 메소드
//	  1) 상품들의 최종 가격(할인가) 계산
//	   (1) 단, 실제 마트처럼 1의 자리가 버림 처리된 정수 출력(예시 : 10220원(o), 10222원(x))
//	   (2) 버림 처리 되지 않은 할인 가격 계산 공식 : 가격 * (할인율 * 0.01)
//	  2) 입력된 상품 추가 데이터를 처리
//
//	2. 출력(ProductExam)
//	 - 할인 여부 관계 없이 전체 상품 출력.
//	 - 카테고리 번호(1, 2, 3)를 입력하면 해당 카테고리 번호에 맞는 제품만 출력.
//	 - 원하는 최소 할인율을 입력하면, 그 할인율 이상인 제품만 출력.
//	 - 할인하는 상품만 출력.
//	 - 상품 추가 기능 : 데이터 입력을 받아 새 상품을 목록에 추가.
//
//	3. 확인용
//	String name;
//	int price;
//	int category; // 채소를 1, 유제품을 2, 면/통조림류를 3, 생활용품을 4
//	double rate;
	
	// 필드
	ArrayList<ProInfo> pro = new ArrayList<>();
	
	// 생성자
	Product () {
		init();
	}
	
	// 메소드
	
	// 1. 기본 데이터
	
	void init() {
		ProInfo p0 = new ProInfo();
		p0.name = "애호박";
		p0.price = 990;
		p0.category = 1;
		p0.rate = 0;
		pro.add(p0);
		
		ProInfo p1 = new ProInfo();
		p1.name = "부추";
		p1.price = 1980;
		p1.category = 1;
		p1.rate = 20;
		pro.add(p1);
		
		ProInfo p2 = new ProInfo();
		p2.name = "우유팩(1+1)";
		p2.price = 5680;
		p2.category = 2;
		p2.rate = 0;
		pro.add(p2);
		
		ProInfo p3 = new ProInfo();
		p3.name = "슬라이스치즈";
		p3.price = 3980;
		p3.category = 2;
		p3.rate = 20;
		pro.add(p3);
		
		ProInfo p4 = new ProInfo();
		p4.name = "짜슐랭";
		p4.price = 5280;
		p4.category = 3;
		p4.rate = 17;
		pro.add(p4);
		
		ProInfo p5 = new ProInfo();
		p5.name = "스위트콘";
		p5.price = 1580;
		p5.category = 3;
		p5.rate = 36;
		pro.add(p5);
		
		ProInfo p6 = new ProInfo();
		p6.name = "섬유유연제";
		p6.price = 16900;
		p6.category = 4;
		p6.rate = 0;
		pro.add(p6);
		
		ProInfo p7 = new ProInfo();
		p7.name = "프리지아향제습제";
		p7.price = 13000;
		p7.category = 4;
		p7.rate = 30;
		pro.add(p7);
	}
	
	// 2. 할인가 계산 메소드
	
	int disPrice (ProInfo p) {
	    double dis = p.price * (1 - p.rate * 0.01);
	    return (int)(dis / 10) * 10;	// 1의 자리 버림용으로 나누기 곱하기하기
	}
	
	// 3. 상품 추가 메소드
	
	void addPro(ProInfo newP) {
	    for (ProInfo p : pro) {	// Emp처럼 향상된 for문 사용
	        if (p.name.equals(newP.name)) { // 이름 중복 체크하기...
	            System.out.println("상품명 " + newP.name + "은 이미 존재합니다. 추가할 수 없습니다.");
	            return;
	        }
	    }
	    pro.add(newP);	// 아니면 더해주기!
	    System.out.println("상품 " + newP.name + "이 추가되었습니다.");
	}
	
	// 4. 전체 상품 출력 메소드
	
	void all() {
		for (ProInfo p : pro) {
			System.out.print(
					"상품명 : " + p.name +
					", 가격 : " + p.price+
					", 카테고리명 : " + getCName(p.category) +
					", 할인율" + p.rate);
			System.out.println();
		}
	}
	
	// 5. 카테고리명 변환... 위 메소드에서 번호만 보이면 뭔지 모르니까. switch... 한 번은 써보자. 해보기.
	
	String getCName(int category) {	// 카테고리 번호 입력 받으면
	    switch(category) {
	        case 1: return "채소";	// 입력 번호에 따라 바꿔주기
	        case 2: return "유제품";
	        case 3: return "면/통조림류";
	        case 4: return "생활용품";
	        default: return "기타";	// default... 잘못 입력했습니다 하고 싶지만... 고민.
	    }
	}
	
	// 6. 카테고리별 출력 메소드
	
	void printByC(int category) {
	    System.out.println(getCName(category) + "의 제품입니다.");
	    for (ProInfo p : pro) {
	        if (p.category == category) {
	            System.out.print(
	                "상품명 : " + p.name +
	                ", 가격 : " + p.price +
	                ", 할인율 : " + p.rate + "%"
	            );
	            System.out.println();
	        }
	    }
	}
	
	// 7. 입력한 할인율 이상 상품 출력 메소드
	
	void printByR(int minRate) {
	    System.out.println("할인율 " + minRate + "% 이상인 상품 목록입니다.");
	    boolean found = false;	// 깃발... 현재 할인율 이상인 상품 없음.
	    for (ProInfo p : pro) {	// 향상된 for문으로 반복하며 할인율 조건 만족하는 상품 찾기.
	        if (p.rate >= minRate) {	// 찾으면 출력하고
	            System.out.println("상품명: " + p.name +
	                               ", 가격: " + p.price +
	                               ", 카테고리: " + getCName(p.category) +
	                               ", 할인율: " + p.rate + "%");
	            found = true;	// 깃발 들기
	        }
	    }
	    if (!found) {	// 없으면 깃발 내린 채로 있기
	        System.out.println("해당하는 할인 상품이 없습니다.");
	    }
	}
	
	// 8. 할인 상품만 출력 메소드

	void printOnlyDis() {
	    System.out.println("할인 중인 상품 목록입니다.");
	    boolean found = false;	// 깃발!! 많이 쓴다...

	    for (ProInfo p : pro) {	// 향상 for문으로 찾기!
	        if (p.rate > 0) {	// 할인율이 0 초과일 떄 작동되도록...
	            System.out.println("상품명: " + p.name +
	                               ", 정가: " + p.price +
	                               ", 할인가: " + disPrice(p) +
	                               ", 카테고리: " + getCName(p.category) +
	                               ", 할인율: " + p.rate + "%");
	            found = true;
	        }
	    }
	    if (!found) {	// 일단 지금은 할인 중인 품목 넣어놨지만 혹시 모르니까...
	        System.out.println("현재 할인 중인 상품이 없습니다.");
	    }
	}
	
}
