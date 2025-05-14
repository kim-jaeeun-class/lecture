/* 250512 수업 */

select * from emp;
select * from dept;
select * from salgrade;

select empno, ename, deptno from emp;
select ename, sal from emp;

select sal, ename, 123 from emp;
select sal, ename, 123, 'a' from emp;

select deptno from emp;

select distinct deptno from emp;
select distinct job, deptno from emp;
select /* distinct */ job, deptno from emp;

select ename, sal, sal*12+comm, comm from emp;

select ename, sal, sal*12+comm s, comm from emp;
select ename, sal, sal*12+comm as s, comm from emp;
select ename, sal, sal*12+comm as "s s", comm from emp;
select ename, sal, sal*12+comm as "s s", comm 추가수당 from emp;

select sal, sal*10 from emp;



/* 250513 수업 */
select * from emp;
select * from emp order by sal;

select * from emp order by sal asc; --sal 기준 오름차순(1>10)
select * from emp order by sal desc; --sal 기준 내림차순(10>1)

select * from emp order by hiredate; --가장 먼저 입사한 순
select * from emp order by ename desc; --이름 역순

select * from emp order by deptno asc, sal desc;
select * from emp order by deptno asc, sal desc, empno desc;

/* 250513 - 오후 시간대 진행(조퇴 부분) */
select * from emp where deptno = 30; -- WHERE절

select * from emp where deptno = 30 order by sal; -- order by 절보다 앞에

select * from emp where sal = 1600;
select * from emp where sal >= 1600;
select * from emp where  sal <=1600; -- 초과, 미만일 때는 = 제거

select * from emp where deptno != 30; -- !=는 <>와 같은 의미

select * from emp where deptno = 30 and job = 'SALESMAN'; -- 둘 다 만족
select * from emp where deptno = 30 or job = 'CLERK';

select * from emp where job='CLERK' or (sal>2000 and deptno = 10);
select * from emp where sal >= 2000 and sal <4000; -- 일반 수학 비교처럼 'n<칼럼명<m'으로 쓰면 오류가 뜨는 듯
select * from emp where deptno = 10 or deptno = 20;

select * from emp where deptno in (10, 20);
select * from emp where deptno not in (10, 20); --앞에 not을 붙여 부정으로



/* 250514 - 퀴즈(복습) */
select * from emp; -- 테이블 확인용

-- 1. 부서번호 10번인 사람들을 출력 (O)
select * from emp where deptno = 10;

-- 2. 부서번호 10번이 아닌 사람들을 출력 (O)
select * from emp where not (deptno = 10); 
select * from emp where deptno != 10;

-- 3. 급여가 3000 이상인 사람들을 출력 (O)
select * from emp where sal>=3000; 

-- 4. 급여가 1500~3000 사이(포함)의 사람을 출력 (O)
select * from emp where sal>=1500 and sal<=3000; 
select * from emp where sal between 1500 and 3000; -- 사용 제한이 있는 언어가 있음

-- 5. 부서번호 10번인 사람 중 급여 2000 이상인 사람을 출력 (O)
select * from emp where deptno = 10 and sal >=2000; 

-- 6. 부서번호 30번 중 1500~3000 사이(미포함)인 사람을 출력 (O)
select * from emp where deptno = 30 and (sal > 1500 and sal < 3000); 

-- 7. 부서번호 30번 중 1500~3000 사이(미포함)인 사람을 연봉이 작은 순으로 출력, 연봉이 같은 경우 이름이 빠른 순으로 출력 (O)
select * from emp where deptno = 30 and (sal > 1500 and sal < 3000) order by sal asc, ename asc; 

-- 8. 부서번호 20,30번 중 1500~3000 사이(미포함)인 사람을 연봉이 작은 순으로 출력, 연봉이 같은 경우 이름이 빠른 순으로 출력 (O)
select * from emp where deptno in (20, 30) and (sal > 1500 and sal < 3000) order by sal asc, ename asc; 
select * from emp where (deptno = 20 or deptno = 30) and (sal > 1500 and sal < 3000) order by sal asc, ename asc; -- or 사용시

-- 9. 부서번호가 20 또는 30이고 급여가 1500 이상인 직원의 이름과 급여를 급여 오름차순으로 출력 (X) - 문제 잘 확인하기!!!! 전 칼럼이 아닌 특정 칼럼만 출력!
select ename, sal from emp where deptno in (20, 30) and sal >= 1500 order by sal asc; 


/* 250514 수업 */
select * from emp where sal between 2000 and 3000;
select * from emp where (sal between 2000 and 3000) and deptno = 20;
select * from emp where sal not between 2000 and 3000;

select * from emp where (sal between 2000 and 3000) and (sal != 2000 and sal != 3000);
select * from emp where (sal between 2000+1 and 3000-1); -- 이쪽은 소수점 값일 때 맞지 않는 경우 있으니 가급적 쓰지 않기

select * from emp where ename like 'S%';
select * from emp where ename like '_L%';

