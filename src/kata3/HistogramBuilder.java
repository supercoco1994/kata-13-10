/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

/**
 *
 * @author usuario
 */
public class HistogramBuilder <Type> {
    
    public Histogram<Type> build (Type[] types){
        Histogram<Type> histogram = new Histogram<>();
        for(Type type: types){
            histogram.put(type, histogram.get(type) + 1);
        }
                
        return histogram;
    }
    
}
