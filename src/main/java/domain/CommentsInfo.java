package domain;

public class CommentsInfo {
    private boolean canPost; // может ли текущий пользователь комментировать запись
    private int quantity; // количество комментариев
    private int commentsInfo; // текст комментария
    private int attachPhoto; // прикрепить фото
    private int video; // прикрепить видео
    private int audioRecording; // прикрепить аудиозапись
    private int file; // прикрепить файл
    private int createPhoto; // создать фото
    private int smile; // прикрепить смайл
    private int sendingMessage; // опубликовать запись

    private int canPin; // может ли текущий пользователь закрепить запись
    private int canDelete; // может ли текущий пользователь удалить запись

    public int getCanPin() {
        return canPin;
    }

    public void setCanPin(int canPin) {
        this.canPin = canPin;
    }

    public int getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    private int canEdit; // может ли текущий пользователь редактировать запись

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
