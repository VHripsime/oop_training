package main.java.am.hsp.apps.oop.investigation.basics;

public class NestedBlocks {

    public static void main(String[] args) {

        System.out.println("Case when: n = 1");
        testJump(1);

        System.out.println();
        System.out.println();

        System.out.println("Case when: n = 2");
        testJump(2);

        System.out.println();
        System.out.println();

        System.out.println("Case when: n = 3");
        testJump(3);

        System.out.println();
        System.out.println();

        System.out.println("Case when: n = 4");
        testJump(4);
    }

    private static void testJump(int n) {
        block1: {

            System.out.println("STARTING block1");

            if (n == 1) {
                break block1;
            }

            block2: {
                System.out.println("STARTING block2");

                if (n == 2) {
                    break block2;
                }

                block3: {
                    if (n == 3) {
                        break block3;
                    }

                    System.out.println("STARTING block3");

                    if (n == 4) {
                        break block2;
                    }
                }

                System.out.println("FINISHING block2");
            }

            System.out.println("FINISHING block1");
        }
    }
}
