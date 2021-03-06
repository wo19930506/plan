package com.effecia.plan.persistence.dao;

import java.util.List;
import java.util.Map;

import com.effecia.plan.persistence.entity.PlanSetting;

public interface PlanSettingDao {

	List<PlanSetting> selectByMap(Map<String,Object> map); 
	
	List<PlanSetting> selectAllPlanByStatus(); //获取所有可用的投注计划设置
}
