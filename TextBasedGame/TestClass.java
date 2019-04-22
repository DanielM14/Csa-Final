
public class TestClass
{
    public static void main(String[] args) throws InterruptedException
    {
        UserNameInput.names();
        String userName2 = UserNameInput.userName; 
        System.out.println("\nTest class name is " + userName2);
    }
}
