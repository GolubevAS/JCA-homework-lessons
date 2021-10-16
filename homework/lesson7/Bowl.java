package ru.homework.lesson7;

public class Bowl {

    private int foodAmount; // количество еды



    public Bowl (int foodAmount) {      // конструктор
        this.foodAmount = foodAmount;
        if (foodAmount < 0) this.foodAmount = 0;
    }

    public void plusFoodIntoBowl (int amount) { // метод добавления еды в миску
        this.foodAmount += amount;
        System.out.printf("Еды добавлено на %d, теперь еды %d \n", amount, this.foodAmount);
    }


    public boolean minusFood (int amount) {   // метод "кушаем"
        if (this.foodAmount < amount) {
            System.out.printf("Еды недостаточно, сейчас еды  %d , необходимо  %d еды\n",  this.foodAmount, amount);
            return false;
        }

        this.foodAmount -= amount;
        System.out.printf("Тарелка уменьшилась на %d еды, теперь осталось %d еды\n", amount, this.foodAmount);
        return true;
    }


    public int getFoodAmount() {
        return foodAmount;
    }

    @Override
    public String toString () {
        return "Bowl{" +
                "foodAmount='" + foodAmount +
                '}';
    }




}
