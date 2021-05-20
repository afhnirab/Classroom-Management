package  classes;
import java.util.*;
import java.lang.*;
import interfaces.*;

public class Classroom implements StudentOperations,FacultyOperations,CourseOperations,Annoucement
{

	 Student students[] = new Student [100];
	 Faculty faculties[] = new Faculty [100];
			 Course courses[] = new Course[50];
			 	 Notice notices[]= new Notice[100];


//!!!!!!!!!!!!!!!!!!!!----------///student-------------------------

	public void addStudent(Student s)
	{
		int flag = 0;
		for(int i=0; i<students.length; i++)
		{
			if(students[i] == null)
			{
				students[i] = s;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
		System.out.println("//////////////////////////////////");
			System.out.println("Student Succesfully Added");
		System.out.println("//////////////////////////////////");
		}
		else
		{
			System.out.println("Can Not Added");
		}
	}
		
		public void removeStudent(Student s)

	{      
		

			for(int i=0; i<students.length; i++)

	{	
			if(students[i] == s)

		{	
			students[i] = null;  break; 
			
			
		} 
	}
			
	}
	public void showAllStudent()
	{
		for(Student s : students)
		{
			if(s!= null)
			{
				System.out.println("**********************************");
				System.out.println("Student Name: "+s.getName());
				System.out.println("Student ID: "+s.getId());
				System.out.println("Student age: "+s.getAge());
				System.out.println("Student mail: "+s.getMail());

				System.out.println("----------------------------------");
				System.out.println("----------------------------------");
			}
		}
	}



	public Student getStudent(String Id)

	{ Student s = null;

		for(int i=0; i<students.length; i++)

		{  if(students[i] != null)

			{  if((students[i].getId()).equals(Id))

				{   s = students[i];
					break;       }}}

		return s;}
		
		public String getStudentPass(String Id)

				{ 
				   String s = null;

					for(int i=0; i<students.length; i++)

					{  
					     if(students[i] != null)

						{  
						     if((students[i].getId()).equals(Id))

							{   
							     s= students[i].getId();	break;       
							
							}
						}
					}

					return s;
				}

	//!!!!!!!!!!!!!!!!----------------courseeeeeeeeeeeeeeeeeeeees----------###############################
	
	public void addCourse(Course co)
	{int flag = 0;

		for(int i=0; i<courses.length; i++)

		{if(courses[i] == null)

		{courses[i] = co; flag = 1; break;}}

		if(flag == 1){System.out.println("course Added");}
		else{System.out.println("Can Not Added");}}

		public void removeCourse(Course co)

	{int flag = 0;

		for(int i=0; i<courses.length; i++)

		{if(courses[i] == co)

			{courses[i] = null;  flag = 1;  break; }  }

		if(flag == 1){System.out.println("course Removed");}
		else{System.out.println("Can Not Remove");} }
		
		
	public void showAllcourse()
	{
		for(Course co : courses)
		{
			if(co != null)
			{
				System.out.println("**********************************");
				System.out.println("Course Name: "+ co.getName());
				System.out.println("Course ID: "+ co.getId());
				System.out.println("----------------------------------");
				System.out.println("----------------------------------");
				
			}		
		}
	}
			
		
		


			public Course getCourse(String Id)

		{ Course co = null;

			for(int i=0; i<courses.length; i++)

			{  if(courses[i] != null)

				{  if(courses[i].getId().equals(Id))

					{   co = courses[i];	break;       }}}

			if(co != null){System.out.println("course Found");}
			else{System.out.println("can Not Found");}return co;}


	//!!!!!!!!!!!!!!!!----------------Facultyyyyyyyyyyyyyyyyyyyyyyyyy----------###############################
		

			public void addFaculty(Faculty f)
			{int flag = 0;

				for(int i=0; i<faculties.length; i++)

				{if(faculties[i] == null)

				{faculties[i] = f; flag = 1; break;}}

				if(flag == 1){System.out.println("Faculty Added");}
				else{System.out.println("Can Not Added");}}

				public void removeFaculty(Faculty f)

			{int flag = 0;

				for(int i=0; i<faculties.length; i++)

				{if(faculties[i] == f)

					{faculties[i] = null;  flag = 1;  break; }  }

				if(flag == 1){System.out.println("Faculty Removed");}
				else{System.out.println("Can Not Remove");} }

		public Faculty getFaculty(String Id)

				{ Faculty f = null;

					for(int i=0; i<faculties.length; i++)

					{  if(faculties[i] != null)

						{  if(faculties[i].getId().equals(Id))

							{   f = faculties[i];	break;       }}}

					return f;}
					
					public String getFacultyPass(String Id)

				{ String f = null;

					for(int i=0; i<faculties.length; i++)

					{  if(faculties[i] != null)

						{  if(faculties[i].getId().equals(Id))

							{   f= faculties[i].getId();	break;       }}}

					return f;
					}
					public void showAllFaculty()
	{
		for(Faculty f : faculties)
		{
			if(f!= null)
			{
				System.out.println("**********************************");
				System.out.println("faculty Name: "+f.getName());
				System.out.println("faculty ID: "+f.getId());
				System.out.println("faculty age: "+f.getAge());
				System.out.println("faculty mail: "+f.getMail());

				System.out.println("----------------------------------");
				System.out.println("----------------------------------");
			}
		}
	}
					
					//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!#########AAAAADDDDDDMIIIIIIIN
					
///!!!!!!!!!!!!!!!!!!-------NOTICE-------------------------------

public void addNotice(Notice n)
	{
		int flag = 0;
		for(int i=0; i<notices.length; i++)
		{
			if(notices[i] == null)
			{
				notices[i] = n;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Notice Added");
		}
		else
		{
			System.out.println("Can Not Added");
		}
	}
	
	public void showAllNotice()   
	
	{
	
		System.out.println("//////////////////////////////////");

	for(Notice n : notices) 

		{  
		     if(n != null)

			{   
			    
				System.out.println(n.getMessage());

				System.out.println(); 
			  
			 }
		
		}  
		
		System.out.println("//////////////////////////////////");
		
	}
					

















}
