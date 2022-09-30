package stax;

public class Internet {
    private String name;
    private String price;
    private String description;
    private String card;

    private Internet() {}

    private Internet(String name, String price, String description, String card) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.card = card;

    }

    public static class Builder {
        private final Internet newInternet;

        public Builder() {
            newInternet = new Internet();
        }

        public Internet build(){
            return newInternet;
        }

    }

    @Override
    public String toString() {

        return "Платёж\n" +
                "Название: " + name + '\n' +
                "Цена: " + price + '\n' +
                "Описание: " + description + '\n' +
                "Карта: " + card + '\n' + '\n';

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }
}