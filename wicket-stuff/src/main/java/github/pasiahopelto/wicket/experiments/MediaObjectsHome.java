package github.pasiahopelto.wicket.experiments;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;

public class MediaObjectsHome extends WebPage {
	
	private static final long serialVersionUID = 1L;

	public MediaObjectsHome(final PageParameters parameters) {
		super(parameters);
		add(new Label("version", getApplication().getFrameworkSettings().getVersion()));
		add(new LabelListView("mediaObjects"));
    }

}
