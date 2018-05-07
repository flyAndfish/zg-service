package com.study.pengxin.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.pengxin.bean.ConsultConfigArea;
import com.study.pengxin.dao.CommonMapper;
import com.study.pengxin.service.CommonService;

@Service
public class CommonServiceImpl implements CommonService {
    
    @Autowired
    CommonMapper mapper;

	public List<ConsultConfigArea> qryArea(Map param, Map cacheConfig) {
		return mapper.qryArea(param);
	}

	public int saveArea(ConsultConfigArea area) {
		return mapper.saveArea(area);
	}

	public int saveAreaToBase(ConsultConfigArea area) {
		return mapper.saveArea(area);
	}

	public List<ConsultConfigArea> qryAreaFromBase(Map param) {
		return mapper.qryArea(param);
	}
    

    
}
