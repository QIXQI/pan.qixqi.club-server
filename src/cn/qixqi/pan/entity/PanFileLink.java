package cn.qixqi.pan.entity;

import java.util.Date;

public class PanFileLink{

    private int linkId;         // 返回到父文件夹时用到
    private int uid;
    private int fileId;
    private String linkName;
    private String fileType;
    private long fileSize;
    private int parent;			// 不会为空，所以使用int
    private Date createLinkTime;
    
    /**
     * add
     * @param uid
     * @param fileId
     * @param linkName
     * @param parent
     */
    public PanFileLink(int uid, int fileId, String linkName, int parent) {
		super();
		this.uid = uid;
		this.fileId = fileId;
		this.linkName = linkName;
		this.parent = parent;
	}

	/**
     * 网络传输的FileLink
     */
    public PanFileLink(int linkId, int uid, int fileId, String linkName, String fileType, long fileSize, int parent, Date createLinkTime) {
        this.linkId = linkId;
        this.uid = uid;
        this.fileId = fileId;
        this.linkName = linkName;
        this.fileType = fileType;
        this.fileSize = fileSize;
        this.parent = parent;
        this.createLinkTime = createLinkTime;
    }

    public int getLinkId() {
        return linkId;
    }

    public void setLinkId(int linkId) {
        this.linkId = linkId;
    }


    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getFileId() {
        return fileId;
    }

    public void setFileId(int fileId) {
        this.fileId = fileId;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public int getParent() {
        return parent;
    }

    public void setParent(int parent) {
        this.parent = parent;
    }

    public Date getCreateLinkTime() {
        return createLinkTime;
    }

    public void setCreateLinkTime(Date createLinkTime) {
        this.createLinkTime = createLinkTime;
    }

    @Override
    public String toString() {
        return "FileLink [createLinkTime=" + createLinkTime + ", fileId=" + fileId
                + ", linkName=" + linkName + ", fileSize=" + fileSize + ", fileType=" + fileType
                + ", linkId=" + linkId + ", parent=" + parent + ", uid=" + uid + "]";
    }






}