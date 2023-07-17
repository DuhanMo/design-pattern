package _02_observer.good

class StatisticsDisplay(
    private val weatherData: WeatherData
) : Observer, DisplayElement {
    init {
        weatherData.registerObserver(this)
    }

    private var maxTemp = 0.0f
    private var minTemp = 200f
    private var tempSum = 0.0f
    private var numReadings = 0

    override fun update() {
        tempSum += weatherData.temperature
        numReadings++
        if (weatherData.temperature > maxTemp) {
            maxTemp = weatherData.temperature
        }
        if (weatherData.temperature < minTemp) {
            minTemp = weatherData.temperature
        }
        display()
    }

    override fun display() {
        println(
            "Avg/Max/Min temperature = " + tempSum / numReadings
                    + "/" + maxTemp + "/" + minTemp
        )
    }
}