package factory;

public class OnlineKimlik implements DersKimligi {
    private final String ogretmen;
    private final String alan;
    private final String platform;

    public OnlineKimlik(String ogretmen, String alan, String platform) {
        this.ogretmen = ogretmen;
        this.alan = alan;
        this.platform = platform != null ? platform : "Zoom";
    }

    @Override
    public void kimlikYazdir() {
        System.out.println("=== Online Ders Kimliği ===");
        System.out.println("Öğretmen: " + ogretmen);
        System.out.println("Bölüm: " + alan);
        System.out.println("Platform/Link: " + platform);
    }
}
