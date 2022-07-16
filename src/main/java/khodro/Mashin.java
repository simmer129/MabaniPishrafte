package khodro;

public class Mashin extends Khodro implements Gearbox , SandoghDar{

   public Mashin(){
        System.out.println("yek mashin bedom dade shakhte shod");
    }

   public Mashin(String mark){
        this.mark=mark;
        System.out.println("mashin ba mark"+this.mark+"sakhte shod");
    }
    //Dade:
    public boolean ayaMashinRoshanAst;
    public boolean ayaDarMashinBazAst;
    double tule;
    double arz;
    String mark;
    int gonjayeshSandogh;
    String noeDande;

    public Mashin(String mark, int gonjayeshSandogh, String noeDande) {
        this.mark=mark;
        this.gonjayeshSandogh=gonjayeshSandogh;
        this.noeDande=noeDande;
    }
    //Methode:

   public void roshan(){
        System.out.println("khodro.Mashin roshan ast.");
        ayaMashinRoshanAst = true;
    }
    void khamosh(){
        System.out.println("khodro.Mashin khamosh ast.");
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

    public boolean ayaMashinDarHalHareketAst(){
        //Dar baste bashad va mashin roshan bashad(rule);
        if (!ayaDarMashinBazAst && ayaMashinRoshanAst){
            System.out.println("khodro.Mashin dar hal harekat ast.");
            return true;
        }else {
            System.out.println("khodro.Mashin park ast.");
            return false;
        }
    }

    @Override
    public String getMark() {
        return mark;
    }
}
