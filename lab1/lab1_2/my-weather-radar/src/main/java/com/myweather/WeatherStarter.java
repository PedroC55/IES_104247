package com.myweather;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import com.myweather.IpmaCityForecast; //may need to adapt package name
import com.myweather.IpmaService;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


/**
 * demonstrates the use of the IPMA API for weather forecast
 */
public class WeatherStarter {

    //todo: should generalize for a city passed as argument
    //private static final int CITY_ID_AVEIRO = 1010500;
    private static Logger logger = LogManager.getLogger(WeatherStarter.class);
    public static void  main(String[] args ) {
        int codigo = Integer.parseInt(args[0]);
        // get a retrofit instance, loaded with the GSon lib to convert JSON into objects
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.ipma.pt/open-data/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        // create a typed interface to use the remote API (a client)
        IpmaService service = retrofit.create(IpmaService.class);
        // prepare the call to remote endpoint
        Call<IpmaCityForecast> callSync = service.getForecastForACity(codigo);

        try {
            Response<IpmaCityForecast> apiResponse = callSync.execute();
            IpmaCityForecast forecast = apiResponse.body();

            if (forecast != null) {
                var firstDay = forecast.getData().listIterator().next();

                logger.info(String.format("\nCountry: %s \nDay: %s \nMax Temperature: %4.1f \nProbability of precipitation: %4.1f \n",
                        forecast.getCountry(),
                        firstDay.getForecastDate(),
                        Double.parseDouble(firstDay.getTMax()),        
                        Double.parseDouble(firstDay.getPrecipitaProb())));
                        
            } else {
                System.out.println( "No results for this request!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
