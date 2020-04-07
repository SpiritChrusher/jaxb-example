package legoset;

import javax.xml.bind.annotation.*;
/*import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;*/
import java.time.*;
import java.util.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class LegoSet extends Minifig{

   private Year year;
   private int pieces;

    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
   private Set<String> tags;

    @XmlElementWrapper(name = "minifigs")
    @XmlElement(name = "minifig")
   private List<Minifig> minifigs;

    public LegoSet(){}
    public LegoSet(Year year, int pieces)
    {
        this.year = year;
        this.pieces = pieces;
    }


}
