package lap5.part1;

public abstract class Taxpayer{

    private String id;

    public String getId(){
        return id;
    }
    public abstract double pay();
}
