package github.pasiahopelto.wicket.experiments;

import java.util.List;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.util.time.Duration;

import com.google.common.collect.Lists;

import de.agilecoders.wicket.core.markup.html.bootstrap.carousel.Carousel;
import de.agilecoders.wicket.core.markup.html.bootstrap.carousel.CarouselImage;
import de.agilecoders.wicket.core.markup.html.bootstrap.carousel.ICarouselImage;

public class CarouselHome extends WebPage {

	private static final long serialVersionUID = 1L;

	public CarouselHome(final PageParameters parameters) {
		super(parameters);
		List<ICarouselImage> model = makeCarouselModel();
		Carousel carousel = new LinkingCarousel("carousel", model);
		carousel.setInterval(Duration.seconds(5));
		add(carousel);
	}

	private List<ICarouselImage> makeCarouselModel() {
		List<ICarouselImage> result = Lists.newArrayList();
		result.addAll(Lists.newArrayList(
				new CarouselImage("http://placehold.it/2000x500", "1st image", "Just a random image, first in series."),
				new CarouselImage("http://placehold.it/2000x500", "2nd image", "Just a random image, second in series."), 
				new CarouselImage("http://placehold.it/2000x500", "3rd image", "Just a random image, third in series.")));
		return result;
	}

}
