package watch;

/**
 * Created with IntelliJ IDEA.
 * User: hongseongmin
 * Date: 2014. 1. 23.
 * Time: 오후 3:00
 * To change this template use File | Settings | File Templates.
 */
public class ProceduralStopWatch {
	public long startTime;
	public long stopTime;

	public long getElapsedTime() {
		return stopTime - startTime;
	}
}
