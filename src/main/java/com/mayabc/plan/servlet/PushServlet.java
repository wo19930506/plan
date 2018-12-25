package com.mayabc.plan.servlet;

import java.util.HashMap;
import java.util.Map;

import org.tio.http.common.HeaderName;
import org.tio.http.common.HeaderValue;
import org.tio.http.common.HttpConfig;
import org.tio.http.common.HttpRequest;
import org.tio.http.common.HttpResponse;
import org.tio.http.server.annotation.RequestPath;
import org.tio.http.server.util.Resps;

@RequestPath("/plan")
public class PushServlet {
	
	@RequestPath("/push")
	public HttpResponse push(HttpRequest request,HttpConfig config){
		HttpResponse response = new HttpResponse(request);
		response.getHeaders().put(HeaderName.Access_Control_Allow_Origin ,HeaderValue.from("*"));
		
		Map<String,Object> data = new HashMap<>();
		//..... 
		//.....  业务操作
        //.....
		
		return Resps.json(request, data, "UTF-8");
	}

}
