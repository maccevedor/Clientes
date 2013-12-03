/*
 * Edwin Leonardo Rojas     Cod. 2012510069
 * Javier Leonardo Grajales Cod. 2013510036
 */
package Control;

import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Edwin Leonardo Rojas
 */
public class Validaciones {
    boolean validacion;
    
    public boolean TeclaEntero(String texto, KeyEvent e){//acepta solo números, ningún otro caracter
        char c = e.getKeyChar();
        if(texto.length()==0){
            if((c<'1' || c>'9') && c!='-' && c!=e.VK_BACK_SPACE && c!=e.VK_ENTER && c!=e.VK_DELETE){
                validacion=false;
            }
            else{
                validacion=true;
            }
        }
        else if(texto.length()==1 && texto.charAt(0)=='-'){
            if((c<'1' || c>'9') && c!=e.VK_BACK_SPACE && c!=e.VK_ENTER && c!=e.VK_DELETE){
                validacion=false;
            }
            else{
                validacion=true;
            }
        }
        else{
            if((c<'0' || c>'9') && c!=e.VK_BACK_SPACE && c!=e.VK_ENTER && c!=e.VK_DELETE){
                validacion=false;
            }
            else{
                validacion=true;
            }        
        }
        return validacion;
    }
    
    public boolean TeclaEntPos(String texto, KeyEvent e){//acepta solo números, ningún otro caracter
        char c = e.getKeyChar();
        if((c<'0' || c>'9') && c!=e.VK_BACK_SPACE && c!=e.VK_ENTER && c!=e.VK_DELETE){
                validacion=false;
        }
        else{
                validacion=true;
        }        
        return validacion;
    }
    
    public boolean TeclaDecimal(String texto, KeyEvent e){//acepta solo números, ningún otro caracter
        
        char c = e.getKeyChar();
        int b = 0;
        if(texto.length()==0){
            if((c<'0' || c>'9') && c!='-' && c!='.' && c!=',' && c!=e.VK_BACK_SPACE && c!=e.VK_ENTER && c!=e.VK_DELETE){
                validacion=false;
            }
            else{
                validacion=true;
            }
        }
        else{
            for(int i=0; i==texto.length();i++){
                if((texto.charAt(i)=='.' && c=='.') || (texto.charAt(i)==',' && c==',')){
                    b = b+1;
                    validacion=false;
                    break;
                }
            }
            if(c<'0' || c>'9'){
                validacion=false;
            }
            else{
                validacion=true;
            }        
        }
        return validacion;
    }
    
    public boolean TeclaTexto(KeyEvent e){
        char c = e.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && c!=e.VK_BACK_SPACE && c!=e.VK_ENTER && c!=e.VK_DELETE){
            validacion=false;
        }
        else{
            validacion=true;
        }
        return validacion;
    }
    
    public boolean cantTexto(String palabra, int cantidad){
        if(palabra.length()>=cantidad){
            validacion = false;        
        }
        else{
            validacion = true;
        }
        return validacion;
    }
    
    public boolean validaMail(String texto){//Valida si es o no un correo electrónico     
        Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$ ");
        Matcher mat = pat.matcher(texto);
        if(mat.find()){
            validacion=true;
        }
        else{
            validacion=false;
        }
        return validacion;
    }
}
