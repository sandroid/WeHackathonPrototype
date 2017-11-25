package wehackathonprototype.ui;


import com.wehackathonprototype.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import wehackathonprototype.network.WeatherNao;
import wehackathonprototype.weather.Weather;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WeatherFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WeatherFragment extends Fragment {

    private static final String ZIP_CODE = "zip_code";
    public static final String TAG = "TAG";
    private String mZipCode;

    public WeatherFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment WeatherFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static WeatherFragment newInstance(String zipCode) {
        WeatherFragment fragment = new WeatherFragment();
        Bundle args = new Bundle();
        args.putString(ZIP_CODE, zipCode);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mZipCode = getArguments().getString(ZIP_CODE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_weather, container, false);
        String zipCode = getArguments().getString(ZIP_CODE);
        final TextView name = (TextView)view.findViewById(R.id.name);
        final TextView description = (TextView)view.findViewById(R.id.description);
        final TextView temp = (TextView)view.findViewById(R.id.temp);

        WeatherNao.getWeather(getActivity(), zipCode)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<Weather>() {
                    @Override
                    public void call(Weather weatherResponse) {

                        if (weatherResponse != null) {
                            name.setText(weatherResponse.getName());
                            description.setText(weatherResponse.getWeather().get(0).getDescription());
                            temp.setText(String.valueOf(weatherResponse.getMain().getTemp()));
                        }

                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        Log.d(TAG, throwable.toString());
                    }
                });

        return view;

    }

}
