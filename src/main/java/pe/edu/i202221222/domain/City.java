package pe.edu.i202221222.domain;

import jakarta.persistence.*;

@Entity
public class City {

    @Id
    private Integer ID;
    private String Name;
    private String CountryCode;
    private String District;
    private Integer Population;

    public City() {
    }

    public City(Integer population, String district, String countryCode, String name, Integer ID) {
        Population = population;
        District = district;
        CountryCode = countryCode;
        Name = name;
        this.ID = ID;
    }

    public Integer getPopulation() {
        return Population;
    }

    public void setPopulation(Integer population) {
        Population = population;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }
}
