package Battleship.Faction1;

import Battleship.Pin;
import Battleship.Ships;

public class F1_Ship4 extends Ships {

    public F1_Ship4() {
        Crtitical.add(new Pin(50,50));
        Crtitical.add(new Pin(50,100));
        Crtitical.add(new Pin(50,150));

        setH(100);setW(50);

        setArt("Art/SpaceShips/Faction1/Ship4.png");

    }
}
