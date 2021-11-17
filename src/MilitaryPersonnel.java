public abstract class MilitaryPersonnel {

    private String surname;
    private String company;
    private String rank;
    private String birth;
    private String date;
    private String unit;

    public MilitaryPersonnel(String surname, String company, String rank, String birth, String date, String unit) {
        this.surname = surname;
        this.company = company;
        this.rank = rank;
        this.birth = birth;
        this.date = date;
        this.unit = unit;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String toString() {
        return "Фамилия: " + getSurname() + "\n" + "Рота: " + getCompany() + "\n" + "Звание: " + getRank() + "\n" + "Дата рождения: " + getBirth() + "\n" + "Дата поступления на службу: " + getDate() + "\n" + "Часть: " + getUnit();
    }
}
