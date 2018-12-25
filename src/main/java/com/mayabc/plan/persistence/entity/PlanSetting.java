package com.mayabc.plan.persistence.entity;

/**
 * @author wade
 * @see 投注计划设置
 * @url http://caipiaomi.com/?g=Api&m=Jihua&category=bjpk10&pagesize=20
 *             &action=no&childAction=定位胆系列
 *             &paramsArr[searchFormulas]=1&paramsArr[pagesize]=20&paramsArr[setCode]=5&paramsArr[planningCycle]=3
 *             &dingsha=ding&index=0
 */
public class PlanSetting {
	
	private int id;
	private String gameType;              //游戏类型
	private int pagesize;                 //分页条目
	private String action;                //no
	private String childAction;           //子选项
	private int paramsArr_searchFormulas; //搜索栏公式 1
	private int paramsArr_pagesize;       //分页数目     20
	private int paramsArr_setCode;        //定码的个数 
	private int planningCycle;            //计划的周期
	private String dingsha;               //定码还是杀码 (ding,sha)
	private int index;                    //球号的位置(0,1,2,3,4,5,6,7,8,9...)
	private int status;                   //计划状态  0:未生效  1:生效
	private int deptId;                   //包网id
	private int gid;                      //群id
	private int uid;                      //操作者id
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGameType() {
		return gameType;
	}
	public void setGameType(String gameType) {
		this.gameType = gameType;
	}
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getChildAction() {
		return childAction;
	}
	public void setChildAction(String childAction) {
		this.childAction = childAction;
	}
	public int getParamsArr_searchFormulas() {
		return paramsArr_searchFormulas;
	}
	public void setParamsArr_searchFormulas(int paramsArr_searchFormulas) {
		this.paramsArr_searchFormulas = paramsArr_searchFormulas;
	}
	public int getParamsArr_pagesize() {
		return paramsArr_pagesize;
	}
	public void setParamsArr_pagesize(int paramsArr_pagesize) {
		this.paramsArr_pagesize = paramsArr_pagesize;
	}
	public int getParamsArr_setCode() {
		return paramsArr_setCode;
	}
	public void setParamsArr_setCode(int paramsArr_setCode) {
		this.paramsArr_setCode = paramsArr_setCode;
	}
	public int getPlanningCycle() {
		return planningCycle;
	}
	public void setPlanningCycle(int planningCycle) {
		this.planningCycle = planningCycle;
	}
	public String getDingsha() {
		return dingsha;
	}
	public void setDingsha(String dingsha) {
		this.dingsha = dingsha;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	
}