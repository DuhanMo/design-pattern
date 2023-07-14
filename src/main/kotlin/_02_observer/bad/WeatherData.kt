package _02_observer.bad

class WeatherData(
    private val currentConditionsDisplay: CurrentConditionsDisplay,
    private val statisticsDisplay: StatisticsDisplay,
    private val forecastDisplay: ForecastDisplay
) {
    private var temperature = 0f
    private var humidity = 0f
    private var pressure = 0f

    fun measurementChanged() {
        val temp = temperature
        val humidity = humidity
        val pressure = pressure
        currentConditionsDisplay.update(temp, humidity, pressure)
        statisticsDisplay.update(temp, humidity, pressure)
        forecastDisplay.update(temp, humidity, pressure)
    }

    fun setMeasurement(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementChanged()
    }
}