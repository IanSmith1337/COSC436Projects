package Composite;

import java.util.ArrayList;

public class Directory implements AbstractFile {
    private String name;
    private ArrayList<AbstractFile> includedFiles = new ArrayList<>(10);
    
    public Directory(String n){
        this.name = n;
    }
    
    
    @Override
    public void ls() {
        System.out.println("Directory: " + name);
        for (AbstractFile abstractFile : includedFiles) {
            System.out.print("    ");
            abstractFile.ls();
        }
    }

    public void add(AbstractFile file) {
        includedFiles.add(file);
    }
}
