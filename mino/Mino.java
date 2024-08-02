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

import TetrisJava.PlayManager;
import TetrisJava.KeyHandler;

public class Mino {
    
    public Block b[] = new Block[4];
    public Block tempB[] = new Block[4];
    int autoDropCounter = 0;

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
        // Move the mino
        if (KeyHandler.upPressed) {

        }

        if (KeyHandler.downPressed) {
            b[0].y += Block.SIZE;
            b[1].y += Block.SIZE;
            b[2].y += Block.SIZE;
            b[3].y += Block.SIZE;

            // When moved down, reset the autoDropCounter
            autoDropCounter = 0;
            
            KeyHandler.downPressed = false;
        }

        if (KeyHandler.leftPressed) { 
            b[0].x -= Block.SIZE;
            b[1].x -= Block.SIZE;
            b[2].x -= Block.SIZE;
            b[3].x -= Block.SIZE;

            KeyHandler.leftPressed = false;
        }

        if (KeyHandler.rightPressed) {
            b[0].x += Block.SIZE;
            b[1].x += Block.SIZE;
            b[2].x += Block.SIZE;
            b[3].x += Block.SIZE;
            
            KeyHandler.rightPressed = false;
        }
        autoDropCounter++; // the counter increases in every frame
        if (autoDropCounter == PlayManager.dropInterval) {
            // the mino goes down
            b[0].y += Block.SIZE;
            b[1].y += Block.SIZE;
            b[2].y += Block.SIZE;
            b[3].y += Block.SIZE;
            autoDropCounter = 0;
        }

    }
    
    public void draw(Graphics2D g2) {
        g2.setColor(b[0].c);
        g2.fillRect(b[0].x - 2, b[0].y + 2, Block.SIZE - 4, Block.SIZE - 4);
        g2.fillRect(b[1].x - 2, b[1].y + 2, Block.SIZE - 4, Block.SIZE - 4);
        g2.fillRect(b[2].x - 2, b[2].y + 2, Block.SIZE - 4, Block.SIZE - 4);
        g2.fillRect(b[3].x - 2, b[3].y + 2, Block.SIZE - 4, Block.SIZE - 4);
    }
}
