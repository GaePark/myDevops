package com.sist.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sist.web.entity.BarEntity;
import com.sist.web.vo.*;
import java.util.*;
import com.sist.web.entity.*;

@Repository
public interface BarRepository extends JpaRepository<BarEntity, Integer> {
	@Query(value = "SELECT bar_no,name,address,image,hit,num "
			+ "FROM (SELECT bar_no,name,address,image,hit,rownum as num "
			+ "FROM (SELECT /*+ INDEX_ASC(cocktailbar CB_BAR_NO_PK)*/ bar_no,name,address,image,hit "
			+ "FROM cocktailbar)) "
			+ "WHERE num BETWEEN :start AND :end",nativeQuery = true)
	public List<BarVO> barListData(@Param("start") int start,@Param("end") int end);

}
