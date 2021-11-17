public class MilitaryContract extends MilitaryPersonnel{

    private int period;
    private String contractDate;
    private String contractNumber;
    private int salary;

    public MilitaryContract(String surname, String company, String rank, String birth, String date, String unit, int period, String contractDate, String contractNumber, int salary) {
        super(surname, company, rank, birth, date, unit);
        this.period = period;
        this.contractDate = contractDate;
        this.contractNumber = contractNumber;
        this.salary = salary;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public String getContractDate() {
        return contractDate;
    }

    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Период договора: " + getPeriod() + "\n" + "Дата договора: " + getContractDate() + "\n" + "Номер протокола: " + getContractNumber() + "\n" + "Сумма зрплаты: " + getSalary() + "\n";
    }
}
