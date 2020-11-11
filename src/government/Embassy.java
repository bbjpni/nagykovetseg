package government;

import java.util.ArrayList;
import java.util.List;

public class Embassy {
    private String orszagnev;
    private ArrayList<Diplomat> dolgozok;

    public Embassy(String orszagnev, ArrayList<Diplomat> dolgozok) {
        this.orszagnev = orszagnev;
        this.dolgozok = dolgozok;
    }

    public void spokenLanguages(){
        List<String> nyelvek = this.dolgozok[0].getLanguages();
    }
}