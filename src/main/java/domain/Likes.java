package domain;

public class Likes {
    private int count; // число пользователей, которым понравилась запись
    private int userLikes; // наличие отметки "мне нравится" от текущего пользователя
    private int canLikes; // может ли текущий пользователь поставить отметку "мне нравится"

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

    public int getCanLikes() {
        return canLikes;
    }

    public void setCanLikes(int canLikes) {
        this.canLikes = canLikes;
    }

    public int getCanPublish() {
        return canPublish;
    }

    public void setCanPublish(int canPublish) {
        this.canPublish = canPublish;
    }

    private int canPublish; // может ли текущий пользователь сделать репост записи
}
