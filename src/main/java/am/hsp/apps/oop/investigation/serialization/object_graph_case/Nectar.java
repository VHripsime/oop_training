package main.java.am.hsp.apps.oop.investigation.serialization.object_graph_case;

import java.io.Serializable;

/**
 * In object graph every object should be serializable.
 * 
 * @author user
 *
 */
public class Nectar implements Serializable {

    private static final long serialVersionUID = 5498256014634577407L;
    private static final double PROPORTION = 50.0;

    private double sucroseProportion = PROPORTION;

    /**
     * Returns the sucrose proportion in nectar.
     * 
     * @return
     */
    public double getSucroseProportion() {
        return sucroseProportion;
    }
}
