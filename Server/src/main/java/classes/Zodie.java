package classes;

public class Zodie {
    private int ziStart;
    private int lunaStart;
    private int ziFinal;
    private int lunaFinal;
    private String nume;

    public Zodie(int ziStart,int lunaStart,int ziFinal,int lunaFinal,String nume)
    {
        this.ziStart=ziStart;
        this.ziFinal=ziFinal;
        this.lunaFinal=lunaFinal;
        this.lunaStart=lunaStart;
        this.nume=nume;
    }

    public int getZiStart() {
        return ziStart;
    }

    public int getLunaStart() {
        return lunaStart;
    }

    public int getZiFinal() {
        return ziFinal;
    }

    public int getLunaFinal() {
        return lunaFinal;
    }

    public String getNume() {
        return nume;
    }
}
