package _02_observer.good


class WeatherData : Subject {
    private val _observers = mutableListOf<Observer>()
    val observers get() = _observers.toList()

    var temperature = 0f
    var humidity = 0f
    var pressure = 0f

    override fun registerObserver(o: Observer) {
        _observers.add(o)
    }

    override fun removeObserver(o: Observer) {
        _observers.remove(o)
    }

    override fun notifyObservers() {
        for (observer in _observers) {
            observer.update()
        }
    }

    fun setMeasurement(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementChanged()
    }

    private fun measurementChanged() {
        notifyObservers()
    }
}