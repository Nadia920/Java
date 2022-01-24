package stax;

import java.util.List;

public class MenuCalculate implements PrintCalculations, EditString{

    List<Internet> interaction = new StaXParser().readConfig("D:/учёба//СиТАиРИС4,5/.idea/menu.xml");


    @Override
    public void printAveragePrice() {
        System.out.println("Средняя цена платежей: "+ averagePrice(interaction));
    }

    @Override
    public void printTheCheapest() {
        System.out.println("Самый дешёвый платёж: "+ theCheapest(interaction));
    }

    @Override
    public void printTheMostExpensive() {
        System.out.println("Самый дорогой платёж: "+ theMostExpensive(interaction));
    }

    @Override
    public void printNumberOfPayments() {
        System.out.println("Общее количество платежей : "+ numberOfPayments(interaction));
    }

    @Override
    public float averagePrice(List<Internet> interaction) {
        float result = 0;
        for (Internet internet : interaction) {
            result+=Float.parseFloat(deleteTheLastSymbol(internet.getPrice()));
        }
        return result/interaction.size();
    }

    @Override
    public Internet theCheapest(List<Internet> interaction) {
        Internet result = interaction.get(0);
        for (Internet internet : interaction) {
            if (Float.parseFloat(deleteTheLastSymbol(internet.getPrice())) < Float.parseFloat(deleteTheLastSymbol(result.getPrice())))
                result = internet;
        }
        return result;
    }

    @Override
    public Internet theMostExpensive(List<Internet> interaction) {
        Internet result = interaction.get(0);
        for (Internet internet : interaction) {
            if (Float.parseFloat(deleteTheLastSymbol(internet.getPrice())) > Float.parseFloat(deleteTheLastSymbol(result.getPrice())))
                result = internet;
        }
        return result;
    }

    @Override
    public int numberOfPayments(List<Internet> interaction) {
        return interaction.size();
    }

    @Override
    public String deleteTheLastSymbol(String str) {
        if (str != null && str.length() > 0 && str.charAt(str.length() - 1) == 'x') { /**/
            str = str.substring(0, str.length() - 1);/**/
        }
        return str;
    }
}
