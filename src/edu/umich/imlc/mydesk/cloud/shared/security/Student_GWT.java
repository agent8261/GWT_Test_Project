package edu.umich.imlc.mydesk.cloud.shared.security;

import com.google.gwt.user.client.rpc.IsSerializable;

public class Student_GWT extends OrganizationMember_GWT implements
    IsSerializable
{
  // ---------------------------------------------------------------------------
  // ---------------------------------------------------------------------------

  public Student_GWT(Long memberID_, MyDeskUser_GWT user_,
      Organization_ShortInfo_GWT organization_)
  {
    super(memberID_, user_, organization_);
  }

  // ---------------------------------------------------------------------------

  /**
   * No-arg ctor for serialization
   */
  @SuppressWarnings("unused")
  private Student_GWT()
  {
  }

  // ---------------------------------------------------------------------------

}// class
