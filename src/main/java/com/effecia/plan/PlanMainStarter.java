package com.effecia.plan;

import com.effecia.plan.consts.cache.CommonBuffer;

/**
 * @see 投注计划平台主进程入口
 * @author wade
 */
public class PlanMainStarter {
	
	public static void main(String[] args) {
		try {
			HttpServerInit.init();
			
			for(int i=0;i<20;i++){
				CommonBuffer.getExecutor().execute(CommonBuffer.getResultServer());
			}

			/** 启动mina连接 **/
			CommonBuffer.getOddsClient().start();
			
			HttpServerInit.start();
		} catch (Exception e){
			e.printStackTrace();
		}
	}

}
