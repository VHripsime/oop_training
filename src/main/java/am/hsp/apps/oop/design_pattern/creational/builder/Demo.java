package main.java.am.hsp.apps.oop.design_pattern.creational.builder;

/**
 * Demonstrating the WomenSweaterSearchCriteria class.
 * 
 * @author user
 *
 */
public class Demo {

    public static void main(String[] args) {
        WomenSweaterSearchCriteria.Builder builder = new WomenSweaterSearchCriteria.Builder();

        WomenSweaterSearchCriteria search = builder.size("XS", "S").color("Blue", "Khaki", "Black")
                .material("Wool", "Cotton").minPrice(50).maxPrice(100).build();
    }
}
