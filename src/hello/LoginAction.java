package hello;

import org.apache.struts2.config.Result;
import org.apache.struts2.dispatcher.*;
@Result(name= "main", value = "main.action",type = ServletRedirectResult.class)


public class LoginAction extends AbstractAction
{
	private static final long serialVersionUID = 1L;
	//define class variables
	public String errmsg;
	public String userId;
	public String password;
	
	@SuppressWarnings("unchecked")
	public String execute() throws Exception
	{
		this.sessionMap.put("userId", null);
		this.userId = "Struts2";
		return "success";
	}
	
	@SuppressWarnings("unchecked")
	public String login() throws Exception
	{
		if(this.password==null || !this.password.equals("pass"))
		{//if password is not entered or password is not equals to pass
			this.password = null;
			this.errmsg = "PASSWORD is 'pass' ";
			return "error";
		}
		this.sessionMap.put("userId", this.userId);
		return "main";
	}

}
