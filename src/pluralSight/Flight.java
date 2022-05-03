package pluralSight;

public class Flight {
    private  int passengers ;
    private int seats = 150;
    private  int flightNumber ;
    private  char flightClass ;

    private  static  int allPassengers  ;
    private  static int maxPassengersPerFlight ;

    static {


    }
    public  static  int getAllPassengers(){
        return allPassengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public  static  void resetAllPassengers (){
        allPassengers = 0 ;
    }
    public  void add1Passenger(){
        if(passengers < seats){
            passengers += 1 ;
            allPassengers  += 1;
        }

    }
    private  boolean[] isSeatAvailable = new boolean[seats];
    /*boolean type ka si default value false
    * duke perdorur initializon blocks mund te krijojme nje
    * instance kodi e cila i ben ato te kthehen n true
    * pra nese pyesim fillimisht A ka vende te lira ? po , sepse n ate
    * moment asnje vend nuk eshte rezervuar */

    /*pjeset e shenuara me koment do te jene pjeset e kodit
    * qe ne mund te perdornim nese nuk do donim te perdornim
    * initializon block */
    //Flight()

   public Flight(){}

    {
        for(int i = 0 ; i < seats ; i++)
            isSeatAvailable[i] = true ;
    }

    public  Flight (int flightNumber){
      //  this();
        /*pa kete funksion nuk do te behej dot run
        pasi ne nuk kemi bere lidhjen me constructorin tjeter ,
        the default constructor */
        this.flightNumber = flightNumber;
    }

    public  Flight(char flightClass){
        //this();
        this.flightClass = flightClass;
    }
}
