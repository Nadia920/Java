package stax;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StaXParser {
    static final String DISH = "client";
    static final String NAME = "name";
    static final String PRICE = "price";
    static final String DESCRIPTION = "description";
    static final String CARD = "card";

    @SuppressWarnings({ "checked", "null" })
    public List<Internet> readConfig(String configFile) {
        List<Internet> interaction = new ArrayList<Internet>();
        try {
            // First, create a new XMLInputFactory
            XMLInputFactory inputFactory = XMLInputFactory.newInstance();/*Определяет абстрактную реализацию фабрики для того, чтобы получить потоки. используется , чтобы создать новый экземпляр класса*/
            // Setup a new eventReader
            InputStream in = new FileInputStream(configFile);/*чтение байтов из файла*/
            XMLEventReader eventReader = inputFactory.createXMLEventReader(in);

            Internet internet = null;

            while (eventReader.hasNext()) {
                XMLEvent event = eventReader.nextEvent();

                if (event.isStartElement()) {
                    StartElement startElement;
                    startElement = event.asStartElement();/**/
                    // If we have an item element, we create a new item
                    if (startElement.getName().getLocalPart().equals(DISH)) {/**/
                        internet = new Internet.Builder().build();
                        // We read the attributes from this tag and add the date
                        // attribute to our object
                        Iterator<Attribute> attributes = startElement.getAttributes();
                        while (attributes.hasNext()) {
                            Attribute attribute = attributes.next();
                            if (attribute.getName().toString().equals(NAME)) {
                                internet.setName(attribute.getValue());
                            }
                        }
                    }
                    if (event.isStartElement()) {
                        if (event.asStartElement().getName().getLocalPart().equals(NAME)) {
                            event = eventReader.nextEvent();
                            assert internet != null;
                            internet.setName(event.asCharacters().getData());/**/
                            continue;
                        }
                    }


                    if (event.isStartElement()) {
                        if (event.asStartElement().getName().getLocalPart().equals(PRICE)) {
                            event = eventReader.nextEvent();
                            assert internet != null;
                            internet.setPrice(event.asCharacters().getData());
                            continue;
                        }
                    }
                    if (event.asStartElement().getName().getLocalPart().equals(DESCRIPTION)) {
                        event = eventReader.nextEvent();
                        assert internet != null;
                        internet.setDescription(event.asCharacters().getData());
                        continue;
                    }

                    if (event.asStartElement().getName().getLocalPart().equals(CARD)) {
                        event = eventReader.nextEvent();
                        assert internet != null;
                        internet.setCard(event.asCharacters().getData());
                        continue;
                    }
                }
                // If we reach the end of an item element, we add it to the list
                if (event.isEndElement()) {
                    EndElement endElement = event.asEndElement();
                    if (endElement.getName().getLocalPart().equals(DISH)) {
                        interaction.add(internet);
                    }
                }

            }
        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
        return interaction;
    }

}
