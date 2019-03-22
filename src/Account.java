import java.util.Date;

public class Account implements Operations{
    private Integer balance;
    private Date dateStart;
    private Integer interest;
    private User owner;

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Integer getInterest() {
        return interest;
    }

    public void setInterest(Integer interest) {
        this.interest = interest;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
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
