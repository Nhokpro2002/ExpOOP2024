package hus.oop.lab8.countryarraymanager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();
    private static final String OUTPUT_FILE = "output.txt";

    public static void main(String[] args) {
        init();

        try (PrintWriter writer = new PrintWriter(new FileWriter(OUTPUT_FILE))) {
            /* Ghi vào file kết quả chạy */
            writer.println("Test data init:");
            System.out.println("Test data init:");
            testOriginalData(writer);
            writer.println();

            writer.println("Countries are arranged in order of population decrease:");
            System.out.println("Countries are arranged in order of population decrease:");
            testSortDecreasingByPopulation(writer);
            writer.println();

            writer.println("Countries are arranged in order of population increase:");
            System.out.println("Countries are arranged in order of population increase:");
            testSortIncreasingByPopulation(writer);
            writer.println();

            writer.println("Countries are arranged in order of GDP decrease:");
            System.out.println("Countries are arranged in order of GDP decrease:");
            testSortDecreasingByGdp(writer);
            writer.println();

            writer.println("Countries are arranged in order of GDP increase:");
            System.out.println("Countries are arranged in order of GDP increase:");
            testSortIncreasingByGdp(writer);
            writer.println();

            writer.println("Countries are arranged in order of area increase:");
            System.out.println("Countries are arranged in order of area increase:");
            testSortIncreasingByArea(writer);
            writer.println();

            writer.println("Countries are arranged in order of area decrease:");
            System.out.println("Countries are arranged in order of area decrease:");
            testSortDecreasingByArea(writer);
            writer.println();

            writer.println("Africa Countries:");
            System.out.println("Africa Countries:");
            testFilterAfricaCountry(writer);

            writer.println("Asia Countries:");
            testFilterAsiaCountry(writer);

            writer.println("Europe Countries:");
            testFilterEuropeCountry(writer);

            writer.println("North America Countries:");
            testFilterNorthAmericaCountry(writer);

            writer.println("South America Countries:");
            testFilterSouthAmericaCountry(writer);

            writer.println("Oceania Countries:");
            testFilterOceaniaCountry(writer);

            writer.println("Countries with most population:");
            testFilterMostPopulousCountries(writer);

            writer.println("Countries with least population:");
            testFilterLeastPopulousCountries(writer);

            writer.println("Countries with largest area:");
            testFilterLargestAreaCountries(writer);

            writer.println("Countries with smallest area:");
            testFilterSmallestAreaCountries(writer);

            writer.println("Countries with highest GDP:");
            testFilterHighestGdpCountries(writer);

            writer.println("Countries with lowest GDP:");
            testFilterLowestGdpCountries(writer);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readListData(String filePath) {
        try (BufferedReader dataReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code") || dataList.size() != 6) {
                    continue;
                }

                try {
                    String code = dataList.get(0);
                    String name = dataList.get(1);
                    int population = Integer.parseInt(dataList.get(2));
                    double area = Double.parseDouble(dataList.get(3));
                    double gdp = Double.parseDouble(dataList.get(4));
                    String continent = dataList.get(5);

                    Country country;
                    switch (continent.toLowerCase()) {
                        case "africa":
                            country = new AfricaCountry(code, name, population, area, gdp);
                            break;
                        case "asia":
                            country = new AsiaCountry(code, name, population, area, gdp);
                            break;
                        case "north america":
                            country = new NorthAmericaCountry(code, name, population, area, gdp);
                            break;
                        case "south america":
                            country = new SouthAmericaCountry(code, name, population, area, gdp);
                            break;
                        case "oceania":
                            country = new OceaniaCountry(code, name, population, area, gdp);
                            break;
                        case "europe":
                            country = new EuropeCountry(code, name, population, area, gdp);
                            break;
                        default:
                            continue;
                    }

                    countryManager.append(country);
                } catch (NumberFormatException e) {
                    System.err.println("Invalid data format in line: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (String data : splitData) {
                result.add(data.trim());
            }
        }
        return result;
    }

    public static void init() {
        String filePath = "D:\\ProjectJava\\OOP2024_ProjectJava\\src\\hus\\oop\\ZipFolder\\countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData(PrintWriter writer) {
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.println(codesString);
        writer.println(codesString);
    }

    public static void testSortIncreasingByPopulation(PrintWriter writer) {
        Country[] countries = countryManager.sortByIncreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
        writer.println(codesString);
    }

    public static void testSortDecreasingByPopulation(PrintWriter writer) {
        Country[] countries = countryManager.sortByDecreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
        writer.println(codesString);
    }

    public static void testSortIncreasingByArea(PrintWriter writer) {
        Country[] countries = countryManager.sortByIncreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
        writer.println(codesString);
    }

    public static void testSortDecreasingByArea(PrintWriter writer) {
        Country[] countries = countryManager.sortByDecreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
        writer.println(codesString);
    }

    public static void testSortIncreasingByGdp(PrintWriter writer) {
        Country[] countries = countryManager.sortByIncreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
        writer.println(codesString);
    }

    public static void testSortDecreasingByGdp(PrintWriter writer) {
        Country[] countries = countryManager.sortByDecreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
        writer.println(codesString);
    }

    public static void testFilterAfricaCountry(PrintWriter writer) {
        AfricaCountry[] countries = countryManager.filterAfricaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
        writer.println(codesString);
    }

    public static void testFilterAsiaCountry(PrintWriter writer) {
        AsiaCountry[] countries = countryManager.filterAsiaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
        writer.println(codesString);
    }

    public static void testFilterEuropeCountry(PrintWriter writer) {
        EuropeCountry[] countries = countryManager.filterEuropeCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
        writer.println(codesString);
    }

    public static void testFilterNorthAmericaCountry(PrintWriter writer) {
        NorthAmericaCountry[] countries = countryManager.filterNorthAmericaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
        writer.println(codesString);
    }

    public static void testFilterOceaniaCountry(PrintWriter writer) {
        OceaniaCountry[] countries = countryManager.filterOceaniaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
        writer.println(codesString);
    }

    public static void testFilterSouthAmericaCountry(PrintWriter writer) {
        SouthAmericaCountry[] countries = countryManager.filterSouthAmericaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
        writer.println(codesString);
    }

    public static void testFilterMostPopulousCountries(PrintWriter writer) {
        Country[] countries = countryManager.filterMostPopulousCountries(3);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
        writer.println(codesString);
    }

    public static void testFilterLeastPopulousCountries(PrintWriter writer) {
        Country[] countries = countryManager.filterLeastPopulousCountries(3);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
        writer.println(codesString);
    }

    public static void testFilterLargestAreaCountries(PrintWriter writer) {
        Country[] countries = countryManager.filterLargestAreaCountries(3);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
        writer.println(codesString);
    }

    public static void testFilterSmallestAreaCountries(PrintWriter writer) {
        Country[] countries = countryManager.filterSmallestAreaCountries(3);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
        writer.println(codesString);
    }

    public static void testFilterHighestGdpCountries(PrintWriter writer) {
        Country[] countries = countryManager.filterHighestGdpCountries(3);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
        writer.println(codesString);
    }

    public static void testFilterLowestGdpCountries(PrintWriter writer) {
        Country[] countries = countryManager.filterLowestGdpCountries(3);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
        writer.println(codesString);
    }
}
