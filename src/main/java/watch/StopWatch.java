package watch;

/**
 * Created with IntelliJ IDEA.
 * User: hongseongmin
 * Date: 2014. 1. 23.
 * Time: 오후 3:18
 * To change this template use File | Settings | File Templates.
 */
public class StopWatch {
	private long startTime;
	private long stopTime;

	public void start() {
		startTime = System.nanoTime();
	}

	public void stop() {
		stopTime = System.nanoTime();
	}

	public Time getElapsedTime() {
		return new Time(stopTime - startTime);
	}
}
