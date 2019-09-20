public class Main {
    public static void main(String[] args) {

        Elever rasmus = new Elever();
        rasmus.name = "Rasmus Jannerup";
        rasmus.adress = "Karrebækvej 28D 1th";
        rasmus.semester = 1;
        rasmus.age = 21;
        rasmus.cpr = 100198;
        rasmus.fravaer = 0;

        Underviser andras = new Underviser();
        andras.paedagogisk = true;
        andras.erfaring = 12;
        andras.loen = 50000;
        andras.fag = "Programmering";
        andras.name = "Andras Acs";

        Administation chef = new Administation();
        chef.afdeling = "IT";
        chef.loen = 100000;

    }
}
