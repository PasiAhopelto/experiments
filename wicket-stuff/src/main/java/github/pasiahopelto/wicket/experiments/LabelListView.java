package github.pasiahopelto.wicket.experiments;

import java.util.ArrayList;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;

import com.google.common.collect.Lists;

public class LabelListView extends ListView<String> {

	private static final long serialVersionUID = 1L;

	public LabelListView(String id) {
		super(id);
		IModel<ArrayList<String>> model = new Model<>(Lists.newArrayList("One", "Two", "Three"));
		setModel(model);
	}

	@Override
	protected void populateItem(ListItem<String> listItem) {
		String modelObject = listItem.getModelObject();
		listItem.add(new Label("itemVersion", modelObject + ": " + getApplication().getFrameworkSettings().getVersion()));
	}

}
