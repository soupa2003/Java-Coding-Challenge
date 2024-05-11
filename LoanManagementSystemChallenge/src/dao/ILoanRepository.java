package dao;
import java.util.List;
import exception.InvalidLoanException;
import entity.loan;
import java.util.*;
public interface ILoanRepository
{
	void applyLoan(loan loan);
    double calculateInterest(int loanId) throws InvalidLoanException;
    String loanStatus(int loanId) throws InvalidLoanException;
    double calculateEMI(int loanId) throws InvalidLoanException;
    void loanRepayment(int loanId, double amount) throws InvalidLoanException;
    void getAllLoan();
    void getLoanById(int loanid);
}

 