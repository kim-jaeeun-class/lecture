package forTest;

import java.util.Scanner;

public class CafeExam {
    public static void main(String[] args) {
        System.out.println("00카페입니다.");
        Scanner sc = new Scanner(System.in);
        Cafe cafe = new Cafe();

        while (true) {
            System.out.println("\n원하시는 메뉴를 골라주세요.");
            System.out.println("1. 커피 | 2. 아이스티 | 3. 조각케이크 | 4. 전체 메뉴 | 5. 장바구니 목록 | 0. 주문 종료");

            int menu = sc.nextInt();

            if (menu == 1) {
                System.out.println("커피를 준비하겠습니다.");
                while (true) {
                    System.out.println("원하시는 커피의 종류를 골라주세요.");
                    System.out.println("1. 아메리카노 | 2. 카페라떼 | 0. 이전");

                    int coffee = sc.nextInt();
                    CafeInfo newC = new CafeInfo();

                    if (coffee == 1) {
                        newC.menu = "아메리카노";
                        newC.price = 2000;
                        cafe.addList(newC);
                        System.out.println("아메리카노를 장바구니에 담았습니다.");
                        break;
                    } else if (coffee == 2) {
                        newC.menu = "카페라떼";
                        newC.price = 2500;
                        cafe.addList(newC);
                        System.out.println("카페라떼를 장바구니에 담았습니다.");
                        break;
                    } else if (coffee == 0) {
                        System.out.println("커피 선택을 종료합니다.");
                        break;
                    } else {
                        System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                    }
                }
            } else if (menu == 2) {
                CafeInfo newC = new CafeInfo();
                newC.menu = "아이스티";
                newC.price = 2000;
                cafe.addList(newC);
                System.out.println("아이스티를 장바구니에 담았습니다.");
            } else if (menu == 3) {
                CafeInfo newC = new CafeInfo();
                newC.menu = "조각케이크";
                newC.price = 4000;
                cafe.addList(newC);
                System.out.println("조각케이크를 장바구니에 담았습니다.");
            } else if (menu == 4) {
                cafe.all();
            } else if (menu == 5) {
                cafe.showCart();
            } else if (menu == 0) {
                System.out.println("주문을 종료합니다. 감사합니다.");
                break;
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }

        sc.close();
    }
}
