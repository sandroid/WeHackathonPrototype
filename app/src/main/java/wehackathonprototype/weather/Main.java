
package wehackathonprototype.weather;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Main {

    @Expose
    private double temp;
    @Expose
    private double pressure;
    @Expose
    private long humidity;
    @Expose
    private double temp_min;
    @Expose
    private double temp_max;
    @Expose
    private double sea_level;
    @Expose
    private double grnd_level;

    /**
     * 
     * @return
     *     The temp
     */
    public double getTemp() {
        return temp;
    }

    /**
     * 
     * @param temp
     *     The temp
     */
    public void setTemp(double temp) {
        this.temp = temp;
    }

    /**
     * 
     * @return
     *     The pressure
     */
    public double getPressure() {
        return pressure;
    }

    /**
     * 
     * @param pressure
     *     The pressure
     */
    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    /**
     * 
     * @return
     *     The humidity
     */
    public long getHumidity() {
        return humidity;
    }

    /**
     * 
     * @param humidity
     *     The humidity
     */
    public void setHumidity(long humidity) {
        this.humidity = humidity;
    }

    /**
     * 
     * @return
     *     The temp_min
     */
    public double getTemp_min() {
        return temp_min;
    }

    /**
     * 
     * @param temp_min
     *     The temp_min
     */
    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min;
    }

    /**
     * 
     * @return
     *     The temp_max
     */
    public double getTemp_max() {
        return temp_max;
    }

    /**
     * 
     * @param temp_max
     *     The temp_max
     */
    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }

    /**
     * 
     * @return
     *     The sea_level
     */
    public double getSea_level() {
        return sea_level;
    }

    /**
     * 
     * @param sea_level
     *     The sea_level
     */
    public void setSea_level(double sea_level) {
        this.sea_level = sea_level;
    }

    /**
     * 
     * @return
     *     The grnd_level
     */
    public double getGrnd_level() {
        return grnd_level;
    }

    /**
     * 
     * @param grnd_level
     *     The grnd_level
     */
    public void setGrnd_level(double grnd_level) {
        this.grnd_level = grnd_level;
    }

}
