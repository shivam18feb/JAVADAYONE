public class EmployeeWage{

public static void main(String[] args) {
			
			int IS_FULL_TIME = 1;
            int PER_HR = 20;
            int DAY_HR = 8;
            int empWage = 0;
            int empHrs = 0;
			
			double empCheck = Math.floor(Math.random() * 10) % 2;
			
			if (empCheck == IS_FULL_TIME) {
                        empHrs = DAY_HR;
                } 
				else {
                        empHrs = 0;
                }
 
                empWage = empHrs * PER_HR;
                System.out.println("Employee Wage: " + empWage);
			



	}
}