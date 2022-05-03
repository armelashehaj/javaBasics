package pluralSight;

public class Main {

    Passenger bob = new Passenger();
    Passenger nia = new Passenger(3);

    public static void main(String[] args) {
//Shembull 1
        performCalculations();

        //Shembull 2

        Flight.resetAllPassengers();

        /*Krijimi i shembujve te cilat i referohen objektit
         * Flight , i cili permban passengers dhe seats */
        Flight laxToSlc = new Flight();

    laxToSlc.add1Passenger();
    laxToSlc.add1Passenger();

    Flight dfwToNyc = new Flight();
    dfwToNyc.add1Passenger();

    System.out.println(laxToSlc.getPassengers());
    System.out.println(dfwToNyc.getPassengers());
    System.out.println(Flight.getAllPassengers());

    }

    static void performCalculations() {
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];

        for (int i = 0; i < opCodes.length; i++) {
            results[i] = execute(opCodes[i], leftVals[i], rightVals[i]);
        }
        for (double currentResult : results)
            System.out.println("result = " + currentResult);

    }

    static double execute(char opCode, double leftVal, double rightVal) {
        double result;
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = rightVal != 0 ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
                break;
        }
        return result;
    }


}
