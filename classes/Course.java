package  classes;
import java.lang.*;
import interfaces.*;

public class Course implements ICourse{
	 
	private String Id;
	private String name;
	private int totalStd;
	private String meetTime;
	 
	 Faculty faculties[] = new Faculty [1];
	 Notice notices[]= new Notice[100];
	 Student students[]= new Student[totalStd];
	 
	 


	
	
	public void setId(String Id){this.Id = Id;}
	public void setName(String name){this.name = name;}
	public void settotalStd(int totalStd){this.totalStd = totalStd;}
	public void setmeetTime(String meetTime){this.meetTime = meetTime;}
	//public void setfaculty(Faculty faculties){this.faculties = faculties;}
	
	public String getId(){return Id;} 
	public String getName(){return name;}
	public int gttotalStd(){return totalStd ;}
	public String getmeetTime(){return meetTime;}
	
	
		
		public boolean setFaculty(Faculty faculty)
	{		int flag=1;
			int i=0;
			if(i<=faculties.length){
			
			if(faculties[i]==null){faculties[0]=faculty;
			flag=0;
			
			}
			}
		
		if(flag==0){ System.out.println("Succesfully Assigned Course to this Faculty");return true; }
	    else{ System.out.println("One Fcaulty is already is already assigned to this course: "); return false;}
}
		public void setNotice(Notice n)
	{		
	    int flag = 0;

		for(int i=0; i<notices.length; i++)

		{if(notices[i] == null)

		{notices[i] = n; flag = 1; break;}}

		if(flag == 1){System.out.println("Notice Added Added");}
		else{System.out.println("Can Not Added");}}
		
		public void ShowNotice()
	
	{System.out.println("//////////////////////////////////");

			for(Notice c : notices)

		{  	if(c!= null)

		{   	System.out.println("Course Name: "+c.getMessage());

			

	System.out.println("//////////////////////////////////");}}}
		

	
	
	public void showDetails(){
	System.out.println("Course Name: "+getName());
				System.out.println("Course ID: "+getId());
				System.out.println("Total Student Capacity"+gttotalStd());
				System.out.println("Course meetTime: "+getmeetTime());
				//System.out.println("Course meetTime: "+getmeetTime());///student has
				System.out.println(); 
	}
	
	
}