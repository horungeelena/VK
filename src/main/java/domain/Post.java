package domain;

public class Post {
    private int id;
    private int heading;
    private int publicationDate;
    private int postText;
    private int complain;
    private int saveToBookmarks;
    private int picture;
    private int like;
    private int commentInfo;
    private CommentsInfo commentsInfo;
    private int toShare;
    private int viewed;
    private int keep;
    private int photoEditor;
    private int openOriginal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHeading() {
        return heading;
    }

    public void setHeading(int heading) {
        this.heading = heading;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getPostText() {
        return postText;
    }

    public void setPostText(int postText) {
        this.postText = postText;
    }

    public int getComplain() {
        return complain;
    }

    public void setComplain(int complain) {
        this.complain = complain;
    }

    public int getSaveToBookmarks() {
        return saveToBookmarks;
    }

    public void setSaveToBookmarks(int saveToBookmarks) {
        this.saveToBookmarks = saveToBookmarks;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getCommentInfo() {
        return commentInfo;
    }

    public void setCommentInfo(int commentInfo) {
        this.commentInfo = commentInfo;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public int getToShare() {
        return toShare;
    }

    public void setToShare(int toShare) {
        this.toShare = toShare;
    }

    public int getViewed() {
        return viewed;
    }

    public void setViewed(int viewed) {
        this.viewed = viewed;
    }

    public int getKeep() {
        return keep;
    }

    public void setKeep(int keep) {
        this.keep = keep;
    }

    public int getPhotoEditor() {
        return photoEditor;
    }

    public void setPhotoEditor(int photoEditor) {
        this.photoEditor = photoEditor;
    }

    public int getOpenOriginal() {
        return openOriginal;
    }

    public void setOpenOriginal(int openOriginal) {
        this.openOriginal = openOriginal;
    }
}
