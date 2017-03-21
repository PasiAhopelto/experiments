package github.pasiahopelto.wicket.experiments;

import java.util.Date;

import org.apache.wicket.validation.IValidatable;
import org.apache.wicket.validation.IValidator;
import org.apache.wicket.validation.ValidationError;

public class DateIsInFutureValidator implements IValidator<Date> {

	private static final long serialVersionUID = 1L;

	@Override
	public void validate(IValidatable<Date> validatable) {
		Date date = validatable.getValue();
		if(date.getTime() < System.currentTimeMillis()) {
			validatable.error(new ValidationError("Date should be in future"));
		}
	}

}
