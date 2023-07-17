package _02_observer.good


class CurrentConditionsDisplay(
    private val weatherData: WeatherData
) : Observer, DisplayElement {
    init {
        weatherData.registerObserver(this)
    }

    private var temperature = 0f
    private var humidity = 0f

    override fun update() {
        this.temperature = weatherData.temperature
        this.humidity = weatherData.humidity
        display()
    }

    override fun display() {
        println(
            "Current conditions: " + temperature
                    + "F degrees and " + humidity + "% humidity"
        )
    }
}