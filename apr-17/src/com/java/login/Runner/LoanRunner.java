package com.java.login.Runner;

import com.java.login.Internal.Loan;

public class LoanRunner {
    public static void main(String[] args) {
        Loan loan = new Loan();
        loan.setUserName("Harsha Kumar");
        loan.setLoanId("420");
        loan.setLoanAmt("500000");
        loan.setBranch("Basvanahalli");

        Loan loan1 = new Loan();
        loan1.setUserName("Ujwal S");
        loan1.setLoanId("120");
        loan1.setLoanAmt("10000");
        loan1.setBranch("M G Road");

        Loan loan2 = new Loan();
        loan2.setUserName("Akash H R");
        loan2.setLoanId("008");
        loan2.setLoanAmt("100000");
        loan2.setBranch("M G Road");

        boolean match = loan1.equals(loan2);
        System.out.println("The Branch is Matched "+match);

        boolean nomatch = loan.equals(loan1);
        System.out.println("The Branch  is Matched "+nomatch);

        System.out.println(loan);
        System.out.println(loan1);
        System.out.println(loan2);

    }
}
