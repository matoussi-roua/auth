package org.auth.auth.model.address;

public class AdressBuilder {
    private Long id;
    private String adress;
    private String city;
    private String country;
    private String state;
    private String zipCode;
    public AdressBuilder id(Long id) {
        this.id = id;
        return this;
    }
    public AdressBuilder adress(String adress) {
        this.adress = adress;
        return this;
    }
    public AdressBuilder city(String city) {
        this.city = city;
        return this;
    }
    public AdressBuilder country(String country) {
        this.country = country;
        return this;
    }
    public AdressBuilder state(String state) {
        this.state = state;
        return this;

    }
    public AdressBuilder zipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }
    public Adress build() {
        Adress adress = new Adress();
        adress.setId(id);
        adress.setCity(city);
        adress.setCountry(country);
        adress.setState(state);
        adress.setZipCode(zipCode);
        return adress;

    }
}
