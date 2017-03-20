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
    
	public void test(){
		System.out.println("base fork");
	}
	
	public void testgit(){
		System.out.println();
		
		System.out.println("我是fork工程");
		System.out.println("我是fork工程1");
		
		System.out.println("我是base版本");
		System.out.println("我要提交");
	}

}
