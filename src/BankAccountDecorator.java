public interface BankAccountDecorator {
    String showInfo();
    String showAccountType();
    double getInterestRate();
    double computeBalanceWithInterest();
    String showBenefits();
    double getBalance();
}
