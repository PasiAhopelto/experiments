package github.pasiahopelto.wicket.experiments;

import java.text.SimpleDateFormat;

import org.apache.wicket.model.IModel;
import org.joda.time.DateTime;

public class DateRangeModel implements IModel<String> {

	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
	private static final long serialVersionUID = 1L;
	
	private IModel<DateFormData> sourceModel;

	public DateRangeModel(IModel<DateFormData> sourceModel) {
		this.sourceModel = sourceModel;
	}
	
	@Override
	public void detach() {
	}

	@Override
	public String getObject() {
		StringBuilder result = new StringBuilder();
		DateTime startsAt = new DateTime(sourceModel.getObject().getStartDate());
		Integer days = sourceModel.getObject().getDays();
		if(days != null) {
			DateTime endsAt = startsAt.plusDays(days);
			result.append(toDateString(startsAt)).append(" ... ").append(toDateString(endsAt));
		}
		return result.toString();
	}

	private String toDateString(DateTime dateTime) {
		return DATE_FORMAT.format(dateTime.toDate());
	}

	@Override
	public void setObject(String object) {
	}

}
