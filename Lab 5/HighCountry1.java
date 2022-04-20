
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighCountry1 {

   public static void main(String[] args) {
      CountryDao countryDao= InMemoryWorldDao.getInstance();
      List<City> highPopulatedCitiesOfCountries = countryDao.findAllCountries()
                .stream()
                .map( country -> country.getCities().stream().max(Comparator.comparing(City::getPopulation)))
                .filter(Optional::isPresent)
                .map(Optional::get)
                  .collect(Collectors.toList());
      highPopulatedCitiesOfCountries.forEach(System.out::println);
   }

}