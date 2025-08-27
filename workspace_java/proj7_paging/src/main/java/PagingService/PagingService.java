package PagingService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import paging.dao.PagingDAO;
import paging.dto.PagingDTO;

public class PagingService {
	
	PagingDAO pagingDAO = new PagingDAO();
	
	public List<PagingDTO> getAll(int r) {
	    return pagingDAO.selectAll(r);
	}
	
	public List<PagingDTO> getAllEMP() {
	    return pagingDAO.selectAllEMP();
	}
	
	public List<PagingDTO> getPageEMP(PagingDTO dto) {
		int pagePerRows = dto.getPagePerRows();
		int page = dto.getPage();
		
		int start = 0;
		int end = 0;
		
		end = pagePerRows * page;
		start = end - (pagePerRows - 1);
		
		dto.setStart(start);
		dto.setEnd(end);
		// TODO : DAO쪽 나중에 git 참고해서 수정하기
		PagingDAO pagingDAO = new PagingDAO();
		
		List list = PagingDAO.selectPageEMP(dto);
		int total = PagingDAO.selectTotalEMP();
		
		// 리스트와 total을 동시에 보내기 위한 map
		Map map = new HashMap();
		map.put("list", list);
		map.put("total", total);
		
		return map;
	}

}
