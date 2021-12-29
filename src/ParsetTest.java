interface Parseable{
    public abstract void parse(String fileName);
}

class ParserManager{
    public static Parseable getParser(String type){
        if (type.equals("XML")){
            //Parseable p = new XMLParser();
            // return new p
            return new XMLParser();
        } else{
            Parseable p = new HTMLParser();
            return p;
            // = return new HTMLParser();
            }
        }
    }

class XMLParser implements Parseable{
    public void parse(String fileName){
        System.out.println(fileName + " - XML parsing completed");
    }
}
class HTMLParser implements Parseable{
    public void parse(String fileName){
        System.out.println(fileName + " - HTML parsing completed");
    }
}

public class ParsetTest {
    public static void main(String[] args){
        Parseable par = ParserManager.getParser("XML");
        par.parse("Document.xml");
        par = ParserManager.getParser("HTML");
        par.parse("Document2.html");

    }
}
