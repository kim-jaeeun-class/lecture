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
select * from emp 
    where deptno = 30; -- WHERE절

select * from emp 
    where deptno = 30 order by sal; -- order by 절보다 앞에

select * from emp 
    where sal = 1600;
select * from emp 
    where sal >= 1600;
select * from emp 
    where  sal <=1600; -- 초과, 미만일 때는 = 제거

select * from emp 
    where deptno != 30; -- !=는 <>와 같은 의미

select * from emp 
    where deptno = 30 and job = 'SALESMAN'; -- 둘 다 만족
select * from emp 
    where deptno = 30 or job = 'CLERK';

select * from emp 
    where job='CLERK' or (sal>2000 and deptno = 10);
select * from emp 
    where sal >= 2000 and sal <4000; -- 일반 수학 비교처럼 'n<칼럼명<m'으로 쓰면 오류가 뜨는 듯
select * from emp 
    where deptno = 10 or deptno = 20;

select * from emp 
    where deptno in (10, 20);
select * from emp 
    where deptno not in (10, 20); --앞에 not을 붙여 부정으로



/* 250514 - 퀴즈(복습) */
select * from emp; -- 테이블 확인용

-- 1. 부서번호 10번인 사람들을 출력 (O)
select * from emp 
    where deptno = 10;

-- 2. 부서번호 10번이 아닌 사람들을 출력 (O)
select * from emp 
    where not (deptno = 10); 
select * from emp 
    where deptno != 10;

-- 3. 급여가 3000 이상인 사람들을 출력 (O)
select * from emp 
    where sal>=3000; 

-- 4. 급여가 1500~3000 사이(포함)의 사람을 출력 (O)
select * from emp 
    where sal>=1500 and sal<=3000; 
select * from emp 
    where sal between 1500 and 3000; -- 사용 제한이 있는 언어가 있음

-- 5. 부서번호 10번인 사람 중 급여 2000 이상인 사람을 출력 (O)
select * from emp 
    where deptno = 10 and sal >=2000; 

-- 6. 부서번호 30번 중 1500~3000 사이(미포함)인 사람을 출력 (O)
select * from emp 
    where deptno = 30 and (sal > 1500 and sal < 3000); 

-- 7. 부서번호 30번 중 1500~3000 사이(미포함)인 사람을 연봉이 작은 순으로 출력, 연봉이 같은 경우 이름이 빠른 순으로 출력 (O)
select * from emp 
    where deptno = 30 and (sal > 1500 and sal < 3000) 
    order by sal asc, ename asc; 

-- 8. 부서번호 20,30번 중 1500~3000 사이(미포함)인 사람을 연봉이 작은 순으로 출력, 연봉이 같은 경우 이름이 빠른 순으로 출력 (O)
select * from emp 
    where deptno in (20, 30) and (sal > 1500 and sal < 3000) 
    order by sal asc, ename asc; 
select * from emp 
    where (deptno = 20 or deptno = 30) and (sal > 1500 and sal < 3000) 
    order by sal asc, ename asc; -- or 사용시

-- 9. 부서번호가 20 또는 30이고 급여가 1500 이상인 직원의 이름과 급여를 급여 오름차순으로 출력 (X) - 문제 잘 확인하기!!!! 전 칼럼이 아닌 특정 칼럼만 출력!
select ename, sal from emp 
    where deptno in (20, 30) and sal >= 1500 
    order by sal asc; 


/* 250514 수업 */
select * from emp 
    where sal between 2000 and 3000;
select * from emp 
    where (sal between 2000 and 3000) and deptno = 20;
select * from emp 
    where sal not between 2000 and 3000;

select * from emp 
    where (sal between 2000 and 3000) and (sal != 2000 and sal != 3000);
select * from emp 
    where (sal between 2000+1 and 3000-1); -- 이쪽은 소수점 값일 때 맞지 않는 경우 있으니 가급적 쓰지 않기

select * from emp 
    where ename like 'S%';
select * from emp 
    where ename like '_L%';

select * from emp 
    where ename like '%AM%';
select * from emp 
    where ename like '%E%';
select * from emp 
    where ename like '_%E%_';
select * from emp 
    where ename like '%A%';
select * from emp 
    where ename like '_%A%_';

select * from emp 
    where ename not like '%A%';

select * from emp 
    where ename like '%A%' and ename like '%S%'; -- 나중에 확인
select * from emp 
    where ename like '%A%S%' or ename like '%S%A%';

select * from emp 
    where ename like '%A%' or ename like '%S%';

select comm from emp;

select comm from emp 
    where comm >= 400;

select comm from emp 
    where comm = null;
select comm from emp 
    where comm is not null;
select comm from emp 
    where comm is null;

select * from emp 
    where deptno = 10;
select * from emp 
    where deptno = 20;

select * from emp 
    where deptno = 10 
union 
select * from emp 
    where deptno = 20;
select * from emp 
    where deptno = 10 
union 
select * from emp 
    where deptno = 10;

select * from emp 
    where deptno = 10 
