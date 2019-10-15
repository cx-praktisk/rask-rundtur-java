import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

class Reader {
    Nabolag readJson(String json) {
        Gson gson = new GsonBuilder().create();
        Nabolag n = gson.fromJson(json, Nabolag.class);
        return n;
    }
}
