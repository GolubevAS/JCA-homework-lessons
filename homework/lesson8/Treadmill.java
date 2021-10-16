package ru.homework.lesson8;

public class Treadmill implements Barrier {
    private final int lenght;

    public Treadmill (int lenght) {
        this.lenght = lenght;
    }

    @Override
    public boolean win (User user) {
        if (user.run (this.lenght)) {
            System.out.printf("%s %s ran track of %dm.\n", user.getClass().getSimpleName(), user.getName(), lenght);
            return true;
        }
        System.out.printf("%s %s haven't ran track of %dm.\n", user.getClass().getSimpleName(), user.getName(), lenght);
        return false;
    }
}
