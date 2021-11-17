import java.util.ArrayList;

public class Lists {

    private ArrayList<MilitaryPersonnel> arr = new ArrayList<>();

    public void addMilitary(MilitaryPersonnel x) {
        arr.add(x);
    }

    public void printMilitary() {
        for (MilitaryPersonnel curr : arr) {
            System.out.println(curr.toString());
        }
    }

    public static void main(String[] args) {
        Lists list = new Lists();
        list.addMilitary(new Awarded("Deberdeev", "R-44", "General", "10/07/1996", "10/10/2010", "Main", "Great", 999, 10900));
        list.addMilitary(new MilitaryGoverning("Sidorov", "B-84", "General", "10/09/1986", "10/10/2010", "Main", "Brew", "Air", 99, 890));
        list.printMilitary();
    }
}
