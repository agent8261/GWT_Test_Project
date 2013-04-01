package edu.umich.imlc.mydesk.cloud.shared.security;

import java.util.HashMap;

import com.google.gwt.user.client.rpc.IsSerializable;

public class Organization_GWT implements IsSerializable
{
  private Long organizationID;

  private String organizationName;

  private String email;

  private String address1;

  private String address2;

  private String city;

  private String state;

  private String postalCode;

  private String country;

  private String primaryPhoneNumber;

  private String secondaryPhoneNumber;

  private String faxNumber;

  private HashMap<String, String> tagMap = new HashMap<String, String>();

  // ---------------------------------------------------------------------------
  // ---------------------------------------------------------------------------

  /**
   * Use this ctor on the front-end. Both the email and organization name must
   * individually unique among all other organizations.
   */
  public Organization_GWT(String organizationName_, String email_)
  {
    this(null, organizationName_, email_);
  }// ctor

  // ---------------------------------------------------------------------------

  /**
   * Use this ctor on the backend.
   */
  public Organization_GWT(Long organizationID_, String organizationName_,
      String email_)
  {
    assert (organizationName_ != null && !organizationName_.isEmpty());
    assert (email_ != null && !email_.isEmpty());

    organizationID = organizationID_;
    email = email_;
    organizationName = organizationName_;
  }// ctor

  // ---------------------------------------------------------------------------

  /**
   * No-arg constructor for de-serialization
   */
  @SuppressWarnings("unused")
  private Organization_GWT()
  {

  }// ctor

  // ---------------------------------------------------------------------------

  public String getOrganizationName()
  {
    return organizationName;
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

  public String getAddress1()
  {
    return address1;
  }

  // ---------------------------------------------------------------------------

  public void setAddress1(String address1_)
  {
    address1 = address1_;
  }

  // ---------------------------------------------------------------------------

  public String getAddress2()
  {
    return address2;
  }

  // ---------------------------------------------------------------------------

  public void setAddress2(String address2_)
  {
    address2 = address2_;
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

  public String getZipCode()
  {
    return postalCode;
  }

  // ---------------------------------------------------------------------------

  public void setZipCode(String postalCode_)
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

  // ---------------------------------------------------------------------------

  public String getPrimaryPhoneNumber()
  {
    return primaryPhoneNumber;
  }

  // ---------------------------------------------------------------------------

  public void setPrimaryPhoneNumber(String primaryPhoneNumber_)
  {
    primaryPhoneNumber = primaryPhoneNumber_;
  }

  // ---------------------------------------------------------------------------

  public String getSecondaryPhoneNumber()
  {
    return secondaryPhoneNumber;
  }

  // ---------------------------------------------------------------------------

  public void setSecondaryPhoneNumber(String secondaryPhoneNumber_)
  {
    secondaryPhoneNumber = secondaryPhoneNumber_;
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

  public String getEmail()
  {
    return email;
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

  public Long getOrganizationID()
  {
    return organizationID;
  }

  // ---------------------------------------------------------------------------

  public void setEmail(String email_)
  {
    assert(email_!= null);
    assert(!email_.isEmpty());
    email = email_;
  }

  // ---------------------------------------------------------------------------

}// class
