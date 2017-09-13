package com.http;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;

public class doGet {

	public static void main(String[] args) {
		
		System.out.println(doGet("http://testapi.mobilepulsa.com/receiver/index.php",""));
		// TODO Auto-generated method stub

	}

	 public static String doGet(String url,String charset){  
	        if(null == charset){  
	            charset = "utf-8";  
	        }  
	        HttpClient httpClient = null;  
	        HttpGet httpGet= null;  
	        String result = null;  
	          
	        try {  
	            httpClient = new SSLClient();  
	            httpGet = new HttpGet(url);  
	              
	            HttpResponse response = httpClient.execute(httpGet);  
	            if(response != null){  
	                HttpEntity resEntity = response.getEntity();  
	                if(resEntity != null){  
	                    result = EntityUtils.toString(resEntity,charset);  
	                }  
	            }  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	          
	        return result;  
	    }  
	
	
}
