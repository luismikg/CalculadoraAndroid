package mx.ipn.cic.geo.calculadora_a18;

import java.util.ArrayList;

/**
 * Created by admin on 3/13/18.
 */

public class ExpressionClass {
    public static ArrayList<String> expression = new ArrayList<String>(){
        @Override
        public String toString() {
            String out = new String();
            for(int i=0; i<this.size(); i++){
                out += this.get( i );
            }
            return out;
        }
    };
}
