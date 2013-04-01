package edu.umich.imlc.mydesk.cloud.shared.security;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * Light version of MyDeskUser_GWT for less network traffic.
 * 
 */
public class MyDeskUser_ShortInfo_GWT implements IsSerializable
{
  private String gMail;
  private String firstName;
  private String lastName;

  // ---------------------------------------------------------------------------
  // ---------------------------------------------------------------------------

  public MyDeskUser_ShortInfo_GWT(String gMail_, String firstName_,
      String lastName_)
  {
    gMail = gMail_;
    firstName = firstName_;
    lastName = lastName_;
  }// ctor

  // ---------------------------------------------------------------------------

  /**
   * No-arg ctor for deserialization
   */
  @SuppressWarnings("unused")
  private MyDeskUser_ShortInfo_GWT()
  {

  }

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

  public String getLastName()
  {
    return lastName;
  }

  // ---------------------------------------------------------------------------

}// class
