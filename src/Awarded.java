public class Awarded extends MilitaryPersonnel {

    private String title;
    private int premium;
    private int premiumAmount;

    public Awarded(String surname, String company, String rank, String birth, String date, String unit, String title, int premium, int premiumAmount) {
        super(surname, company, rank, birth, date, unit);
        this.title = title;
        this.premium = premium;
        this.premiumAmount = premiumAmount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPremium() {
        return premium;
    }

    public void setPremium(int premium) {
        this.premium = premium;
    }

    public int getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(int premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Назавание награды: " + getTitle() + "\n" + "Премия: " + getPremium() + "\n" + "Сумма надбавки: " + getPremiumAmount() + "\n";
    }
}
