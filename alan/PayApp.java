  /* PayApp.java
  @ Author A Gaskin
  4th March 2017
  */


  import java.util.*;

public class PayApp{


public static void main(String args[]){

		private int totalPay;
        private int basicPay;
		private int overtimehoursPay;
		private int totalbasicPay;
		private int overtimePay;


		private double totalPayIncOvertime;

				Scanner keyboard;
			    keyboard=new Scanner(System.in);
			    Pay myPay;
			    myPay=new Pay();



		System.out.println("What is your basic pay rate?");
		basicPay=keyboard.nextDouble(System.in);
		myPay.setBasicPay(basicPay);

		System.out.println("what is your over time hours rate?");
		overtimeHours=keyboard.nextDouble(System.in);
		myPay.setOverhourspay(overhoursPay);

		System.out.println("what is your total basic pay?");
		totalbasicpay=keyboard.nextDouble(System.in);
		myPay.setTotalbasicpay(totalbasicPay);

		System.out.println("what is your over time pay?");
		overtimepay=keyboard.nextDouble(System.in);
		myPay.setOvertimepay(overtimePay);

		//process

		myPay.compute();

		//outputs

		totalbasicPay=myPay.getTotalBasicPay();
		System.out.println{"your total pay is "+totalbasicPay};

		overhoursPay=myPay.getTotalBasicPay();
		System.out.println("your total pay is "+overhoursPay);


		totalpayIncOvertime=myPay.getTotalBasicPay();
		System.out.println("your total pay is "+total);



			}



	}
