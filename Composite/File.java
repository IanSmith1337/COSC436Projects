package Composite;

public class File implements AbstractFile{
    private String name;

    public File(String n) {
        this.name = n;
    }

    @Override
    public void ls() {
        System.out.print("    ");
        System.out.println("File: " + name);
    }
}
