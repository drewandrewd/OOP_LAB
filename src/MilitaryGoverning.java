public class MilitaryGoverning extends MilitaryPersonnel{

    private String name;
    private String post;
    private int years;
    private int sum;

    public MilitaryGoverning(String surname, String company, String rank, String birth, String date, String unit, String name, String post, int years, int sum) {
        super(surname, company, rank, birth, date, unit);
        this.name = name;
        this.post = post;
        this.years = years;
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Название округа: " + getName() + "\n" + "Должность: " + getPost() + "\n" + "Выслуга лет: " + getYears() + "\n" + "Сумма надбавки: " + getSum() + "\n";
    }
}
