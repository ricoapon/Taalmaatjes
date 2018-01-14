package com.apon.taalmaatjes.frontend.tabs.volunteers.detail;

import com.apon.taalmaatjes.backend.database.generated.tables.pojos.VolunteerPojo;
import com.apon.taalmaatjes.backend.database.generated.tables.pojos.VolunteerinstancePojo;
import com.apon.taalmaatjes.backend.facade.VolunteerFacade;
import com.apon.taalmaatjes.backend.util.StringUtil;
import com.apon.taalmaatjes.frontend.FrontendContext;
import com.apon.taalmaatjes.frontend.transition.Transition;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class DetailVolunteer {
    VolunteerFacade volunteerFacade;
    int volunteerId;

    @FXML
    Label labelName, labelDateOfBirth, labelPhoneNr, labelMobPhoneNr, labelEmail, labelStreetNameAndHouseNr, labelPostalCode, labelCity;

    @FXML
    VBox vboxActive;

    public void setVolunteerId(int volunteerId) {
        this.volunteerId = volunteerId;
        volunteerFacade = new VolunteerFacade(FrontendContext.getInstance().getContext());
        initializeValues();
    }

    /**
     * Controller is initialized before volunteerId is set, therefore we don't use @FXML here.
     */
    public void initializeValues() {
        VolunteerPojo volunteerPojo = volunteerFacade.getVolunteer(volunteerId);

        // Set the name.
        String name = "";
        if (volunteerPojo.getFirstname() != null) {
            name += volunteerPojo.getFirstname() + " ";
        }
        if (volunteerPojo.getInsertion() != null) {
            name += volunteerPojo.getInsertion()  + " ";
        }
        if (volunteerPojo.getLastname() != null) {
            name += volunteerPojo.getLastname() + " ";
        }
        name += "(" + String.valueOf(volunteerPojo.getVolunteerid()) + ")";
        labelName.setText(name);

        // Set the date of birth.
        labelDateOfBirth.setText(StringUtil.getOutputString(volunteerPojo.getDateofbirth()));

        // Set phonenumber,
        labelPhoneNr.setText(StringUtil.getOutputString(volunteerPojo.getPhonenumber()));

        // Set mobile phone nr.
        labelMobPhoneNr.setText(StringUtil.getOutputString(volunteerPojo.getMobilephonenumber()));

        // Set email.
        labelEmail.setText(StringUtil.getOutputString(volunteerPojo.getEmail()));

        // Set street and house number
        if (volunteerPojo.getStreetname() != null && volunteerPojo.getHousenr() != null) {
            labelStreetNameAndHouseNr.setText(StringUtil.getOutputString(volunteerPojo.getStreetname() + " " + volunteerPojo.getHousenr()));
        }

        // Set postal code
        labelPostalCode.setText(StringUtil.getOutputString(volunteerPojo.getPostalcode()));

        // Set city
        labelCity.setText(StringUtil.getOutputString(volunteerPojo.getCity()));

        // Add all volunteerInstance lines (in order!).
        for (VolunteerinstancePojo volunteerinstancePojo : volunteerFacade.getVolunteerInstanceInOrder(volunteerId)) {
            addActiveLine(volunteerinstancePojo);
        }
    }

    @FXML
    public void initialize() {

    }

    @FXML
    public void back() {
        Transition.getInstance().volunteerOverview();
    }

    private void addActiveLine(VolunteerinstancePojo volunteerinstancePojo) {
        Label label = new Label();
        label.getStyleClass().add("labelActive");
        String text = "Actief vanaf " + volunteerinstancePojo.getDatestart() + " tot ";
        if (volunteerinstancePojo.getDateend() == null) {
            text += "nu.";
        } else {
            text += volunteerinstancePojo.getDateend() + ".";
        }

        label.setText(text);
        vboxActive.getChildren().add(label);
    }
}
