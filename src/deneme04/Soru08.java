package deneme04;

public class Soru08 {
    /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
            (if deyimini KULLANMAYIN)

     */

    public static void main(String[] args) {

        String gun="salı";

        switch (gun){
            case "pazartesi":
            case "salı":
                System.out.println("Java ders gunleri");
                break;
            case "persembe":
            case "cuma":
                System.out.println("Selenyum dersi gunleri");
                break;
            case "carsamba":
            case "cumartesi":
                System.out.println("SQL dersi günleri");
                break;
            default:
                System.out.println("izin gunu");


        }


    }
}
