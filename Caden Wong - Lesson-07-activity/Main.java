
class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/*  
    Challenge 1:
    1) Create the variables, ask the user for the variable values, write the equation in file EQ1-act6 and display the equation value.
*/
  System.out.println("Enter x value");
  double x = Input.readDouble();
  System.out.println(Math.pow(x,7));

/*  
    Challenge 2:
    1) Create the variables, ask the user for the variable values, write the equation in fileEQ1.1-act6 and display the equation value.
*/
    System.out.println("Enter z value");
  double z = Input.readDouble();
  double q = Math.pow(z,3) + 5;
  System.out.println("q = " + q);

/*  
    Challenge 3:
    Create the variables, ask the user for the variable values, write the equation in file EQ2-act6 and display the equation value..
    
*/

     System.out.println("Enter t value");
  double t = Input.readDouble();
       System.out.println("Enter r value");
  double r = Input.readDouble();
  double s = Math.pow(t, 5) * Math.pow((r + 2), 4);
  System.out.println("s = " + s);

/*  
    Challenge 4:
    Create the variables, ask the user for the variable values, write the equation in file EQ3-act6 and display the equation value..
    
*/
     System.out.println("Enter A value");
  double A = Input.readDouble();
       System.out.println("Enter B value");
  double B = Input.readDouble();
  double C = Math.sqrt(A+B);
  System.out.println("C = " + C);

/*  
    Challenge 5:
    Create the variables, ask the user for the variable values, write the equation in file EQ4-act6 and display the equation value..
    
*/
     System.out.println("Enter x2 value");
  double x2 = Input.readDouble();
       System.out.println("Enter x1 value");
  double x1 = Input.readDouble();
     System.out.println("Enter y2 value");
  double y2 = Input.readDouble();
       System.out.println("Enter y1 value");
  double y1 = Input.readDouble();
  double d = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1, 2));
  System.out.println("d = " + d);



/*  
    Challenge 6:
    Create the variables, ask the user for the variable values, write the equation g=sin(deg) and display the equation value..
    
*/

    System.out.println("Enter degree value");
  double deg = Input.readDouble();
  double g = Math.sin(deg);
  System.out.println("g = " + g);




/*  
    Challenge 7:
    Create the variables, ask the user for the variable values, write the equation in file EQ5-act6 and display the equation value.
    
*/
     System.out.println("Enter m value");
  double m = Input.readDouble();
       System.out.println("Enter n value");
  double n = Input.readDouble();
     System.out.println("Enter n value");

  double k = Math.pow(m,5)/(Math.sqrt(n+1));
  System.out.println("k = " + k);





/*  
    *** Bonus Challenge ***:
    Create the variables, ask the user for the variable values, write the equation in file Ch-act6 and display the equation value.

    HINT: What does the "plus minus: after "-b" mean.
*/





    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}