package Food_Shortage;

public class Citizen implements Person, Buyer, Identifiable {

        private String name;
        private int age;
        private String id;
        private String birthDate;
        private int food;


    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
        this.food=0;

    }
   @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    @Override
    public int getFood() {
        return food;
    }
     @Override
    public void buyFood() {
        this.food+=10;
    }


}

