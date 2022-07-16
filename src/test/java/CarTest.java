import khodro.Mashin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void Mashin_Bayad_Harekat_Konad_Vaghti_Dar_Baste_Ast_Va_Mashin_Roshan_Ast() {
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






//        khodro.Mashin mashin = new khodro.Mashin();
//        mashin.bazKardanDar();
//        mashin.bastanDar();
//        System.out.println("Aya dar mashin baz ast?" + mashin.ayaDarMashinBazAst);
//        mashin.roshan();
//        mashin.harekat();
//
//        System.out.println("--------------------------------------------------------");
//
//        khodro.Mashin peraid = new khodro.Mashin("peraid");
//        peraid.roshan();
//        peraid.bazKardanDar();
//        peraid.harekat();

    }

}
