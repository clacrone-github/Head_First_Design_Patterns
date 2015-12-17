import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;


public class WeatherData extends Observable {

//	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
//		this.observers = new ArrayList();
	}
//	
//	@Override
//	public void registerObserver(Observer o) {
//		// TODO Auto-generated method stub
//		observers.add(o);
//	}
//
//	@Override
//	public void removeObserver(Observer o) {
//		// TODO Auto-generated method stub
//		int i = observers.indexOf(o);
//		if (i >= 0) {
//			observers.remove(i);
//		}
//	}
//
//	@Override
//	public void notifyObservers() {
//		// TODO Auto-generated method stub
//		for (int i = 0; i < observers.size(); i++) {
//			Observer observer = (Observer) observers.get(i);
//			observer.update(temperature, humidity, pressure);
//		}
//	}
	
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	
	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
