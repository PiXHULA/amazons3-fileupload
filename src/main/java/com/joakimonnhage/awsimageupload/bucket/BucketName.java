package com.joakimonnhage.awsimageupload.bucket;

public enum BucketName {
    PROFILE_IMAGE("joakimonnhage-amigos");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
