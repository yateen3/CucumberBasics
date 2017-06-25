package Steps;

import Base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by a615532 on 25-06-2017.
 */
public class Hook extends BaseUtil{

/*    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }*/

    @Before
    public void initialize()
    {
        System.out.println("Opening Browser :MOCK");
        //Passing the instance of Webdriver
   //    base.stepInfo="FireFoxDriver";
    }

    @After
    public void teardown()
    {
        System.out.println("Closing Browser");
    }
}
