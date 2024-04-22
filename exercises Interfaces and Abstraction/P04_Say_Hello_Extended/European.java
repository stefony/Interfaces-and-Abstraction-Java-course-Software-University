package Say_Hello_Extend;


public class European extends BasePerson {

    private String name;

    public European(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Hello";
    }


}

