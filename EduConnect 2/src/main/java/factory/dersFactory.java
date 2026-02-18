package factory;

public class dersFactory {

    public static dersFabrikasi getFactory(String dersTipi) {

        if (dersTipi == null) {
            throw new IllegalArgumentException("Ders tipi boş olamaz");
        }

        switch (dersTipi.toLowerCase()) {
            case "online":
                return new OnlineDersFabrikası();

            case "kayitli":
                return new kayitliDersFabrikasi();

            case "quiz":
                return new quizDersFabrikasi();

            default:
                throw new IllegalArgumentException("Geçersiz ders tipi: " + dersTipi);
        }
    }
}
