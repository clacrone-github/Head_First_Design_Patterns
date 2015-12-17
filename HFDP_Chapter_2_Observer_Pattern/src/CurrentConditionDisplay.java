import java.util.Observable;
import java.util.Observer;


public class CurrentConditionDisplay implements Observer, DisplayElement {
	
	private float temperature;
	private float humidity;
//	private Subject weatherData;
	private Observable observable;
	
//	public CurrentConditionDisplay(Subject weatherData) {
//		this.weatherData = weatherData;
//		weatherData.registerObserver(this);
//	}
	public CurrentConditionDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}

//	@Override
//	public void update(float temp, float humidity, float pressure) {
//		// TODO Auto-generated method stub
//		this.temperature = temp;
//		this.humidity = humidity;
//		display();
//	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

}
