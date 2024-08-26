import java.util.Scanner;
	public class IT24103111Lab5Q3{
	public static void main(String[]args){

	int roomChargePerDay=48000;
	int discountFor3To4Days=10;
	int discountFor5OrMoreDays=20;

	Scanner input=new Scanner(System.in);
	
	System.out.print("Enter Start Date (1-31):");
	int startDate=input.nextInt();

	System.out.print("Enter End Date (1-31):");
	int endDate=input.nextInt();

	if(startDate<1||startDate>31||endDate<1||endDate>31){
	System.out.println("Error: Days must be between 1 and 31");
	return;
	}

	if(startDate>=endDate){
	System.out.println("Error :Start Date must be less than End Date");
	return;
	}

	int daysReserved=endDate-startDate;
	int discountRate=0;
	if(daysReserved>=3 && daysReserved<5){
		discountRate=10;
	}

	else if(daysReserved>=5){
		discountRate=20;
	}
	
	double totalAmount=(roomChargePerDay*daysReserved);
	double discountAmount = totalAmount * discountRate/100.00;
	totalAmount = totalAmount - discountAmount;

	System.out.println("Room Charge Per Day: Rs "+ roomChargePerDay +".00");
	System.out.println("Number of Days Reserved:"+ daysReserved);
	System.out.println("Total amount to be Paid: "+ totalAmount); 

	}
}
	
	

	
	

	