package forTest;

import java.util.ArrayList;

public class Cafe {
    ArrayList<CafeInfo> cafe = new ArrayList<>();
    ArrayList<CafeInfo> buy = new ArrayList<>();

    Cafe() {
        init();
    }

    void init() {
        CafeInfo cafe0 = new CafeInfo();
        cafe0.menu = "커피";
        cafe0.price = 2000;

        CafeInfo cafe1 = new CafeInfo();
        cafe1.menu = "아이스티";
        cafe1.price = 2000;

        CafeInfo cafe2 = new CafeInfo();
        cafe2.menu = "조각케이크";
        cafe2.price = 5000;

        cafe.add(cafe0);
        cafe.add(cafe1);
        cafe.add(cafe2);
    }

    void addList(CafeInfo newC) {
        buy.add(newC);
    }

    void all() {
        System.out.println("[전체 메뉴]");
        for (CafeInfo c : cafe) {
            System.out.println("메뉴: " + c.menu + ", 가격: " + c.price + "원");
        }
    }

    void showCart() {
        System.out.println("[장바구니 목록]");
        if (buy.isEmpty()) {
            System.out.println("장바구니가 비어 있습니다.");
        } else {
            for (CafeInfo c : buy) {
                System.out.println("메뉴: " + c.menu + ", 가격: " + c.price + "원");
            }
        }
    }
}
