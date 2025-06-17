package sec05.prac02.quiz;

import java.util.Scanner;

public class EmpExam {
    public static void main(String[] args) {
    	
    	// 하...... 내가 해냈다. 위대한 인간승리의 역사.
    	
        Scanner sc = new Scanner(System.in);
        EmpTable empTable = new EmpTable();
        boolean work = true;
        
        while(work) {
            System.out.println("1. 조회 2. 새 사원 정보 입력 3. 사원 정보 수정 0. 종료");
            System.out.print("번호 입력: ");
            int choice = sc.nextInt();
            sc.nextLine();  // 오류 안 나게!
            
            if (choice == 0) {
                System.out.println("프로그램 종료");
                work = false;  // 종료
            } 
            else if (choice == 1) { // 조회
                while(true) {
                    System.out.println("조회 메뉴 :");
                    System.out.println("1. 전체 조회");
                    System.out.println("2. 상사 번호로 조회");
                    System.out.println("3. 급여 이상으로 조회");
                    System.out.println("4. 부서 번호로 조회");
                    System.out.println("0. 이전 메뉴로 돌아가기");
                    System.out.print("조회 번호 입력 : ");
                    int searchChoice = sc.nextInt();
                    sc.nextLine();

                    if (searchChoice == 0) {
                        break; // 조회 메뉴 종료, 메인 메뉴로 돌아감
                    }
                    else if (searchChoice == 1) {
                        empTable.all();
                    }
                    else if (searchChoice == 2) {
                        System.out.print("상사 번호 입력 : ");
                        int mgrNo = sc.nextInt();
                        sc.nextLine();
                        System.out.println("상사 번호 " + mgrNo + "인 사원 목록");
                        empTable.mgrSearch(mgrNo);
                    }
                    else if (searchChoice == 3) {
                        System.out.print("최소 급여 입력 : ");
                        int minSal = sc.nextInt();
                        sc.nextLine();
                        System.out.println("급여 " + minSal + " 이상 사원 목록");
                        empTable.salSearch(minSal);
                    }
                    else if (searchChoice == 4) {  // 부서 번호 조회 추가 부분
                        System.out.print("부서 번호 입력: ");
                        int deptNo = sc.nextInt();
                        sc.nextLine();
                        System.out.println("부서 번호 " + deptNo + " 사원 목록");
                        empTable.deptNoSearch(deptNo);
                    }
                    else {
                        System.out.println("잘못된 입력입니다.");
                    }
                }
            }
            else if (choice == 2) {
                // 새 사원 정보 입력... 이게 맞나??????? 일단 전체 출력으로 체크하면 됐다고 뜨긴 하는데... Table에 변경이 없어서???
                Emp newEmp = new Emp();

                System.out.print("사원 번호 입력: ");
                newEmp.empno = sc.nextInt();
                sc.nextLine(); // 또 오류나... 넣어둠.

                System.out.print("사원명 입력: ");
                newEmp.ename = sc.nextLine();

                System.out.print("직책명 입력: ");
                newEmp.job = sc.nextLine();

                System.out.print("상사 사원 번호 입력: ");
                newEmp.mgr = sc.nextInt();
                sc.nextLine(); // 이하동문.

                System.out.print("급여 입력: ");
                newEmp.sal = sc.nextInt();
                sc.nextLine(); // 이하동문.

                System.out.print("추가금 입력 (없으면 0으로): ");
                int commIn = sc.nextInt();
                newEmp.comm = commIn;
                

                System.out.print("부서 번호 입력: ");
                newEmp.deptno = sc.nextInt();
                sc.nextLine(); // 이하동문.

                // 사원 추가
                empTable.addEmp(newEmp);
            }
            else if (choice == 3) {
                System.out.println("수정할 사원 번호 입력 : ");
                int empno = sc.nextInt();
                sc.nextLine();

                System.out.print("새 직책명 : ");
                String newJob = sc.nextLine();

                System.out.print("새 상사 사원 번호 : ");
                int newMgr = sc.nextInt();
                sc.nextLine();

                System.out.print("새 급여 : ");
                int newSal = sc.nextInt();
                sc.nextLine();

                System.out.print("새 추가금 : ");
                int newComm = sc.nextInt();
                sc.nextLine();

                System.out.print("새 부서 번호 : ");
                int newDeptNo = sc.nextInt();
                sc.nextLine();

                empTable.upE(empno, newJob, newMgr, newSal, newComm, newDeptNo);
            }
            else {
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            }
        }

        sc.close();
    }
}
