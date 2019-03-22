
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Account account = new Account(2000,"jutro",3,new User(3666));
        System.out.println(account.getBalance());


    }
}
