class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
    

/*  
    Challenge 1:
    Create two integer variables and Assign values to them. 
    Calculate the sum of the two numbers and store the 
    calculated sum and then display it.
    
*/

int n1 = 99;
int n2 = 12;
int sum = n1 + n2;
  System.out.println(sum);
   


/*  
    Challenge 2:
    Create three variables to assign three grades and Assign values to each grade. 
    Calculate the sum of the three grades and store the 
    calculated sum and then display it.
    
*/

double g1 = 99;
double g2 = 88;
double g3 = 77;
double grade = (g1+g2+g3)/3;




/*  
    Challenge 3:
    Calculate the average from the three grades from challenge 2,
    store the value and then display it.
    Declare and assign values to any new variables
    NOTE: Does it look correct, check with a calculator?
*/

  System.out.println(grade);

/*  
    Challenge 4:
    Write the following equation in EQ1.PNG file in Java; store the result and the display it:
    Declare and assign values to any new variables

*/
  double x = 12;
  double A = 9;
  double eq1 = A/(x+1);
System.out.println(eq1);
/*  
    Challenge 5:
    Using the variables same variables from challenge4 above, write the following equation in EQ2.PNG file in Java, store the result and the display it:

    Declare and assign values to any new variables

*/
 
double eq2 = ((2*x)*(x+1)*(-x/-2))/A;
System.out.println(eq2);




/*  
    Challenge 6:
    Create the variables and write the equation in
    file  EQ3.PNG

    Declare and assign values to any new variables
*/
 
double b = 8;
double h = 9;
double eq3 = (b*h)/2;
System.out.println(eq3);



/*  
    **** Bonus Challenge ****:
    Create a variable that stores the total number of eggs 
    and assign it 100. We want to fill as many baskets with 
    eggs as we can. Each basket can hold only 12 eggs.

    1) Write the java code that will calcute how many baskets
    of 12 eggs can we fill fully.

    HINT: What do we get when we divide an integer by 
    an integer in Java

    2) Write the java code that will calculate how many eggs
    are left over after we filled as many baskets of 12 eggs.
*/

int eggs = 100;

int q1 = eggs/12;

int q2 = eggs%12;

System.out.println(q1);
System.out.println(q2);


    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}