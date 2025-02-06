import java.util.Scanner;

class ExpirationDate {
    private static final String MONTHS = "ABCDEFGHIJKL"; 
    private static final String DAYS = "QRSTUVWXYZ";    
    private static final int YEAR_OFFSET = 1970;      

    public String encodeDate(int month, int day, int year) {
        char monthCode = MONTHS.charAt(month - 1); 
        
        char dayTens = DAYS.charAt(day / 10);      
        char dayOnes = DAYS.charAt(day % 10);      
        
        int yearOffset = year - YEAR_OFFSET;
        char yearCode = (char) (90 - yearOffset);  
        
        return "" + monthCode + dayTens + dayOnes + yearCode;
    }

    public String decodeDate(String code) {
        char monthCode = code.charAt(0);
        int month = MONTHS.indexOf(monthCode) + 1;
        
        char dayTens = code.charAt(1);
        char dayOnes = code.charAt(2);
        int day = DAYS.indexOf(dayTens) * 10 + DAYS.indexOf(dayOnes);
        
        char yearCode = code.charAt(3);
        int yearOffset = 90 - (int) yearCode;  
        int year = YEAR_OFFSET + yearOffset;
        
        return month + "/" + day + "/" + year;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExpirationDate expirationDate = new ExpirationDate();

        while (true) {
            System.out.println("-----menu-----");
            System.out.println("0) Quit");
            System.out.println("1) Encode Date");
            System.out.println("2) Decode Date");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();  
            
            if (option == 0) {
                break;
            } else if (option == 1) {
                System.out.print("Enter date (m/d/y): ");
                String dateStr = scanner.nextLine();
                String[] dateParts = dateStr.split("/");
                int month = Integer.parseInt(dateParts[0]);
                int day = Integer.parseInt(dateParts[1]);
                int year = Integer.parseInt(dateParts[2]);
                
                String code = expirationDate.encodeDate(month, day, year);
                System.out.println("The code is: " + code);
            } else if (option == 2) {
                System.out.print("Enter the code: ");
                String code = scanner.nextLine();
                String decodedDate = expirationDate.decodeDate(code);
                System.out.println("The date is: " + decodedDate);
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
