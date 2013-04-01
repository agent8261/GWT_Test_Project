package edu.umich.imlc.mydesk.cloud.shared.security;

import com.google.gwt.user.client.rpc.IsSerializable;

public class Organization_ShortInfo_GWT implements IsSerializable
{
  private Long organizationID;

  private String organizationName;
  
  private String organizationEmail;

  // ---------------------------------------------------------------------------
  // ---------------------------------------------------------------------------

  public Organization_ShortInfo_GWT(long organizationID_,
      String organizationName_, String organizationEmail_)
  {
    organizationID = organizationID_;
    organizationName = organizationName_;
    organizationEmail = organizationEmail_;
  }

  // ---------------------------------------------------------------------------

  /**
   * No-arg ctor for de-serialization
   */
  @SuppressWarnings("unused")
  private Organization_ShortInfo_GWT()
  {
    
  }
  
  // ---------------------------------------------------------------------------

  public Long getOrganizationID()
  {
    return organizationID;
  }

  // ---------------------------------------------------------------------------

  public String getOrganizationName()
  {
    return organizationName;
  }

  // ---------------------------------------------------------------------------

  public String getOrganizationEmail()
  {
    return organizationEmail;
  }

  // ---------------------------------------------------------------------------

}// class
