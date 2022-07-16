package khodro;

public class NamKhodroChapKon {


    static Khodro[] khodroha;
    //Constructor
    public NamKhodroChapKon(Khodro[] khodroha) {
        this.khodroha=khodroha;
    }

    public static String execute() {
        String nameKhodroha = "";
        for (int neshaneGar = 0; neshaneGar < khodroha.length; neshaneGar ++){
            Khodro khodro = khodroha[neshaneGar];
            if (neshaneGar != khodroha.length - 1){
                nameKhodroha=nameKhodroha + khodro.getMark() + "-";
            }else {
                nameKhodroha=nameKhodroha + khodro.getMark();
            }
        }
        return nameKhodroha;
    }
}
