import foroshande.Froshande;
import khodro.Mashin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FroshandeMashinTest {
    @Test
    void Bayad_Tedad_Kol_Mashin_Haye_Frokhte_Shode_Ra_Be_Dast_Avarim() {

        Froshande ali = new Froshande();
        Froshande naser = new Froshande();

        ali.froshMashin();
        ali.froshMashin();
        ali.froshMashin();
        ali.froshMashin();
        naser.froshMashin();
        Assertions.assertEquals(5, Mashin.tedatFrosh);
    }
}
