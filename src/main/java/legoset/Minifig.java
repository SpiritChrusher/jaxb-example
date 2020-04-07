package legoset;

import javax.xml.bind.annotation.*;
/*import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;*/
import lombok.Data;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Minifig {

private String name;
private  String theme;
private String subtheme;
private String url;
private  int count;

}
