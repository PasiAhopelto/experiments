package github.pasiahopelto.wicket.experiments;

import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import de.agilecoders.wicket.core.markup.html.bootstrap.carousel.Carousel;

@RunWith(MockitoJUnitRunner.class)
public class TestCarouselHome {
	private WicketTester tester;

	@Before
	public void setUp() {
		tester = new WicketTester(new WicketApplication());
	}

	@Test
	public void homepageRendersSuccessfully() {
		tester.startPage(CarouselHome.class);
		tester.assertRenderedPage(CarouselHome.class);
		tester.assertComponent("carousel", Carousel.class);
	}

}
