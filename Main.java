class Main {
  public static void main(String[] args) {
   // kindly use appropriate data types for your declaration
   // declare variables days the debtor defaulted, amount the debtor is to pay per day,amount the debtor paid and assign values to them

  int defaultedDays = 30;
  int amountPerDay = 400;
  int amountPaid = 8_000;
   
   //Declare the variable of the total amount the debtor is to pay, the days the debtor paid for, amount the debtor is left to pay, days the debtor has not payed for
  int numofDaysPaid;
  int amountToPay;
  int daysToPay;
  int amountLeftToPay;


   // calculate and print total amount the debtor is to pay
  amountToPay = defaultedDays * amountPerDay;
  System.out.println("The amount to pay is " + amountToPay);

   // calculate and print the days the debtor paid for
  numofDaysPaid = amountPaid / amountPerDay;
  System.out.println("The number of days paid for is " + numofDaysPaid);

  // calculate and print the amount whose day was not captured because the amount was incomplete
  int incompleteAmount = amountPaid % amountPerDay;
  System.out.println("The incomplete amount not captured in a day is " + incompleteAmount);

   // calculate and print amount the debtor is left to pay
  amountLeftToPay = amountToPay - amountPaid;
  System.out.println("The amount left to pay is " + amountLeftToPay);

   // calculate and print days the debtor has not payed for
  daysToPay = defaultedDays - numofDaysPaid;
  System.out.println("The days the debtor is left to pay is " +daysToPay);
   //kindly remove the statement below when you are done with the assignment
    
  }
}