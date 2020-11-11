package government;

import java.util.Arrays;

public class Diplomat {
    private String nev;
    private String[] beszeltNyelvek;
    public Diplomat JamesBond = new Diplomat("James Bond", new String[]{"English", "German", "French"});

    private Diplomat(String nev, String[] beszeltNyelvek) {
        this.nev = nev;
        this.beszeltNyelvek = beszeltNyelvek;
    }

    public static void make(String nev, String[] beszeltNyelvek){

        String[] nevTagok = nev.split(" ");

        if (!nev.equals("")&&
                nevTagok.length==2&&
                Character.isUpperCase(nevTagok[0].charAt(0))&&
                Character.isUpperCase(nevTagok[1].charAt(0))){
            Diplomat diplomat = new Diplomat(nev, beszeltNyelvek);

        }
        else{
            Diplomat diplomat = null;
        }
    }

    public String getNev() {
        return nev;
    }

    public boolean speaks(String nyelv){
        return Arrays.stream(this.beszeltNyelvek).anyMatch(nyelv::equals);
    }

    public String[] getLanguages(){
        return this.beszeltNyelvek;
    }

    @Override
    public String toString() {
        return "Diplomat(" +nev +
                ", [" + Arrays.toString(beszeltNyelvek) +
                "])";
    }
}