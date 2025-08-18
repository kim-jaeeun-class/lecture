create table tbl_todo {
	tno number primary key,
    title varchar2(4000) not null,
    dueDate date,
    finished number(1)
};