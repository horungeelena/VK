package domain;

public class Likes {
    private int count; // число пользователей, которым понравилась запись
    private int userLikes; // наличие отметки "мне нравится" от текущего пользователя
    private boolean canLikes; // может ли текущий пользователь поставить отметку "мне нравится"

    private boolean canPublish; // может ли текущий пользователь сделать репост записи

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(int userLikes) {
        this.userLikes = userLikes;
    }

    public boolean isCanLikes() {
        return canLikes;
    }

    public void setCanLikes(boolean canLikes) {
        this.canLikes = canLikes;
    }

    public boolean isCanPublish() {
        return canPublish;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }
}
