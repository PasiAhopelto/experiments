package github.pasiahopelto.wicket.experiments;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.wicket.extensions.markup.html.form.DateTextField;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.FormComponent;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.form.validation.IFormValidator;
import org.joda.time.DateTime;

public class CrossMonthFormValidator implements IFormValidator {

	private static final long serialVersionUID = 1L;
	private Form<DateFormData> form;

	public CrossMonthFormValidator(Form<DateFormData> form) {
		this.form = form;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public FormComponent<?>[] getDependentFormComponents() {
		return new FormComponent[] { (FormComponent) form.get("startDate"), (FormComponent) form.get("days") };
	}

	@Override
	public void validate(Form<?> form) {
		DateTime startDate = parseStartDate(form);
		Integer days = parseDays(form);
		if(startDate.plusDays(days).getMonthOfYear() != startDate.getMonthOfYear()) {
			form.error("Dates should be within one month");
		}
	}

	@SuppressWarnings("rawtypes")
	private Integer parseDays(Form<?> form) {
		Integer days = null;
		try {
			days = Integer.parseInt(((TextField) form.get("days")).getInput());
		}
		catch(NumberFormatException e) {
			form.error("Unable to parse days");
		}
		return days;
	}

	private DateTime parseStartDate(Form<?> form) {
		DateTime startDate = null;
		try {
			startDate = new DateTime(new SimpleDateFormat(SimpleFormPage.DATE_FORMAT).parse(((DateTextField) form.get("startDate")).getInput()));
		} catch (ParseException e) {
			form.error("Unable to parse date");
		}
		return startDate;
	}

}
