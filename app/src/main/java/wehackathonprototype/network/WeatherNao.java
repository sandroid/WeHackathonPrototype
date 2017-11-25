package wehackathonprototype.network;

import wehackathonprototype.weather.Weather;

import android.content.Context;

import retrofit2.Response;
import rx.Observable;
import rx.functions.Func1;


/**
 * Network class to call login endpoint with swoosh credentials to get employee prices in
 * Webview Cart
 * Endpoint is called when swoosh pricing is enabled in Settings
 * Swoosh cookies expire every 30 minutes and user will need to re-login upon expiration
 * Swoosh prices will only be visible in Webview Cart, and will not be visible in app
 * (gridwall or PDP will not display employee prices)
 */
public final class WeatherNao {

    private static final String TAG = WeatherNao.class.getSimpleName();

    private WeatherNao() {

    }

    /**
     * Network class to call weather endpoint
     * @param zipCode
     */
    public static Observable<Weather> getWeather(Context context, String zipCode) {
        return RestClient.getWeatherNetworkApi(context)
                .getWeather(zipCode)
                .flatMap(new Func1<Response<Weather>, Observable<Weather>>() {
                    @Override
                    public Observable<Weather> call(
                            Response<Weather> response) {
                        return Observable.just(response.body());
                    }
                });
    }
}