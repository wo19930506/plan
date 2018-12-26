package com.effecia.plan.util;

import java.net.URISyntaxException;

import org.apache.log4j.Logger;
import org.lionsoul.ip2region.DataBlock;
import org.lionsoul.ip2region.DbConfig;
import org.lionsoul.ip2region.DbSearcher;
import org.lionsoul.ip2region.Util;

public class IpUtil {
	private static Logger logger = Logger.getLogger(IpUtil.class);
	private static IpUtil ipUtil = null;
	private static DbConfig config = null;
	private static DbSearcher searcher = null;
	
	public static void init(String ipdatxCN) throws Exception{
		if(config == null){
			config = new DbConfig();
			searcher = new DbSearcher(config, ipdatxCN);
		}
		if(searcher == null){
			searcher = new DbSearcher(config, ipdatxCN);
		}
	}
	
	private static void initIpUtil() throws Exception {
		if (ipUtil == null) {
			logger.warn("ip2region.db url: "+ IpUtil.class.getResource("/").toURI().getPath().toString().replace("vfs:", "").replace("file:", "").replace("com/effecia/ag/util", ""));
			String url = IpUtil.class.getResource("").toURI().getPath().replace("vfs:", "").replace("file:", "").replace("/com/mayabc/ag/util", "");
			logger.warn("url :"+url+"ip2region.db");
			ipUtil = new IpUtil();
			init(url+"ip2region.db");  //https://gitee.com/lionsoul/ip2region/tree/master/data 下载最新db包
		}
	}
	
	public static String getAddress(String ip) throws Exception{		
		if(ip.equals("0:0:0:0:0:0:0:1")){
			return "局域网|0|0|0|0";
		}
		if(!Util.isIpAddress(ip)){
			return "未知|0|0|0|0";
		}
		initIpUtil();
		DataBlock block2 = searcher.btreeSearch(ip);
		if(block2 == null){
			return "未知|0|0|0|0";
		} else {
			return block2.getRegion();
		}
	}
	
	
	public static void main(String[] args) throws Exception {
		String ipaddr = IpUtil.getAddress("49.51.46.0");
		System.out.println(ipaddr);
	}
}