package SlozenaZadaca;

public class Time10_1 {

    private long sat;
    private long minut;
    private long sekund;

    public Time10_1() {
        long vrijeme = System.currentTimeMillis();
        this.setTime(vrijeme);
    }
    public Time10_1(long novoVrijeme) {
        this.setTime(novoVrijeme);
    }

    public Time10_1(long sat, long minut, long sekund) {
        this.sat = sat;
        this.minut = minut;
        this.sekund = sekund;
    }

    public void setTime(long podjelaVremena) {

        sat = (((podjelaVremena / 1000) / 60) / 60) % 24;

        sekund = (podjelaVremena / 1000) % 60;

        minut = ((podjelaVremena / 1000) / 60) % 60;


    }


    public long getSat() {
        return sat;
    }

    public long getMinut() {
        return minut;
    }

    public long getSekund() {
        return sekund;
    }
}
