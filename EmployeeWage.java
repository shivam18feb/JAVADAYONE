public class EmployeeWage{

public static void main(String[] args) {
			public static final int  IS_PART_TIME = 1;	
			public static final int  IS_FULL_TIME = 2; 	
			public static final int  PER_HR = 20; 
			public static final int  DAY_HR = 8; 
			public static final int  PART_DAY_HR= 4;
			
			
            int empHrs = 0;
			
			double empCheck = Math.floor(Math.random() * 10) % 3;
			
			switch ((int) empCheck) {
 			case IS_PART_TIME: 
 					empHrs = PART_DAY_HR; 
				break; 
			case IS_FULL_TIME: 
 					empHrs = DAY_HR; 
 				break; 
 				default: 
				empHrs = 0; 
				} 
 
                empWage = empHrs * PER_HR;
                System.out.println("Employee Wage: " + empWage);
			



	}
}