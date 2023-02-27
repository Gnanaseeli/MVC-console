package com.contactView;

//import com.contactController.ContactController;
//import com.contactModel.ContactModel;
//
//public class ContactManagement {
//    public static void main(String[] args) {
//        ContactModel model = new ContactModel();
//        ContactView view = new ContactView();
//        ContactController controller = new ContactController(model, view);
//        controller.start();
//    }
//}



import java.util.ArrayList;

import com.contactController.ContactController;
import com.contactModel.Contact;

public class ContactManagement {
    public static void main(String[] args) {
        ContactView view = new ContactView();
        ArrayList<Contact> model = new ArrayList<>();
        ContactController controller = new ContactController(view, model);

        controller.run();
    }
}
