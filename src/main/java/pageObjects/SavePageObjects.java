package pageObjects;

import com.hp.lft.sdk.Desktop;

import com.hp.lft.sdk.stdwin.*;


public class SavePageObjects {

    public EditField getFileName() throws Exception {
        return  Desktop.describe(Window.class, new WindowDescription.Builder()
                .childWindow(false)
                .ownedWindow(false)
                .windowClassRegExp("Chrome_WidgetWin_1")
                .windowTitleRegExp(" Google Chrome").build())
                .describe(Dialog.class, new DialogDescription.Builder()
                        .childWindow(false)
                        .ownedWindow(true)
                        .nativeClass("#32770")
                        .text("Save As").build())
                .describe(EditField.class, new EditFieldDescription.Builder()
                        .attachedText("File name:")
                        .nativeClass("Edit").build());
    }



    public Button saveButton() throws  Exception {
       return Desktop.describe(Window.class, new WindowDescription.Builder()
                .childWindow(false)
                .ownedWindow(false)
                .windowClassRegExp("Chrome_WidgetWin_1")
                .windowTitleRegExp(" Google Chrome").build())
                .describe(Dialog.class, new DialogDescription.Builder()
                        .childWindow(false)
                        .ownedWindow(true)
                        .nativeClass("#32770")
                        .text("Save As").build())
                .describe(Button.class, new ButtonDescription.Builder()
                        .nativeClass("Button")
                        .text("&Save").build());
    }


}
