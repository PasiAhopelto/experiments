package github.pasiahopelto.wicket.experiments;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class TestLabelListView {

	@SuppressWarnings("unchecked")
	@Mock
	private ListItem<String> listItem = mock(ListItem.class);
	
	private LabelListView view;
	
	@Before
	public void setUp() {
		new WicketTester();
		view = new LabelListView("id");
	}

	@Test
	public void addsLabelToListItem() {
		view.populateItem(listItem);
		verify(listItem).add(any(Label.class));
	}

}
