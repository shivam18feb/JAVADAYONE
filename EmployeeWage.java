public class EmployeeWage{

public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;
        public static final int PER_HR = 20;
        public static final int DAY_HR = 8;
        public static final int PART_DAY_HR = 4;
        public static final int DAYS_PER_MONTH = 20;
 
        static int days = 1;
        static int workingHours = 0;
        static int totalHours = 0;

        public static int getWorkingHours() {
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (empCheck) {
                case 1:
                        workingHours = DAY_HR;
                        break;
                case 2:
                        workingHours = PART_DAY_HR;
                        break;
                default:
                        workingHours = 0;
                        break;
                }
                return workingHours;
        }
 
        public static void main(String[] args) {
                while (days <= DAYS_PER_MONTH && totalHours <= 100) {
                        totalHours = (totalHours + getWorkingHours());
                        if (getWorkingHours() != 0) {
                                days++;
                        }
                }
                System.out.println("Employee Wage Per Month: " + (PER_HR * totalHours)); 
	}
}