import java.util.Scanner;
public class User {
    Scanner scanner = new Scanner(System.in);
    Ingredient ingredient = new Ingredient();

    int espressoMoney = 4000;
    int latteMoney = 7000;
    int cappuccinoMoney = 6000;
    void buy(){
        System.out.println("어떤 커피를 구매하시겠습니까?");
        System.out.println("1. 에스프레소 (가격 : 4000원)");
        System.out.println("2. 라떼 (가격 : 7000원)");
        System.out.println("3. 카푸치노 (가격 : 6000원)");
        System.out.print("> ");
        int buySelect = Integer.parseInt(scanner.nextLine());
        if(buySelect == 1){
            ingredient.setMoney(ingredient.getMoney() + espressoMoney);
        } else if(buySelect == 2){
            ingredient.setMoney(ingredient.getMoney() + latteMoney);
        } else if(buySelect == 3) {
            ingredient.setMoney(ingredient.getMoney() + cappuccinoMoney);
        }
        coffeeMachineState();
    }

    void fill(){

    }

    void take(){

    }

    void coffeeMachineState() {
        System.out.println("남은 재료와 돈 상태: ");
        System.out.println("물 : " + ingredient.getWater() + "ml");
        System.out.println("우유 : " + ingredient.getMilk() + "ml");
        System.out.println("원두 : " + ingredient.getCoffeeBeans() + "g");
        System.out.println("일회용 컵 : " + ingredient.getDisposableCup() + "개");
        System.out.println("돈 : " + ingredient.getMoney() + "원");
    }
}
