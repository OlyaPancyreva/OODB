package XML;

import Classes.Shop;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class LoadXML {
    public static Shop loadData(){
        try {
            JAXBContext context = JAXBContext.newInstance(Shop.class);
            Unmarshaller un = context.createUnmarshaller();
            return (Shop)un.unmarshal(new File("Shop.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
