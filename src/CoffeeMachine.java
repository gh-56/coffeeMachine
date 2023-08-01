import java.util.Scanner;
public class CoffeeMachine {
    public static void main(String[] args) {

        boolean run = true;
        Ingredient ingredient = new Ingredient();
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========================");
        System.out.println("커피 머신이 가동되었습니다.");
        System.out.println("현재 커피머신 상태: ");
        user.coffeeMachineState();
        while(run) {
            System.out.println("==========================");
            System.out.println("옵션을 선택하세요");
            System.out.println("1. 구매 | 2. 채우기 | 3. 가져가기 | 4. 종료");
            System.out.print("> ");
            int select = Integer.parseInt(scanner.nextLine());
            System.out.println("==========================");

            if(select == 1){
                user.buy();
            } else if(select == 2) {
                run = false;
            } else if(select == 3){
                run = false;
            } else if(select == 4) {
                run = false;
            }
        }
    }
}