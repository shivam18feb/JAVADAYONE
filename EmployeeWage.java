public class EmployeeWage{

public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;
        public static final int PER_HR = 20;
        public static final int DAY_HR = 8;
        public static final int PART_DAY_HR = 4;
        public static final int DAYS_PER_MONTH = 20;
 
        public static void main(String[] args) {
                int days = 1;
                double salary = 0;
                while (days <= DAYS_PER_MONTH) {
                        double empCheck = Math.floor(Math.random() * 10) % 3;
                        switch ((int) empCheck) {
                        case IS_PART_TIME:
                                salary = (salary + (PART_DAY_HR * PER_HR));
                        break;
                        case IS_FULL_TIME:
                                salary = (salary + (DAY_HR * PER_HR));
                        break;
                        default:
                                salary = (salary + 0);
                        }
                        days++;
                }
                System.out.println("Employee Wage Per Month: " + salary); 
			



	}
}