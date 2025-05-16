/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConTrol;

import UTIL.XDialog;

/**
 *
 * @author Admin
 */
public class Contro {
    public interface LoginController {
void open();
void login();
default void exit(){
if(XDialog.confirm("Bạn muốn kết thúc?")){
System.exit(0);

}
}
    }
}

