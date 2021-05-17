import java.util.Scanner;

public class MakeChange {
  public static void main(String[] args) {

    //Create Scanner
    Scanner input = new Scanner(System.in);

    //Initilize Variables
    double amount_item = 0.0;
    double cash_tendered = 0.0;
    int twenty_bill = 0;
    int ten_bill = 0;
    int five_bill = 0;
    int one_bill = 0;
    int quarter = 0;
    int dime = 0;
    int nickel = 0;
    int penny = 0;

    //Input
    //Ask for price of item
    System.out.println("Please enter the amount of the item: ");
    amount_item = (int)(input.nextDouble() * 100);

    //Ask for amount tendered
    System.out.println("Please enter the amount you paid: ");
    cash_tendered = (int)(input.nextDouble() * 100);

    input.close(); //Close Scanner

//-----------------------------------------------------------------------------

    //Calculations

    //Conditional if cash tendered less than or same amount of item
    if (cash_tendered < amount_item) {
      System.out.println("ERROR -- Insufficient Payment Amount");
    } else if (cash_tendered == amount_item) {
      System.out.println("Exact Amount -- No Change Given");
    }

    //Finding Remainder
    cash_tendered -= amount_item;

    //While loop to keep counter current
    while (cash_tendered > 0.0) {

    //$20
    if (cash_tendered >= 2000) {
      cash_tendered = cash_tendered - 2000;
      twenty_bill++;
    }

    //$10
   else if (cash_tendered >= 1000) {
      cash_tendered = cash_tendered - 1000;
      ten_bill++;

    }

    //$5
    else if (cash_tendered >= 500) {
      cash_tendered = cash_tendered - 500;
      five_bill++;
    }

    //$1
    else if (cash_tendered >= 100) {
      cash_tendered = cash_tendered - 100;
      one_bill++;
    }

    //0.25c
    else if (cash_tendered >= 25) {
      cash_tendered = cash_tendered - 25;
      quarter++;
    }

    //0.10c
    else if (cash_tendered >= 10) {
      cash_tendered = cash_tendered - 10;
      dime++;
    }

    //0.05c
    else if (cash_tendered >= 5) {
      cash_tendered = cash_tendered - 5;
      nickel++;
    }

    //0.01c
    else if (cash_tendered >= 1) {
      cash_tendered = cash_tendered - 1;
      penny++;

    }
      else {
          break;
        }

  } //While Loop

//----------------------------------------------------------------------------

//Formatted Output

if (twenty_bill > 1) {
  System.out.printf("20 Dollar Bills: %d %n", twenty_bill);
} else if (twenty_bill > 0) {
  System.out.printf("20 Dollar Bill: %d %n", twenty_bill);
}

if (ten_bill > 1) {
  System.out.printf("10 Dollar Bills: %d %n", ten_bill);
} else if (ten_bill > 0) {
  System.out.printf("10 Dollar Bill: %d %n", ten_bill);
}

if (five_bill > 1) {
  System.out.printf("5 Dollar Bills: %d %n", five_bill);
} else if (five_bill > 0) {
  System.out.printf("5 Dollar Bill: %d %n", five_bill);
}

if (one_bill > 1) {
  System.out.printf("1 Dollar Bills: %d %n", one_bill);
} else if (one_bill > 0) {
  System.out.printf("1 Dollar Bill: %d %n", one_bill);
}

if (quarter > 1) {
  System.out.printf("Quarters: %d %n", quarter);
} else if (quarter > 0) {
  System.out.printf("Quarter: %d %n", quarter);
}

if (dime > 1) {
  System.out.printf("Dimes: %d %n", dime);
} else if (dime > 0) {
  System.out.printf("Dime: %d %n", dime);
}

if (nickel > 1) {
  System.out.printf("Nickels: %d %n", nickel);
} else if (nickel > 0) {
  System.out.printf("Nickel: %d %n", nickel);
}

if (penny > 1) {
  System.out.printf("Pennies: %d %n", penny);
} else if (penny > 0) {
  System.out.printf("Penny: %d %n", penny);
}


  } //Main
} //Class
