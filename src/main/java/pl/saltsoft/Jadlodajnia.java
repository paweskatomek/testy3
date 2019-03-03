package pl.saltsoft;

import com.google.gson.Gson;

public class Jadlodajnia {

    public void serializacja(Zupa bestZupa ) {
        Gson gson = new Gson();
        String json = gson.toJson(bestZupa);



System.out.println(json);
    }

    public Zupa deserializacja(String json) {
        Gson gson = new Gson();
        Zupa bestZupaAgain = gson.fromJson(json, Zupa.class);
        return bestZupaAgain;
    }

}
