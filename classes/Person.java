package classes;
abstract class Person{
	protected String name, Id, mail;
	protected int age;
	//protected Date jd;
	
	public Person(String name, String Id, String mail, int age)
	{
	      this.name=name;
		  this.Id=Id;
		  this.age=age;
		  this.mail=mail;
		  
	}
	
	public void setId(String Id){this.Id = Id;}
	public void setName(String name){this.name = name;}
	public void setAge(int age){this.age = age;}
	public void setMail(String mail){this.mail=mail;}
	
	public String getId(){return Id;} 
	public String getName(){return name;}
	public double getAge(){return age;} 
	public String getMail(){return mail;}
	
		public void ShowDetails(){
		
		        System.out.println("student Name: "+ getName());
				System.out.println("student ID: "+getId());
				System.out.println("student age: "+getAge());
				System.out.println("Student Mail: "+getMail());
//				System.out.println("student AdmissionDate: "+getAdmissionDate());

				System.out.println();}

}

