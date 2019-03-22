import java.util.Date;

public class Account implements Operations{
    private Integer balance;
    private String dateStart;
    private Integer interest;
    private User owner;

    public Account() {

    }

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

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
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

    public void sayDebit(){
        System.out.println("You don't have money! Balance: " + getBalance());
    }

    public void checkDebit(){
        if (getBalance()<0){
            sayDebit();
        } else {
            System.out.println("Balance: " + getBalance());
        }
    }

    public Account(Integer balance, String dateStart, Integer interest, User owner) {
        this.balance = balance;
        this.dateStart = dateStart;
        this.interest = interest;
        this.owner = owner;
    }
}


