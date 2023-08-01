public class Ingredient {
    private int money = 50000;
    private int water = 400;
    private int milk = 540;
    private int coffeeBeans = 120;
    private int disposableCup = 9;

//     money getter, setter
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


//    water getter, setter
    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        if(water < 0){
            System.out.println("물이 부족합니다");
            return;
        } else {
            this.water = water;
        }
    }

//    milk getter, setter
    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        if(milk < 0) {
            System.out.println("우유가 부족합니다");
            return;
        } else {
            this.milk = milk;
        }
    }

//    coffeeBeans getter, setter
    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        if(coffeeBeans < 0) {
            System.out.println("원두가 부족합니다");
            return;
        } else {
            this.coffeeBeans = coffeeBeans;
        }
    }

//    disposableCup getter, setter
    public int getDisposableCup() {
        return disposableCup;
    }

    public void setDisposableCup(int disposableCup) {
        if(disposableCup < 0) {
            System.out.println("컵이 부족합니다");
            return;
        } else {
            this.disposableCup = disposableCup;
        }
    }
}
