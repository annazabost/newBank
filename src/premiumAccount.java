public class premiumAccount extends Account implements Operations {

    private Integer bonus;

    public final Integer getBonus() {
        return bonus;
    }

    public premiumAccount(Integer bonus) {
        this.bonus = bonus;
    }


    @Override
    public void addMoney(Integer money) {
        setBalance(getBonus()+money + getBalance());
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