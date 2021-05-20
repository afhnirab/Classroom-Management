package classes;
import java.util.*;
import interfaces.*;

public  class  Student extends Person implements IPerson{
	
	
			 Course courses[] = new Course[50];
			 Message messages[]= new Message[500];
			 
	public Student(String name, String Id, String mail, int age)
	{
		super(name, Id, mail, age);

	}

			
		//!!!!!!!!!!!!!!!!NNNNNNNNNOOOOOOOooooooooootIIIIIIIIIIIIIICEEEEEEEEEEES
		
		public void setMessage(Message m)
	{int flag = 0;

		for(int i=0; i<messages.length; i++)

		{if(messages[i] == null)

		{messages[i] = m; flag = 1; break;}}

		if(flag == 1){System.out.println("Message Succesfulyy Sended ");}
		else{System.out.println("Can Not Send the message");}}
		
		
			public void setCourse(Course co)
	{int flag = 0;

		for(int i=0; i<courses.length; i++)

		{if(courses[i] == null)

		{courses[i] = co; flag = 1; break;}}

		if(flag == 1){System.out.println("course Added");}
		else{System.out.println("Can Not Added");}}
	
	


	

	
	
	
	public void ShowCourse()
	{System.out.println("//////////////////////////////////");

	for(Course c : courses)

		{  if(c!= null)

			{   System.out.println("Course Name: "+ c.getName());
				System.out.println("Course ID: "+ c.getId());
				//System.out.println("student age: "+ s.getAge());
				System.out.println(); }}
				
				//else if {System.out.println("No course found");}

		System.out.println("//////////////////////////////////");}
		
		
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
	
	  public void ReplyMessage()
	{System.out.println("//////////////////////////////////");

	for(Message m : messages)

		{  if(m!= null)

	{   System.out.println("Sender-"+m.getId());
		System.out.println("-----------------------------------------------------");
		System.out.println("Message- "+m.getMessage());

		System.out.println("//////////////////////////////////");}
		}
	}


	}
	
	
	
	
	
	
	
	
	
