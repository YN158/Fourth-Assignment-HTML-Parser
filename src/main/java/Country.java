import java.util.Objects;

public class Country {
    private String name;
    private String capital;
    private int population;
    private double area;

    public Country(String N, String C, int P, double A) {
        //TODO
        name = N;
        capital = C;
        population = P;
        area = A;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public int getPopulation() {
        return population;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        //TODO
        return "";
    }

    @Override
    public boolean equals(Object o) {
        Country country = (Country) o;
        return population == country.population &&
                Double.compare(country.area, area) == 0 &&
                Objects.equals(name, country.name) &&
                Objects.equals(capital, country.capital);
    }
}
