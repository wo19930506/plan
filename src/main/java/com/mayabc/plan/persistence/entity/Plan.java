package com.mayabc.plan.persistence.entity;

import java.util.Date;

public class Plan {
	
	private long id;
	private String gameNo;   //期号
    private String gameType; //游戏类型    
	private String result;   //结果号码
    private Date resultTime; //结果时间
    private String forecast; //预测号码

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getGameNo() {
		return gameNo;
	}
	public void setGameNo(String gameNo) {
		this.gameNo = gameNo;
	}
	public String getGameType() {
		return gameType;
	}
	public void setGameType(String gameType) {
		this.gameType = gameType;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Date getResultTime() {
		return resultTime;
	}
	public void setResultTime(Date resultTime) {
		this.resultTime = resultTime;
	}
	public String getForecast() {
		return forecast;
	}
	public void setForecast(String forecast) {
		this.forecast = forecast;
	}

}