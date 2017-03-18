package com.run.spring.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.run.spring.model.GradeInfo;
import com.run.spring.page.IbatisDaoAnnotation;
import com.run.spring.page.Page;

@Repository
public class ExtGradeInfoDAOImpl extends IbatisDaoAnnotation implements ExtGradeInfoDAO {

	public List<GradeInfo> findExtGradeInfo(Long studentId, Page page) {
		Map<String , Object> paramMap = new HashMap<String , Object>();
		paramMap.put("studentId", studentId);
		return this.searchListPageMyObject("TB_GRADE_INFO.findExtGradeInfo", paramMap, page);
	}
    
	

}
