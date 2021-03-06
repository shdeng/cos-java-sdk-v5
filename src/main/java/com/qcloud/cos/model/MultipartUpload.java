package com.qcloud.cos.model;

import java.io.Serializable;
import java.util.Date;

public class MultipartUpload implements Serializable {
    private static final long serialVersionUID = 1L;

    /** The key by which this upload is stored. */
    private String key;

    /** The unique ID of this multipart upload. */
    private String uploadId;

    /** The owner of this multipart upload. */
    private Owner owner;

    /** The initiator of this multipart upload. */
    private Owner initiator;


    /** The date at which this upload was initiated. */
    private Date initiated;


    /**
     * Returns the key by which this upload is stored.
     *
     * @return The key by which this upload is stored.
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the key by which this upload is stored.
     *
     * @param key
     *            The key by which this upload is stored.
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Returns the unique ID of this multipart upload.
     *
     * @return The unique ID of this multipart upload.
     */
    public String getUploadId() {
        return uploadId;
    }

    /**
     * Sets the unique ID of this multipart upload.
     *
     * @param uploadId
     *            The unique ID of this multipart upload.
     */
    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * Returns the owner of this multipart upload.
     *
     * @return The owner of this multipart upload.
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * Sets the owner of this multipart upload.
     *
     * @param owner
     *            The owner of this multipart upload.
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * Returns the user who initiated this multipart upload.
     *
     * @return The user who initiated this multipart upload.
     */
    public Owner getInitiator() {
        return initiator;
    }

    /**
     * Sets the user who initiated this multipart upload.
     *
     * @param owner
     *            The user who initiated this multipart upload.
     */
    public void setInitiator(Owner initiator) {
        this.initiator = initiator;
    }

     /**
     * Returns the date at which this upload was initiated.
     *
     * @return The date at which this upload was initiated.
     */
    public Date getInitiated() {
        return initiated;
    }

    /**
     * Sets the date at which this upload was initiated.
     *
     * @param initiated
     *            The date at which this upload was initiated.
     */
    public void setInitiated(Date initiated) {
        this.initiated = initiated;
    }
}
