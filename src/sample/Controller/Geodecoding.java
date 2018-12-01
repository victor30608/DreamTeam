package sample.Controller;
import java.io.IOException;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.common.collect.Maps;

public class Geodecoding extends AbstractSample {
    public static String decode(String args) throws IOException, JSONException {
        final String baseUrl = "https://reverse.geocoder.api.here.com/6.2/reversegeocode.json";// путь к Geocoding API по HTTP
        final Map<String, String> params = Maps.newHashMap();
        params.put("prox", args);// исходит ли запрос на геокодирование от устройства с датчиком местоположения
        params.put("mode","retrieveAddresses");// адрес, который нужно геокодировать
        params.put( "maxresults","1");
        params.put( "additionaldata","IncludeShapeLevel,postalCode");
        params.put( "gen","9");
        params.put( "app_id","dm401Yashtsawoo3xcwe");
        params.put( "app_code","o1BPH31eCiUNuIj8wWiVjw");
//        System.out.println(args);
        final String url = baseUrl + '?' + encodeParams(params);// генерируем путь с параметрами
//        System.out.println(url);// Путь, что бы можно было посмотреть в браузере ответ службы
        final JSONObject response = JsonReader.read(url);// делаем запрос к вебсервису и получаем от него ответ
        // как правило наиболее подходящий ответ первый и данные о кординатах можно получить по пути
        // //results[0]/geometry/location/lng и //results[0]/geometry/location/lat
        String ans=response.toString();
        System.out.println(ans);
        JSONArray location = response.getJSONArray("View");
//        location = location.getJSONObject("geometry");
//        location = location.getJSONObject("location");
        return "end";
    }

}