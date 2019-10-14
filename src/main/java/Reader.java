import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

class Reader {

    Nabolag readJson(String json) {

    JSONObject obj = new JSONObject(json);
    List hus = obj.getJSONArray("hus").toList();
    JSONArray veiListe = obj.getJSONArray("veier");
    List<Vei> veier = new ArrayList();

        for (int i = 0; i < veiListe.length(); i++) {
            String fra = veiListe.getJSONObject(i).getString("fra");
            String til = veiListe.getJSONObject(i).getString("til");
            int minuttGange = veiListe.getJSONObject(i).getInt("minutterGange");

            Vei vei = new Vei(fra, til, minuttGange);
            veier.add(vei);
        }

        return new Nabolag(hus, veier);
    }
}
