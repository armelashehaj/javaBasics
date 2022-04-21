package pluralSight;

public class Passenger {
    private  int checkedBags ;
    private  int freeBags ;
    private  double perBagFee ;
public  Passenger(){}

    public Passenger(int freeBags){
/*kontrollohet sipas rregulles se biznesit nese pasagjeri
* ka ose jo me shume se nje valixhe dhe nqs po
* ata paguajne 25 dollar n t kundert paguajne 50 */
    this(freeBags > 1 ? 25.0d : 50.0d);

        this.freeBags = freeBags;
    }

    public  Passenger(int freeBags , int checkedBags){
    /*mund te perdorej dhe si this.freeBags = freeBags
    * por kjo do te dublikonte kodin , ndaj ne e therrasim te tille
    * me this(freeBags)
    *
    * radha e veprimeve kur ne perdorim konstruktorin e dyte
    * eshte se ne shkojme dhe kontrollojme konstruktorin e pare
    * per te pare se sa jane free bags dhe pastaj vazhdojme me pjesen
    * tjeter te instruksioneve
    *
    * ndihmon ne specializimin e puneve  */
    this(freeBags);
    this.checkedBags = checkedBags ;
    }
    private Passenger(double perBagFee){
    this.perBagFee = perBagFee ;
    }

}
