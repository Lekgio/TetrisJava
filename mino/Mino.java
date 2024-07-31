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

public class Mino {
    
    public Block b[] = new Block[4];
    public Block tempB[] = new Block[4];

    public void create(Color c) {
        b[0] = new Block(c);
        b[1] = new Block(c);
        b[2] = new Block(c);
        b[3] = new Block(c);
        tempB[0] = new Block(c);
        tempB[1] = new Block(c);
        tempB[2] = new Block(c);
        tempB[3] = new Block(c);
    }

    public void setXY(int x, int y) {}
    public void updateXY(int direction) {}
    public void update() {

    }
    
    public void draw(Graphics2D g2) {
        g2.setColor(b[0].c);
        g2.fillRect(b[0].x - 2, b[0].y + 2, Block.SIZE - 4, Block.SIZE - 4);
        g2.fillRect(b[1].x - 2, b[1].y + 2, Block.SIZE - 4, Block.SIZE - 4);
        g2.fillRect(b[2].x - 2, b[2].y + 2, Block.SIZE - 4, Block.SIZE - 4);
        g2.fillRect(b[3].x - 2, b[3].y + 2, Block.SIZE - 4, Block.SIZE - 4);
    }
}
