package com.study.pengxin.service;

import java.util.List;
import java.util.Map;

import com.study.pengxin.bean.ConsultConfigArea;

public interface CommonService {
    
    public List<ConsultConfigArea> qryArea(Map param, Map cacheConfig);
    
    int saveArea(ConsultConfigArea area);
    
    int saveAreaToBase(ConsultConfigArea area);
    
    public List<ConsultConfigArea> qryAreaFromBase(Map param);
    
}
