package Border_Control;

public class Citizen implements Identifiable{

    private String name;
    private Integer age;
    public String id;

    public Citizen(String name, Integer age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
