package com.apon.taalmaatjes.frontend.presentation;

import com.apon.taalmaatjes.backend.api.returns.StudentReturn;

public class NameUtil {

    public static String getStudentName(StudentReturn studentReturn) {
        if (studentReturn.getGroup()) {
            // Group is filled in lastName.
            return studentReturn.getLastName();
        } else {
            String studentName = "";

            if (studentReturn.getFirstName() != null) {
                studentName += studentReturn.getFirstName() + " ";
            }

            if (studentReturn.getInsertion() != null) {
                studentName += studentReturn.getInsertion() + " ";
            }

            // Last name is always filled.
            return studentName + studentReturn.getLastName();
        }
    }
}