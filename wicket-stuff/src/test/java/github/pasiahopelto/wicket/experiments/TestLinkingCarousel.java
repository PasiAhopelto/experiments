package github.pasiahopelto.wicket.experiments;

import org.apache.wicket.markup.html.link.ExternalLink;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import de.agilecoders.wicket.core.markup.html.bootstrap.carousel.ICarouselImage;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class TestLinkingCarousel {

	private LinkingCarousel linkingCarousel;
	
	@Before
	public void before() {
		new WicketTester();
		linkingCarousel = new LinkingCarousel("id", null);
	}
	
	@Test
	public void newImageIsExternalLink() {
		assertTrue(linkingCarousel.newImage("image", mock(ICarouselImage.class)) instanceof ExternalLink);
	}
	
}
