package com.java.login.Internal;

import java.util.Objects;

public class Loan {
    private String UserName;
    private String LoanId;
    private String Branch;
    private String LoanAmt;

    public void setUserName(String userName){
        this.UserName = userName;
    }
    public void setLoanId(String loanId){
        this.LoanId = loanId;
    }
    public void setBranch(String branch){
        this.Branch =branch;
    }
    public void setLoanAmt(String loanAmt){
        this.LoanAmt = loanAmt;
    }

    @Override
    public String toString() {
        return "Loan(User Name; "+UserName+ ", Loan Id " +LoanId+ ", Branch: "+Branch+ ", Loan Amount: "+LoanAmt+")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Loan){
            Loan right = (Loan)obj;

            if (Objects.equals(this.Branch,right.Branch)){
                System.out.println("Loan is Running");
                return true;
            }
        }
        return false;
    }
}
