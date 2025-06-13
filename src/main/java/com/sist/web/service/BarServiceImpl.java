package com.sist.web.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sist.web.dao.*;
import com.sist.web.entity.*;
import com.sist.web.vo.*;
@Service
public class BarServiceImpl implements BarService {
	@Autowired
	private BarRepository bDao;
	
	@Override
	public Map barListData(int page) {
		Map map = new HashMap();
		int rowSize=12;
		int start=(rowSize*page)-(rowSize-1);
		int end=(rowSize*page);
		
		int count =(int) bDao.count();
		int totalpage= (int)(Math.ceil(count/rowSize));
		
		final int BLOCK = 10;
		int startPage = ((page-1)/BLOCK*BLOCK)+1;
		int endPage = ((page-1)/BLOCK*BLOCK)+10;
		if(endPage>totalpage)
			endPage=totalpage;
		
		List<BarVO> list =  bDao.barListData(start, end);
		
		map.put("list", list);
		map.put("totalpage", totalpage);
		map.put("startPage",startPage);
		map.put("endPage", endPage);
		map.put("curpage", page);
		
		return map;
	}
	
}
