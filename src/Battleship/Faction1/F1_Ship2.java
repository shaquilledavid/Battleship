package Battleship.Faction1;

import Battleship.Ships;

public class F1_Ship2 extends Ships {
    /*
    A child of Ships
    A ship has an appropriate artwork set at instantiation
    A ship has a Mouse Listener
    */

    public F1_Ship2() {
        setH(100);
        setW(50);//Set the size of the ship
        setArt("Art/SpaceShips/Faction1/Ship2.png");//Set the artwork of the ship
    }
}
