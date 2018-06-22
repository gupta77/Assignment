package steps;

import com.hp.lft.sdk.Aut;
import com.hp.lft.sdk.Desktop;
import com.hp.lft.sdk.GeneralLeanFtException;

public class Launch {

    public Aut launchApp(String path) throws GeneralLeanFtException {
        Aut app =  Desktop.launchAut( path);
        return app;
    }

}
