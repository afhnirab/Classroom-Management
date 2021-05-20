package classes;
import interfaces.*;

public  class  Faculty extends Person implements IPerson{

	
public Faculty(String name, String Id, String mail, int age)
	{
		super(name, Id, mail, age);

	}	
	
						Course courses[] = new Course[50];
			 			Message messages[]= new Message[500];

			
			public void setCourse(Course co)
	{int flag = 0;

		for(int i=0; i<courses.length; i++)

		{if(courses[i] == null)

		{courses[i] = co; flag = 1; break;}}

		if(flag == 1){System.out.println("course Added");}
		else{System.out.println("Can Not Added");}}
		
		public void setMessage(Message m)
	{int flag = 0;

		for(int i=0; i<messages.length; i++)

		{if(messages[i] == null)

		{messages[i] = m; flag = 1; break;}}

		if(flag == 1){System.out.println("Message Succesfulyy Sended ");}
		else{System.out.println("Can Not Send the message");}}
		
		
				
	public void ShowCourse()
	
	{

			for(Course c : courses)

		{  	if(c!= null)

		{   System.out.println("//////////////////////////////////");
		
			System.out.println("Course Name: "+c.getName());



			System.out.println("//////////////////////////////////");}}
		

	}
	    public void showMessage()
	{

	int count=0;
	for(Message m : messages)

	{  
	
	if(m!= null)

	{  count++;
		System.out.println("//////////////////////////////////");
		
		System.out.println("Sender-"+m.getId());
		System.out.println("-----------------------------------------------------");
		System.out.println("Message- "+m.getMessage());

		System.out.println("//////////////////////////////////");
	}

		}
if(count==0)
{
			System.out.println("//////////////////////////////////");
            System.out.println("No Messages Found");
			System.out.println("//////////////////////////////////");
}		

	}
	
	
		//!!!!!!!!!!!!!!!!----------------add message----------###############################

	
	
	
	
	
	}
