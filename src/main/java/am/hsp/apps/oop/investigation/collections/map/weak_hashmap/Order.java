package main.java.am.hsp.apps.oop.investigation.collections.map.weak_hashmap;

/**
 * Contains attributes characterizing the orders.
 * 
 * @author hripsime
 *
 */
public class Order {

    private int id;
    private String details;

    /**
     * Constructor for initializing the members by the given inputs.
     * 
     * @param id
     * @param details
     */
    public Order(int id, String details) {
        this.id = id;
        this.details = details;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((details == null) ? 0 : details.hashCode());
        result = prime * result + id;
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Order other = (Order) obj;
        if (details == null) {
            if (other.details != null)
                return false;
        } else if (!details.equals(other.details))
            return false;
        if (id != other.id)
            return false;
        return true;
    }

    /**
     * Returns the order id.
     * 
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the order id.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Returns the order details.
     * 
     * @return
     */
    public String getDetails() {
        return details;
    }

    /**
     * Sets the order details.
     * 
     * @param details
     */
    public void setDetails(String details) {
        this.details = details;
    }
}
