
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

   double gpa(double GPANumb){
	if (GPANumb > 90){
		return GPANumb * 1.1;
	}
	else return GPANumb;
   }

   String BMI(double weight, double height){
		double result = (weight/Math.pow(height,2))*703;
		if (result <= 18.4) return "underweight";
		if (result >= 18.5 && result <= 24.9) return "Normal";
		if (result >= 25. && result <= 39.9) return "Overweight";
		if (result >= 40.0) return "underweight";

    String isGraduating(double Pounds, double height){
	if (seniorStatus == true && Credits == 44){
		return "Student is graduating";
	else return "Student is NOT graduating";
   }
	}

	void init(){
  
   System.out.println("Enter GPA");
   	double GPANumb = Input.readDouble();


  }

 
  
}