public class CarTest {
    class Mashin{

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

        void harekat(){
            //Dar baste bashad va mashin roshan bashad(rule);
            if (!ayaDarMashinBazAst && ayaMashinRoshanAst){
                System.out.println("Mashin dar hal harekat ast.");
            }else {
                System.out.println("Mashin park ast.");
            }
        }
    }
}
