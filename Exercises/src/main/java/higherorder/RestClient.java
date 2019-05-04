package higherorder;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class RestClient {

    public void randomJoke() throws Exception {
        URL url = new URL("https://08ad1pao69.execute-api.us-east-1.amazonaws.com/dev/random_joke");
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line = null;
        StringBuilder data = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            data.append(line);
        }
        String jsonString = data.toString();
        JSONObject jsonObject = new JSONObject(jsonString);
        System.out.println(jsonObject.get("setup"));
        System.out.println(jsonObject.get("punchline"));
    }

    public void locationFor(String cityName) throws Exception {
        URL url = new URL(String.format("https://www.metaweather.com/api/location/search/?query=%s", cityName));
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line = null;
        StringBuilder data = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            data.append(line);
        }
        String jsonString = data.toString();
        JSONArray array = new JSONArray(jsonString);
        JSONObject jsonObject = array.getJSONObject(0);
        System.out.println(jsonObject.get("title"));
        System.out.println(jsonObject.get("latt_long"));
    }


}
