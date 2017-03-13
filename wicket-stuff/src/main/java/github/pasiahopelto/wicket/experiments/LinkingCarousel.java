package github.pasiahopelto.wicket.experiments;

import java.util.List;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.Component;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.model.IModel;

import de.agilecoders.wicket.core.markup.html.bootstrap.carousel.Carousel;
import de.agilecoders.wicket.core.markup.html.bootstrap.carousel.ICarouselImage;

public class LinkingCarousel extends Carousel {

	private static final long serialVersionUID = 1L;
	private IModel<String> selectionModel;

	public LinkingCarousel(String markupId, List<ICarouselImage> model, IModel<String> selectionModel) {
		super(markupId, model);
		this.selectionModel = selectionModel;
	}

	@Override
	protected Component newImage(String markupId, final ICarouselImage image) {
		AjaxLink<String> link = new AjaxLink<String>(markupId, selectionModel) {
			private static final long serialVersionUID = 1L;
			@Override
			public void onClick(AjaxRequestTarget target) {
				Component selectionLabel = getPage().get("selection");
				selectionLabel.setDefaultModelObject(image.description());
				target.add(selectionLabel);
			}
		};
		link.add(new AttributeModifier("src", image.url()));
        return link;
	}

}
