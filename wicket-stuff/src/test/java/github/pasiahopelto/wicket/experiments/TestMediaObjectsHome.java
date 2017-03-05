package github.pasiahopelto.wicket.experiments;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestMediaObjectsHome {
	private WicketTester tester;

	@Before
	public void setUp() {
		tester = new WicketTester(new WicketApplication());
	}

	@Test
	public void homepageRendersSuccessfully() {
		tester.startPage(MediaObjectsHome.class);
		tester.assertRenderedPage(MediaObjectsHome.class);
		tester.assertComponent("version", Label.class);
		tester.assertComponent("mediaObjects", LabelListView.class);
	}

}
