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

select 
    empno,
    rpad(substr(empno, 1, 2), 4, '*') as masking_empno,
    ename,
    rpad(substr(ename, 1, 1), length(ename), '*') as masking_ename
from emp
    where length(ename) >= 5 and length(ename) < 6;-- Q1.

select 
    empno, ename, sal,
    trunc(sal/(21.5*8)*8, 2) as day_pay,
    round(sal/(21.5*8), 1) as time_pay
from emp; -- Q2.
select 
    empno, ename, sal,
    trunc(sal/21.5, 2) as day_pay,
    round(sal/(21.5*8), 1) as time_pay
from emp; -- Q2. -- 조금 더 짧게! (풀어 쓰면 어차피 /21.5 /8 *8 = /21.5라)

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
select empno, ename, mgr,
    decode(comm,
        null, '0000',
        '75%', '5555',
        '76%', '6666',
        '77%', '7777',
        '78%', '8888',
        to_char(mgr))
    as chg_mgr
from emp; --Q4 decode로 변형
select empno, ename, mgr,
    case
        when mgr is null then '0000'
        when substr(mgr, 1, 2) = 75 then '5555'
        when substr(mgr, 1, 2) = 76 then '6666'
        when substr(mgr, 1, 2) = 77 then '7777'
        when substr(mgr, 1, 2) = 78 then '8888'
        else to_char(mgr)
    end as chg_mgr
from emp; --Q4. substr 쓸 경우
select empno, ename, mgr,
    case
        when mgr is null then '0000'
        when mgr is not null then
            case substr(mgr, 1, 2)
                when '75' then '5555'
                when '76' then '6666'
                when '77' then '7777'
                when '78' then '8888'
                else to_char(mgr)
            end
    end as chg_mgr
from emp; -- Q4. substr을 case 2개를 사용 
select empno, ename, mgr,
                case substr(mgr, 1, 2)
                when '75' then '5555'
                when '76' then '6666'
                when '77' then '7777'
                when '78' then '8888'
                else '0000'
                end as chg_mgr
from emp; -- Q4. substr-2개의 case-nvl 사용
select
    case
        when mgr is null then '0000'
        when substr(mgr, 2, 1) in ('5', '6', '7', '8')
            then lpad(substr(mgr, 2, 1), length(mgr), substr(mgr, 2, 1))
        else '' || mgr
    end as chg_mgr
from emp; -- Q4. lpad 안에 다른 함수(substr) 사용

select sum(sal) from emp;

select count(COMM), sum(sal), max(sal), min(sal), min(hiredate), min(comm) from emp;

select count(*) from emp
    where ename like '%A%';
    
select trunc(avg(sal)) from emp 
    where deptno = 10;
    
select trunc(avg(sal)) as avg_sal, deptno, count(*) as no from emp
    group by deptno;
    
select job, count(*) as no from emp
    group by job;
    
select deptno, ename, job, avg(sal) from emp
    group by deptno, job, ename
    order by deptno, ename, job;
    
select job from emp
    where deptno in (10, 20)
    group by job
    order by job;
    
select job, deptno from emp
    group by deptno, job
        having deptno = 10;

select job, deptno, avg(sal) from emp
    group by deptno, job;
    
select job, deptno, avg(sal) from emp
    where avg(sal) >= 2000
    group by deptno, job; -- 불가
    
select job, deptno, avg(sal) from emp
    group by deptno, job
    having avg(sal) > 2000;  -- 위에서 의도한 내용 출력 가능
    
select job, count(*) as cnt from emp
    where sal > 1000 -- cnt > 3이나 count(*) > 3 불가
    group by job
    having count(*) > 3
    order by cnt;
    
select 
    deptno,
    trunc(avg(sal)) as avg_sal,
    max(sal) as max_sal,
    min(sal) as min_sal,
    count(*) as cnt from emp
    group by deptno; -- Q1.
    
select 
    job,
    count(*) from emp
    group by job
        having count(*) >= 3; -- Q2.
    
select 
    to_char(hiredate, 'yyyy') as hire_year,
    deptno,00
    count(*) as cnt from emp
    group by to_char(hiredate, 'yyyy'), deptno; -- Q3.
    
