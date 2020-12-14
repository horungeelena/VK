package domain;

public class ReplyCommentsInfo {
    private int reply; // репост записи
    private int publicationDate; // дата репоста
    private int commentsInfo; // текст репоста
    private int attachPhoto; // прикрепить фото
    private int video; // прикрепить видео
    private int audioRecording; // прикрепить аудиозапись
    private int file; // прикрепить файл
    private int createPhoto; // создать фото
    private int smile; // прикрепить смайл
    private int sendingMessage; // опубликовать репост
    private int complain; // пожаловаться на репост в службу поддержки
    private int like; // лайки пользователей

    private int canClose; // может ли текущий пользователь закрыть комментарии к записи
    private int canOpen; // может ли текущий пользователь открыть комментарии к записи

    public int getCanClose() {
        return canClose;
    }

    public void setCanClose(int canClose) {
        this.canClose = canClose;
    }

    public int getCanOpen() {
        return canOpen;
    }

    public void setCanOpen(int canOpen) {
        this.canOpen = canOpen;
    }

    public int getCanPost() {
        return canPost;
    }

    public void setCanPost(int canPost) {
        this.canPost = canPost;
    }

    private int canPost; // может ли текущий польователь комментировать запись

    public int getReply() {
        return reply;
    }

    public void setReply(int reply) {
        this.reply = reply;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
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

    public int getComplain() {
        return complain;
    }

    public void setComplain(int complain) {
        this.complain = complain;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }
}
