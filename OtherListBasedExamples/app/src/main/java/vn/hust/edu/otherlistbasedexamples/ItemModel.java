package vn.hust.edu.otherlistbasedexamples;

public class ItemModel {
    String label;
    int thumbnailResource;
    int imageResource;

    public ItemModel(String label, int thumbnailResource, int imageResource) {
        this.label = label;
        this.thumbnailResource = thumbnailResource;
        this.imageResource = imageResource;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getThumbnailResource() {
        return thumbnailResource;
    }

    public void setThumbnailResource(int thumbnailResource) {
        this.thumbnailResource = thumbnailResource;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }
}
