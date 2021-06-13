package core;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.Assert;

import java.io.IOException;

public class RESTUtils {

    public Response getRequest(String url) throws IOException {

        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url(url)
                .method("GET", null)
                .build();

        return client.newCall(request).execute();

    }

    public void validateCountryPopulationByYear(Response response, String year, String population) throws IOException {


        assert response.body() != null;
        String jsonData = response.body().string();
        JsonElement jElement = new JsonParser().parse(jsonData);
        JsonObject jObject = jElement.getAsJsonObject();
        jElement = jObject.get("data");
        JsonArray jArray = jElement.getAsJsonArray();
        for (int i = 0; i < jArray.size(); i++) {
            jElement = jArray.get(i);
            System.out.println(jElement);
            jObject = jElement.getAsJsonObject();
            JsonElement elementYear = jObject.get("ID Year");
            String elementString = elementYear.getAsString();
            JsonElement elementPopuation = jObject.get("Population");
            String elementString2 = elementPopuation.getAsString();
            if (year.equals(elementString)) {
                Assert.assertEquals(population, elementString2);
            }
        }
    }
}
