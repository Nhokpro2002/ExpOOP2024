package hus.oop.lab8.countryarraymanager;

import java.util.*;

public class CountryArrayManager {
    private Country[] countries;
    private int length;

    public CountryArrayManager() {
        countries = new Country[1];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        countries = new Country[maxLength];
        this.length = maxLength;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[2 * this.countries.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i-1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population
     *  using selection sort algorithm.
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 0; i < newArray.length - 1; i++) {

            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int min_idx = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getPopulation() < newArray[min_idx].getPopulation()) {
                    min_idx = j;
                }
            }

            // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
            Country temp = newArray[min_idx];
            newArray[min_idx] = newArray[i];
            newArray[i] = temp;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population
     *  using selection sort algorithm.
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 0; i < newArray.length - 1; i++) {

            // Tìm phần tử lớn nhất trong mảng chưa được sắp xếp
            int min_idx = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getPopulation() > newArray[min_idx].getPopulation()) {
                    min_idx = j;
                }
            }

            // Hoán đổi phần tử lớn nhất và phần tử đầu tiên
            Country temp = newArray[min_idx];
            newArray[min_idx] = newArray[i];
            newArray[i] = temp;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing area
     *  using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 0; i < newArray.length - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < newArray.length - i - 1; j++) {
                if (newArray[j].getArea() > newArray[j + 1].getArea()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                    isSwapped = true;
                }
            }

            if (!isSwapped) {
                break;
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area
     *  using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 0; i < newArray.length - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < newArray.length - i - 1; j++) {
                if (newArray[j].getArea() < newArray[j + 1].getArea()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                    isSwapped = true;
                }
            }

            if (!isSwapped) {
                break;
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     *  using insertion sort algorithm.
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 1; i < newArray.length; ++i) {
            Country key = newArray[i];
            int j = i - 1;

            // Di chuyển các phần tử của arr [0 ... i - 1], lớn hơn key
            // đến một vị trí trước vị trí hiện tại của chúng
            while (j >= 0 && newArray[j].getGdp() > key.getGdp()) {
                newArray[j + 1] = newArray[j];
                j = j - 1;
            }
            newArray[j + 1] = key;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing GDP
     *  sing insertion sort algorithm.
     * @return array of decreasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 1; i < newArray.length; ++i) {
            Country key = newArray[i];
            int j = i - 1;

            // Di chuyển các phần tử của arr [0 ... i - 1], lớn hơn key
            // đến một vị trí trước vị trí hiện tại của chúng
            while (j >= 0 && newArray[j].getGdp() < key.getGdp()) {
                newArray[j + 1] = newArray[j];
                j = j - 1;
            }
            newArray[j + 1] = key;
        }

        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        /* TODO */
        List<AfricaCountry> list = new ArrayList<AfricaCountry>();
        for (Country elements: countries) {
            if (elements instanceof AfricaCountry) {
                list.add((AfricaCountry) elements);
            }
        }
        return list.toArray(new AfricaCountry[0]);
    }

    public AsiaCountry[] filterAsiaCountry() {
        /* TODO */
        List<AsiaCountry> list = new ArrayList<AsiaCountry>();
        for (Country elements: countries) {
            if (elements instanceof AsiaCountry) {
                list.add((AsiaCountry) elements);
            }
        }
        return list.toArray(new AsiaCountry[0]);

    }

    public EuropeCountry[] filterEuropeCountry() {
        /* TODO */
        List<EuropeCountry> list = new ArrayList<EuropeCountry>();
        for (Country elements: countries) {
            if (elements instanceof EuropeCountry) {
                list.add((EuropeCountry) elements);
            }
        }
        return list.toArray(new EuropeCountry[0]);
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        /* TODO */
        List<NorthAmericaCountry> list = new ArrayList<NorthAmericaCountry>();
        for (Country elements: countries) {
            if (elements instanceof NorthAmericaCountry) {
                list.add((NorthAmericaCountry) elements);
            }
        }
        return list.toArray(new NorthAmericaCountry[0]);
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        /* TODO */
        List<OceaniaCountry> list = new ArrayList<OceaniaCountry>();
        for (Country elements: countries) {
            if (elements instanceof OceaniaCountry) {
                list.add((OceaniaCountry) elements);
            }
        }
        return list.toArray(new OceaniaCountry[0]);
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        /* TODO */
        List<SouthAmericaCountry> list = new ArrayList<SouthAmericaCountry>();
        for (Country elements: countries) {
            if (elements instanceof SouthAmericaCountry) {
                list.add((SouthAmericaCountry) elements);
            }
        }
        return list.toArray(new SouthAmericaCountry[0]);
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        /* TODO */
        countries = sortByDecreasingPopulation();
        List<Country> list = new ArrayList<Country>();
        for (int i = 0; i < howMany; i++) {
            list.add(countries[i]);
        }
        return list.toArray(new Country[0]);
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        /* TODO */
        countries = sortByIncreasingPopulation();
        List<Country> list = new ArrayList<Country>();
        for (int i = 0; i < howMany; i++) {
            list.add(countries[i]);
        }
        return list.toArray(new Country[0]);
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        /* TODO */
        countries = sortByDecreasingArea();
        List<Country> list = new ArrayList<Country>();
        for (int i = 0; i < howMany; i++) {
            list.add(countries[i]);
        }
        return list.toArray(new Country[0]);
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        /* TODO */
        countries = sortByIncreasingArea();
        List<Country> list = new ArrayList<Country>();
        for (int i = 0; i < howMany; i++) {
            list.add(countries[i]);
        }
        return list.toArray(new Country[0]);
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        /* TODO */
        countries = sortByDecreasingGdp();
        List<Country> list = new ArrayList<Country>();
        for (int i = 0; i < howMany; i++) {
            list.add(countries[i]);
        }
        return list.toArray(new Country[0]);
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        /* TODO */
        countries = sortByIncreasingGdp();
        List<Country> list = new ArrayList<Country>();
        for (int i = 0; i < howMany; i++) {
            list.add(countries[i]);
        }
        return list.toArray(new Country[0]);
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
