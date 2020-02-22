package ohtu.kivipaperisakset;

public class Tekoaly {


    public Tekoaly() {
        
    }

    public String annaSiirto(Integer i) {
        String[] siirrot = new String[]{"k","p","s"};
        if (i <0 || i>2) i= 0;
        return siirrot[i];
    }

    void asetaSiirto(String ekanSiirto) {
        // ei tehdä mitään 
    }
}
