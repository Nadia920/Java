package stax;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StaxWriter implements Checking{
    private String configFile;
    private static StaxWriter staxWriter;

    private StaxWriter() {
        configFile = "";
    }

    public static StaxWriter createWriter(){
        if(staxWriter==null){
            staxWriter=new StaxWriter();
        }
        return staxWriter;
    }

    public void setFile(String configFile) {
        this.configFile = configFile;
    }

    public void saveConfig() throws Exception {
        String name, price, description, card;
        // create an XMLOutputFactory
        XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
        // create XMLEventWriter
        XMLEventWriter eventWriter = outputFactory
                .createXMLEventWriter(new FileOutputStream(configFile));
        // create an EventFactory
        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        XMLEvent end = eventFactory.createDTD("\n");
        // create and write Start Tag
        StartDocument startDocument = eventFactory.createStartDocument();
        eventWriter.add(startDocument);

        // create config open tag
        StartElement configStartElement = eventFactory.createStartElement("", "", "payment");
        eventWriter.add(configStartElement);
        eventWriter.add(end);

        // Write the different nodes
        int flag = 1;
        do {
            configStartElement = eventFactory.createStartElement("",
                    "", "client");
            eventWriter.add(configStartElement);
            eventWriter.add(end);
            System.out.println("Введите имя Клиента: ");
            Scanner in = new Scanner(System.in);
            name = in.nextLine();
            System.out.println("Введите стоимость платежа: ");
            price = checkInt()+"$";
            System.out.println("Введите описание платежа ");
            description = in.nextLine();
            System.out.println("Введите карту: ");
            card = in.nextLine();
            createNode(eventWriter, "name", name);/**/
            createNode(eventWriter, "price", price);
            createNode(eventWriter, "description", description);
            createNode(eventWriter, "card", card);

            eventWriter.add(eventFactory.createEndElement("", "", "client"));
            eventWriter.add(end);
            flag=checkIntOneZero();
        } while(flag == 1);
        eventWriter.add(eventFactory.createEndElement("", "", "payment"));
        eventWriter.add(end);
        eventWriter.add(eventFactory.createEndDocument());
        eventWriter.close();
    }

    private void createNode(XMLEventWriter eventWriter, String name,
                            String value) throws XMLStreamException {

        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        XMLEvent end = eventFactory.createDTD("\n");
        XMLEvent tab = eventFactory.createDTD("\t");
        // create Start node
        StartElement sElement = eventFactory.createStartElement("", "", name);
        eventWriter.add(tab);
        eventWriter.add(sElement);
        // create Content
        Characters characters = eventFactory.createCharacters(value);
        eventWriter.add(characters);
        // create End node
        EndElement eElement = eventFactory.createEndElement("", "", name);
        eventWriter.add(eElement);
        eventWriter.add(end);

    }

    @Override
    public String checkInt() {
        Pattern pattern;
        pattern = Pattern.compile("[0-9]+");
        String line;
        Matcher matcher;
        boolean flag = false;
        do {
            if(flag) System.out.println("Некорректный ввод");
            line = in.nextLine();
            matcher = pattern.matcher(line);/**/
            flag=true;
        } while(!matcher.matches());

        return line;
    }

    @Override
    public int checkIntOneZero() {
        System.out.println("Хотите добавить ещё? Введите 1.\nДостаточно? Введите 0.");
        Pattern pattern;
        pattern = Pattern.compile("[0,1]");
        String line;
        Matcher matcher;
        boolean flag = false;
        do {
            if(flag) System.out.println("Некорректный ввод");
            line = in.nextLine();
            matcher = pattern.matcher(line);
            flag=true;
        } while(!matcher.matches());

        return Integer.parseInt(line);
    }
}