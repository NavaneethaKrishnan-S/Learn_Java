
package InterfaceExample;

public class PacmanGame implements GamingConsole{
    @Override
    public void up(){
        System.out.println("Up");
    }
    @Override
    public void down(){
        System.out.println("Down");
    }
    @Override
    public void right(){
        System.out.println("Right");
    }
    @Override
    public void left(){
        System.out.println("Left");
    }
}
