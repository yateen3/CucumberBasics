package Steps;

import Base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by a615532 on 24-06-2017.
 */
public class LoginSteps extends BaseUtil{

   /* private BaseUtil base;

    public LoginSteps(BaseUtil base) {
        this.base = base;
    }
*/
    @Given("^I navigate to login page$")
    public void iNavigateToLoginPage() throws Throwable {
    //    System.out.println("dd");
    //System.out.println("The driver is"+base.stepInfo);

    }

    @And("^I enter username as admin and password as admin$")
    public void iEnterUsernameAsAdminAndPasswordAsAdmin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^I click on enter button$")
    public void iClickOnEnterButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I should see on user form$")
    public void iShouldSeeOnUserForm() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }


    @And("^I enter the following credential$")
    public void iEnterTheFollowingCredential(DataTable table) throws Throwable {
        List<List<String>> data = table.raw();

        /*System.out.println(table.get(0).get(0).toString());
        System.out.println(table.get(0).get(1).toString());*/

        List<User> users = new ArrayList<User>();
        users = table.asList(User.class);

        for (User user : users) {

//            System.out.println("The username is " + user.username);
  //          System.out.println("The password is " + user.password);
        }
    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String username, String password) throws Throwable {
        System.out.println("Username: "+username);
        System.out.println("Password: "+password);
    }

    public class User {
        public String username;
        public String password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }
}
