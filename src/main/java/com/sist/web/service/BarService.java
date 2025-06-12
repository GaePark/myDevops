package com.sist.web.service;

import java.util.*;

import org.springframework.data.repository.query.Param;

import com.sist.web.vo.BarVO;

public interface BarService {
	public Map barListData(int page);
}
