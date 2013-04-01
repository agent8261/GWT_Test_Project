package edu.umich.imlc.mydesk.cloud.shared.security;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * Lightweight version of Student_DS for less network traffic.
 * 
 */
public class Student_ShortInfo_GWT implements IsSerializable
{
  private Long organizationMemberID;
  private MyDeskUser_ShortInfo_GWT user;
  private Organization_ShortInfo_GWT organization;

  // ---------------------------------------------------------------------------
  // ---------------------------------------------------------------------------

  public Student_ShortInfo_GWT(Long memberID_, MyDeskUser_ShortInfo_GWT user_,
      Organization_ShortInfo_GWT organization_)
  {
    organizationMemberID = memberID_;
    user = user_;
    organization = organization_;
  }// ctor

  // ---------------------------------------------------------------------------

  /**
   * No-arg ctor for serialization
   */
  @SuppressWarnings("unused")
  private Student_ShortInfo_GWT()
  {
  }

  // ---------------------------------------------------------------------------

  public Long getOrganizationMemberID()
  {
    return organizationMemberID;
  }

  // ---------------------------------------------------------------------------

  public MyDeskUser_ShortInfo_GWT getUser()
  {
    return user;
  }

  // ---------------------------------------------------------------------------

  public Organization_ShortInfo_GWT getOrganization()
  {
    return organization;
  }

  // ---------------------------------------------------------------------------

}// class
