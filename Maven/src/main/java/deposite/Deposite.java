package deposite;

import java.util.*;

public class Deposite {
    private int id;
    private DepositeType type;
    private String title;
    private double percent;
    private String term;
    private String description;
    private String currency;

    private static Map<Integer, Deposite> allDeposite = new HashMap<>();;
    private static int countId = 0;

    public Deposite(DepositeType type, String title, double percent, String term, String description, String currency) {
        this.type = type;
        this.title = title;
        this.percent = percent;
        this.term = term;
        this.description = description;
        this.currency = currency;


        if (!hasDeposite()) {
            countId++;
            this.id = countId;
            allDeposite.put(id, this);
        }
    }

    private boolean hasDeposite() {
        for (Deposite deposite : allDeposite.values()) {
            if (deposite.equals(this) && deposite.hashCode() == this.hashCode()) {
                return true;
            }
        }
        return false;
    }

    public DepositeType getType() { return type; }
    public String getTitle() { return title; }
    public double getPercent() { return percent; }
    public String getTerm() { return term; }
    public String getDescription() { return description; }
    public String getCurrency() { return currency; }

    public void setType(DepositeType type) { this.type = type; }
    public void setTitle(String title) { this.title = title; }
    public void setPercent(double percent) { this.percent = percent; }
    public void setTerm(String term) { this.term = term; }
    public void setDescription(String description) { this.description = description; }
    public void setCurrency(String currency) { this.currency = currency; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deposite deposite = (Deposite) o;
        return type == deposite.type && Objects.equals(title, deposite.title) && Objects.equals(currency, deposite.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, title, currency);
    }

    @Override
    public String toString() {
        return "deposite.Deposite{" +
                "id=" + id +
                ", type=" + type +
                ", title='" + title + '\'' +
                ", percent=" + percent +
                ", term='" + term + '\'' +
                ", description='" + description + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }

    public static List<Deposite> getAllDeposite(){
        return new ArrayList<>(allDeposite.values());
    }

    public static List<Deposite> getAllDeposite(DepositeType type){
        List<Deposite> listAllUsers = new ArrayList<>();
        for (Deposite deposite : allDeposite.values()){
            if (deposite.type == type){
                listAllUsers.add(deposite);
            }
        }
        return listAllUsers;
    }

    public static int getHowManyDeposite(){
        return allDeposite.size();
    }

    public static int getHowManyDeposite(DepositeType type){
        return getAllDeposite(type).size();
    }

    public static double getAllPercent(){
        double countPercent = 0.0;
        for (Deposite deposite : allDeposite.values()){
            countPercent += deposite.percent;
        }
        return countPercent;
    }

    public static double getAllPercent(DepositeType type){
        double countPercent = 0.0;
        for (Deposite deposite : getAllDeposite(type)){
            countPercent += deposite.percent;
        }
        return countPercent;
    }

    public static double getAveragePercentOfAllDeposite(){
        return getAllPercent() / getHowManyDeposite();
    }

    public static double getAveragePercentOfAllDeposite(DepositeType type){
        return getAllPercent(type) / getHowManyDeposite(type);
    }

    /*public static void main(String[] args) {
       new deposite.Deposite(deposite.DepositeType.SHORT_TERM_DEPOSITE, "Урожайный Отзывный",4.5, "от 3 месяцев", "Плавающая ставка, с капитализацией", "BYN");
       new deposite.Deposite(deposite.DepositeType.SAVING_DEPOSITE, "Беларусбанк-онлайн", 12.4, "от 3 месяцев", "Выплата процентов ежемесячно", "USD");
      new deposite.Deposite(deposite.DepositeType.TIME_DEPOSITE, "Легкий", 11.1, "От 90 до 720 дней", "Возможность пополнения и отзыва, гибкие условия размещения", "BYN");

        System.out.println("Все депозиты:");
        deposite.Deposite.getAllDeposite().forEach(System.out::println);
        System.out.println("Все депозиты: SHORT_TERM_DEPOSITE");
        deposite.Deposite.getAllDeposite(deposite.DepositeType.SHORT_TERM_DEPOSITE).forEach(System.out::println);
        System.out.println("Все депозиты: SAVING_DEPOSITE");
        deposite.Deposite.getAllDeposite(deposite.DepositeType.SAVING_DEPOSITE).forEach(System.out::println);
        System.out.println("================================================");
        System.out.println("       всех депозитов: " + deposite.Deposite.getHowManyDeposite());
        System.out.println("  всех депозитов SHORT_TERM_DEPOSITE: " + deposite.Deposite.getHowManyDeposite(deposite.DepositeType.SHORT_TERM_DEPOSITE));
        System.out.println("всех депозитов SAVING_DEPOSITE: " + deposite.Deposite.getHowManyDeposite(deposite.DepositeType.SAVING_DEPOSITE));
        System.out.println("================================================");
        System.out.println("       общий процент всех депозитов: " + deposite.Deposite.getAllPercent());
        System.out.println("  общий процент всех депозитов SHORT_TERM_DEPOSITE: " + deposite.Deposite.getAllPercent(deposite.DepositeType.SHORT_TERM_DEPOSITE));
        System.out.println("общий процент всех депозитов SAVING_DEPOSITE: " + deposite.Deposite.getAllPercent(deposite.DepositeType.SAVING_DEPOSITE));
        System.out.println("================================================");
        System.out.println("       средний процент всех депозитов: " + deposite.Deposite.getAveragePercentOfAllDeposite());
        System.out.println("  средний процент всех депозитов SHORT_TERM_DEPOSITE: " + deposite.Deposite.getAveragePercentOfAllDeposite(deposite.DepositeType.SHORT_TERM_DEPOSITE));
        System.out.println("средний процент всех депозитов SAVING_DEPOSITE: " + deposite.Deposite.getAveragePercentOfAllDeposite(deposite.DepositeType.SAVING_DEPOSITE));
        System.out.println("================================================");
    }*/
}

