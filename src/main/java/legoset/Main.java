package legoset;

import jaxb.JAXBHelper;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Year;
import java.util.ArrayList;



public class Main {

    public static void main(String[] args) throws Exception
    {

LegoSet LegoSet = new LegoSet();
LegoSet.setName("Imerial TIE Fighter");
LegoSet.setTheme("Star Wars");
LegoSet.setSubtheme("Solo");
LegoSet.setYear(Year.of(2018));

ArrayList<String> tags = new ArrayList<>();
tags.add("StarFighter");
tags.add("Stormtrooper");
tags.add("Star Wars");

        JAXBHelper.toXML(LegoSet, System.out);

       JAXBHelper.toXML(LegoSet, new FileOutputStream("legoSet.xml"));
         System.out.println(JAXBHelper.fromXML(LegoSet.class, new FileInputStream("legoSet.xml")));
    }
}
