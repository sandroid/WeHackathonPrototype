package wehackathonprototype.network;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import android.content.Context;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Get retrofit network interfaces for making network requests.
 */
public class RestClient {

    private static final String RFC_339_TIME_FORMAT = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSS'Z'";


    public static WeatherNetworkAPI getWeatherNetworkApi(Context context) {
        return getJsonRestAdapter("http://api.openweathermap.org")
                .create(WeatherNetworkAPI.class);
    }



    private static Retrofit getJsonRestAdapter(String baseURL) {
        Gson gson = new GsonBuilder()
                .setDateFormat(RFC_339_TIME_FORMAT)
                .create();
        return new Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }
}
