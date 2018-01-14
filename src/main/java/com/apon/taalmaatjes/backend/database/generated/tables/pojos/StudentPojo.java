/*
 * This file is generated by jOOQ.
*/
package com.apon.taalmaatjes.backend.database.generated.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StudentPojo implements Serializable {

    private static final long serialVersionUID = -1989892543;

    private Integer studentid;
    private String  firstname;
    private String  insertion;
    private String  lastname;
    private Boolean islookingforvolunteer;
    private Boolean isgroup;

    public StudentPojo() {}

    public StudentPojo(StudentPojo value) {
        this.studentid = value.studentid;
        this.firstname = value.firstname;
        this.insertion = value.insertion;
        this.lastname = value.lastname;
        this.islookingforvolunteer = value.islookingforvolunteer;
        this.isgroup = value.isgroup;
    }

    public StudentPojo(
        Integer studentid,
        String  firstname,
        String  insertion,
        String  lastname,
        Boolean islookingforvolunteer,
        Boolean isgroup
    ) {
        this.studentid = studentid;
        this.firstname = firstname;
        this.insertion = insertion;
        this.lastname = lastname;
        this.islookingforvolunteer = islookingforvolunteer;
        this.isgroup = isgroup;
    }

    public Integer getStudentid() {
        return this.studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getInsertion() {
        return this.insertion;
    }

    public void setInsertion(String insertion) {
        this.insertion = insertion;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Boolean getIslookingforvolunteer() {
        return this.islookingforvolunteer;
    }

    public void setIslookingforvolunteer(Boolean islookingforvolunteer) {
        this.islookingforvolunteer = islookingforvolunteer;
    }

    public Boolean getIsgroup() {
        return this.isgroup;
    }

    public void setIsgroup(Boolean isgroup) {
        this.isgroup = isgroup;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("StudentPojo (");

        sb.append(studentid);
        sb.append(", ").append(firstname);
        sb.append(", ").append(insertion);
        sb.append(", ").append(lastname);
        sb.append(", ").append(islookingforvolunteer);
        sb.append(", ").append(isgroup);

        sb.append(")");
        return sb.toString();
    }
}
