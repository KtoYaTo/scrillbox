public class CoffeeMachine
{
    private int[] drinkPrices;
    private String[] drinkNames;

    public CoffeeMachine(int[] prices, String[] names)
    {
        this.drinkNames = names;
        this.drinkPrices = prices;
    }

    public void checkPrices(int moneyAmount)
    {
        for(int i = 0; i < drinkNames.length; i = i + 1)
        {
            if(moneyAmount >= drinkPrices[i]) {
                System.out.println("Вы можете купить " +
                        drinkNames[i]);
            }
        }
    }
}
