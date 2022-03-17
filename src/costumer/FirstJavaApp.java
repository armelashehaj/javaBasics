package costumer;

import shop.Costumer;
import shop.VIPCostumer;

import java.util.Arrays;

public class FirstJavaApp {
    public static  void main (String[] args) {
        System.out.println("Hello World" );
        Costumer costumer = new VIPCostumer();
        /*Deklarimi i nje costumer i cili ka si tip te dhenash Costumer nga package shop
        * dhe eshte nje costumer qe do te marri atributet e vena ne ate constructer
        * Ketu mund te vendosnim gjithashtu dhe VIPCostumer , dhe gjithe te tjeret te cilet jane
        * pjese e trashgimnise se Costumer , POR e kunderta NUK ndodh pasi VIPCostumer eshte
        * "femija " e Costumer*/
        costumer.setName("Armela");
        /*perdorimi i funksionit per ti dhene emer*/
        costumer.setInterests(Arrays.asList("coding"));
        /*Perdorimi i funksionit per te mbushur me interesa , Arrays.asList eshte
        gjithashtu nje funksion i cili ben mbushjen me listen e interesave*/

        System.out.println(costumer.getName() + " loves " + costumer.getInterests().get(0)  );
        /*Afishimi i emrit dhe interesave duke therritur funksionet perkatese */

    }

}
