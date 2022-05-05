import utils.TextUtils;

public class Main {

    public static void main(String[] args) {
        System.out.println("The total number of legs of all the animals: " + countAnimalsLegs());
    }

    public static int countAnimalsLegs() {
        int amountChickenLegs = 2;
        int amountPigsLegs = 4;
        int amountCowsLegs = 4;
        return (Integer.parseInt(TextUtils.getDataAboutAnimalsFromJsonFile().getChickens()) * amountChickenLegs) +
                (Integer.parseInt(TextUtils.getDataAboutAnimalsFromJsonFile().getCows()) * amountCowsLegs) +
                (Integer.parseInt(TextUtils.getDataAboutAnimalsFromJsonFile().getPigs()) * amountPigsLegs);
    }
}