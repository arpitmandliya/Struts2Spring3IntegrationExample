package org.arpit.javaPostsForLearning;
import com.opensymphony.xwork2.ActionSupport;
public class HelloWorld extends ActionSupport{
	String message;
    public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String execute()
   {
	  return SUCCESS;
   }
}
