package sec05.prac02.quiz;

import java.util.ArrayList;

public class EmpTable {
	
    ArrayList<Emp> empT = new ArrayList<>(); // ArrayList 써보기
	
//	int empno; 확인용
//	String ename;
//	String job;
//	int mgr;
//	int sal;
//	int comm;
//	int deptno;
	
	/* 생성자 */
	EmpTable () {
		init();
	}
	
	/* 메소드 */
	
	// 기본 데이터
	void init () {
        Emp e0 = new Emp();
        e0.empno = 7369;
        e0.ename = "SMITH";
        e0.job = "CLERK";
        e0.mgr = 7902;
        e0.sal = 800;
        e0.comm = 0;	// 계산 편의상... null값 대신 0으로. (Integer로 쓸 수 있음)
        e0.deptno = 20;
        empT.add(e0);

        Emp e1 = new Emp();
        e1.empno = 7499;
        e1.ename = "ALLEN";
        e1.job = "SALESMAN";
        e1.mgr = 7698;
        e1.sal = 1600;
        e1.comm = 300;
        e1.deptno = 30;
        empT.add(e1);
		
        Emp e2 = new Emp();
        e2.empno = 7521;
        e2.ename = "WARD";
        e2.job = "SALESMAN";
        e2.mgr = 7698;
        e2.sal = 1250;
        e2.comm = 500;
        e2.deptno = 30;
        empT.add(e2);

        Emp e3 = new Emp();
        e3.empno = 7566;
        e3.ename = "JONES";
        e3.job = "MANAGER";
        e3.mgr = 7839;
        e3.sal = 2975;
        e3.comm = 0;
        e3.deptno = 20;
        empT.add(e3);

        Emp e4 = new Emp();
        e4.empno = 7698;
        e4.ename = "BLAKE";
        e4.job = "MANAGER";
        e4.mgr = 7839;
        e4.sal = 2850;
        e4.comm = 0;
        e4.deptno = 30;
        empT.add(e4);
	}
	
	// 사원 추가... 이게 CRUD의 C인 듯. create니까.
    void addEmp(Emp newE) { // 추가하려면 사원 번호만이 아니라 다 넣어야 하는데... 이런 식의 객체 추가? 도? 되나??? 일단 넣어봤는데 오류 안 뜬다.
        for (Emp e : empT) {	// 같은 번호에 여러 명 추가 불가해두기
            if (e.empno == newE.empno) {
                System.out.println("사번 " + newE.empno + "은 이미 존재합니다. 추가할 수 없습니다.");
                return; // 중복이므로 추가 X
            }
        }
        empT.add(newE);
        System.out.println("사번 " + newE.empno + " 직원이 추가되었습니다.");
    }
    
    // 전체 사원 목록 : SELECT * FROM EMP; 같은 거. CRUD의 R.
    void all() {
        for(Emp e : empT) {	// 향상된 for문
            System.out.println("사원 번호 : " + e.empno);
            System.out.println("사원명 : " + e.ename);
            System.out.println("직책명 : " + e.job);
            System.out.println("상사 사원 번호 : " + e.mgr);
            System.out.println("급여 : " + e.sal);
            System.out.println("추가금 : " + e.comm);
            System.out.println("부서 번호 : " + e.deptno);
        }
    }
    
    // 부서 번호가 입력값과 같은 사람만 조회. CRUD의 R.
    void deptNoSearch(int deptNo) {
        for (Emp e : empT) {	// 향상된 for문
            if (e.deptno == deptNo) {
                System.out.println("사원 번호 : " + e.empno);
                System.out.println("사원명 : " + e.ename);
                System.out.println("직책명 : " + e.job);
                System.out.println("상사 사원 번호 : " + e.mgr);
                System.out.println("급여 : " + e.sal);
                System.out.println("추가금 : " + e.comm);
                System.out.println("부서 번호 : " + e.deptno);
                System.out.println("------------");
            }
        }
    }
    
    // 급여가 입력값 이상인 사람만 조회. CRUD의 R.
    
    void salSearch(int minS) {
        for (Emp e : empT) {
            if (e.sal >= minS) {	// 입력값으로 조건 설정
                System.out.println("사원 번호 : " + e.empno);
                System.out.println("사원명 : " + e.ename);
                System.out.println("직책명 : " + e.job);
                System.out.println("상사 사원 번호 : " + e.mgr);
                System.out.println("급여 : " + e.sal);
                System.out.println("추가금 : " + e.comm);
                System.out.println("부서 번호 : " + e.deptno);
                System.out.println("------------");
            }
        }
    }
    
 // 상사 번호가 입력값과 같은 직원만 조회. CRUD의 C.
    void mgrSearch(int mgrNo) {
        boolean found = false;
        for (Emp e : empT) {
            if (e.mgr == mgrNo) {	// 같은 사람 있으면 출력하고 true로 바꿔주기.
                System.out.println("사원 번호 : " + e.empno);
                System.out.println("사원명 : " + e.ename);
                System.out.println("직책명 : " + e.job);
                System.out.println("상사 사원 번호 : " + e.mgr);
                System.out.println("급여 : " + e.sal);
                System.out.println("추가금 : " + e.comm);
                System.out.println("부서 번호 : " + e.deptno);
                System.out.println("------------");
                found = true;
            }
        }
        if (!found) {	// 없으면 false가 안 바뀔 테니까 없다고 표시 가능.
            System.out.println(mgrNo + "번 상사 번호와 일치하는 직원이 없습니다.");
        }
    }
    
    // 특정 직원 정보 수정. empno로 찾기. CRUD의 U(update).
    
    void upE(int empno, String newJob, int newMgr, int newSal, int newComm, int newDeptNo) {
        for (Emp e : empT) {
            if (e.empno == empno) {
                e.job = newJob;
                e.mgr = newMgr;
                e.sal = newSal;
                e.comm = newComm;
                e.deptno = newDeptNo;
                System.out.println(empno + "번 사원의 정보가 수정되었습니다.");
                return;
            }
        }
        System.out.println(empno + "번 사원을 찾을 수 없습니다.");
    }
    
    // 특정 직원 정보 삭제. empno 기준으로. CRUD의 D(delete).
//    void delE(int empno) {
//        for (int i = 0; i < empT.size(); i++) {	// arraylist 크기 확인 .size로 진행. 노션 확인하기.
//            if (empT.get(i).empno == empno) {
// 					* 이 자리에 삭제하는 걸 넣으면 되는데... arraylist 삭제 관련해서... 배웠던가...?????
//               System.out.println(empno + "번 사원이 삭제되었습니다.");
//                return;
//            }
//        }
//        System.out.println(empno + "번 사원을 찾을 수 없습니다.");
//    }
	
}
