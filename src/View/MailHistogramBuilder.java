
package View;
import java.util.*;
public class MailHistogramBuilder {
    
    public Model.Histogram<String> build(List<Model.Mail> lista){
        Model.Histogram<String> histo = new Model.Histogram<>();
        Iterator<Model.Mail> it = lista.iterator();
        String aux = "";
        while(it.hasNext()){
            aux = it.next().getDomain();
            histo.increment(aux);
        }
        return histo;
    }
}
