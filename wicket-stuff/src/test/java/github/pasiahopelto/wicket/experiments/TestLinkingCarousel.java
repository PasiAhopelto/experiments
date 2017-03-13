package github.pasiahopelto.wicket.experiments;

import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.model.Model;
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
		linkingCarousel = new LinkingCarousel("id", null, new Model<>(""));
	}
	
	@Test
	public void newImageIsAjaxLink() {
		assertTrue(linkingCarousel.newImage("image", mock(ICarouselImage.class)) instanceof AjaxLink);
	}
	
	// TODO test onClick
	
}
