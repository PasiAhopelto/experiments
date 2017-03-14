package github.pasiahopelto.wicket.experiments;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class GridHome extends WebPage {

	private static final long serialVersionUID = 1L;

	public GridHome(final PageParameters parameters) {
		super(parameters);
		add(new Label("topNarrow", "Top Narrow"));
		add(new Label("nestedNarrow", "Nested Narrow"));
		add(new Label("nestedMedium", "Nested Medium"));
		add(new Label("nestedWide", "Nested Wide"));
		add(new Label("topWide", "Top Wide"));
	}

}
