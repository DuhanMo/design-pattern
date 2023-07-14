package _02_observer.bad

class StatisticsDisplay {
    private var maxTemp = 0.0f
    private var minTemp = 200f
    private var tempSum = 0.0f
    private var numReadings = 0
    fun update(temp: Float, humidity: Float, pressure: Float) {
        tempSum += temp
        numReadings++

        if (temp > maxTemp) {
            maxTemp = temp
        }

        if (temp < minTemp) {
            minTemp = temp
        }
        display()
    }

    fun display() {
        println(
            "Avg/Max/Min temperature = " + tempSum / numReadings
                    + "/" + maxTemp + "/" + minTemp
        )
    }
}