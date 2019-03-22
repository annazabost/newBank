public class savingsAccount extends Account implements Operations {

    private Integer savingsMoney;

    public savingsAccount(Integer balance, String dateStart, Integer interest, User owner) {
        super(balance, dateStart, interest, owner);
    }

    public Integer getSavingsMoney() {
        return savingsMoney;
    }

    public void setSavingsMoney(Integer savingsMoney) {
        this.savingsMoney = savingsMoney;
    }

    @Override
    public void addMoney(Integer money) {

        setBalance(getBalance()+money);

    }

    @Override
    public void checkBalance() {

        System.out.println("Balance: " + getBalance());

    }

    @Override
    public void outMoney(Integer money) {

        setBalance(getBalance()-money);

    }
}
