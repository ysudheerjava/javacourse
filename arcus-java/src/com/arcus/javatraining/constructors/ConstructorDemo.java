package com.arcus.javatraining.constructors;

public class ConstructorDemo {

	public static void main(String[] args) {
	
		
		  //Creating a Student object Student student1 = new Student();
		  Student student1 = new Student();
		  //initializing student object student1.sname="Praveen"; student1.sage=20;
		  student1.gender='M';
		  
		  //retrieve the student object System.out.println("Name: "+student1.sname);
		  System.out.println("Age: "+student1.sage);
		  System.out.println("Gender: "+student1.gender);
		  
		  
		  System.out.println("****************************"); Student student2 = new
		  Student();
		  
		  //initializing student object student2.sname="Samantha"; student2.sage=25;
		  student2.gender='F';
		  
		  //retrieve the student object System.out.println("Name: "+student2.sname);
		  System.out.println("Age: "+student2.sage);
		  System.out.println("Gender: "+student2.gender);
		  
		  System.out.println("****************************");
		  System.out.println("****************************");		
		
		  Student student3 = new Student("Ram",25,'M'); Student student4 = new
		  Student("Sita",34,'F');
		  
		  System.out.println("Name: "+student3.sname);
		  System.out.println("Age: "+student3.sage);
		  System.out.println("Gender: "+student3.gender);
		  
		  System.out.println("****************************");
		  
		  System.out.println("Name: "+student4.sname);
		  System.out.println("Age: "+student4.sage);
		  System.out.println("Gender: "+student4.gender);
		 
	
	}

}
