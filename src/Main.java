import com.patikadev.helper.Helper;
import com.patikadev.view.LoginGUI;


public class Main {
    public static void main(String[] args) {



        Helper.setLayout();
        Operator operator=new Operator();
        operator.setId(1);
        operator.setFirstName("Berk");
        operator.setLastName("tmpp");
        operator.setUserName("berktmp");
        operator.setUserPassword("123456");
        operator.setUserType("OPERATOR");
        OperatorGUI operatorGUI=new OperatorGUI(operator);
         */

        Helper.setLayout();
        LoginGUI loginGUI=new LoginGUI();
    }
}
