package domain;

public class Post {
    private int id; // идентификатор записи
    private int heading; // заголовок
    private int publicationDate; // дата публикации
    private int postText; // текст поста
    private int complain; // пожаловаться на пост в службу поддержки
    private int saveToBookmarks; // сохранить в закладки
    private int picture; // прикрепить картинку
    private int like; // лайки пользователей
    private int commentInfo; // комментарии
    private CommentsInfo commentsInfo;
    private Likes likes;
    private ReplyCommentsInfo reply;
    private int toShare; // поделиться записью
    private int viewed; // количество просмотров поста
    private int keep; // сохранить
    private int photoEditor; // фото редактор
    private int openOriginal; // открыть оригинал

    private int search; // поиск
    private int pinPost; // закрепить запись
    private int ownerId; // идентификатор владельца стены опубликованной записи
    private int replyOwnerId; // идентификатор владельца записи, в ответ на которую оставлена текущая
    private int replyPostId; // идентификатор записи, в ответ на которую оставлена текущая

    public Likes getLikes() {
        return likes;
    }

    public void setLikes(Likes likes) {
        this.likes = likes;
    }

    public ReplyCommentsInfo getReply() {
        return reply;
    }

    public void setReply(ReplyCommentsInfo reply) {
        this.reply = reply;
    }

    public int getSearch() {
        return search;
    }

    public void setSearch(int search) {
        this.search = search;
    }

    public int getPinPost() {
        return pinPost;
    }

    public void setPinPost(int pinPost) {
        this.pinPost = pinPost;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    private int friendsOnly; // запись создана с опцией "только для друзей"


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
