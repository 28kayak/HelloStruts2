package hello;

import java.util.*;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class AbstractAction extends ActionSupport implements ServletResponseAware,SessionAware
{
	private static final long serialVersionUID = 1L;
	public HttpServletResponse response;
	@SuppressWarnings("rawtypes")
	public Map sessionMap;
	
	public void setServletResponse(HttpServletResponse response)
	{
		this.response = response;
	}
	public void setSession(@SuppressWarnings("rawtypes") Map sessionMap)
	{
		this.sessionMap = sessionMap;
	}
	

}