select 
    nvl2(comm, 'O', 'X') as exist_comm,
    count(*) as cnt from emp
    group by nvl2(comm, 'O', 'X'); -- Q4. nvl2로. 이게 가장 깔끔해 보인다.
select
    case
        when comm is null then 'X'
        else 'O'
    end as exist_comm,
    count(*) as cnt
from emp
group by 
    case
        when comm is null then 'X'
        else 'O'
    end; -- Q4. case로도 가능할까 싶어서...? 근데 너무 길다.
    

/* 250519 수업 */

select * from dept;
select * from emp, dept order by empno;
select * from emp, dept 
    where emp.deptno = dept.deptno
    order by empno;
    
select * from emp E, dept D 
    where E.deptno = D.deptno
    order by empno;
    
select deptno from emp E, dept D 
    where E.deptno = D.deptno
    order by empno; -- 오류 발생
select ename from emp E, dept D 
    where E.deptno = D.deptno
    order by empno; -- 오류 X.
    
select * from salgrade;

select * from emp, salgrade
    where emp.sal between salgrade.losal and salgrade.hisal;
    
select grade, e.* -- salgrade에서는 grade만, emp에서는 모든 칼럼(*)을 띄우고 싶을 때 앞에 '테이블.' 사용.
from emp e, salgrade s
    where e.sal between s.losal and s.hisal;

select * from emp e1, emp e2
    where e1.mgr = e2.empno;

select e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename from emp e1, emp e2
    where e1.mgr = e2.empno(+); -- left 조인 시 상사가 없는 사람도 출력. right는 부하 직원이 없는 사람을 출력.
    
select * from emp join dept using (deptno); -- join using
select * from emp join dept on (emp.deptno = dept.deptno); --join on. 위의 join using이랑 동일.
select empno, ename, deptno
from emp e join dept d using(deptno)
where sal >= 3000;

select e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename 
from emp e1 left outer join emp e2 on (E1.mgr = E2.empno); -- left outer join by sql-99
select e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename 
from emp e1 full outer join emp e2 on (E1.mgr = E2.empno);
select e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename 
from emp e1 right outer join emp e2 on (E1.mgr = E2.empno);

select d.deptno, d.dname, e.empno, e.ename, e.sal
    from dept d join emp e on (d.deptno = e.deptno)
    where e.sal >=2000
    order by d.deptno; -- Q1. SQL-99. 굳이 outer 쓸 필요 없음.
select d.deptno, d.dname, e.empno, e.ename, e.sal
    from dept d, emp e
    where e.sal >=2000
        and d.deptno = e.deptno
    order by d.deptno, d.dname; -- Q1. SQL-99 이전(순서 맞춰봄)

select 
    d.deptno, d.dname,
    floor(avg(e.sal)) as avg_sal, -- trunc는 oracle에서만 있기 때문에 조건이 있지 않은 한 가급적 floor로 써주기.
    max(e.sal) as max_sal,
    min(e.sal) as min_sal,
    count(*) as cnt
from dept d, emp e
    where d.deptno = e.deptno
    group by d.deptno, d.dname
    order by d.deptno; -- Q2. SQL-99 이전 (group by 적용시키기!!!)
select 
    d.deptno, d.dname,
    floor(avg(e.sal)) as avg_sal, 
    max(e.sal) as max_sal,
    min(e.sal) as min_sal,
    count(*) as cnt
from dept d join emp e on (d.deptno = e.deptno)
    group by d.deptno, d.dname
    order by d.deptno; -- Q2. SQL-99

select 
    d.deptno, d.dname,
    e.empno, e.ename, e.job, e.sal
from dept d, emp e
    where d.deptno = e.deptno(+)
    order by d.deptno, e.ename; -- Q3. sql-99 이전
select 
    d.deptno, d.dname,
    e.empno, e.ename, e.job, e.sal
from dept d left outer join emp e on (d.deptno = e.deptno)
    order by d.deptno, e.ename;-- Q3. sql-99

