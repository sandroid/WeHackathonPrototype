package wehackathonprototype.network;


import wehackathonprototype.weather.Weather;

import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Network class to call weather endpoint
 */
public interface WeatherNetworkAPI
{

    @Headers({
            "Accept: application/json",
            "Accept-Charset: utf-8",
    })
    @GET("http://api.openweathermap.org/data/2.5/weather?us&APPID=da0578f96b2dbb5b4c4f0d87f0eb1aa3&units=imperial")
    Observable<Response<Weather>> getWeather(@Query("zip") String zipCode);
}
