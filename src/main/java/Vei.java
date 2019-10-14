public class Vei {

    String fra;
    String til;
    int minutterGange;

    Vei(String fra, String til, int minutterGange) {
        this.fra = fra;
        this.til = til;
        this.minutterGange = minutterGange;
    }

    public String getFra() {
        return fra;
    }

    public String getTil() {
        return til;
    }

    public int getMinutterGange() {
        return minutterGange;
    }
}