select 
    d.deptno, d.dname, 
    e1.empno, e1.ename, e1.mgr, e1.sal, e1.deptno,
    s.losal, s.hisal, s.grade,
    e2.empno as mgr_empno, e2.ename as mgr_ename
from dept d left outer join emp e1 on (d.deptno = e1.deptno)
            left outer join emp e2 on (e1.mgr = e2.empno)
            left outer join salgrade s on (e1.sal between s.losal and s.hisal) 
    -- 위 between 행의 e1.sal을 e2.sal로 바꾸니 salgrade 테이블 쪽에 null이 뜸. 
    -- 왜냐하면 king의 상사는 없기 때문에! 다른 행도 다 상사 기준으로 salgrade가 재설정됨!
    order by d.deptno, e1.empno; -- Q4. SQL-99 방식. 

select 
    d.deptno, d.dname, 
    e1.empno, e1.ename, e1.mgr, e1.sal, e1.deptno,
    s.losal, s.hisal, s.grade,
    e2.empno as mgr_empno, e2.ename as mgr_ename
from dept d, emp e1, emp e2, salgrade s
where d.deptno = e1.deptno(+)
        and e1.mgr = e2.empno(+)
        and e1.sal >= s.losal(+) 
        and e1.sal <= s.hisal(+)
    order by d.deptno, e1.empno; -- Q4. SQL-99 이전 방식. 
select 
    d.deptno, d.dname, 
    e1.empno, e1.ename, e1.mgr, e1.sal, e1.deptno,
    s.losal, s.hisal, s.grade,
    e2.empno as mgr_empno, e2.ename as mgr_ename
from dept d, emp e1, emp e2, salgrade s
where d.deptno = e1.deptno(+) -- d.deptno 기준. left 적용 필요. 없으면 deptno = 40인 경우가 출력되지 않음.
        and e1.mgr = e2.empno(+) -- e1.mgr 기준. left 적용 필요. 없으면 상사가 없는 king과 deptno = 40인 두 행이 출력되지 않음.
        and e1.sal between s.losal(+) and s.hisal(+) -- e1.sal 기준. losal이랑 hisal 양쪽에 (+)를 넣으니 between이 적용됨. 없을 시 deptno = 40인 행이 출력되지 않음. 40인 행에는 salgrade 테이블이 모두 null이어서.
    order by d.deptno, e1.empno; -- Q4. SQL-99 이전 방식. between 사용.

/* 250519 복습용 문제 다시 풀이 */
-- 문제 풀이 자체는 모두 ok. 1번만 한 번 생각해보기.

--Q1. 조건 적용 잊지 말기!!! 근데 첫 번째에서 group by 쓰면 안 된다면서 오류 나더라... 안 되는 이유 생각해보기. -> ename이 다르니까!!!!!! 당연히 묶일 수가 없다...
select
    d.deptno, d.dname,
    e.empno, e.ename, e.sal
    from dept d, emp e
    where d.deptno = e.deptno
        and e.sal >= 2000;
select
    d.deptno, d.dname,
    e.empno, e.ename, e.sal
    from dept d join emp e on (d.deptno = e.deptno)
    where e.sal >= 2000;
    
-- Q2.
select
    d.deptno, d.dname,
    trunc(avg(e.sal)) as avg_sal,
    max(e.sal) as max_sal,
    min(e.sal) as min_sal,
    count(*) as cnt
from dept d, emp e
    where d.deptno = e.deptno
group by d.deptno, d.dname
order by deptno;
select
    d.deptno, d.dname,
    trunc(avg(e.sal)) as avg_sal,
    max(e.sal) as max_sal,
    min(e.sal) as min_sal,
    count(*) as cnt
from dept d join emp e on (d.deptno = e.deptno)
group by d.deptno, d.dname
order by deptno;
    
-- Q3.
select
    d.deptno, d.dname,
    e.empno, e.ename, e.job, e.sal
from dept d, emp e
    where d.deptno = e.deptno(+)
order by d.deptno, e.ename;
select
    d.deptno, d.dname,
    e.empno, e.ename, e.job, e.sal
