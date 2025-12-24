public class UpSave implements BankAccountDecorator {
    private BankAccountDecorator bankAccount;

    public UpSave(BankAccountDecorator bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String showInfo() {
        return bankAccount.showInfo();
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public double getInterestRate() {
        return 0.04;
    }

    @Override
    public double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public double computeBalanceWithInterest() {
        return getBalance() * (1 + getInterestRate());
    }

    @Override
    public String showBenefits() {
        return bankAccount.showBenefits() + ", With Insurance";
    }
}
