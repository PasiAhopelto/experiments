package github.pasiahopelto.wicket.experiments;

import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import de.agilecoders.wicket.core.markup.html.bootstrap.carousel.Carousel;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class TestCarouselHome {
	private WicketTester tester;

	@Before
	public void setUp() {
		tester = new WicketTester(new WicketApplication());
		tester.startPage(CarouselHome.class);
	}

	@Test
	public void homepageRendersSuccessfully() {
		tester.assertRenderedPage(CarouselHome.class);
		tester.assertComponent("carousel", Carousel.class);
	}
	
	@Test
	public void carouselIntervalIsFiveSeconds() {
		Carousel carousel = (Carousel) tester.getComponentFromLastRenderedPage("carousel");
		assertEquals(5000, carousel.getInterval().getMilliseconds());
	}

}
