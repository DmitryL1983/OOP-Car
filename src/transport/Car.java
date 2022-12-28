package transport;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private float engineVolume;
    private String color;

    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeat;
    private boolean typeOfRubber;
    private Key key;


    public Car(String brand, String model, float engineVolume, String color,
               int year, String country, String transmission, String bodyType,
               String registrationNumber, int numberOfSeat, boolean typeOfRubber) {

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

        if (transmission != null) {
            this.transmission = transmission;
        } else this.transmission = "ММКП";

        if (bodyType != null) {
            this.bodyType = bodyType;
        } else this.bodyType = "Седан";

        if (registrationNumber != null) {
            this.registrationNumber = registrationNumber;
        } else this.registrationNumber = "х000хх000";

        if (numberOfSeat > 0) {
            this.numberOfSeat = numberOfSeat;
        } else this.numberOfSeat = 5;

        this.typeOfRubber = typeOfRubber;
        if (key == null) {
            this.key = new Key();
        } else this.key = key;
    }

        public void changTires () {
            int monthNumber = LocalDate.now().getMonthValue();
            switch (monthNumber) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 11:
                case 12:
                    typeOfRubber = false;
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    typeOfRubber = true;
                    break;
            }
        }
    public static class Key{
        private final boolean remoteRunEngine;
        private final boolean withoutKeyAccess;

        public Key(boolean remoteRunEngine, boolean withoutKeyAccess) {
            this.remoteRunEngine = remoteRunEngine;
            this.withoutKeyAccess = withoutKeyAccess;
        }

        public boolean isRemoteRunEngine() {
            return remoteRunEngine;
        }

        public boolean isWithoutKeyAccess() {
            return withoutKeyAccess;
        }

        public Key() {
            this(false, false);
        }
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public boolean isTypeOfRubber() {
        return typeOfRubber;
    }

    public void setTypeOfRubber(boolean typeOfRubber) {
        this.typeOfRubber = typeOfRubber;
    }






    @Override
    public String toString() {
        return getBrand() + " " + getModel() + " " +
                getYear() + " года выпуска, страна сборки: " + getCountry() + ", " +
                getColor() + " цвет, объем двигателя — " + getEngineVolume() + " л."
                + " коробка передач " + getTransmission() + ", тип кузова " + getBodyType()
                + ", рег.номер " + getRegistrationNumber() + ", количество мест " + getNumberOfSeat() +
                ", резина: " + (typeOfRubber ? "летняя," : "зимняя,") +(key.remoteRunEngine ? " удаленный запуск" : " обычный запуск,") +
                (key.withoutKeyAccess ? " безключевой доступ" : " ключевой доступ") ;
    }
}
