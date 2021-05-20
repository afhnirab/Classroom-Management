package  classes;
import java.lang.*;

public class Message extends Text
{
	
	private String Id;
	
	public void setId (String Id){ this.Id = Id;}
	public void setMessage(String message){this.message = message;}
	
	
	public String getId (){ return Id;}
	public String getMessage(){return message;} 
	
	public void showMessage()
	{ 
		
		System.out.println("Sender-"+getId());
		System.out.println("-----------------------------------------------------");
		System.out.println("Message- "+getMessage());
		
	}

	
}