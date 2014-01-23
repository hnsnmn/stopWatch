package watch;

import org.junit.Test;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: hongseongmin
 * Date: 2014. 1. 23.
 * Time: 오후 2:55
 * To change this template use File | Settings | File Templates.
 */
public class ProceduralStopWatchTest {
	private long expectedElapsedTime = 100l;

	@Test
	public void should_return_elapsed_milli_seconds() {
		ProceduralStopWatch stopWatch = new ProceduralStopWatch();
		stopWatch.startTime = System.currentTimeMillis(); // start time in millis

		doSomething();
		stopWatch.stopTime = System.currentTimeMillis(); // end time in millis

		long elapsedTime = stopWatch.getElapsedTime();
		assertThat(elapsedTime, is(greaterThanOrEqualTo(expectedElapsedTime)));

	}


	private void doSomething() {
		try {
			Thread.sleep(expectedElapsedTime);
		}  catch (InterruptedException e) {
			e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
		}
	}
}
