package pe.edu.i202221222.domain;
import jakarta.persistence.*;

@Entity
public class CountryLanguage {

    @Id
    private String CountryCode;
    @Id
    private String Language;
    private String IsOfficial;
    private Double Percentage;

    public CountryLanguage() {
    }

    public CountryLanguage(String countryCode, String language, String isOfficial, Double percentage) {
        CountryCode = countryCode;
        Language = language;
        IsOfficial = isOfficial;
        Percentage = percentage;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getIsOfficial() {
        return IsOfficial;
    }

    public void setIsOfficial(String isOfficial) {
        IsOfficial = isOfficial;
    }

    public Double getPercentage() {
        return Percentage;
    }

    public void setPercentage(Double percentage) {
        Percentage = percentage;
    }
}
