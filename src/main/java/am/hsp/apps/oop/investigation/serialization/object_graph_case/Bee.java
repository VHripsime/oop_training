package main.java.am.hsp.apps.oop.investigation.serialization.object_graph_case;

import java.io.Serializable;

/**
 * In object graph every object should be serializable.
 * 
 * @author user
 *
 */
public class Bee implements Serializable {
  
    private static final long serialVersionUID = 8312769726099843099L;
    
    private Nectar nectar = new Nectar();

    /**
     * Returns the nectar collected by the bee.
     * 
     * @return
     */
    public Nectar getNectar() {
        return this.nectar;
    }
}
