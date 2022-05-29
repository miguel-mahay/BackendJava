public class Game {
    public static void main(String[] args) throws InterruptedException{
        TestAshe();

    }

    private static void TestAshe() throws InterruptedException{
        Screen screen = new Screen();
        Ashe ashe1 = new Ashe(
                1,
                "Ashe",
                "Marksman",
                "Moderate",
                "Iceborn warmother of the Avarosan tribe, Ashe commands the most populous horde in the north"
        );

    Runnable attack = new Runnable() {
        @Override
        public void run() {
            try {
                ashe1.frostShot(screen);
                Thread.sleep(4000);

                ashe1.hawkShot(screen);
                Thread.sleep(4000);

                ashe1.rangerFocus(screen);
                Thread.sleep(4000);

                ashe1.volley(screen);
                Thread.sleep(4000);

                ashe1.crystalArrow(screen);
                Thread.sleep(4000);

            } catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    };

Thread attackAshe = new Thread(attack);
attackAshe.start();

    }
}
