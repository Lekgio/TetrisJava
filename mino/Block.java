//  _          _         _       
// | |        | |       (_)      
// | |     ___| | ____ _ _  ___  
// | |    / _ \ |/ / _` | |/ _ \ 
// | |___|  __/   < (_| | | (_) |
// |______\___|_|\_\__, |_|\___/ 
//                  __/ |        
//                 |___/         
// ----------------------------------
// Github: https://github.com/Lekgio

package TetrisJava.mino;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Block extends Rectangle{

    public int x, y;
    public static final int SIZE = 30; // 30x30 block
    public Color c;

    public Block(Color c) {
        this.c = c;
    }

    public void draw(Graphics2D g2) {
        g2.setColor(c);
        g2.fillRect(x + 2, y + 2, SIZE - 4, SIZE - 4);
    }
}
