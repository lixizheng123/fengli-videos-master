package com.fengli.video.pojo;

public class Users_like_videos {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users_like_videos.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users_like_videos.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users_like_videos.video_id
     *
     * @mbggenerated
     */
    private String videoId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users_like_videos.id
     *
     * @return the value of users_like_videos.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users_like_videos.id
     *
     * @param id the value for users_like_videos.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users_like_videos.user_id
     *
     * @return the value of users_like_videos.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users_like_videos.user_id
     *
     * @param userId the value for users_like_videos.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users_like_videos.video_id
     *
     * @return the value of users_like_videos.video_id
     *
     * @mbggenerated
     */
    public String getVideoId() {
        return videoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users_like_videos.video_id
     *
     * @param videoId the value for users_like_videos.video_id
     *
     * @mbggenerated
     */
    public void setVideoId(String videoId) {
        this.videoId = videoId == null ? null : videoId.trim();
    }
}