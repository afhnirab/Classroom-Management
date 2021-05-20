import java.util.*;
import interfaces.*;
import classes.*;
import fileio.*;
import java.io.*;

public class Start
    {

	public static void main(String args[])

	{
		System.out.println("Welcome to Online Classroom Management");
		Scanner sc = new Scanner(System.in);
		Scanner multiString = new Scanner(System.in);

		Classroom c = new Classroom();
		Course cc = new Course();
		Message mes = new Message();
		StudentRecord Sreadwrite = new StudentRecord();
		CourseRecord Creadwrite = new CourseRecord();
		FacultyRecord Freadwrite = new FacultyRecord();


	     String username1="admin", password1="admin";



		boolean choice = true;
		while(choice)
		{


			try{

			System.out.println("Choose any Options-");
			System.out.println("	1. Admin");
			System.out.println("	2. Faculty");
			System.out.println("	3. student");
			System.out.println("	4. Exit\n");


			//sc = new Scanner(System.in);
			int first = sc.nextInt();

			switch(first)
			{
				case 1:

				//#####LOOOOOOOG IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIn

				/*System.out.println("Username"); String Username = sc.next();

                        System.out.println("Password");  String Password = sc.next();

                           if( username1.equals(Username) && password1.equals(Password)){ System.out.println("Welcome to the Administrator");}

						   else                       { System.out.println("Can't Log you IN"); break;} */



					boolean Admin=true;
					while(Admin){



					try{
					System.out.println("    1. Manage Student");
					System.out.println("    2. Manage Faculty");
					System.out.println("    3. Manage Course");
					System.out.println("    4. PublishNotice");
					System.out.println("	5. Log out\n");

					int manage = sc.nextInt();


		switch(manage)
		{
					case 1:


					boolean student=true;
					while(student){
						
					boolean success2=true;
					while(success2){
					try{
								System.out.println("Student Management");
								System.out.println("    1. Add Student");
								System.out.println("    2. Remove Student");
								System.out.println("    3. Show ALl Student");
								System.out.println("    4. Assign a course to Student");
								System.out.println("    5. Go back");
							   int std = sc.nextInt();
							   success2=false;

							   switch(std)
							   {
								   case 1:
					              System.out.println("Student Adding:-");


							boolean add=true;
							while(add)
				{


							System.out.println("You have Selected to Add a new Student\n");
							System.out.print(  "Enter Student Id: ");
							String Id = sc.next();

							System.out.print("Enter Student Name: ");
							String name = multiString.nextLine();

							/*System.out.print("Enter Student Admission Date: ");
							String ad = sc.nextLine();
							sc = new Scanner(System.in);*/

							System.out.print("Enter Student Mail: ");
							String mail = multiString.nextLine();

							boolean StudentAge=true;
							while(StudentAge)
					{

						try{
							System.out.print("Enter Student Age: ");
							int age = sc.nextInt();

							StudentAge=false;


                            Student s = new Student(name,Id,mail,age);
							//s.setId(Id); s.setName(name); s.setMail(mail); s.setAge(age);
							
							c.addStudent(s);
							Sreadwrite.writeinFile(mail+";"+Id+";"+"Name: "+name+";"+"Age: "+age);

							add=false;
							boolean Repeat=true;
							while(Repeat)
						{
							try{

							System.out.println("------------||||||||||--------------");
							System.out.println();
							System.out.println("1.Add another Student?");
							System.out.println("2.Go back");
							int choose = sc.nextInt();
							Repeat=false;

							if(choose == 1){ add = true; break;}
							else if(choose == 2){add=false;break;}
							else Repeat=true;
							}
							 catch(Exception f)
							{

										sc=new Scanner(System.in);
										System.out.println("////////////////////");
										System.out.println("Invalid input.Please input valid integer");
										System.out.println("////////////////////");

							}
						}

							break;
							}
							catch(Exception f)
							{

										sc = new Scanner(System.in);
										System.out.println("////////////////////");
										System.out.println("Invalid input of age. Please input valid integer");
										System.out.println("////////////////////");

							}
					}
				}
								   break;

							case 2:
					              System.out.println("Student Removing:-");
								  boolean remove=true;
							while(remove)
							{
									System.out.println("You have Selected to remove an existing Student");
									System.out.print("Enter student Id: ");
									String id = sc.next();


									if((c.getStudent(id))!= null){ c.removeStudent(c.getStudent(id));}
									else{System.out.println("Sorry, No Student Found");}
									remove=false;

									boolean repeat=true;
									while(repeat)
								{
									try{
									System.out.println("-------////////--------///////----------");
									System.out.println();
									System.out.println("1.Remove another Student?");
									System.out.println("2.Go back");

									int choose= sc.nextInt();
									repeat=false;

                  if(choose == 1){ remove = true; break;}
    							else if(choose == 2){remove=false;break;}
    							else repeat=true;

									}
                                     catch(Exception f)
							{
										sc = new Scanner(System.in);
										System.out.println("Please Input valid Value");
										 continue;
							}
								}

							}

							break;


					case 3:
										System.out.println("Showing All Student:");


     							System.out.println("You have Selected to see all students");


								c.showAllStudent();
								/*try{Sreadwrite.readFromFile();}
							    catch(Exception e){System.out.println("error handled");}*/
					  break;

						case 4:
										System.out.println("You have Selected to assign a course to a an existing Student");
										System.out.print("Available Courses "); Creadwrite.readFromFile();
										System.out.println("Input the course ID:");
										String scId = sc.next();
										System.out.println("Input the Student ID:");
										String sId = sc.next();


										(c.getStudent(sId)).setCourse(c.getCourse(scId));
								  break;
					       case 5:

											System.out.println("Exiting ");
											student=false;
											//Creadwrite.readFromFile();
							break;

						  default:

							System.out.println("Invalid Input");
							System.out.println("Please Input Correct Value:");
							break;

					}


					}
					   catch(Exception f)
			   {
						sc = new Scanner(System.in);
						System.out.println("Please Input valid Value");
                        //f.printStackTrace();
				}
						//break;

					}
					}
					break;



//---------------------------manage case ----------------1 111111111111111 end

		case 2:

					boolean faculty=true;
					while(faculty){

					boolean success3=true;
					while(success3){
					try{

		                       System.out.println("Faculty Management");
					           System.out.println("    1. Add Faculty");
							   System.out.println("    2. Remove Faculty");
							   System.out.println("    3. Show ALl Faculty");
							   System.out.println("    4. Assign a course to Faculty");
			                   System.out.println("    5. Go back");
							   int fac = sc.nextInt();
							   success3=false;

							   switch(fac)
							   {
								   case 1:
					                        System.out.println("Student Adding:-");

                              boolean add=true;
                							while(add)
                				{


                							System.out.println("You have Selected to Add a new Faculty\n");
                							System.out.print(  "Enter Faculty Id: ");
                							String Id = sc.next();

											        sc = new Scanner(System.in);
                							System.out.print("Enter Faculty Name: ");
                							String name = sc.nextLine();
                							sc = new Scanner(System.in);

                							/*System.out.print("Enter Faculty Admission Date: ");
                							String ad = sc.nextLine();
                							sc = new Scanner(System.in);*/

                							System.out.print("Enter Faculty Mail: ");
                							String mail = sc.nextLine();
                							sc = new Scanner(System.in);

                							boolean error=true;
                							while(error)
                					{

                						try{
                							System.out.print("Enter Faculty Age: ");
                							int age = sc.nextInt();

                							error=false;


											Faculty s = new Faculty(name,Id,mail,age);



                							c.addFaculty(s);
                							Freadwrite.writeinFile(mail+";"+Id+";"+"Name: "+name+";"+"Age: "+age);

                							add=false;
                							boolean repeat=true;
                							while(repeat)
                						{
                							try{

                							System.out.println("------------||||||||||--------------");
                							System.out.println();
                							System.out.println("1.Add another Faculty?");
                							System.out.println("2.Go back");
                							int choose = sc.nextInt();
                							repeat=false;

                              if(choose == 1){ add = true; break;}
                							else if(choose == 2){add=false;break;}
                							else repeat=true;

                              }
                							 catch(Exception f)
                							{

                										sc=new Scanner(System.in);
                										System.out.println("////////////////////");
                										System.out.println("Invalid input.Please input valid integer");
                										System.out.println("////////////////////");

                							}
                						}

                							break;
                							}
                							catch(Exception f)
                							{

                										sc = new Scanner(System.in);
                										System.out.println("////////////////////");
                										System.out.println("Invalid input of age. Please input valid integer");
                										System.out.println("////////////////////");

                							}
                					}
                				}								  break;

						case 2:


							   boolean remove=true;
							   while(remove)
							{
									System.out.println("You have Selected to remove an existing Faculty");
									System.out.print("Enter Faculty Id: ");
									String id = sc.next();


									if((c.getFaculty(id))!= null){ c.removeFaculty(c.getFaculty(id));}
									else{System.out.println("Sorry, No Faculty Found");}
									remove=false;

									boolean repeat=true;
									while(repeat)
								{
									try{
									System.out.println("-------////////--------///////----------");
									System.out.println();
									System.out.println("1.Remove another Faculty?");
									System.out.println("2.Go back");

									int choose= sc.nextInt();
									repeat=false;

                  if(choose == 1){ remove = true; break;}
    							else if(choose == 2){remove=false;break;}
    							else repeat=true;

									}
                                     catch(Exception f)
							{
										sc = new Scanner(System.in);
										System.out.println("Please Input valid Value");
										 continue;
							}
								}

							}

							break;

					case 3:
                                      System.out.println("You have Selected to see all Facultys");

											c.showAllFaculty();

											//Freadwrite.readFromFile();

											break;

					case 4:

                                        System.out.println("//////////////////////////////////");
										System.out.println("You have Selected to assign a course to a an existing Faculty");
										System.out.println("//////////////////////////////////");
										System.out.print("Available Courses "); 
										//Creadwrite.readFromFile();
										c.showAllcourse();
										System.out.println("//////////////////////////////////");
										System.out.println("Input the course ID:");
										String fcId = sc.next();
										System.out.println("Input the Faculty ID:");
										String fId = sc.next();


										if((c.getCourse(fcId)).setFaculty((c.getFaculty(fId)))==true)

										{

										(c.getFaculty(fId)).setCourse(c.getCourse(fcId));

										 }
					break;

					   case 5:

											System.out.println("Going Back");
											faculty=false;
											//Creadwrite.readFromFile();
							break;
							default:
											System.out.println("Invalid Input");
											break;


					}
					}
					catch(Exception f)
			   {
						sc = new Scanner(System.in);
						System.out.println("Please Input valid Value");
                        //f.printStackTrace();
				}

					}

					}

					break;

                    case 3:

					boolean course=true;
					while(course){
					boolean success4=true;
					while(success4){
					try{

	                           System.out.println("Course Management");
						       System.out.println("    1. Add Course");
							   System.out.println("    2. Remove Course");
							   System.out.println("    3. Show ALl Course");
							   System.out.println("    4. Going Back");
							   int std = sc.nextInt();
							   success4=false;
							   switch(std)
							   {
								   case 1:
								   boolean add=true;
							while(add)
				{
			                            System.out.println("You have Selected to Add a new Course\n");


										sc=new Scanner(System.in);
										System.out.print("Enter Course Id: "); String Id2 = sc.next();
										sc = new Scanner(System.in);
										System.out.print("Enter Course Name: "); String name2 = sc.nextLine();
										sc = new Scanner(System.in);
										System.out.print("Class Schedule: "); String meetTime = sc.nextLine();



										boolean error=true;
										while(error)
						{
					             try
								 {

										System.out.print("Total Student Capacity: ");
										int totalStd = sc.nextInt();
										error=false;



										Course co = new Course();
										co.setId(Id2); co.setName(name2); co.settotalStd(totalStd); co.setmeetTime(meetTime);
										c.addCourse(co);
										//Creadwrite.writeinFile("Course Name: "+name2+";"+"Course ID: "+Id2);
										add=false;

									boolean repeat=true;
									while(repeat)
								{
									try{
									System.out.println("-------////////--------///////----------");
									System.out.println();
									System.out.println("1.Add another Course?");
									System.out.println("2.Go back");

									int choose= sc.nextInt();
									repeat=false;

                  if(choose == 1){ add = true; break;}
    							else if(choose == 2){add=false;break;}
    							else repeat=true;

									}
                                     catch(Exception f)
							{
										sc = new Scanner(System.in);
										System.out.println("Please Input valid Value");
										 continue;
							}
								}
										}
								  catch(Exception f)
							{
										sc = new Scanner(System.in);
										System.out.println("Invalid Input. Input Again.");

							}
						}

				}
								   break;

								case 2:

							  boolean remove=true;
							  while(remove)
							{
									System.out.println("You have Selected to remove an existing Course");
									System.out.print("Enter Course Id: ");
									String crId = sc.next();


									if((c.getCourse(crId))!= null){ c.removeCourse(c.getCourse(crId));}
									else{System.out.println("Sorry, No Course Found");}
									remove=false;

									boolean repeat=true;
									while(repeat)
								{
									try{
									System.out.println("-------////////--------///////----------");
									System.out.println();
									System.out.println("1.Remove another Course?");
									System.out.println("2.Go back");

									int choose= sc.nextInt();
									repeat=false;

                  if(choose == 1){ remove = true; break;}
    							else if(choose == 2){remove=false;break;}
    							else repeat=true;

									}
                                     catch(Exception f)
							{
										sc = new Scanner(System.in);
										System.out.println("Please Input valid Value");
										 continue;
							}
								}

							}								break;

							case 3:

											System.out.println("You have Selected to see all courses");
											c.showAllcourse();
											//Creadwrite.readFromFile();
							break;
							case 4:

											System.out.println("Exit");
											course = false;

							break;

							default:
										System.out.println("Invalid Input");
							break;

							   }

					}
                     catch(Exception f)
			{
						sc = new Scanner(System.in);
						System.out.println("Please Input valid Value");
                        //f.printStackTrace();
				}
					}
					}

					 break;
///#########################################################course case end
                              case 4:
										System.out.println("You have Selected to Add a new Notice\n");
										System.out.print("Enter Notice: ");
										String no = multiString.nextLine();
                    multiString = new Scanner(System.in);

										Notice n = new Notice();
										n.setMessage(no);
										c.addNotice(n);
							 break;
                       case 5:
					   System.out.println("Exiting Administrator");
					  Admin =false;
                       break;

					   default:
					   System.out.println("Invalid input");
					   break;
		}
/////@###########################administrator all case end

					}

                     catch(Exception f)
			{
						sc = new Scanner(System.in);
						System.out.println("Please Input valid Value");
						continue;
                        //f.printStackTrace();
				}

					}

			    break;


		case 2:
					        //#######!!!!!!!!Faculty LOOOOOGIN
        System.out.println("Enter Your Mail");
        String fusername = sc.next();
        System.out.println("Enter Your ID");
        String Fpassword = sc.next();


        Freadwrite.verify(fusername,Fpassword);

         if(Freadwrite.verify(fusername,Fpassword)== true){
           System.out.println("Welcome to the management");

         }
         else {System.out.println("INvalid user"); break;}



				boolean faculty=true;
				while(faculty)
				{
			        boolean success=true;
					while(success)
					{
						try
						{

					System.out.println("	1.  Show profile");
					System.out.println("	2.  show courses");
					System.out.println("    3.  See notices");
					System.out.println("    4.  Send Message");
					System.out.println("	5.  Log Out");

					System.out.println("What do you want to do?");
								int second = sc.nextInt();
								success=false;

								switch(second){

									case 1: 					c.getFaculty(Fpassword).ShowDetails(); break;

									case 2:
									            System.out.println("Your Courses: ");
												(c.getFaculty(Fpassword)).ShowCourse();

									             System.out.println("1.SELECT A COURSE: ");
												 System.out.println("2.Go Back");
												 int s2 = sc.nextInt();


												    switch(s2){

													 case 1:

													 System.out.println("Enter the course ID= ");
													 String cId = sc.next();
													 (c.getCourse(cId)).showDetails();

													 System.out.println("Make a notices: ");
													 String post= sc.nextLine();
													 Notice notice = new Notice();
													 notice.setMessage(post);
													 (c.getCourse(cId)).setNotice(notice);//assigning this to that specific course
													 break;

													case 2:

													System.out.println("You have Selected to Go Back"); break;

													default:

													System.out.println("Invalid Input");  	break;

	                                                          }  break;

									    case 3: 					c.showAllNotice(); break;


										case 4:

                    boolean Smessage=true;
                  	 while(Smessage)
                  	 {
                  		 boolean error=true;
                  	 while(error)
                  	 {
                  	try{
                  		System.out.println("1. Send Message");
                  	 System.out.println("2. See Recieved Message");
                  	 System.out.println("3. Go Back");
                  	 int i= sc.nextInt();
                  	 error=false;




                  										if(i==1)
                  										{
                  										boolean sentMessage=true;
                  										while(sentMessage)
                  										{
                  											System.out.println("Enter the Reciever ID : ");
                  											String mId = sc.next();
                  											sc = new Scanner(System.in);
                  													
																	if(c.getFaculty(mId)!= null)

                  														{
                  															System.out.print("Enter the message: ");
                  															String mMessage = sc.nextLine();
                  															sc = new Scanner(System.in);

                  															mes.setMessage(mMessage);
                  															mes.setId(Fpassword);

                  															(c.getFaculty(mId)).setMessage(mes);

                  														}
                  														else if(c.getStudent(mId)!= null)

                  														{
                  															System.out.print("Enter the message: ");
                  															String mMessage = sc.nextLine();
                  															sc = new Scanner(System.in);

                  															mes.setMessage(mMessage);
                  															mes.setId(Fpassword);

                  															(c.getStudent(mId)).setMessage(mes);

                  														}
                  												else System.out.println("unable to find a ID");

                  									boolean Repeatmsg=true;
                  									while(Repeatmsg)
                  								{
                  									try{
                  									System.out.println("-------////////--------///////----------");
                  									System.out.println();
                  									System.out.println("1.Sent another message?");
                  									System.out.println("2.Go back");

                  									sc = new Scanner(System.in);
                  									int msgSent= sc.nextInt();
                  									Repeatmsg=false;

                  									if(msgSent == 1){ sentMessage = true;break;}

                  									sentMessage=false;

                  									}
                  										catch(Exception f)
                  							{
                  										sc = new Scanner(System.in);
                  										System.out.println("Please Input valid Value");
                  							}
                  								}

                  								}
                  								}

                  			if(i==2)
                  			{
                  			    (c.getStudent(Fpassword)).showMessage();

                  			 }

                  	}
                  				catch(Exception f)
                  							{
                  										sc = new Scanner(System.in);
                  										System.out.println("Please Input valid Value");
                  							}
                  	 }
                         	Smessage=false;
                  	 }													break;




											 case 5:

															System.out.println("Loogging Out");
													         faculty= false;
															  break;

												default:

													System.out.println("Invalid Input");
													break;

					                      }
										  }
                                     catch(Exception f)
							{
										sc = new Scanner(System.in);
										System.out.println("Please Input valid Value");
										 continue;
							}



							 }
				}

					break;
					case 3:
         												//#######!!!!!!!!Student LOOOOOGIN
																System.out.println("Enter Your Mail");
																String username = sc.next();
																System.out.println("Enter Your ID");
																String password = sc.next();


																Sreadwrite.verify(username,password);

															   if(Sreadwrite.verify(username,password)== true){
																   System.out.println("Welcome to the management");

															   }
															   else {System.out.println("INvalid user"); break;}

					//show profile
                      boolean student=true;
	                  while(student)
	        {

                    boolean success=true;
					while(success)
					{
						try
						{
					System.out.println("	1. Show profile");
					System.out.println("	2.  show courses");
					System.out.println("	3.  Message");
					System.out.println("	4.  Log Out");

					System.out.println("What do you want to do?");
								int second2 = sc.nextInt();
								success=false;

								switch(second2){

									case 1: 			(c.getStudent(password)).ShowDetails(); break;

									case 2:
									                 System.out.println("Your Courses: ");
													  (c.getStudent(password)).ShowCourse();

									             System.out.println("1.SELECT A COURSE: ");
												 System.out.println("2.Go Back");
												 int s2 = sc.nextInt();


												 switch(s2){

													 case 1:

													 System.out.println("Enter the course ID= ");
													 String cId = sc.next();

													 Course stuCourse = new Course();
													 stuCourse=c.getCourse(cId);
													 stuCourse.showDetails();

													 System.out.println("1.Check Post ");
													 int cp= sc.nextInt();
													 if(cp == 1){
																stuCourse.ShowNotice();break;
																}

													 break;

														case 2:

															System.out.println("You have Selected to Go Back");  break;

																default:

													System.out.println("Invalid Input");  	break;

	                                             } break;

     case 3:

     boolean Smessage=true;
   	 while(Smessage)
   	 {
   		 boolean error=true;
   	 while(error)
   	 {
   	try{
   	 System.out.println("1. Send Message");
   	 System.out.println("2. See Recieved Message");
   	 System.out.println("3. Go Back");
   	 int i= sc.nextInt();
   	 error=false;




   										if(i==1)
   										{
   										boolean sentMessage=true;
   										while(sentMessage)
   										{
   											System.out.println("Enter the Reciever ID : ");
   											String mId = sc.next();
   															sc = new Scanner(System.in);
   													if(c.getFaculty(mId)!= null)

   														{
   															System.out.print("Enter the message: ");
   															String mMessage = sc.nextLine();
   															sc = new Scanner(System.in);

   															mes.setMessage(mMessage);
   															mes.setId(password);

   															(c.getFaculty(mId)).setMessage(mes);

   														}
   														else if(c.getStudent(mId)!= null)

   														{
   															System.out.print("Enter the message: ");
   															String mMessage = sc.nextLine();
   															sc = new Scanner(System.in);

   															mes.setMessage(mMessage);
   															mes.setId(password);

   															(c.getStudent(mId)).setMessage(mes);

   														}
   												System.out.println("unable to find a ID");

   									boolean Repeatmsg=true;
   									while(Repeatmsg)
   								{
   									try{
   									System.out.println("-------////////--------///////----------");
   									System.out.println();
   									System.out.println("1.Sent another message?");
   									System.out.println("2.Go back");

   									sc = new Scanner(System.in);
   									int msgSent= sc.nextInt();
   									Repeatmsg=false;

   									if(msgSent == 1){ sentMessage = true;break;}

   									sentMessage=false;

   									}
   										catch(Exception f)
   							{
   										sc = new Scanner(System.in);
   										System.out.println("Please Input valid Value");
   							}
   								}

   								}
   								}

   			if(i==2)
   			{
   			    (c.getStudent(password)).showMessage();

   			}

   	}
   				catch(Exception f)
   							{
   										sc = new Scanner(System.in);
   										System.out.println("Please Input valid Value");
   							}
   	 }
          	Smessage=false;
   	 }									break;

												 case 4:

												   System.out.println("Loogging Out");  student=false;break;

													default:

													System.out.println("Invalid Input");  	break;


								}
								}
                                     catch(Exception f)
							{
										sc = new Scanner(System.in);
										System.out.println("Please Input valid Value");
										 continue;
							}

			}


							}
							break;


							case 4:

							System.out.println("Exiting ");
							choice=false;

                               break;

                                default:

										System.out.println("Invalid Input");
										break;




			}
				  }

						catch(InputMismatchException e)
					 {
						 sc = new Scanner(System.in);
						 System.out.println("Invalid Input. Input Again");

					}


					}

	        }

		}
