package  classes;
import java.lang.*;

public class Notice extends Text
{
	
	
	public void setMessage(String message){this.message = message;}
	
	
	public String getMessage(){return message;} 
	
	public void showMessage(){ System.out.println(" "+getMessage());}
	
	
	
}