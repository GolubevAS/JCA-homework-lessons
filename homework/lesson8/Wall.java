package ru.homework.lesson8;

public class Wall implements Barrier {
    private final int height;

    public Wall (int height) {
        this.height = height;
    }

    @Override
    public boolean win (User user) {
        if (user.jump (this.height)) {
            System.out.printf("%s %s jump track of %dm.\n", user.getClass().getSimpleName(), user.getName(), height);
            return true;
        }
        System.out.printf("%s %s haven't jumped over wall of %dm.\n", user.getClass().getSimpleName(), user.getName(), height);
        return false;
    }
}
