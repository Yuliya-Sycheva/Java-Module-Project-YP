public class Formattor {

    public static String getAliasForRubles(int resultRound) {
        String rubles;
        switch (resultRound % 10) {
            case 1:
                rubles = "рубль";
                break;
            case 2:
            case 3:
            case 4:
                rubles = "рубля";
                break;
            default:
                rubles = "рублей";
                break;
        }
        return rubles;
    }
}
