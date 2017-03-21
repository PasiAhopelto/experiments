package github.pasiahopelto.wicket.experiments;

import java.util.Date;

import org.apache.wicket.extensions.markup.html.form.DateTextField;
import org.apache.wicket.feedback.ComponentFeedbackMessageFilter;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.SubmitLink;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;

public class SimpleFormPage extends WebPage {

	private static final long serialVersionUID = 1L;

	public SimpleFormPage() {
		IModel<DateFormData> model = new Model<>(new DateFormData());
		add(makeForm(model));
	}

	private Form<DateFormData> makeForm(IModel<DateFormData> model) {
		Form<DateFormData> form = new Form<>("dateForm", model);
		form.add(new Label("dateRangeLabel", "Form with Date and Numeric Text Fields"));
		DateTextField dateTextField = new DateTextField("startDate", new PropertyModel<Date>(model, "startDate"), "yyyy-MM-dd");
		dateTextField.add(new DateIsInFutureValidator());
		form.add(dateTextField);
		form.add(new FeedbackPanel("dateValidationError", new ComponentFeedbackMessageFilter(dateTextField)));
		form.add(new TextField<Integer>("days", new PropertyModel<Integer>(model, "days")));
		form.add(new SubmitLink("submitDates", model));
		return form;
	}
	
}
