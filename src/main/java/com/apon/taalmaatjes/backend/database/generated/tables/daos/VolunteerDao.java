/*
 * This file is generated by jOOQ.
*/
package com.apon.taalmaatjes.backend.database.generated.tables.daos;


import com.apon.taalmaatjes.backend.database.generated.tables.Volunteer;
import com.apon.taalmaatjes.backend.database.generated.tables.pojos.VolunteerPojo;
import com.apon.taalmaatjes.backend.database.generated.tables.records.VolunteerRecord;

import java.sql.Date;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class VolunteerDao extends DAOImpl<VolunteerRecord, VolunteerPojo, Integer> {

    /**
     * Create a new VolunteerDao without any configuration
     */
    public VolunteerDao() {
        super(Volunteer.VOLUNTEER, VolunteerPojo.class);
    }

    /**
     * Create a new VolunteerDao with an attached configuration
     */
    public VolunteerDao(Configuration configuration) {
        super(Volunteer.VOLUNTEER, VolunteerPojo.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(VolunteerPojo object) {
        return object.getVolunteerid();
    }

    /**
     * Fetch records that have <code>VOLUNTEERID IN (values)</code>
     */
    public List<VolunteerPojo> fetchByVolunteerid(Integer... values) {
        return fetch(Volunteer.VOLUNTEER.VOLUNTEERID, values);
    }

    /**
     * Fetch a unique record that has <code>VOLUNTEERID = value</code>
     */
    public VolunteerPojo fetchOneByVolunteerid(Integer value) {
        return fetchOne(Volunteer.VOLUNTEER.VOLUNTEERID, value);
    }

    /**
     * Fetch records that have <code>EXTERNALIDENTIFIER IN (values)</code>
     */
    public List<VolunteerPojo> fetchByExternalidentifier(String... values) {
        return fetch(Volunteer.VOLUNTEER.EXTERNALIDENTIFIER, values);
    }

    /**
     * Fetch a unique record that has <code>EXTERNALIDENTIFIER = value</code>
     */
    public VolunteerPojo fetchOneByExternalidentifier(String value) {
        return fetchOne(Volunteer.VOLUNTEER.EXTERNALIDENTIFIER, value);
    }

    /**
     * Fetch records that have <code>FIRSTNAME IN (values)</code>
     */
    public List<VolunteerPojo> fetchByFirstname(String... values) {
        return fetch(Volunteer.VOLUNTEER.FIRSTNAME, values);
    }

    /**
     * Fetch records that have <code>INSERTION IN (values)</code>
     */
    public List<VolunteerPojo> fetchByInsertion(String... values) {
        return fetch(Volunteer.VOLUNTEER.INSERTION, values);
    }

    /**
     * Fetch records that have <code>LASTNAME IN (values)</code>
     */
    public List<VolunteerPojo> fetchByLastname(String... values) {
        return fetch(Volunteer.VOLUNTEER.LASTNAME, values);
    }

    /**
     * Fetch records that have <code>DATEOFBIRTH IN (values)</code>
     */
    public List<VolunteerPojo> fetchByDateofbirth(Date... values) {
        return fetch(Volunteer.VOLUNTEER.DATEOFBIRTH, values);
    }

    /**
     * Fetch records that have <code>PHONENUMBER IN (values)</code>
     */
    public List<VolunteerPojo> fetchByPhonenumber(String... values) {
        return fetch(Volunteer.VOLUNTEER.PHONENUMBER, values);
    }

    /**
     * Fetch records that have <code>MOBILEPHONENUMBER IN (values)</code>
     */
    public List<VolunteerPojo> fetchByMobilephonenumber(String... values) {
        return fetch(Volunteer.VOLUNTEER.MOBILEPHONENUMBER, values);
    }

    /**
     * Fetch records that have <code>EMAIL IN (values)</code>
     */
    public List<VolunteerPojo> fetchByEmail(String... values) {
        return fetch(Volunteer.VOLUNTEER.EMAIL, values);
    }

    /**
     * Fetch records that have <code>POSTALCODE IN (values)</code>
     */
    public List<VolunteerPojo> fetchByPostalcode(String... values) {
        return fetch(Volunteer.VOLUNTEER.POSTALCODE, values);
    }

    /**
     * Fetch records that have <code>CITY IN (values)</code>
     */
    public List<VolunteerPojo> fetchByCity(String... values) {
        return fetch(Volunteer.VOLUNTEER.CITY, values);
    }

    /**
     * Fetch records that have <code>STREETNAME IN (values)</code>
     */
    public List<VolunteerPojo> fetchByStreetname(String... values) {
        return fetch(Volunteer.VOLUNTEER.STREETNAME, values);
    }

    /**
     * Fetch records that have <code>HOUSENR IN (values)</code>
     */
    public List<VolunteerPojo> fetchByHousenr(String... values) {
        return fetch(Volunteer.VOLUNTEER.HOUSENR, values);
    }

    /**
     * Fetch records that have <code>LOG IN (values)</code>
     */
    public List<VolunteerPojo> fetchByLog(String... values) {
        return fetch(Volunteer.VOLUNTEER.LOG, values);
    }

    /**
     * Fetch records that have <code>JOB IN (values)</code>
     */
    public List<VolunteerPojo> fetchByJob(String... values) {
        return fetch(Volunteer.VOLUNTEER.JOB, values);
    }

    /**
     * Fetch records that have <code>DATETRAINING IN (values)</code>
     */
    public List<VolunteerPojo> fetchByDatetraining(Date... values) {
        return fetch(Volunteer.VOLUNTEER.DATETRAINING, values);
    }
}
