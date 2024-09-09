package pl.zabrze.zs10.kosci4a;
public class Kosc {
    private int wartosc;
    private boolean zablokowana;
    private int idObrazka;
    private int[] obrazki = {R.drawable.kosc1, R.drawable.kosc2,
    R.drawable.kosc3, R.drawable.kosc4, R.drawable.kosc5, R.drawable.kosc6};

    public void rzucKoscia(){
        if(!zablokowana){
            wartosc = (int)(Math.random()*6+1);
            idObrazka = obrazki[wartosc-1];
        }
    }
    public Kosc() {
        zablokowana = false;
        rzucKoscia();
    }
    public void odblokujzablokuj(){
        zablokowana = !zablokowana;
    }
    public int getWartosc() {
        return wartosc;
    }

    public boolean isZablokowana() {
        return zablokowana;
    }

    public int getIdObrazka() {
        return idObrazka;
    }
}
