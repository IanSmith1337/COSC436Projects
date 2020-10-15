package Composite;

import java.util.Random;

public class Driver {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory homework = new Directory("Homework");
        Directory games = new Directory("Games");
        Directory sus = new Directory("Imposters");
        root.add(homework);
        root.add(games);
        root.add(sus);
        for(int i = 0; i < 10; i++) {
            File file = new File("File_" + (i+1));
            Random random = new Random();
            int result = random.nextInt(3) + 1;
            switch (result) {
                case 1:
                    homework.add(file);
                    break;
                case 2:
                    games.add(file);
                    break;
                case 3:
                    sus.add(file);
                    break;
            }
        }
        root.ls();
    }
}
