package _02_observer.bad

fun main() {
    val weatherData = WeatherData(
        CurrentConditionsDisplay(),
        StatisticsDisplay(),
        ForecastDisplay()
    )
    weatherData.setMeasurement(24.4f, 123f, 3.33f)
    println("==========")
    weatherData.setMeasurement(13.4f, 12f, 0.33f)
    println("==========")
    weatherData.setMeasurement(55.4f, 123f, 3.33f)
}