package github.pasiahopelto.wicket.experiments;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.image.ExternalImage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class GridHome extends WebPage {

	private static final long serialVersionUID = 1L;

	public GridHome(final PageParameters parameters) {
		super(parameters);
		add(new ExternalImage("topNarrow", "http://placehold.it/128x64"));
		add(new ExternalImage("nestedNarrow", "http://placehold.it/64x64"));
		add(new ExternalImage("nestedMedium", "http://placehold.it/128x64"));
		add(new ExternalImage("nestedWide", "http://placehold.it/192x64"));
		add(new ExternalImage("topWide", "http://placehold.it/384x64"));
	}

}
