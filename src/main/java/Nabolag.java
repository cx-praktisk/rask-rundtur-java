import java.util.List;

public class Nabolag {

    List<String> hus;
    List<Vei> veier;

    Nabolag(List<String> hus, List<Vei> veier) {
        this.hus = hus;
        this.veier = veier;
    }

    public List<String> getHus() {
        return hus;
    }

    public List<Vei> getVeier() {
        return veier;
    }
}
