package com.mayabc.plan;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tio.http.common.HttpConfig;
import org.tio.http.common.handler.HttpRequestHandler;
import org.tio.http.server.HttpServerStarter;
import org.tio.http.server.handler.DefaultHttpRequestHandler;
import org.tio.http.server.mvc.Routes;
import org.tio.utils.SystemTimer;

import com.jfinal.kit.PropKit;

/**
 * @author 初始化相关参数，启动HTTP服务
 */
public class HttpServerInit {
	private static Logger log = LoggerFactory.getLogger(HttpServerInit.class);

	public static HttpConfig httpConfig;

	public static HttpRequestHandler requestHandler;

	public static HttpServerStarter httpServerStarter;

	public static void init() throws Exception { 
		PropKit.use("conf/app.properties");  //预加载系统配置文件	
		PropKit.append("conf/db.properties");   //数据库配置文件
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-mybatis.xml");
		context.start();    //加载spring
	}
	
	public static void start() throws IOException{
		long start = SystemTimer.currentTimeMillis(); 
		int port = PropKit.getInt("http.port");    //启动端口
		String pageRoot = PropKit.get("http.page");//html/css/js等的根目录，支持classpath:，也支持绝对路径
		String[] scanPackages = new String[] { PlanMainStarter.class.getPackage().getName() };//LG mvc需要扫描的根目录包
		httpConfig = new HttpConfig(port, null, null, null);
		httpConfig.setPageRoot(pageRoot);
		
		Routes routes = new Routes(scanPackages);
		DefaultHttpRequestHandler requestHandler = new DefaultHttpRequestHandler(httpConfig, routes);
				
		httpServerStarter = new HttpServerStarter(httpConfig, requestHandler);
		httpServerStarter.start();
		
		long end = SystemTimer.currentTimeMillis();
		long iv = end - start;
		log.info("Plan Http Server启动完毕,耗时:{}ms,访问地址:http://127.0.0.1:{}", iv, port);
	}
	

	public HttpServerInit() {}
}