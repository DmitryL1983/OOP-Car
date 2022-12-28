import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car granta = new Car("Lada",
                "Granta",
                1.7F,
                "Желтый",
                2015,
                "Россия",
                "ММКП",
                "Седан",
                "с123ур43",
                5,
                false);
        Car audi = new Car("Audi",
                "A8 50 L TDI quattro",
                3.0F,
                "Черный",
                2020,
                "Германия",
                "АКПП",
                "Седан",
                "а123мд54",
                5,
                true);

        Car bmw = new Car("BMW",
                "Z8",
                3.0F,
                "Черный",
                2021,
                "Германия",
                "АКПП",
                "Родстер",
                "в777дс51",
                2,
                true);
        Car kia = new Car("Kia",
                "Sportage 4-го поколения",
                1.7F,
                "Крсный",
                2018,
                "Южная Корея",
                "ММКП",
                "Внедорожник",
                "а888аа45",
                5,
                true);
        Car hyundai = new Car("Hyundai",
                "Avante",
                1.6F,
                "Оранжевый",
                2016,
                "Южная Корея",
                "АКПП",
                "Седан",
                "а111кк11",
                5,
                true);
        granta.changTires();
        audi.changTires();
        bmw.changTires();
        kia.changTires();
        hyundai.changTires();
        System.out.println(granta);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
      }
}