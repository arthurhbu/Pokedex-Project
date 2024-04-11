package Fonte;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

public class jFrameAddingFont {
    
    public static Font font;
    
    public static Font Adding_font(){
        try{
            File fontstyle = new File("src\\Fonte\\Anton-Regular.ttf");
            font = Font.createFont(Font.TRUETYPE_FONT, fontstyle);
        }catch(FontFormatException | IOException e){
            System.out.println(e);
        }
        return font;
    }
    
    public static void main(String[] args) {
        
        Font fonte = Adding_font();
    }

}
