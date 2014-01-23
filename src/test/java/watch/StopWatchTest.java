package watch;

import org.junit.Test;

import static java.lang.Math.pow;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Created with IntelliJ IDEA.
 * User: hongseongmin
 * Date: 2014. 1. 23.
 * Time: 오후 3:15
 * To change this template use File | Settings | File Templates.
 */
public class StopWatchTest {
	private long expectedElapsedTime = 1000l;

	@Test
	public void should_return_elapsed_millis() {
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();

		doSomething();

		stopWatch.stop();
		Time time = stopWatch.getElapsedTime();
		assertThat(time.getMilliTime(), is(greaterThanOrEqualTo(expectedElapsedTime))); // 기대치 보다 크거나 같으면 성공
		assertThat(time.getNanoTime(), is(greaterThanOrEqualTo(expectedElapsedTime * (long) pow(10, 6)))); // 기대치 보다 크거나 같으면 성공
	}



	private void doSomething() {
		try {
			Thread.sleep(expectedElapsedTime);
		} catch (InterruptedException e) {
			e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
		}
	}
}
