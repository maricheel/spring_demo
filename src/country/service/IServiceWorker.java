package country.service;

import country.model.Country;

import java.util.List;

public interface IServiceWorker {
	void dealWithCountryByCode(String language);
	void addCountry(String information);
	Country getCountry(String code);
	Country getCountryInfos(String code);
	void deleteCountry(String code);
	void updateCountry(String code, String infos);
	List<Country> getAllCountries(String code);
}
