package github.pasiahopelto.wicket.experiments;

import java.util.List;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.Component;
import org.apache.wicket.markup.html.link.ExternalLink;

import de.agilecoders.wicket.core.markup.html.bootstrap.carousel.Carousel;
import de.agilecoders.wicket.core.markup.html.bootstrap.carousel.ICarouselImage;

public class LinkingCarousel extends Carousel {

	private static final long serialVersionUID = 1L;

	public LinkingCarousel(String markupId, List<ICarouselImage> model) {
		super(markupId, model);
	}

	@Override
	protected Component newImage(String markupId, ICarouselImage image) {
		ExternalLink link = new ExternalLink(markupId, "http://www.google.fi");
		link.add(new AttributeModifier("src", image.url()));
        return link;
	}

}