union all 
select * from emp 
    where deptno = 10;

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

select ename from emp 
    where ename like '%aM%'; -- 이 상태로는 출력 X
select ename from emp 
    where lower(ename) like lower('%aM%'); -- 이렇게 where절 조건을 맞춰주면 출력 가능

select * from dual; -- 연습용 더미 테이블
select 1 from dual;
select 'abc' from dual;
select upper('aBc') from dual;
select upper('aBc'), lower('aBc') from dual;
select upper('aBc'), upper(lower('aBc')) from dual;

select ename from emp;
select ename, length(ename) from emp;
select * from emp 
    where length(ename) = 5; -- 이름 글자수가 5자인 경우만 출력

select lengthb('a'), lengthb('한') from dual;

desc emp;

/* 250514 - 자체 복습 */
SELECT * FROM EMP 
    WHERE DEPTNO BETWEEN 20 AND 30; -- between 연산자
SELECT * FROM EMP 
    WHERE JOB LIKE '%T%'; --LIKE 연산자
SELECT * FROM EMP 
    WHERE (JOB LIKE '%T%') AND (DEPTNO BETWEEN 20 AND 30); -- AND로 위 둘을 합쳐보기... 세미콜론 잊지 말기!
SELECT * FROM EMP 
    WHERE COMM IS NULL;

SELECT LOWER(JOB) FROM EMP;
SELECT JOB FROM EMP 
    WHERE LENGTH(JOB) = 5;
SELECT LOWER(JOB) FROM EMP 
    WHERE LENGTH(JOB) = 5;

/* 250514 복습용 예제 다시 풀이 */
SELECT * FROM EMP 
    WHERE ENAME LIKE '%S';
    
SELECT EMPNO, ENAME, JOB, SAL, DEPTNO FROM EMP 
    WHERE DEPTNO = 30 AND JOB = 'SALESMAN';
    
SELECT EMPNO, ENAME, JOB, SAL, DEPTNO FROM EMP 
    WHERE DEPTNO IN (20, 30) AND SAL > 2000;
    
SELECT EMPNO, ENAME, JOB, SAL, DEPTNO FROM EMP 
    WHERE DEPTNO = 20 AND SAL > 2000
UNION
SELECT EMPNO, ENAME, JOB, SAL, DEPTNO FROM EMP 
    WHERE DEPTNO = 30 AND SAL > 2000;
    
SELECT * FROM EMP 
    WHERE SAL<2000 OR SAL>3000;
SELECT ENAME, EMPNO, SAL, DEPTNO FROM EMP 
    WHERE ENAME LIKE '%E%' AND DEPTNO = 30 AND SAL NOT BETWEEN 1000 AND 2000;
SELECT * FROM EMP 
    WHERE COMM IS NULL AND MGR IS NOT NULL AND JOB IN ('MANAGER', 'CLERK') AND ENAME NOT LIKE '_L%';


/* 250515 수업 */

select * from emp 
    where deptno = 10 
    order by empno desc;
select * from emp 
    where deptno = 20 
    order by empno asc; -- 이 문장들을 union이나 union all로,

select * from emp 
    where deptno = 10 
    order by empno desc
union all
select * from emp 
    where deptno = 20 
    order by empno asc; -- 합치기 불가

select job from emp; -- 전체 열 확인용
select ename from emp; -- 문제 답 확인용
select job, substr(job, 1, 2), substr(job, 3, 2), substr(job, 5) from emp; --substr
select substr(job, -4, 2) from emp; -- 오른쪽 기준
select substr(ename, 2, 3) from emp; -- 사원 이름을 왼쪽 기준 두 번째부터 세 글자만 출력
select substr(ename, -3) from emp; --이름을 뒤에서부터 3글자만 출력
select job, substr(job, -length(job)), substr(job, -length(job), 2), substr(job, -3) from emp;

select instr('HELLO, ORACLE!', 'L') AS INSTR_1 from dual; -- L이 첫 번째 항목 문자열의 어디에 있는지 표시

select '010-1234-5678' as replace_before, replace('010-1234-5678', '-', ' ') as replace_1, replace('010-1234-5678', '-') as replace_2 from dual;
select '가나다' as before, replace('가나다', '나', '👌👌👌') as replace from dual;
select replace('a-b-c', '-', '*'), replace('a-b-c', '-'), replace('a-b-c', '-', '') from dual;
select ename, replace(ename, 'E', '-') as re_ename from emp; -- ename의 E를 -로 교체
select ename, replace(ename, 'LL', '!!!!!') as re_ename from emp;

select lpad(ename, 10, '+') from emp;
select lpad(ename, 10, ' ') as lp_ename from emp;

select substr(ename, 1, 2) as Q1 from emp; -- 문제1. ename 앞 두 글자만 출력

