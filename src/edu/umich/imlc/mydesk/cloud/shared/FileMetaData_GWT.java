package edu.umich.imlc.mydesk.cloud.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

public class FileMetaData_GWT implements IsSerializable
{
  public static final String NO_FILE_TYPE = "NoType";

  public static final long UNINITIALIZED_SEQUENCE_NUMBER = -1;

  private String fileID;

  private String fileName;

  private String fileType;

  private Date_GWT lastUpdated;

  private Date_GWT created;

  private long sequenceNumber;

  // ---------------------------------------------------------------------------
  // ---------------------------------------------------------------------------

  public FileMetaData_GWT(String fileID_, String fileName_, String fileType_)
  {
    this(fileID_, fileName_, fileType_, UNINITIALIZED_SEQUENCE_NUMBER);
  }// ctor

  // ---------------------------------------------------------------------------

  public FileMetaData_GWT(String fileID_, String fileName_, String fileType_,
      long sequenceNumber_)
  {
    this(fileID_, fileName_, fileType_, sequenceNumber_, new Date_GWT(),
        new Date_GWT());
  }// ctor

  // ---------------------------------------------------------------------------

  public FileMetaData_GWT(String fileID_, String fileName_, String fileType_,
      long sequenceNumber_, Date_GWT created_, Date_GWT lastUpdated_)
  {
    fileID = fileID_;
    fileName = fileName_;
    fileType = fileType_;
    sequenceNumber = sequenceNumber_;
    created = created_;
    lastUpdated = lastUpdated_;
  }// ctor

  // ---------------------------------------------------------------------------

  /**
   * No-arg ctor for deserialization
   */
  @SuppressWarnings("unused")
  private FileMetaData_GWT()
  {
    fileID = null;
    fileName = null;
    fileType = null;
    sequenceNumber = UNINITIALIZED_SEQUENCE_NUMBER;
    created = null;
    lastUpdated = null;
  }// ctor

  // ---------------------------------------------------------------------------

  public String getFileID()
  {
    return fileID;
  }

  // ---------------------------------------------------------------------------

  public String getFileType()
  {
    return fileType;
  }

  // ---------------------------------------------------------------------------

  public void setFileType(String fileType_)
  {
    fileType = fileType_;
  }

  // ---------------------------------------------------------------------------

  public String getFileName()
  {
    return fileName;
  }

  // ---------------------------------------------------------------------------

  public void setFileName(String fileName_)
  {
    fileName = fileName_;
  }

  // ---------------------------------------------------------------------------

  public Date_GWT getLastUpdated()
  {
    return lastUpdated;
  }

  // ---------------------------------------------------------------------------

  public void setLastUpdated(Date_GWT lastUpdated_)
  {
    lastUpdated = lastUpdated_;
  }

  // ---------------------------------------------------------------------------

  public Date_GWT getCreationDate()
  {
    return created;
  }

  // ---------------------------------------------------------------------------

  public long getSequenceNumber()
  {
    return sequenceNumber;
  }

  // ---------------------------------------------------------------------------

  public void setSequenceNumber(long sequenceNumber_)
  {
    sequenceNumber = sequenceNumber_;
  }

  // ---------------------------------------------------------------------------

  public void incrementSequenceNumber()
  {
    sequenceNumber++;
  }

  // ---------------------------------------------------------------------------

}// class
