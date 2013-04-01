package edu.umich.imlc.mydesk.cloud.shared.security;

public class OrganizationMember_GWT
{
  private Long organizationMemberID;
  private MyDeskUser_GWT user;
  private Organization_ShortInfo_GWT organization;

  // ---------------------------------------------------------------------------
  // ---------------------------------------------------------------------------

  public OrganizationMember_GWT(Long memberID_, MyDeskUser_GWT user_,
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
  protected OrganizationMember_GWT()
  {
  }

  // ---------------------------------------------------------------------------

  public Long getOrganizationMemberID()
  {
    return organizationMemberID;
  }

  // ---------------------------------------------------------------------------

  public MyDeskUser_GWT getUser()
  {
    return user;
  }

  // ---------------------------------------------------------------------------

  public Organization_ShortInfo_GWT getOrganization()
  {
    return organization;
  }

  // ---------------------------------------------------------------------------

  public boolean isTeacher()
  {
    return (this instanceof Teacher_GWT);
  }

  // ---------------------------------------------------------------------------

  public boolean isStudent()
  {
    return (this instanceof Student_GWT);
  }

}// class
