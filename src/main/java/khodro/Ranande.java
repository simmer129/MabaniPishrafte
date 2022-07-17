package khodro;

//Outer Class
public class Ranande {

    private String noeGavahiname = "paye1";
    private static String nam = "Esmaeil";
    //Non-Static Nested Class : Inner Class
    public class Gavahiname{
        public void print(){
            System.out.println("Class Non Static");
            System.out.println(noeGavahiname);
            System.out.println(nam);
        }
    }

    //Static Nested Class
    public static class StaticGavahiname{
        public void print(){
            System.out.println("Class Static");
//            System.out.println(noeGavahiname);  //kar nemikonad ->
            System.out.println(nam);
        }
    }
}
