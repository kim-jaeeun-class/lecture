create table tbl_todo {
	tno number primary key,
    title varchar2(4000) not null,
    dueDate date,
    finished number(1)
};

select * from emp;

create sequence seq_emp2;

select seq_emp2.nextval from dual;

commit;