from dept d left outer join emp e 
    on (d.deptno = e.deptno)
order by d.deptno, e.ename;

--Q4.

select
    d.deptno, d.dname,
    e1.empno, e1.ename, e1.mgr, e1.sal, e1.deptno,
    s.losal, s.hisal, s.grade,
    e2.empno as mgr_empno,
    e2.ename as mgr_ename
from dept d, emp e1, salgrade s, emp e2
    where d.deptno = e1.deptno(+)
        and e1.mgr = e2.empno(+)
        and e1.sal between s.losal(+) and s.hisal(+)
order by d.deptno, e1.empno;
select
    d.deptno, d.dname,
    e1.empno, e1.ename, e1.mgr, e1.sal, e1.deptno,
    s.losal, s.hisal, s.grade,
    e2.empno as mgr_empno,
    e2.ename as mgr_ename
from dept d 
    left outer join emp e1
        on (d.deptno = e1.deptno)
    left outer join salgrade s
        on (e1.sal between s.losal and s.hisal)
    left outer join emp e2
        on (e1.mgr = e2.empno)
order by d.deptno, e1.empno;
select
    d.deptno, d.dname,
    e.empno, e.ename, e.sal, e.deptno as deptno_1, 
    s.losal, s.hisal, s.grade, 
    e2.empno as mgr_empno, 
    e2.ename as mgr_ename
from dept d
    left outer join emp e 
        on (d.deptno = e.deptno)
    left outer join salgrade s 
        on (e.sal >= s.losal and e.sal <= s.hisal)
    left outer join emp e2 
        on (e.mgr = e2.empno)
order by d.deptno, e.empno; -- 수업 중 진행한 방식. 큰 차이는 없지만 실제로 더 많이 쓰는 방식이 적용돼 있으니 참고.
        
/* 250520 */

-- Q. 각 부서별로 급여가 가장 높은 사원, 가장 낮은 사원의 급여 차이.

select deptno, max(sal), min(sal), max(sal)-min(sal)
    from emp
    group by deptno
    order by deptno; -- 이쪽은 가독성 목적. 필수 X.
    
select * from emp
    where sal > (select sal from emp
                        where ename ='JONES'); -- 서브쿼리
select * from emp
    where hiredate < (select hiredate from emp
                             where ename = 'SCOTT');
                            
select 
    e.empno, e.ename, e.job, e.sal,
    d.deptno, d.dname, d.loc
from emp e, dept d
    where e.deptno = d.deptno
    and e.sal > (select avg(sal) from emp); -- avg(e.sal)로는 출력값 없음.

select * from emp
    where sal in (
                select max(sal) from emp
                group by deptno);
 
select * from emp
    where sal in (2850, 3000, 5000); -- 이 코드를...
select * from emp
    where sal in (
                select max(sal) from emp
                group by deptno); -- 이런 다중행 서브쿼리로 표현 가능.
select * from emp
    where sal = some (
                select max(sal) from emp
                group by deptno); -- IN과 출력값 차이 없음. (동일 기능 수행)
select * from emp
    where sal = any (
                select max(sal) from emp
                group by deptno); -- IN과 출력값 차이 없음(2) (동일 기능 수행)

select * from emp
	where (deptno, sal) in (select deptno, max(sal)
							from emp
							group by deptno);

select * from emp, dept
    where emp.deptno = dept.deptno;
    
select
	e10.empno, e10.ename, e10.deptno,
	d.dname, d.loc
from (select * from emp where deptno = 10) e10,
      dept d
where e10.deptno = d.deptno;
with
e10 as (select * from emp where deptno = 10),
d as (select * from dept) -- 여기는 d as dept가 안 됨. dept는 select문이 아니기 때문에.
select
    e10.empno, e10.ename, e10.deptno,
	d.dname, d.loc
from e10, d
where e10.deptno = d.deptno; -- 위 코드와 아래 코드는 같은 출력값을 보여줌.

-- job별로 직책이 3명 이상인 것만.
select job, count(*)
from emp
group by job
having count(*) >= 3; -- A1. having을 사용한 방식
select *
from (select job, count(*) cnt
      from emp
      group by job)
