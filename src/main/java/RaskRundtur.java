import java.util.List;

public class RaskRundtur {

    static Reader reader = new Reader();
    static RutePlanlegger rutePlanlegger = new RutePlanlegger();

    public static void main(String[] args) {
        Nabolag nabolag = reader.readJson(input);
        int antallMinutter = rutePlanlegger.finnRaskesteRundtur(nabolag);
        System.out.println("Turen tok " + antallMinutter + " minutter");
    }

    static String input = "{\n" +
            "    \"hus\": [\n" +
            "        \"TV-aksjonen sitt kontor\",\n" +
            "        \"Jonas sitt hus\",\n" +
            "        \"Monika sitt hus\",\n" +
            "        \"Erik sitt hus\",\n" +
            "        \"Teodor sitt hus\"\n" +
            "    ],\n" +
            "    \"veier\": [\n" +
            "        { \"fra\": \"TV-aksjonen sitt kontor\", \"til\": \"Monika sitt hus\", \"minutterGange\": 30 },\n" +
            "        { \"fra\": \"TV-aksjonen sitt kontor\", \"til\": \"Erik sitt hus\", \"minutterGange\": 60 },\n" +
            "        { \"fra\": \"Jonas sitt hus\", \"til\": \"TV-aksjonen sitt kontor\", \"minutterGange\": 120 },\n" +
            "        { \"fra\": \"Jonas sitt hus\", \"til\": \"Monika sitt hus\", \"minutterGange\": 15 },\n" +
            "        { \"fra\": \"Jonas sitt hus\", \"til\": \"Erik sitt hus\", \"minutterGange\": 50 },\n" +
            "        { \"fra\": \"Monika sitt hus\", \"til\": \"Jonas sitt hus\", \"minutterGange\": 15 },\n" +
            "        { \"fra\": \"Monika sitt hus\", \"til\": \"Teodor sitt hus\", \"minutterGange\": 20 },\n" +
            "        { \"fra\": \"Erik sitt hus\", \"til\": \"TV-aksjonen sitt kontor\", \"minutterGange\": 60 },\n" +
            "        { \"fra\": \"Erik sitt hus\", \"til\": \"Jonas sitt hus\", \"minutterGange\": 50 },\n" +
            "        { \"fra\": \"Teodor sitt hus\", \"til\": \"TV-aksjonen sitt kontor\", \"minutterGange\": 15 },\n" +
            "        { \"fra\": \"Teodor sitt hus\", \"til\": \"Monika sitt hus\", \"minutterGange\": 20 },\n" +
            "        { \"fra\": \"Teodor sitt hus\", \"til\": \"Erik sitt hus\", \"minutterGange\": 40 }\n" +
            "    ]\n" +
            "}";

}