select * from emp where ename like '%AM%';
select * from emp where ename like '%E%';
select * from emp where ename like '_%E%_';
select * from emp where ename like '%A%';
select * from emp where ename like '_%A%_';

select * from emp where ename not like '%A%';

select * from emp where ename like '%A%' and ename like '%S%'; -- 나중에 확인
select * from emp where ename like '%A%S%' or ename like '%S%A%';

select * from emp where ename like '%A%' or ename like '%S%';

select comm from emp;

select comm from emp where comm >= 400;

select comm from emp where comm = null;
select comm from emp where comm is not null;
select comm from emp where comm is null;

select * from emp where deptno = 10;
select * from emp where deptno = 20;

select * from emp where deptno = 10 union select * from emp where deptno = 20;
select * from emp where deptno = 10 union select * from emp where deptno = 10;

select * from emp where deptno = 10 union all select * from emp where deptno = 10;

select empno from emp
union all
select sal from emp;

select empno from emp
union all
select ename from emp; -- 타입이 달라 발생하는 오류


select * from emp
    where ename like '%S'; -- Q1
    
select empno, ename, job, sal, deptno from emp
    where deptno = 30
    and job = 'SALESMAN'; -- Q2
    
select empno, ename, job, sal, deptno from emp
    where deptno in (20, 30)
    and sal > 2000;  --Q3 1번 방식
    
select empno, ename, job, sal, deptno from emp
    where deptno in (20, 30)
intersect
select empno, ename, job, sal, deptno from emp
    where sal > 2000; --Q3 2번 방식 (정답에서는 union 방식으로 출력)
    
select empno, ename, job, sal, deptno from emp
    where deptno = 20 and sal > 2000
union
select empno, ename, job, sal, deptno from emp
    where deptno = 30 and sal > 2000; -- Q3 정답 : 집합연산자 사용시 두 select문 까먹지 말기!
    
select * from emp
    where not (sal >=2000 and sal <=3000); -- Q4 (정답에서는 where not이 아닌 방식으로 출력)
    
select ename, empno, sal, deptno from emp 
    where ename like '%E%' 
    and deptno = 30 
    and (sal < 1000 or sal > 2000); -- Q5
    
select * from emp
    where comm is null
    and mgr is not null
    and (job = 'MANAGER' or job = 'CLERK')
    and ename not like '_L%'; -- Q6

select ename, upper(ename), lower(ename), initcap(ename) from emp;

select ename from emp where ename like '%aM%'; -- 이 상태로는 출력 X
select ename from emp where lower(ename) like lower('%aM%'); -- 이렇게 where절 조건을 맞춰주면 출력 가능

select * from dual; -- 연습용 더미 테이블
select 1 from dual;
select 'abc' from dual;
select upper('aBc') from dual;
select upper('aBc'), lower('aBc') from dual;
select upper('aBc'), upper(lower('aBc')) from dual;

select ename from emp;
select ename, length(ename) from emp;
select * from emp where length(ename) = 5; -- 이름 글자수가 5자인 경우만 출력

select lengthb('a'), lengthb('한') from dual;

desc emp;

/* 250514 - 자체 복습 */
SELECT * FROM EMP WHERE DEPTNO BETWEEN 20 AND 30; -- between 연산자
SELECT * FROM EMP WHERE JOB LIKE '%T%'; --LIKE 연산자
SELECT * FROM EMP WHERE (JOB LIKE '%T%') AND (DEPTNO BETWEEN 20 AND 30); -- AND로 위 둘을 합쳐보기... 세미콜론 잊지 말기!
SELECT * FROM EMP WHERE COMM IS NULL;

SELECT LOWER(JOB) FROM EMP;
SELECT JOB FROM EMP WHERE LENGTH(JOB) = 5;
SELECT LOWER(JOB) FROM EMP WHERE LENGTH(JOB) = 5;

/* 250514 복습용 예제 다시 풀이 */
SELECT * FROM EMP WHERE ENAME LIKE '%S';
SELECT EMPNO, ENAME, JOB, SAL, DEPTNO FROM EMP WHERE DEPTNO = 30 AND JOB = 'SALESMAN';
SELECT EMPNO, ENAME, JOB, SAL, DEPTNO FROM EMP WHERE DEPTNO IN (20, 30) AND SAL > 2000;
SELECT EMPNO, ENAME, JOB, SAL, DEPTNO FROM EMP WHERE DEPTNO = 20 AND SAL > 2000
UNION
SELECT EMPNO, ENAME, JOB, SAL, DEPTNO FROM EMP WHERE DEPTNO = 30 AND SAL > 2000;
SELECT * FROM EMP WHERE SAL<2000 OR SAL>3000;
SELECT ENAME, EMPNO, SAL, DEPTNO FROM EMP WHERE ENAME LIKE '%E%' AND DEPTNO = 30 AND SAL NOT BETWEEN 1000 AND 2000;
SELECT * FROM EMP WHERE COMM IS NULL AND MGR IS NOT NULL AND JOB IN ('MANAGER', 'CLERK') AND ENAME NOT LIKE '_L%';