package Exercise13.Service;

import Exercise13.Exception.BirthDayException;
import Exercise13.Exception.EmailException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ValidatorService implements DateValidator {
    private DateTimeFormatter date_formatter;

    public ValidatorService(DateTimeFormatter date_formatter) {
        this.date_formatter = date_formatter;
    }

    @Override
    public boolean isValid(String date) {
        try {
            LocalDate.parse(date, this.date_formatter);
        } catch (DateTimeParseException e) {
            return false;
        }
        return true;
    }

    static public void checkBirthDay(LocalDate birthday) throws BirthDayException {
        DateTimeFormatter date_formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String check_date = date_formatter.format(birthday);
        ValidatorService validatorService = new ValidatorService(date_formatter);
        if (!validatorService.isValid(check_date)) {
            throw new BirthDayException("BirthDay format is not Valid!");
        }
    }

    static public void checkEmail(String email) throws EmailException {

    }
}
