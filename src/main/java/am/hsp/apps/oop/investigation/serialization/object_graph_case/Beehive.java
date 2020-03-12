package main.java.am.hsp.apps.oop.investigation.serialization.object_graph_case;

import java.io.Serializable;

/**
 * This class contains an object of another class, which in turn contains an
 * object of another class. This group of objects is called 'object graph'.
 * 
 * @author user
 *
 */
public class Beehive implements Serializable {

    private static final long serialVersionUID = -8571690894859802817L;

    private Bee bee = new Bee();

    /**
     * Returns a bee from the beehive.
     * 
     * @return
     */
    public Bee getBee() {
        return this.bee;
    }
}
