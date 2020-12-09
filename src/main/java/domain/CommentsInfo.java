package domain;

public class CommentsInfo {
    private boolean canPost;
    private int quantity;
    private int commentsInfo;
    private int attachPhoto;
    private int video;
    private int audioRecording;
    private int file;
    private int createPhoto;
    private int smile;
    private int sendingMessage;

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(int commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public int getAttachPhoto() {
        return attachPhoto;
    }

    public void setAttachPhoto(int attachPhoto) {
        this.attachPhoto = attachPhoto;
    }

    public int getVideo() {
        return video;
    }

    public void setVideo(int video) {
        this.video = video;
    }

    public int getAudioRecording() {
        return audioRecording;
    }

    public void setAudioRecording(int audioRecording) {
        this.audioRecording = audioRecording;
    }

    public int getFile() {
        return file;
    }

    public void setFile(int file) {
        this.file = file;
    }

    public int getCreatePhoto() {
        return createPhoto;
    }

    public void setCreatePhoto(int createPhoto) {
        this.createPhoto = createPhoto;
    }

    public int getSmile() {
        return smile;
    }

    public void setSmile(int smile) {
        this.smile = smile;
    }

    public int getSendingMessage() {
        return sendingMessage;
    }

    public void setSendingMessage(int sendingMessage) {
        this.sendingMessage = sendingMessage;
    }
}
