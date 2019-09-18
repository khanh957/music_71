package com.sun_asterisk.soundcloud_71.data.model;

public class Song {
    private int mId;
    private String mTitle;
    private String mArtist;
    private String mDuration;
    private String mGenre;
    private String mArtWorkUrl;
    private String mStreamUrl;
    private boolean mIsDownload;

    public int getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getArtist() {
        return mArtist;
    }

    public String getDuration() {
        return mDuration;
    }

    public String getGenre() {
        return mGenre;
    }

    public String getArtWorkUrl() {
        return mArtWorkUrl;
    }

    public String getStreamUrl() {
        return mStreamUrl;
    }

    public boolean isDownload() {
        return mIsDownload;
    }

    public static class Builder {
        private int mId;
        private String mTitle;
        private String mArtist;
        private String mDuration;
        private String mGenre;
        private String mArtWorkUrl;
        private String mStreamUrl;
        private boolean mIsDownload;

        public Builder(int id, String title, String artist, String duration, String genre,
                String artWorkUrl, String streamUrl, boolean isDownload) {
            mId = id;
            mTitle = title;
            mArtist = artist;
            mDuration = duration;
            mGenre = genre;
            mArtWorkUrl = artWorkUrl;
            mStreamUrl = streamUrl;
            mIsDownload = isDownload;
        }

        public Builder() {

        }

        public Builder id(int id) {
            mId = id;
            return this;
        }

        public Builder title(String title) {
            mTitle = title;
            return this;
        }

        public Builder artist(String artist) {
            mArtist = artist;
            return this;
        }

        public Builder duration(String duration) {
            mDuration = duration;
            return this;
        }

        public Builder genre(String genre) {
            mGenre = genre;
            return this;
        }

        public Builder artWorkUrl(String artWorkUrl) {
            mArtWorkUrl = artWorkUrl;
            return this;
        }

        public Builder streamUrl(String streamUrl) {
            mStreamUrl = streamUrl;
            return this;
        }

        public Builder isDownload(boolean isDownload) {
            mIsDownload = isDownload;
            return this;
        }
    }

    public final class SongEntry {
        public static final String ID = "id";
        public static final String TITLE = "title";
        public static final String DURATION = "duration";
        public static final String GENRE = "genre";
        public static final String ARTWORKURL = "artwork_url";
        public static final String STREAMURL = "stream_url";
        public static final String USER = "user";
        public static final String USERNAME = "username";
    }
}
