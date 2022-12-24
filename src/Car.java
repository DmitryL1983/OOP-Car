public class Car {
    String brand;
    String model;
    float engineVolume;
    String color;
    int year;
    String country;

    public Car(String brand, String model, float engineVolume, String color, int year, String country) {

        if (brand != null && !brand.equals("")) {
            this.brand = brand;
        } else this.brand = "default";

        if (model != null && !model.equals("")) {
            this.model = model;
        } else this.model = "default";

        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else this.engineVolume = 1.5F;

        if (color != null && !color.equals("")) {
            this.color = color;
        } else this.color = "Белый";

        if (year > 0) {
            this.year = year;
        } else this.year = 2000;

        if (country != null && !country.equals("")) {
            this.country = country;
        } else this.country = "default";
    }

    @Override
    public String toString() {
        return brand + " " + model + " " +
                year + " года выпуска, страна сборки: " + country + ", " +
                color + " цвет, объем двигателя — " + engineVolume + " л.";
    }
}
