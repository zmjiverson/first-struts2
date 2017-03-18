package com.run.spring.dao;

import java.util.List;

import com.run.spring.model.GradeInfo;
import com.run.spring.page.Page;

public interface ExtGradeInfoDAO {

	public List<GradeInfo> findExtGradeInfo(Long studentId , Page page);
}
