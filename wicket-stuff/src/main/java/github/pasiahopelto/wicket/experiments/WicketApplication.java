package github.pasiahopelto.wicket.experiments;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;

import de.agilecoders.wicket.core.Bootstrap;
import de.agilecoders.wicket.core.settings.BootstrapSettings;

public class WicketApplication extends WebApplication {

	@Override
	public Class<? extends WebPage> getHomePage() {
		return MediaObjectsHome.class;
	}

	@Override
	public void init() {
		super.init();
		BootstrapSettings settings = new BootstrapSettings();
		Bootstrap.install(this, settings);
		mountPage("/MediaObjects", MediaObjectsHome.class);
		mountPage("/Carousel", CarouselHome.class);
		mountPage("/Grid", GridHome.class);
		mountPage("/BlockElements", BlockElementsHome.class);
		mountPage("/SimpleForm", SimpleFormPage.class);
	}

}
