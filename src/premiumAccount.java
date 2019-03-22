public class premiumAccount extends Account {

    private Integer bonus;

    public final Integer getBonus() {
        return bonus;
    }

    public premiumAccount(Integer bonus) {
        this.bonus = bonus;
    }
}