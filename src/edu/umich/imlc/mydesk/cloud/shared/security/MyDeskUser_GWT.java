package edu.umich.imlc.mydesk.cloud.shared.security;

import java.util.HashMap;

import com.google.gwt.user.client.rpc.IsSerializable;

import edu.umich.imlc.mydesk.cloud.shared.Date_GWT;

/**
 * GWT equivalent to MyDeskUser_DS.
 * 
 */
public class MyDeskUser_GWT implements IsSerializable
{
  private String gMail;

  private String firstName;

  private String middleName;

  private String lastName;

  private Date_GWT dateOfBirth;

  private String homeNumber;

  private String workNumber;

  private String mobileNumber;

  private String faxNumber;

  private String addressLine1;

  private String addressLine2;

  private String city;

  private String state;

  private String postalCode;

  private String country;

  private HashMap<String, String> tagMap = new HashMap<String, String>();

  // ---------------------------------------------------------------------------
  // ---------------------------------------------------------------------------

  public MyDeskUser_GWT(String gMail_, String firstName_, String lastName_)
  {
    assert (gMail_ != null && !gMail_.isEmpty());
    assert (firstName_ != null && !firstName_.isEmpty());
    assert (lastName_ != null && !lastName_.isEmpty());

    gMail = gMail_;
    firstName = firstName_;
    lastName = lastName_;
  }// ctor

  // ---------------------------------------------------------------------------

  /**
   * No-arg constructor for Objectify
   */
  @SuppressWarnings("unused")
  private MyDeskUser_GWT()
  {

  }// ctor

  // ---------------------------------------------------------------------------

  public String getGMail()
  {
    return gMail;
  }

  // ---------------------------------------------------------------------------

  public String getFirstName()
  {
    return firstName;
  }

  // ---------------------------------------------------------------------------

  public void setFirstName(String firstName_)
  {
    firstName = firstName_;
  }

  // ---------------------------------------------------------------------------

  public String getMiddleName()
  {
    return middleName;
  }

  // ---------------------------------------------------------------------------

  public void setMiddleName(String middleName_)
  {
    middleName = middleName_;
  }

  // ---------------------------------------------------------------------------

  public String getLastName()
  {
    return lastName;
  }

  // ---------------------------------------------------------------------------

  public void setLastName(String lastName_)
  {
    lastName = lastName_;
  }

  // ---------------------------------------------------------------------------

  public String getFirstAndLastName()
  {
    return ((firstName == null) ? ("") : (firstName)) + " "
        + ((lastName == null) ? ("") : (lastName));
  }

  // ---------------------------------------------------------------------------

  public Date_GWT getDateOfBirth()
  {
    return dateOfBirth;
  }

  // ---------------------------------------------------------------------------

  public void setDateOfBirth(Date_GWT dateOfBirth_)
  {
    assert (dateOfBirth_ != null);
    dateOfBirth = dateOfBirth_;
  }

  // ---------------------------------------------------------------------------

  /**
   * Returns the tag map for this object. The keys are duplicated in a list for
   * indexing.
   */
  public HashMap<String, String> getTagMap()
  {
    return tagMap;
  }

  // ---------------------------------------------------------------------------

  public String toString()
  {
    StringBuilder str = new StringBuilder();
    str.append("Gmail: " + gMail + "\n");
    if( (firstName == null) || (lastName == null) )
    {
      str.append("Null Name");
    }
    else
    {
      str.append("Name: " + firstName + " " + lastName + "\n");
    }
    return str.toString();
  }

  // ---------------------------------------------------------------------------

  public String getHomeNumber()
  {
    return homeNumber;
  }

  // ---------------------------------------------------------------------------

  public void setHomeNumber(String homeNumber_)
  {
    homeNumber = homeNumber_;
  }

  // ---------------------------------------------------------------------------

  public String getWorkNumber()
  {
    return workNumber;
  }

  // ---------------------------------------------------------------------------

  public void setWorkNumber(String workNumber_)
  {
    workNumber = workNumber_;
  }

  // ---------------------------------------------------------------------------

  public String getMobileNumber()
  {
    return mobileNumber;
  }

  // ---------------------------------------------------------------------------

  public void setMobileNumber(String mobileNumber_)
  {
    mobileNumber = mobileNumber_;
  }

  // ---------------------------------------------------------------------------

  public String getFaxNumber()
  {
    return faxNumber;
  }

  // ---------------------------------------------------------------------------

  public void setFaxNumber(String faxNumber_)
  {
    faxNumber = faxNumber_;
  }

  // ---------------------------------------------------------------------------

  public String getAddress1()
  {
    return addressLine1;
  }

  // ---------------------------------------------------------------------------

  public void setAddressLine1(String addressLine1_)
  {
    addressLine1 = addressLine1_;
  }

  // ---------------------------------------------------------------------------

  public String getAddressLine2()
  {
    return addressLine2;
  }

  // ---------------------------------------------------------------------------

  public void setAddressLine2(String addressLine2_)
  {
    addressLine2 = addressLine2_;
  }

  // ---------------------------------------------------------------------------

  public String getCity()
  {
    return city;
  }

  // ---------------------------------------------------------------------------

  public void setCity(String city_)
  {
    city = city_;
  }

  // ---------------------------------------------------------------------------

  public String getState()
  {
    return state;
  }

  // ---------------------------------------------------------------------------

  public void setState(String state_)
  {
    state = state_;
  }

  // ---------------------------------------------------------------------------

  public String getPostalCode()
  {
    return postalCode;
  }

  // ---------------------------------------------------------------------------

  public void setPostalCode(String postalCode_)
  {
    postalCode = postalCode_;
  }

  // ---------------------------------------------------------------------------

  public String getCountry()
  {
    return country;
  }

  // ---------------------------------------------------------------------------

  public void setCountry(String country_)
  {
    country = country_;
  }

}// class
