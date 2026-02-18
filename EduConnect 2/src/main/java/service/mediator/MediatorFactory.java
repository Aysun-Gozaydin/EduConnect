package service.mediator;

public class MediatorFactory {

    public static DilMediator getMediator(String dil) {

        if (dil == null)
            throw new IllegalArgumentException("Dil seçimi boş olamaz!");

        switch (dil.toLowerCase()) {
            case "ingilizce": return new IngilizceMediator();
            case "almanca": return new AlmancaMediator();
            case "italyanca": return new ItalyancaMediator();
            case "japonca": return new JaponcaMediator();
            case "korece": return new KoreceMediator();
            case "rusça":
            case "rusca": return new RuscaMediator();
            case "hintçe":
            case "hintce": return new HintceMediator();
            default:
                throw new IllegalArgumentException("Desteklenmeyen dil: " + dil);
        }
    }
}
