public class EmployeeWage{

public static void main(String[] args) {
			
			int IS_FULL_TIME = 1;
			int IS_PART_TIME = 2;
			
            int PER_HR = 20;
            int DAY_HR = 8;
			int PART_TIME_HR = 4;
            int empWage = 0;
            int empHrs = 0;
			
			double empCheck = Math.floor(Math.random() * 10) % 3;
			
			if (empCheck == IS_FULL_TIME) {
                        empHrs = DAY_HR;
                } 
				else if (empCheck == IS_PART_TIME) {
                        empHrs = PART_TIME_HR;
                }
				else {
                        empHrs = 0;
                }
 
                empWage = empHrs * PER_HR;
                System.out.println("Employee Wage: " + empWage);
			



	}
}