/* 250512 */

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
select ename, sal,        sal*12+comm, comm from emp;
select ename, sal, sal*12+comm s, comm from emp;
select ename, sal, sal*12+comm as s, comm from emp;
select ename, sal, sal*12+comm as "s s", comm from emp;
select ename, sal, sal*12+comm as "s s", comm 추가수당 from emp;
select sal, sal*10 from emp;


/* 250513 */
select * from emp;
select * from emp order by sal;
select * from emp order by sal asc; --sal 기준 오름차순(1>10)
select * from emp order by sal desc; --sal 기준 내림차순(10>1)
select * from emp order by hiredate; --가장 먼저 입사한 순
select * from emp order by ename desc; --이름 역순
select * from emp order by deptno asc, sal desc;
select * from emp order by deptno asc, sal desc, empno desc;
