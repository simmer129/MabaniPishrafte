import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void Mashin_Bayad_Harekat_Konad_Vaghti_Dar_Baste_Ast_Va_Mashin_Roshan_Ast() {
        //Given
        Mashin benz = new Mashin("Benz");
        Mashin volvo = new Mashin("Volvo");

        //When
        boolean ayaHarekatMikonad = benz.ayaMashinDarHalHareketAst();
        volvo.roshan();
        boolean ayaVolvoHarekatMikonad = volvo.ayaMashinDarHalHareketAst();


        //Then

        Assertions.assertFalse(ayaHarekatMikonad);
        Assertions.assertTrue(ayaVolvoHarekatMikonad);






//        Mashin mashin = new Mashin();
//        mashin.bazKardanDar();
//        mashin.bastanDar();
//        System.out.println("Aya dar mashin baz ast?" + mashin.ayaDarMashinBazAst);
//        mashin.roshan();
//        mashin.harekat();
//
//        System.out.println("--------------------------------------------------------");
//
//        Mashin peraid = new Mashin("peraid");
//        peraid.roshan();
//        peraid.bazKardanDar();
//        peraid.harekat();

    }
    class Mashin{
        Mashin(){
            System.out.println("yek mashin bedom dade shakhte shod");
        }

        Mashin(String mark){
            this.mark=mark;
            System.out.println("mashin ba mark"+this.mark+"sakhte shod");
        }
        //Dade:
        boolean ayaMashinRoshanAst;
        boolean ayaDarMashinBazAst;
        double tule;
        double arz;
        String mark;
        //Methode:

        void roshan(){
            System.out.println("Mashin roshan ast.");
            ayaMashinRoshanAst = true;
        }
        void khamosh(){
            System.out.println("Mashin khamosh ast.");
            ayaMashinRoshanAst = false;
        }

        void bazKardanDar(){
            System.out.println("Dar baz ast.");
            ayaDarMashinBazAst = true;
        }

        void bastanDar(){
            System.out.println("Dar baste shod.");
            ayaDarMashinBazAst = false;
        }

        boolean ayaMashinDarHalHareketAst(){
            //Dar baste bashad va mashin roshan bashad(rule);
            if (!ayaDarMashinBazAst && ayaMashinRoshanAst){
                System.out.println("Mashin dar hal harekat ast.");
                return true;
            }else {
                System.out.println("Mashin park ast.");
                return false;
            }
        }
    }
}
