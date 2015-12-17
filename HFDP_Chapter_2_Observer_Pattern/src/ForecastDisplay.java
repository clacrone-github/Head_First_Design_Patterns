import java.util.Observable;
import java.util.Observer;


public class ForecastDisplay implements DisplayElement, Observer {

	private float currentPressure = 29.92f;
	private float lastPressure;
	
	public ForecastDisplay(Observable observable) {
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();
			display();
		}
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("The pressure has changed from " + lastPressure + " to " + currentPressure);
	}

}
