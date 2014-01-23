package watch;

import static java.lang.Math.pow;

/**
 * Created with IntelliJ IDEA.
 * User: hongseongmin
 * Date: 2014. 1. 23.
 * Time: 오후 3:22
 * To change this template use File | Settings | File Templates.
 */
public class Time {
	private long nano;

	public Time(long nano) {
		this.nano = nano;
	}

	public long getMilliTime() {
		return (long) (nano / pow(10, 6));
	}

	public Long getNanoTime() {
		return nano;
	}
}