select concat(substr(ename, 1, 2), '****') as Q2_v1 from emp; --문제2. ename 총 6글자. 앞 두 글자만 원본 출력, 나머지는 *표시. (concat 예습 적용)
select substr(ename, 1, 2) || '****' as Q2_v1 from emp;
select rpad(substr(ename, 1, 2), 6, '*') as Q2_v2 from emp; --문제2. ename 총 6글자. 앞 두 글자만 원본 출력, 나머지는 *표시. (concat 이전까지만)

select rpad(substr(ename, 1, 2), length(ename), '*') as Q3 from emp; --문제3. ename 전 자릿수 출력. 앞 두 글자만 원본 출력, 나머지는 *표.

select substr(
    (substr('          ', 1, 10-(length(job)/2)) || job || substr('          ', 1, (10-length(job)/2))), 1, 20)
    as Q4_v1 from emp; --문제4(심화). job을 총 20자리로 지정해 가운데 정렬(학습내용 이후에 대강 했기 때문에 다른 방식으로 재진행하기.)
select lpad(rpad(job, 20/2+length(job)/2, ' '), 20) as Q4_v2 from emp;

select 'ab'||'cd' from dual;

select '  ab c    ', trim('   ab c     ') as 예1, ltrim('   ab c     ') as 예2, rtrim('   ab c     ') as 예3 from dual;

SELECT ROUND(1234.5678) FROM DUAL;
select round(14.46) from dual;
select round(14.46, 1) from dual;
select round(14.46, -1) from dual;

select trunc(14.46), trunc(14.46, 1), trunc(14.46, -1), trunc(-14.46) from dual;
select ceil(3.14), floor(3.14), ceil(-3.14), floor(-3.14) from dual;

select 7/0 from dual; -- 0 나누기는 불가
select mod(7, 3) from dual;
select mod(length(job), 2) from emp;
select mod(6, 3), mod(7, 3), mod(8, 3), mod(9, 3) from dual;
select mod(684689, 3) from dual;
select mod(3.1, 3) from dual;

select sysdate from dual;

select empno + 1000 from emp; -- 출력 가능
select empno + 'a' from emp; -- 타입이 다르므로 에러 표시
select empno || 'a' from emp; -- 이렇게 하기

select to_char(sysdate, 'yyyy"년" mm"월" dd"일" pm hh12"시":mi"분":ss"초"') as now from dual;
select to_char(hiredate, 'yyyy"년" mm"월" dd"일"') as HIREDATE from emp;

select to_date('2025-05-15', 'yyyy-mm-dd') - to_date('2025-05-12', 'yyyy-mm-dd') from dual;

select * from emp 
    where hiredate > to_date('1981-06-01', 'yyyy-mm-dd') order by hiredate;

select sal*12 + nvl(comm, 0) as pay from emp;

select * from emp E, salgrade S 
    where E.sal between S.losal and S.hisal;


/* 250516 수업 */

select ename, sal*12+nvl(comm, 0) as total_pay from emp; -- Q. 각 사원의 연봉 출력. 월급*12+comm. ename, total_pay로 출력

select empno, ename, job, sal,
    decode(job,
        'MANAGER', SAL*1.1,
        'SALESMAN', SAL*1.05,
        'ANALYST', SAL,
        SAL*1.03) as upsal -- 표기 없는 이 부분이 나머지 경우
from emp;

select job, sal,
    decode(job,
        'MANAGER', SAL*1.1,
        'SALESMAN', SAL*1.05,
        'ANALYST', SAL,
        SAL*1.03) as upsal
from emp;

select job, sal,
    case job
        when 'MANAGER' then SAL*1.1
        when 'SALESMAN' then SAL*1.05
        when 'ANALYST' then SAL
        else SAL*1.03
        end as upsal
from emp;


--nvl 사용 없이 decode, case로 nvl과 동일 기능 구현

select comm,
    decode(comm, 
        null, -1,
        comm) as decode,
    case
        when comm is null then -1 -- when null은 where comm = null과 동일한 의미. comm is null도 사용 불가.
        else comm
        end as case
from emp;

select empno, ename, comm,
    case
        when comm is null then '해당 없음'
        when comm = 0 then '0원'
        when comm > 0 then '수당 : ' || COMM
    end as comm_text
from emp;

select empno,
rpad(substr(empno, 1, 2), 4, '*') as masking_empno,
ename,
rpad(substr(ename, 1, 1), length(ename), '*') as masking_ename
from emp
where length(ename) >= 5 and length(ename) < 6;-- Q1.

select empno, ename, sal,
trunc(sal/(21.5*8)*8, 2) as day_pay,
round(sal/(21.5*8), 1) as time_pay
from emp; -- Q2.

select empno, ename, hiredate,
    to_char(add_months(hiredate, 3), 'yyyy-mm-dd') as r_job,
    nvl(to_char(comm), 'N/A') as comm
from emp;-- Q3.

select empno, ename, mgr,
    case
        when comm is null then '0000'
        when comm like '75%' then '5555'
        when comm like '76%' then '6666'
        when comm like '77%' then '7777'
        when comm like '78%' then '8888'
        else to_char(mgr)
    end as chg_mgr
from emp;-- Q4.