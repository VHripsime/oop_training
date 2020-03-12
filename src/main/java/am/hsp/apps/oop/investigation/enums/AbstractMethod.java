package main.java.am.hsp.apps.oop.investigation.enums;

/**
 * If we declare an abstract method inside an enum, we MUST override it in each
 * constant type, otherwise we'll get a CE.
 * 
 * @author hripsime
 *
 */
public enum AbstractMethod {

    JOB1(50) {
        @Override
        void whoAmI() {
            System.out.println("I am a Job1.");
        }
    },

    JOB2(55) {
        @Override
        void whoAmI() {
            System.out.println("I am a Job2.");
        }
    },

    JOB3(60) {
        @Override
        void whoAmI() {
            System.out.println("I am a Job3.");
        }
    };

    int payPerHour;

    AbstractMethod(int payPerHour) {
        this.payPerHour = payPerHour;
    }

    abstract void whoAmI();

    /**
     * Testing...
     * 
     * @param args
     */
    public static void main(String[] args) {
        Class<AbstractMethod> c = AbstractMethod.class;

        /**
         * Getting the job name and its payment.
         */
        for (AbstractMethod constant : c.getEnumConstants()) {
            constant.whoAmI();
            System.out.println(" - my payment per hour is " + constant.payPerHour);
        }
    }
}
