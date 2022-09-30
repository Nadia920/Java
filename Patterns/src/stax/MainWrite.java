package stax;

import static stax.StaxWriter.createWriter;

public class MainWrite {
    public static void main(String[] args) {
        StaxWriter configFile = createWriter();
        configFile.setFile("/.idea/menu.xml");
        try {
            configFile.saveConfig();
        } catch (Exception e) {
            e.printStackTrace();/*Он печатает трассировку стека Exception до System.err.*/
        }
    }
}
