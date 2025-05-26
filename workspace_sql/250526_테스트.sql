-- Q1.

select rpad(substr(empno, 1, 2), length(empno), '*') as empno, ename
from emp
order by empno desc;

-- Q2.

select
    e.empno, e.ename,
    d.dname, d.loc
from emp e left outer join dept d on (e.deptno = d.deptno)
order by d.dname desc;


