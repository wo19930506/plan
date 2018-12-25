package com.mayabc.plan;

/**
 * @see 投注计划平台主进程入口
 * @author wade
 */
public class PlanMainStarter {
	
	public static void main(String[] args) {
		try {
			HttpServerInit.init();
			
			//.....  业务初始化
			
			HttpServerInit.start();
		} catch (Exception e){
			e.printStackTrace();
		}
	}

}
