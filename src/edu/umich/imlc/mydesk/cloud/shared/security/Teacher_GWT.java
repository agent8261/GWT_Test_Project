package edu.umich.imlc.mydesk.cloud.shared.security;

import com.google.gwt.user.client.rpc.IsSerializable;

public class Teacher_GWT extends OrganizationMember_GWT implements
    IsSerializable
{
  // ---------------------------------------------------------------------------
  // ---------------------------------------------------------------------------

  public Teacher_GWT(Long memberID_, MyDeskUser_GWT user_,
      Organization_ShortInfo_GWT organization_)
  {
    super(memberID_, user_, organization_);
  }

  // ---------------------------------------------------------------------------

  /**
   * No-arg ctor for serialization
   */
  @SuppressWarnings("unused")
  private Teacher_GWT()
  {
  }

  // ---------------------------------------------------------------------------

}// class