where cnt >= 3; -- A2. 서브쿼리를 사용한 방식. 이 경우 다중행함수를 where 절에 사용 가능.

select
    rownum, emp.*
from emp; -- 이 상태로는 rownum에 조건 달기 불가
select *
from (select
      rownum rn, emp.*
      from emp)
where rn >=2 and rn <=4; -- 서브쿼리로 감싸 조건 설정이 가능하게 만듦.
select rownum rn, emp.*
from emp;

select * 
from (select 
           rownum rn, e.*
      from (select 
                  emp.*
            from emp
            order by sal desc
            ) e
      )
where rn >= 2 or rn <= 3; -- 위 코드의 응용. 이쪽에서 rn 조건을 조정해 월급 순위 확인 가능.

with e1 as (
    with e as (
        select emp.* from emp order by sal desc
    )
    select rownum rn, e.*
    from e)
select * from e1
where rn >= 2 or rn <= 3; -- 위 코드 with로 바꾸려고 했는데 이렇게는 안 됨...  <질문검색 1>


with e10 as (
    select * from emp where deptno = 10
)
select ename from e10;

select
	empno, ename, job, sal,
	(select grade
	 from salgrade
	 where e.sal between losal and hisal) as salgrade,
	deptno,
	(select dname
	 from dept
	 where e.deptno = dept.deptno) as dname
from emp e; -- select절에 사용하는 서브쿼리

/* Q1 */
select
    e.job, e.empno, e.ename, e.sal, e.deptno,
    d.dname
from (select * 
      from emp
      where ename = 'ALLEN') e, dept d;

/* Q2. 풀이 과정 */
select
    e.empno, e.ename,
    d.dname,
    e.hiredate,
    d.loc,
    e.sal,
    s.grade
from emp e 
    join dept d on (e.deptno = d.deptno)
    join salgrade s on (e.sal >= s.losal and e.sal <= s.hisal); -- 조인 먼저(성공!)

select e.*
    from (
        select
            e.empno, e.ename,
            d.dname,
            e.hiredate,
            d.loc,
            e.sal,
            s.grade
        from emp e 
            join dept d on (e.deptno = d.deptno)
            join salgrade s on (e.sal >= s.losal and e.sal <= s.hisal)
         ) e
order by sal desc, empno; -- 조인+정렬까지 성공

select *
    from (select e.*
            from (
                select
                    e.empno, e.ename,
                    d.dname,
                    e.hiredate,
                    d.loc,
                    e.sal,
                    s.grade
                from emp e 
                    join dept d on (e.deptno = d.deptno)
                    join salgrade s on (e.sal >= s.losal and e.sal <= s.hisal)
                 ) e
          order by sal desc, empno); -- 우선 서브쿼리로 감쌈. CLERK 아랫부분이 다 잘려야 하는데...
          
select avg(sal) from emp; -- 평균 급여

select *
    from (select e.*
            from (
                select
                    e.empno, e.ename,
                    d.dname,
                    e.hiredate,
                    d.loc,
                    e.sal,
                    s.grade
                from emp e 
                    join dept d on (e.deptno = d.deptno)
                    join salgrade s on (e.sal >= s.losal and e.sal <= s.hisal)
                 ) e
          order by sal desc, empno)
    where sal > (select avg(sal) from emp); -- 최종 출력(조인 사용). 평균 급여 select문 만들어서 메인 쿼리 where절에 적용.

select
    e.empno, e.ename,
    d.dname,
    e.hiredate,
    d.loc,
    e.sal,
    s.grade
from emp e 
    join dept d on (e.deptno = d.deptno)
    join salgrade s on (e.sal >= s.losal and e.sal <= s.hisal); -- 이걸 서브쿼리로 바꿔서 위 최종 출력에 대체해놔야.

select
    e.empno, e.ename,
    d.dname,
    e.hiredate,
    d.loc,
    e.sal,
    s.grade
from
    (select empno, ename, hiredate, deptno, sal from emp) e,
    (select dname, loc, deptno from dept) d,
    (select grade, losal, hisal from salgrade) s
