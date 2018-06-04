package com.example.demo.springboot.util;

import com.example.demo.springboot.bean.Response;

public class ResultUtil {
	/** 
     * 请求成功返回 
     * @param object 
     * @return 
     */  
    public static Response success(Object object){  
    	Response response=new Response();  
    	response.setCode(200);  
    	response.setMsg("请求成功");  
    	response.setData(object);  
        return response;  
    }  
    public static Response success(){  
        return success(null);  
    }  
  
    public static Response error(Integer code,String resultmsg){  
    	Response response=new Response();  
    	response.setCode(code);  
    	response.setMsg(resultmsg);  
        return response;  
    }  
}
