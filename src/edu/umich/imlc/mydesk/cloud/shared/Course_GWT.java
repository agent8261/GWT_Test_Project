package edu.umich.imlc.mydesk.cloud.shared;

import java.util.HashMap;

import com.google.gwt.user.client.rpc.IsSerializable;

import edu.umich.imlc.mydesk.cloud.shared.security.Organization_ShortInfo_GWT;

public class Course_GWT implements IsSerializable
{
  private Long courseID;

  private String courseName;

  private String courseDescription;

  private Organization_ShortInfo_GWT organization;

  private HashMap<String, String> tagMap = new HashMap<String, String>();

  // ---------------------------------------------------------------------------
  // ---------------------------------------------------------------------------

  public Course_GWT(Long courseID_, String courseName_,
      String courseDescription_, Organization_ShortInfo_GWT organization_)
  {
    assert (courseName_ != null && !courseName_.isEmpty());
    assert (organization_ != null);

    courseID = courseID_;
    courseName = courseName_;
    courseDescription = courseDescription_;
    organization = organization_;
  }// ctor

  // ---------------------------------------------------------------------------

  /**
   * No-arg ctor for serialization
   */
  @SuppressWarnings("unused")
  private Course_GWT()
  {
  }// ctor

  // ---------------------------------------------------------------------------

  public String getCourseName()
  {
    return courseName;
  }

  // ---------------------------------------------------------------------------

  public void setCourseName(String courseName_)
  {
    courseName = courseName_;
  }

  // ---------------------------------------------------------------------------

  public String getCourseDescription()
  {
    return courseDescription;
  }

  // ---------------------------------------------------------------------------

  public void setCourseDescription(String description_)
  {
    courseDescription = description_;
  }

  // ---------------------------------------------------------------------------

  public Long getCourseID()
  {
    return courseID;
  }

  // ---------------------------------------------------------------------------

  public Organization_ShortInfo_GWT getOrganization()
  {
    return organization;
  }

  // ---------------------------------------------------------------------------

  public HashMap<String, String> getTagMap()
  {
    return tagMap;
  }

  // ---------------------------------------------------------------------------

}// class
