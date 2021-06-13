package core;

import com.google.gson.*;

import okhttp3.Response;
import okhttp3.ResponseBody;

import java.io.IOException;

public class RESTTestClass {

    public static void main(String args[]) throws IOException {



        RESTUtils utils = new RESTUtils();
        Response response = utils.getRequest("https://datausa.io/api/data?drilldowns=Nation&measures=Population");
        String jsonData = response.body().string();
        JsonElement jElement = new JsonParser().parse(jsonData);
        JsonObject  jObject = jElement.getAsJsonObject();
        jElement = jObject.get("data");
        JsonArray jArray = jElement.getAsJsonArray();

        for(int i = 0; i < jArray.size(); i++){
            jElement = jArray.get(i);
            System.out.println(jElement);
            jObject = jElement.getAsJsonObject();
            JsonElement elementYear = jObject.get("ID Year");
            String elementString = elementYear.getAsString();
            JsonElement elementPopuation = jObject.get("Population");
            String elementString2 = elementPopuation.getAsString();
            switch(elementString){
                case "2018":
                    if (elementString2.equalsIgnoreCase("327167439")) {
                        System.out.println("PASS");
                    }else{
                        System.out.println("FAILED");
                    }
            }

        }





    }

}
