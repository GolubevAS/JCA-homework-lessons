package ru.homework.firsttask;

public class Tarelka {
    private int eda_v_tarelke;

    public Tarelka(int eda_v_tarelke) {
        this.eda_v_tarelke = eda_v_tarelke;
        if (eda_v_tarelke < 0) this.eda_v_tarelke = 0;
    }

    //процесс уменьшения еды
    public boolean minusFood (int kol) {
        this.eda_v_tarelke -= kol;
        System.out.printf("Тарелка опустела на  %d еды, теперь там осталось: %d\n", kol, this.eda_v_tarelke);
        return true;
    }

    public int getEda_v_tarelke() {
        return eda_v_tarelke;
    }

    public void setEda_v_tarelke(int eda_v_tarelke) {
        this.eda_v_tarelke = eda_v_tarelke;
    }

    @Override
    public String toString() {
        return "Bowl{" +
                "eda_v_tarelke=" + eda_v_tarelke +
                '}';
    }
}
