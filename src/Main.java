public class Main {
    public static void main(String[] args) {
        Car granta = new Car("Lada", "Granta", 1.7F, "Желтый", 2015, "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0F, "Черный", 2020, "Германия");
        Car bmw = new Car("BMW", "Z8", 3.0F, "Черный", 2021, "Германия");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 1.7F, "Крсный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6F, "Оранжевый", 2016, "Южная Корея");
        System.out.println(granta);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
      }
}