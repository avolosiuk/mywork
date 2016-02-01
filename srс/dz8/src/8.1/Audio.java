package files;

public class Audio extends File {
    private String name;

    public Audio(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Audio{" +
                "name='" + name + '\'' +
                '}';
    }
}

