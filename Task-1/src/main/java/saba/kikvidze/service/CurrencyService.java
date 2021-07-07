package saba.kikvidze.service;

import saba.kikvidze.model.Currency;
import saba.kikvidze.model.CurrencyDummyData;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.*;

@WebService
public class CurrencyService {

    @WebMethod
    public String GetCurrency(String curr) {
        for (Currency currency: CurrencyDummyData.get()) {
            if (currency.getName().equals(curr)) {
                return String.valueOf(currency.getValue());
            }

        }
        return "No Curr found";
    }

    @WebMethod
    public String GetCurrencyDescription(String curr) {
        for (Currency currency: CurrencyDummyData.get()) {
            if (currency.getName().equals(curr)) {
                return currency.getDescription();
            }
        }

        return "No curr found";
    }

    @WebMethod
    public List<String> GetDate() {
        List<String> dateList = new ArrayList<>();
        for (Currency currency : CurrencyDummyData.get()) {
            dateList.add(java.time.LocalDate.now().toString());
        }
        return dateList;
    }
}
