package main.java.am.hsp.apps.oop.design_pattern.creational.builder;

/**
 * Contains a search criteria data that the user has selected.
 * 
 * @author user
 *
 */
public final class WomenSweaterSearchCriteria {

    private final String[] size;
    private final String[] brand;
    private final String[] material;
    private final String[] sleeveLength;
    private final String[] color;
    private final String[] style;
    private final String[] pattern;
    private final String[] length;
    private final double minPrice;
    private final double maxPrice;

    /**
     * Private constructor for initializing its' members according to the Builder
     * class properties.
     * 
     * @param builder
     */
    private WomenSweaterSearchCriteria(Builder builder) {
        size = builder.size;
        brand = builder.brand;
        material = builder.material;
        sleeveLength = builder.sleeveLength;
        color = builder.color;
        style = builder.style;
        pattern = builder.pattern;
        length = builder.length;
        minPrice = builder.minPrice;
        maxPrice = builder.maxPrice;
    }

    /**
     * Returns the size.
     * 
     * @return
     */
    public String[] getSize() {
        return size.clone();
    }

    /**
     * Returns the brand.
     * 
     * @return
     */
    public String[] getBrand() {
        return brand.clone();
    }

    /**
     * Returns the material.
     * 
     * @return
     */
    public String[] getMaterial() {
        return material.clone();
    }

    /**
     * Returns the sleeve length.
     * 
     * @return
     */
    public String[] getSleeveLength() {
        return sleeveLength.clone();
    }

    /**
     * Returns the color.
     * 
     * @return
     */
    public String[] getColor() {
        return color.clone();
    }

    /**
     * Returns the style.
     * 
     * @return
     */
    public String[] getStyle() {
        return style.clone();
    }

    /**
     * Returns the pattern.
     * 
     * @return
     */
    public String[] getPattern() {
        return pattern.clone();
    }

    /**
     * Returns the length.
     * 
     * @return
     */
    public String[] getLength() {
        return length.clone();
    }

    /**
     * Returns the minimum price.
     * 
     * @return
     */
    public double getMinPrice() {
        return minPrice;
    }

    /**
     * Returns the maximum price.
     * 
     * @return
     */
    public double getMaxPrice() {
        return maxPrice;
    }

    /**
     * A nested class, which is responsible for building the searching attributes.
     * 
     * @author user
     *
     */
    static class Builder {
        private String[] size;
        private String[] brand;
        private String[] material;
        private String[] sleeveLength;
        private String[] color;
        private String[] style;
        private String[] pattern;
        private String[] length;
        private double minPrice;
        private double maxPrice;

        /**
         * Sets the size and returns the current object.
         * 
         * @param size
         * @return
         */
        public Builder size(String... size) {
            this.size = size;

            return this;
        }

        /**
         * Sets the brand and returns the current object.
         * 
         * @param brand
         * @return
         */
        public Builder brand(String... brand) {
            this.brand = brand;

            return this;
        }

        /**
         * Sets the material and returns the current object.
         * 
         * @param material
         * @return
         */
        public Builder material(String... material) {
            this.material = material;

            return this;
        }

        /**
         * Sets the length of the sleeve and returns the current object.
         * 
         * @param sleeveLength
         * @return
         */
        public Builder sleeveLength(String... sleeveLength) {
            this.sleeveLength = sleeveLength;

            return this;
        }

        /**
         * Sets the color and returns the current object.
         * 
         * @param color
         * @return
         */
        public Builder color(String... color) {
            this.color = color;

            return this;
        }

        /**
         * Sets the style and returns the current object.
         * 
         * @param style
         * @return
         */
        public Builder style(String... style) {
            this.style = style;

            return this;
        }

        /**
         * Sets the pattern and returns the current object.
         * 
         * @param pattern
         * @return
         */
        public Builder pattern(String... pattern) {
            this.pattern = pattern;

            return this;
        }

        /**
         * Sets the length and returns the current object.
         * 
         * @param length
         * @return
         */
        public Builder length(String... length) {
            this.length = length;

            return this;
        }

        /**
         * Sets the minimum price and returns the current object.
         * 
         * @param minPrice
         * @return
         */
        public Builder minPrice(double minPrice) {
            this.minPrice = minPrice;

            return this;
        }

        /**
         * Sets the maximum price and returns the current object.
         * 
         * @param maxPrice
         * @return
         */
        public Builder maxPrice(double maxPrice) {
            this.maxPrice = maxPrice;

            return this;
        }

        /**
         * Builds an object of WomenSweaterSearchCriteria type, which members are
         * initialized according to this object's members.
         * 
         * @return
         */
        public WomenSweaterSearchCriteria build() {
            return new WomenSweaterSearchCriteria(this);
        }
    }
}