where e.sal >= s.losal and e.sal <= s.hisal
    and  e.deptno = d.deptno;

select *
    from (select e.*
            from (
                select
                    e.empno, e.ename,
                    d.dname,
                    e.hiredate,
                    d.loc,
                    e.sal,
                    s.grade
                from
                    (select empno, ename, hiredate, deptno, sal from emp) e,
                    (select dname, loc, deptno from dept) d,
                    (select grade, losal, hisal from salgrade) s
                where e.sal >= s.losal and e.sal <= s.hisal
                and  e.deptno = d.deptno) e
          order by sal desc, empno)
    where sal > (select avg(sal) from emp); -- <질문 검색 3)> 이건 SQL-99 이전 조인이지 서브쿼리라고 할 수 없지 않나?

/* Q3. 풀이 과정 */

select *
    from (
        select
            e.empno, e.ename, e.job, e.deptno,
            d.dname, d.loc
        from emp e join dept d on (e.deptno = d.deptno)
        where e.deptno = 10)
where job not in (select job from emp where deptno = 30);

/* Q4. */

select 
    e.empno, e.ename, e.sal,
    s.grade
from emp e join salgrade s on (e.sal >= s.losal and e.sal <= s.hisal); -- 조인 성공

select max(sal) from (select sal from emp
    where job = 'SALESMAN'); -- salesman의 max(sal). 다중행 함수 사용해서 표현.
    
select sal
    from (select sal, rownum as rn
            from emp
            where job = 'SALESMAN')
    where rn = 1
    order by rn; -- salesman의 max(sal). 다중행 함수 미사용... 꼼수 같다.

select *
    from (
        select 
            e.empno, e.ename, e.sal,
            s.grade
        from emp e 
            join salgrade s 
                on (e.sal >= s.losal and e.sal <= s.hisal))
    where sal > (select max(sal) 
                    from (select sal 
                            from emp
                            where job = 'SALESMAN'))
    order by empno; -- Q4. 다중행 함수 사용

select *
    from (
        select 
            e.empno, e.ename, e.sal,
            s.grade
        from emp e 
            join salgrade s 
                on (e.sal >= s.losal and e.sal <= s.hisal))
    where sal > (select *
                    from(
                        select sal
                            from (
                                  select 
                                    sal, rownum as rn
                                  from emp
                                  where job = 'SALESMAN')
                            where rn = 1
                            order by rn))
    order by empno;                           
-- Q4. 다중행 함수 미사용... 일단 원래 이렇게 안 하는 건 잘 알겠다.
select *
    from (
        select 
            e.empno, 
            e.ename, 
            e.sal,
            s.grade
        from emp e 
            join salgrade s 
            on e.sal >= s.losal and e.sal <= s.hisal
          )
    where sal > (
                 select max(sal)
                 from emp
                 where job = 'SALESMAN' -- 생각해보니 굳이 서브쿼리로 안 감싸도 max는 뜬다.
                 )
order by empno; -- Q4. 다중행 함수 사용(간략화)
select *
from (
    select 
        e.empno, e.ename, e.sal,
        s.grade
    from emp e 
    join salgrade s 
        on (e.sal >= s.losal and e.sal <= s.hisal)
     )
where sal > (
            select sal  -- 어차피 아래 from절의 서브쿼리에서 sal만 나오니까... 이왕이면 where절의 서브쿼리에서도 sal로? 실제 사용에서는 * 잘 안 쓴다고 하니까.
            from (
                select sal
                from emp
                where job = 'SALESMAN'
                order by sal desc   -- 처음 버전은 1/6의 도박이 성공했지만, 생각해보면 sal desc 안 해줄 경우 salesman의 max_sal이 출력 안 될 가능성이 있음. 바꿔주기.
                  )
            where rownum = 1 -- 그러므로 from절에서 먼저 급여순 맞춰주고, where절에 별칭 없이 따로 rownum 써주기. 수업에서 where절에 바로 rownum 쓰면 따로 작업된다 했으니 될지도? -> 된다!
            )
order by empno; -- Q4. 다중행 함수 미사용 보완 버전

