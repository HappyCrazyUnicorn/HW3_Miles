public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService(); //создаем объект из класса BonusMilesService
        int price = 10_000; //объявляем переменную стоимости билета
        int miles = service.calculate(price); //вызываем метод calculate из класса BonusMilesService, передаем на вход стоимость билета

        System.out.println("Вам будет начислено " + miles + " миль"); //выводим рассчетное количество миль
    }
}