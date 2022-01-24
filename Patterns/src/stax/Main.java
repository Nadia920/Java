package stax;

import java.util.List;

public class Main {
    //И DOM, и Sax — старые API
    /*Stax (Streaming API for XML) — это API для чтения и записи XML-документов.
     Он был представлен в Java 6.0 и считается превосходящим SAX и DOM.*/
    public static void main(String[] args) throws InterruptedException {
        StaXParser read = new StaXParser();
        List<Internet> readConfig = read.readConfig("D:/учёба//СиТАиРИС4,5/.idea/menu.xml");
        for (Object internet : readConfig) {
            System.out.println(internet);
        }
        MenuCalculate menuCalculate = new MenuCalculate();
        menuCalculate.printNumberOfPayments();
        menuCalculate.printAveragePrice();
        menuCalculate.printTheCheapest();
        menuCalculate.printTheMostExpensive();
        StaxWriter configFile = StaxWriter.createWriter();
        configFile.setFile("D:/учёба//СиТАиРИС4,5/.idea/menu.xml");

        try {
            configFile.saveConfig();
        } catch (Exception var3) {
            var3.printStackTrace();
        }
        Thread.sleep(10000);/*Мы можем приостановить выполнение потока на заданное время с помощью статического метода Thread.sleep().*/

    }
}
