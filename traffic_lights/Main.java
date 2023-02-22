public class Main {

    private static enum LightColour {
        RED, YELLOW, GREEN
    }

    public static boolean isDrivingAllowed(LightColour light) {

        switch (light) {
            case RED: {
                return false;
            }

            case YELLOW: {
                return false;
            }

            case GREEN: {
                return true;
            }
        }

        return false;
    }

    public static void printLight(LightColour light) {
        System.out.println(light);

        if (isDrivingAllowed(light)) {
            System.out.println("You can drive!");
        }
        else {
            System.out.println("You can't drive!");
        }
    }

    public static void main(String[] args) throws InterruptedException {

        while (true) {

            printLight(LightColour.RED);

            Thread.sleep(3000);

            printLight(LightColour.YELLOW);

            Thread.sleep(500);

            printLight(LightColour.GREEN);

            Thread.sleep(3000);

            printLight(LightColour.YELLOW);

            Thread.sleep(500);

        }
    }

}