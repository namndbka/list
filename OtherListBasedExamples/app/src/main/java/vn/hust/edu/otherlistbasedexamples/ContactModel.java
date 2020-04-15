package vn.hust.edu.otherlistbasedexamples;

public class ContactModel {
    String fullname;
    int avatarResource;
    boolean isSelected;
    boolean isLeft;

    public ContactModel(String fullname, int avatarResource) {
        this.fullname = fullname;
        this.avatarResource = avatarResource;
        this.isSelected = false;
        this.isLeft = true;
    }

    public ContactModel(String fullname, int avatarResource, boolean isLeft) {
        this.fullname = fullname;
        this.avatarResource = avatarResource;
        this.isLeft = isLeft;
    }

    public boolean isLeft() {
        return isLeft;
    }

    public void setLeft(boolean left) {
        isLeft = left;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAvatarResource() {
        return avatarResource;
    }

    public void setAvatarResource(int avatarResource) {
        this.avatarResource = avatarResource;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
