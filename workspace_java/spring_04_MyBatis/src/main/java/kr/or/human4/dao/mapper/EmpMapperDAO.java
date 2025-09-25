package kr.or.human4.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import kr.or.human4.dto.EmpDTO;

@Mapper
public interface EmpMapperDAO {
	List<EmpDTO> selectEmp();
	
	// @Param의 이름과 전달인자명이 같으면 @Param() 생략 가능
	@Select("select * from emp2 where empno = #{a}")
	EmpDTO detail(@Param("a") int empno);
	
	@Select("select * from emp2 where empno = #{empno}")
	EmpDTO detail2(int empno);
}
