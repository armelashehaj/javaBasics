package shop;
/*Package statement , we dont have any imports here*/
import java.util.List;
/*import statement*/

public class Costumer {
    private String name;
    private List<String> interests;
    private Address address;
    /*Deklarimi i atributeve*/

    /*Constructor  ,  menyra si mund te dallosh konstruktorin
    * nga nje metode eshte se nje nje konstruktor nuk kthen
    * asnje vlere , pra eshte gjithmone void. Mund te kete me
    * shume se nje konstruktor ne nje klase*/
    public  Costumer (){

    }
    public  Costumer(String name , List<String> interests , Address address){
    this.name = name ;/**/
    this.interests = interests;
    this.address = address;
    }

    public  void  returnItem (String item){
        System.out.println("I would like to return " + item + ".");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }
}
