package Car_Shop_Extend_01;

public class Audi extends CarImpl implements Rentable {

    private Integer minRentDay;
    private Double pricePerDay;

    public Audi(String model, String color, int horsePower, String countryProduced,Integer minRentDay,Double pricePerDay) {
        super(model, color, horsePower, countryProduced);
        this.minRentDay=minRentDay;
        this.pricePerDay=pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return this.minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }
}
